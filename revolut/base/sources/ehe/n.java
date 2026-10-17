package ehe;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import fma.c0;
import fma.d0;
import fma.y;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class n {
    public static /* synthetic */ boolean A(AtomicReferenceArray atomicReferenceArray, int i, elm.k kVar) {
        while (!atomicReferenceArray.compareAndSet(i, kVar, null)) {
            if (atomicReferenceArray.get(i) != kVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean B(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, elm.o oVar, elm.k kVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(oVar, kVar, null)) {
            if (atomicReferenceFieldUpdater.get(oVar) != kVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean C(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj2, elm.k kVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj2, kVar, null)) {
            if (atomicReferenceFieldUpdater.get(obj2) != kVar) {
                return false;
            }
        }
        return true;
    }

    public static byte[] D(ASN1Sequence aSN1Sequence, int i) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets();
    }

    public static int a(int i, int i2, int i3, int i5) {
        return (i * i2) + i3 + i5;
    }

    public static int b(int i, int i2, byte[] bArr) {
        return (Arrays.hashCode(bArr) + i) * i2;
    }

    public static int c(aw0.e eVar, int i, int i2) {
        return (eVar.hashCode() + i) * i2;
    }

    public static int d(Color color, int i, int i2) {
        return (color.hashCode() + i) * i2;
    }

    public static int e(ChatBubbleView chatBubbleView, String str, float f) {
        Context context = chatBubbleView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, str);
        return kli.a.k(context, f);
    }

    public static e4m.e f(c cVar, a aVar, p pVar, int i) {
        return e4m.b.b(new o(cVar, aVar, pVar, i, 0));
    }

    public static e4m.e g(c cVar, b bVar, q qVar, int i) {
        return e4m.b.b(new o(cVar, bVar, qVar, i, 1));
    }

    public static e4m.e h(ewg.h hVar, int i) {
        return e4m.b.b(new ede.a(hVar, i, 11));
    }

    public static e4m.e i(ey.b bVar, ey.d dVar, int i) {
        return e4m.b.b(new ea2.p(bVar, dVar, i, 21));
    }

    public static e4m.e j(fa0.k kVar, fa0.h hVar, int i) {
        return e4m.b.b(new eyd.j(kVar, hVar, i, 28));
    }

    public static e4m.e k(fa0.k kVar, fa0.j jVar, int i) {
        return e4m.b.b(new eyd.j(kVar, jVar, i, 29));
    }

    public static e4m.e l(fh7.a aVar, int i) {
        return e4m.b.b(new ede.a(aVar, i, 24));
    }

    public static e4m.e m(c0 c0Var, d0 d0Var, y yVar, int i) {
        return e4m.b.b(new o(c0Var, d0Var, yVar, i, 17));
    }

    public static e4m.e n(g9g.d dVar, int i) {
        return e4m.b.b(new fw2.l(dVar, i, 3));
    }

    public static e4m.e o(gg0.d dVar, int i) {
        return e4m.b.b(new fw2.l(dVar, i, 5));
    }

    public static e4m.e p(h1e.c cVar, int i) {
        return e4m.b.b(new gff.a(cVar, i, 7));
    }

    public static e4m.e q(h1e.c cVar, h1e.b bVar, int i) {
        return e4m.b.b(new h08.e(cVar, bVar, i, 5));
    }

    public static he2.b r() {
        return kxa.j.o(new nji.b());
    }

    public static j60.c s(com.revolut.kompot.navigable.a controller, rp0.m dialogDisplayer) {
        he2.b dialogHostFinder = kxa.j.o(new nji.b());
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    public static String t(float f, String str, StringBuilder sb6) {
        sb6.append(f);
        sb6.append(str);
        return sb6.toString();
    }

    public static String u(String str) {
        return m70.a.l(kotlin.text.d0.F0(str).toString());
    }

    public static Iterator v(Set set, Parcel parcel) {
        parcel.writeInt(set.size());
        return set.iterator();
    }

    public static List w(int i) {
        return u.c(new mp0.d(i));
    }

    public static List x(xi0.b bVar, CurrencyClause.Format.Ticker ticker, Style style, int i) {
        return u.c(new CurrencyClause(bVar, ticker, style, i));
    }

    public static /* synthetic */ void y(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else {
                if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void z(String str, String str2, ne0.j jVar, List list) {
        jVar.f(str + str2, list);
    }
}
