package pea;

import com.revolut.feature.pockets.impl.details_v2.qr.AccountQrCodeScreenContract$InputData;
import jki.p;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends jki.g implements jki.h {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fkg.a f235355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f235356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tqi.g f235357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f01.c f235358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f235359t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fkg.a qrCodeGenerator, d provider, tqi.g shareNaviCommandFactory, f01.c uiKitResources, AccountQrCodeScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f235355p = qrCodeGenerator;
        this.f235356q = provider;
        this.f235357r = shareNaviCommandFactory;
        this.f235358s = uiKitResources;
        this.f235359t = yhm.j.b(new os2.a(inputData, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable y2(pea.l r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof pea.j
            if (r0 == 0) goto L13
            r0 = r7
            pea.j r0 = (pea.j) r0
            int r1 = r0.f235353w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235353w = r1
            goto L18
        L13:
            pea.j r0 = new pea.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235353w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            fkg.a r5 = r5.f235355p
            h90.a r7 = new h90.a
            r2 = 33
            r7.<init>(r2, r2)
            i80.c r2 = i80.c.H
            r4 = 20
            ufm.c r5 = fkg.a.m(r5, r6, r7, r2, r4)
            r0.f235353w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            i80.a r7 = (i80.a) r7
            i80.a r5 = mif.a.Z(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pea.l.y2(pea.l, java.lang.String, gim.c):java.io.Serializable");
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null, 0), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return (g) this.f235359t.getValue();
    }
}
