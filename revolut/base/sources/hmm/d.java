package hmm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mmm.l;
import mmm.m;
import net.sf.scuba.smartcards.ISO7816;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f154002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f154003c;
    public static final d d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f154004a;

    static {
        l lVar = m.Companion;
        byte[] bArr = {ISO7816.INS_PSO};
        lVar.getClass();
        f154002b = l.e(bArr);
        f154003c = u.c("*");
        Intrinsics.checkNotNullParameter(f.Companion, "<this>");
        d = new d(new b());
    }

    public d(b publicSuffixList) {
        Intrinsics.checkNotNullParameter(publicSuffixList, "publicSuffixList");
        this.f154004a = publicSuffixList;
    }

    public static List b(String str) {
        List listM0 = d0.m0(str, new char[]{CoreConstants.DOT}, 6);
        return Intrinsics.f(zhm.d0.m0(listM0), "") ? zhm.d0.W(1, listM0) : listM0;
    }

    public final String a(String domain) {
        String strA;
        String strA2;
        String strA3;
        List listM0;
        List listM02;
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.h(unicode);
        List listB = b(unicode);
        b bVar = this.f154004a;
        AtomicBoolean atomicBoolean = bVar.f153999a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                bVar.f154000b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        try {
                            bVar.b();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z = true;
                        }
                    } catch (IOException e) {
                        bVar.e = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (bVar.f154001c == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) bVar.f) + " resource.");
            illegalStateException.initCause(bVar.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        m[] mVarArr = new m[size3];
        for (int i = 0; i < size3; i++) {
            l lVar = m.Companion;
            String str = (String) listB.get(i);
            lVar.getClass();
            mVarArr[i] = l.c(str);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strA = null;
                break;
            }
            c cVar = Companion;
            m mVar = bVar.f154001c;
            if (mVar == null) {
                Intrinsics.r("bytes");
                throw null;
            }
            strA = c.a(cVar, mVar, mVarArr, i2);
            if (strA != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            m[] mVarArr2 = (m[]) mVarArr.clone();
            int length = mVarArr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                mVarArr2[i3] = f154002b;
                c cVar2 = Companion;
                m mVar2 = bVar.f154001c;
                if (mVar2 == null) {
                    Intrinsics.r("bytes");
                    throw null;
                }
                strA2 = c.a(cVar2, mVar2, mVarArr2, i3);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                c cVar3 = Companion;
                m mVar3 = bVar.d;
                if (mVar3 == null) {
                    Intrinsics.r("exceptionBytes");
                    throw null;
                }
                strA3 = c.a(cVar3, mVar3, mVarArr, i6);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listM02 = d0.m0("!".concat(strA3), new char[]{CoreConstants.DOT}, 6);
        } else if (strA == null && strA2 == null) {
            listM02 = f154003c;
        } else {
            if (strA == null || (listM0 = d0.m0(strA, new char[]{CoreConstants.DOT}, 6)) == null) {
                listM0 = f0.f322471a;
            }
            if (strA2 == null || (listM02 = d0.m0(strA2, new char[]{CoreConstants.DOT}, 6)) == null) {
                listM02 = f0.f322471a;
            }
            if (listM0.size() > listM02.size()) {
                listM02 = listM0;
            }
        }
        if (listB.size() == listM02.size() && ((String) listM02.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM02.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listM02.size();
        } else {
            size = listB.size();
            size2 = listM02.size() + 1;
        }
        return y.u(y.m(zhm.d0.Q(b(domain)), size - size2), ".", null, 62);
    }
}
