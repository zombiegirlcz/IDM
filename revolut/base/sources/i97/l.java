package i97;

import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f159604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f159605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f159606c;
    public final gte.a d;
    public final fd0.d e;
    public final Lazy f;

    public l(fd2.n service, n walletInteractor, e currencyResolver, fk3.a configurationInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(currencyResolver, "currencyResolver");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f159604a = service;
        this.f159605b = walletInteractor;
        this.f159606c = configurationInteractor;
        this.d = featureToggleInteractor;
        this.e = new fd0.d(10);
        this.f = yhm.j.b(new hq1.f(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(i97.l r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof i97.g
            if (r0 == 0) goto L13
            r0 = r6
            i97.g r0 = (i97.g) r0
            int r1 = r0.f159592w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159592w = r1
            goto L18
        L13:
            i97.g r0 = new i97.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159592w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            phm.a r4 = r4.f159604a
            java.lang.Object r4 = r4.get()
            com.revolut.feature.globalsearch.impl.data.SmartTileService r4 = (com.revolut.feature.globalsearch.impl.data.SmartTileService) r4
            efm.d0 r4 = r4.extractAssetViewData(r5)
            r0.f159592w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            d97.a r6 = (d97.a) r6
            java.lang.String r4 = r6.getRef()
            if (r4 == 0) goto L55
            a97.a r5 = new a97.a
            r5.<init>(r4)
            return r5
        L55:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Unable to extract asset ref"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i97.l.a(i97.l, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(i97.l r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof i97.h
            if (r0 == 0) goto L13
            r0 = r7
            i97.h r0 = (i97.h) r0
            int r1 = r0.f159594x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159594x = r1
            goto L18
        L13:
            i97.h r0 = new i97.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159594x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            xi0.b r5 = r0.u
            yhm.o.b(r7)
            goto L8e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r7)
            goto L50
        L38:
            yhm.o.b(r7)
            phm.a r7 = r5.f159604a
            java.lang.Object r7 = r7.get()
            com.revolut.feature.globalsearch.impl.data.SmartTileService r7 = (com.revolut.feature.globalsearch.impl.data.SmartTileService) r7
            efm.d0 r6 = r7.extractCryptoAssetViewData(r6)
            r0.f159594x = r4
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L50
            goto L8c
        L50:
            d97.b r7 = (d97.b) r7
            java.lang.String r6 = r7.getCode()
            if (r6 == 0) goto L95
            java.lang.String r7 = "code"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            xi0.a r7 = xi0.b.Companion
            r7.getClass()
            xi0.b r6 = xi0.a.a(r6)
            boolean r7 = cp5.d.z(r6)
            if (r7 == 0) goto L6d
            goto L6e
        L6d:
            r6 = 0
        L6e:
            if (r6 == 0) goto L95
            kotlin.Lazy r7 = r5.f
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8f
            xi0.b[] r7 = new xi0.b[]{r6}
            r0.u = r6
            r0.f159594x = r3
            java.lang.Object r5 = r5.e(r7, r0)
            if (r5 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r5 = r6
        L8e:
            r6 = r5
        L8f:
            a97.b r5 = new a97.b
            r5.<init>(r6)
            return r5
        L95:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Unable to extract crypto asset code"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i97.l.b(i97.l, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(i97.l r6, java.lang.String r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof i97.i
            if (r0 == 0) goto L13
            r0 = r8
            i97.i r0 = (i97.i) r0
            int r1 = r0.f159597y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159597y = r1
            goto L18
        L13:
            i97.i r0 = new i97.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f159595w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159597y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            a97.c r6 = r0.v
            a97.c r7 = r0.u
            yhm.o.b(r8)
            goto La6
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            yhm.o.b(r8)
            goto L53
        L3b:
            yhm.o.b(r8)
            phm.a r8 = r6.f159604a
            java.lang.Object r8 = r8.get()
            com.revolut.feature.globalsearch.impl.data.SmartTileService r8 = (com.revolut.feature.globalsearch.impl.data.SmartTileService) r8
            efm.d0 r7 = r8.extractExchangeData(r7)
            r0.f159597y = r4
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L53
            goto La4
        L53:
            d97.c r8 = (d97.c) r8
            d97.d r7 = r8.getFrom()
            a97.c r7 = f(r6, r7)
            d97.d r8 = r8.getTo()
            a97.c r8 = f(r6, r8)
            if (r7 != 0) goto L69
            if (r8 == 0) goto Lad
        L69:
            r2 = 0
            if (r7 == 0) goto L6f
            xi0.b r4 = r7.f2366a
            goto L70
        L6f:
            r4 = r2
        L70:
            if (r8 == 0) goto L75
            xi0.b r5 = r8.f2366a
            goto L76
        L75:
            r5 = r2
        L76:
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 != 0) goto Lad
            kotlin.Lazy r4 = r6.f
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto La7
            if (r7 == 0) goto L8f
            xi0.b r4 = r7.f2366a
            goto L90
        L8f:
            r4 = r2
        L90:
            if (r8 == 0) goto L94
            xi0.b r2 = r8.f2366a
        L94:
            xi0.b[] r2 = new xi0.b[]{r4, r2}
            r0.u = r7
            r0.v = r8
            r0.f159597y = r3
            java.lang.Object r6 = r6.e(r2, r0)
            if (r6 != r1) goto La5
        La4:
            return r1
        La5:
            r6 = r8
        La6:
            r8 = r6
        La7:
            a97.d r6 = new a97.d
            r6.<init>(r7, r8)
            return r6
        Lad:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Extracted currencies are invalid"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i97.l.c(i97.l, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(i97.l r6, java.lang.String r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i97.l.d(i97.l, java.lang.String, gim.c):java.lang.Object");
    }

    public static final a97.c f(l lVar, d97.d dVar) {
        String ticker;
        xi0.b bVarC;
        if (dVar != null && (ticker = dVar.getCcy()) != null) {
            if (((Boolean) lVar.f.getValue()).booleanValue()) {
                Intrinsics.checkNotNullParameter(ticker, "code");
                xi0.b.Companion.getClass();
                bVarC = xi0.a.a(ticker);
            } else {
                Intrinsics.checkNotNullParameter(ticker, "ticker");
                xi0.b.Companion.getClass();
                bVarC = xi0.a.c(ticker);
            }
            if (bVarC != null) {
                String amount = dVar.getAmount();
                return new a97.c(amount != null ? new BigDecimal(amount) : null, bVarC);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xi0.b[] r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof i97.f
            if (r0 == 0) goto L13
            r0 = r10
            i97.f r0 = (i97.f) r0
            int r1 = r0.f159591x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159591x = r1
            goto L18
        L13:
            i97.f r0 = new i97.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159591x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.ArrayList r9 = r0.u
            yhm.o.b(r10)
            goto L8c
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            java.util.ArrayList r10 = p.a.u(r10)
            int r2 = r9.length
            r4 = 0
        L37:
            if (r4 >= r2) goto L4d
            r5 = r9[r4]
            if (r5 == 0) goto L44
            boolean r6 = cp5.d.z(r5)
            if (r6 == 0) goto L44
            goto L45
        L44:
            r5 = 0
        L45:
            if (r5 == 0) goto L4a
            r10.add(r5)
        L4a:
            int r4 = r4 + 1
            goto L37
        L4d:
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L56
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L56:
            fk3.a r9 = r8.f159606c
            ik3.c r9 = (ik3.c) r9
            fk3.b r9 = r9.f161878a
            ik3.g r9 = (ik3.g) r9
            f7l.a r9 = r9.f161888g
            efm.d0 r9 = r9.h()
            ijj.p r2 = new ijj.p
            r4 = 5
            r2.<init>(r4)
            ihd.c r4 = new ihd.c
            r5 = 6
            r4.<init>(r5, r2)
            r9.getClass()
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r9, r4, r5)
            java.lang.String r9 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            r0.u = r10
            r0.f159591x = r3
            java.lang.Object r9 = nim.a.b(r2, r0)
            if (r9 != r1) goto L89
            return r1
        L89:
            r7 = r10
            r10 = r9
            r9 = r7
        L8c:
            java.util.Set r10 = (java.util.Set) r10
            if (r9 == 0) goto L97
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L97
            goto Lb8
        L97:
            java.util.Iterator r9 = r9.iterator()
        L9b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r9.next()
            xi0.b r0 = (xi0.b) r0
            java.lang.String r0 = r0.f306286a
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto Lb0
            goto L9b
        Lb0:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            java.lang.String r10 = "Unsupported crypto currency extracted"
            r9.<init>(r10)
            throw r9
        Lb8:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i97.l.e(xi0.b[], gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r12, java.lang.Class r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof i97.k
            if (r0 == 0) goto L13
            r0 = r12
            i97.k r0 = (i97.k) r0
            int r1 = r0.f159603y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159603y = r1
            goto L18
        L13:
            i97.k r0 = new i97.k
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f159601w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159603y
            fd0.d r3 = r11.e
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Class r13 = r0.v
            java.lang.String r14 = r0.u
            yhm.o.b(r12)
            goto L64
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            yhm.o.b(r12)
            kotlin.Pair r12 = new kotlin.Pair
            r12.<init>(r14, r13)
            java.lang.Object r12 = r3.c(r12)
            a97.f r12 = (a97.f) r12
            if (r12 == 0) goto L46
            return r12
        L46:
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            hsd.c r5 = new hsd.c
            r10 = 17
            r9 = 0
            r7 = r11
            r6 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r8
            r0.v = r6
            r0.f159603y = r4
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L62
            return r1
        L62:
            r13 = r6
            r14 = r8
        L64:
            a97.f r12 = (a97.f) r12
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r14, r13)
            r3.d(r0, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i97.l.g(gim.c, java.lang.Class, java.lang.String):java.lang.Object");
    }
}
