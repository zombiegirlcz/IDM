package ie;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.ironz.binaryprefs.exception.SerializationException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f160499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f160500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f160501c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f160502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f160503h;

    public a(ecm.q qVar) {
        qf.b bVar = new qf.b(15);
        this.f160499a = bVar;
        int i = 16;
        ah.a aVar = new ah.a(i);
        ch.b bVar2 = new ch.b(i);
        dfm.c cVar = new dfm.c(i);
        qf.b bVar3 = new qf.b(i);
        this.f160501c = bVar3;
        int i2 = 17;
        af.f fVar = new af.f(i2);
        this.d = fVar;
        ah.a aVar2 = new ah.a(i2);
        this.e = aVar2;
        ch.b bVar4 = new ch.b(i2);
        dfm.c cVar2 = new dfm.c(i2);
        this.f = cVar2;
        this.f160502g = new qf.b(17);
        af.f fVar2 = new af.f(16);
        this.f160500b = fVar2;
        this.f160503h = new ufm.g(bVar, aVar, fVar2, bVar2, cVar, bVar3, fVar, aVar2, bVar4, cVar2, qVar);
    }

    public static /* synthetic */ vkm.d c(a aVar, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aVar.b(str, z, false);
    }

    public Object a(String str, byte[] bArr) {
        if (bArr.length == 0) {
            throw new SerializationException(a0.d.r(str, " key's value is zero bytes for deserialize"));
        }
        byte b4 = bArr[0];
        if (b4 == -7) {
            return Boolean.valueOf(bArr[1] != 0);
        }
        if (b4 == -3) {
            return Integer.valueOf(af.f.o(0, bArr));
        }
        if (b4 == -4) {
            return Long.valueOf((((long) bArr[8]) & 255) + ((((long) bArr[7]) & 255) << 8) + ((((long) bArr[6]) & 255) << 16) + ((((long) bArr[5]) & 255) << 24) + ((((long) bArr[4]) & 255) << 32) + ((((long) bArr[3]) & 255) << 40) + ((((long) bArr[2]) & 255) << 48) + (((long) bArr[1]) << 56));
        }
        if (b4 == -5) {
            return Double.valueOf(Double.longBitsToDouble(((long) ((bArr[8] & UnsignedBytes.MAX_VALUE) + ((bArr[7] & UnsignedBytes.MAX_VALUE) << 8) + ((bArr[6] & UnsignedBytes.MAX_VALUE) << 16))) + (((long) (bArr[5] & UnsignedBytes.MAX_VALUE)) << 24) + (((long) (bArr[4] & UnsignedBytes.MAX_VALUE)) << 32) + (((long) (bArr[3] & UnsignedBytes.MAX_VALUE)) << 40) + (((long) (bArr[2] & UnsignedBytes.MAX_VALUE)) << 48) + (((long) bArr[1]) << 56)));
        }
        if (b4 == -6) {
            return Float.valueOf(Float.intBitsToFloat((bArr[4] & UnsignedBytes.MAX_VALUE) + ((bArr[3] & UnsignedBytes.MAX_VALUE) << 8) + ((bArr[2] & UnsignedBytes.MAX_VALUE) << 16) + (bArr[1] << Ascii.CAN)));
        }
        if (b4 == -2) {
            return new String(bArr, 1, bArr.length - 1);
        }
        if (b4 == -1) {
            if (b4 != -1) {
                throw new ClassCastException(j6.a.l(b4, "Set<String> cannot be deserialized in '", "' flag type"));
            }
            HashSet hashSet = new HashSet();
            int i = 1;
            while (i < bArr.length) {
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, i, bArr2, 0, 4);
                int i2 = (bArr2[3] & 255) + ((bArr2[2] & 255) << 8) + ((bArr2[1] & 255) << 16) + (bArr2[0] << 24);
                byte[] bArr3 = new byte[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    bArr3[i3] = bArr[i + i3 + 4];
                }
                hashSet.add(new String(bArr3));
                i += i2 + 4;
            }
            return Collections.unmodifiableSet(hashSet);
        }
        ufm.g gVar = (ufm.g) this.f160503h;
        if (b4 == -11) {
            new io.grpc.okhttp.internal.n((af.f) gVar.f279885b, (ecm.q) gVar.f279886c).d(str, bArr);
            throw null;
        }
        if (b4 == -9) {
            return Short.valueOf((short) ((bArr[1] << 8) + (bArr[2] & UnsignedBytes.MAX_VALUE)));
        }
        if (b4 == -8) {
            return Byte.valueOf(bArr[1]);
        }
        if (b4 != -12) {
            if (b4 == -10) {
                return Character.valueOf((char) ((bArr[1] << 8) + (bArr[2] & UnsignedBytes.MAX_VALUE)));
            }
            throw new UnsupportedClassVersionError(j6.a.l(b4, "Flag verification failed. Incorrect flag '", "'"));
        }
        int length = bArr.length - 1;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 1, bArr4, 0, length);
        return bArr4;
    }

    public vkm.d b(String cardId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        efm.r rVarX = ((ha3.x) ((l93.f) this.f160499a)).n(cardId).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r map = te0.w.n(rVarX, m70.a.g(((mt8.d) this.f160500b).a(false), null, new w6b.a(17), 1), m70.a.g(sh3.a.c((sh3.a) this.f160501c, zhm.u.c(pi3.s.CARD), null, null, 6), null, new w6b.a(18), 1), rd0.e.c(((om4.f) ((al4.b) this.f160503h)).b(), kotlin.coroutines.g.f186406a)).distinctUntilChanged().map(new w4l.c(new wa3.b(this, z, z3, 0), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    public vkm.d d(boolean z, boolean z3) {
        efm.r map = te0.w.n(m70.a.g(g(), null, new w6b.a(16), 1), m70.a.g(((mt8.d) this.f160500b).a(false), null, new w6b.a(16), 1), m70.a.g(sh3.a.c((sh3.a) this.f160501c, zhm.u.c(pi3.s.CARD), null, null, 6), null, new w6b.a(16), 1), rd0.e.c(((om4.f) ((al4.b) this.f160503h)).b(), kotlin.coroutines.g.f186406a)).distinctUntilChanged().map(new w4l.c(new wa3.b(this, z, z3, 1), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable e(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wa3.f
            if (r0 == 0) goto L13
            r0 = r7
            wa3.f r0 = (wa3.f) r0
            int r1 = r0.f295804x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f295804x = r1
            goto L18
        L13:
            wa3.f r0 = new wa3.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f295804x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            efm.r r7 = r5.g()
            vkm.d r7 = rd0.e.b(r7)
            zfd.e r7 = zi0.c.w(r7)
            r2 = 3
            jhi.b r7 = mo3.a.g(r7, r4, r4, r2)
            r0.u = r6
            r0.f295804x = r3
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            java.util.List r7 = (java.util.List) r7
            if (r6 == 0) goto L79
            if (r7 == 0) goto L7a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r7.iterator()
        L62:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L7a
            java.lang.Object r7 = r6.next()
            r0 = r7
            h93.f0 r0 = (h93.f0) r0
            boolean r0 = xa3.b.a(r0)
            if (r0 == 0) goto L62
            r4.add(r7)
            goto L62
        L79:
            r4 = r7
        L7a:
            if (r4 != 0) goto L7e
            zhm.f0 r4 = zhm.f0.f322471a
        L7e:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = zhm.w.t(r4, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r4.iterator()
        L8f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r7.next()
            h93.f0 r0 = (h93.f0) r0
            java.lang.String r0 = r0.getId()
            r6.add(r0)
            goto L8f
        La3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.a.e(boolean, gim.c):java.io.Serializable");
    }

    public boolean f(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        ((xa3.b) this.d).getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return Intrinsics.f(itemId, "CARD_LIST_ITEM_ID");
    }

    public efm.r g() {
        efm.r rVarSwitchMap = rd0.e.c(bla.b.b((jla.h) this.f160502g, "YOUTH"), kotlin.coroutines.g.f186406a).map(new w4l.c(new w6h.f(16), 11)).switchMap(new w4l.c(new wa3.a(1, this), 12));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarFlatMap = rVarSwitchMap.distinctUntilChanged().flatMap(new w4l.c(new wa3.a(0, this), 10));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public a(l93.f cardsInteractor, mt8.d kycInteractor, sh3.a checkoutInteractor, xa3.b mapper, zf8.k juniorAccountInfoProvider, mp.r cardsTroubleshooterRepository, jla.h productCatalogueInteractor, al4.b comboCardInteractor) {
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(cardsTroubleshooterRepository, "cardsTroubleshooterRepository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        this.f160499a = cardsInteractor;
        this.f160500b = kycInteractor;
        this.f160501c = checkoutInteractor;
        this.d = mapper;
        this.e = juniorAccountInfoProvider;
        this.f = cardsTroubleshooterRepository;
        this.f160502g = productCatalogueInteractor;
        this.f160503h = comboCardInteractor;
    }

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, ao.h hVar) {
        this.f160499a = str;
        this.f160500b = str2;
        this.f160502g = arrayList;
        this.f160501c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f160503h = hVar;
    }
}
