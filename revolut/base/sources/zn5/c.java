package zn5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jli.g;
import kn5.e;
import kn5.f;
import kn5.h;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.f0;
import org.bouncycastle.jcajce.provider.digest.Blake2b;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f323668b = v.k(new b(3, 1, 1), new b(4, 2, 1), new b(5, 2, 2), new b(6, 4, 1), new b(7, 4, 2), new b(8, 4, 3), new b(9, 4, 4), new b(10, 8, 1), new b(11, 8, 2), new b(12, 8, 3), new b(13, 8, 4), new b(14, 8, 5), new b(15, 8, 6), new b(16, 8, 7), new b(17, 8, 8), new b(34, 32, 2));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn5.b f323669a;

    public c(mn5.b base58Codec) {
        Intrinsics.checkNotNullParameter(base58Codec, "base58Codec");
        this.f323669a = base58Codec;
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        Object next;
        Collection collectionC;
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.f185996a;
        if (str.length() == 0) {
            return new e(h.f186003a);
        }
        Set setG = z0.g('1');
        if (params.f185998c) {
            setG.add('5');
        }
        if (!setG.contains(Character.valueOf(f0.P0(str)))) {
            return new e(null);
        }
        byte[] bArrA = this.f323669a.a(str, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz");
        boolean zF = false;
        if (bArrA != null) {
            String strI = g.i(d0.Y0(d.o0(1, bArrA)));
            Intrinsics.checkNotNullParameter(bArrA, "<this>");
            byte[] bArrY0 = d0.Y0(d.k0(bArrA, new IntRange(1, bArrA.length - 1, 1)));
            Iterator it8 = f323668b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((b) next).f323665a == bArrY0.length) {
                    break;
                }
            }
            b bVar = (b) next;
            if (bVar != null) {
                int i = bVar.f323667c;
                String strI2 = g.i(d0.Y0(d.o0(bVar.f323666b, bArrY0)));
                Intrinsics.checkNotNullParameter(bArrY0, "<this>");
                if (i < 0) {
                    throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " is less than zero.").toString());
                }
                if (i == 0) {
                    collectionC = zhm.f0.f322471a;
                } else {
                    int length = bArrY0.length;
                    if (i >= length) {
                        collectionC = d.q0(bArrY0);
                    } else if (i == 1) {
                        collectionC = u.c(Byte.valueOf(bArrY0[length - 1]));
                    } else {
                        ArrayList arrayList = new ArrayList(i);
                        for (int i2 = length - i; i2 < length; i2++) {
                            arrayList.add(Byte.valueOf(bArrY0[i2]));
                        }
                        collectionC = arrayList;
                    }
                }
                String strI3 = g.i(d0.Y0(collectionC));
                String str2 = "53533538505245" + strI + strI2;
                Intrinsics.checkNotNullParameter(str2, "<this>");
                Blake2b.Blake2b512 blake2b512 = new Blake2b.Blake2b512();
                Intrinsics.checkNotNullParameter(str2, "<this>");
                ArrayList arrayListM0 = f0.M0(2, str2);
                ArrayList arrayList2 = new ArrayList(w.t(arrayListM0, 10));
                Iterator it9 = arrayListM0.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(Byte.valueOf((byte) Integer.parseInt((String) it9.next(), CharsKt.checkRadix(16))));
                }
                byte[] bArrDigest = blake2b512.digest(d0.Y0(arrayList2));
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                zF = Intrinsics.f(f0.U0(i * 2, g.i(bArrDigest)), strI3);
            }
        }
        return zF ? kn5.c.f186000a : new e(null);
    }
}
