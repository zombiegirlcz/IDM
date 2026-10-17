package cnh;

import e60.s;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import rea.m;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f25426l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f25427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f25428n;
    public Object o;

    public f(wsg.n walletInteractor, m pocketDetailsInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f25427m = walletInteractor;
        this.f25428n = pocketDetailsInteractor;
        this.o = jointAccountsInteractor;
    }

    @Override // yji.n
    public void D2() {
        switch (this.f25426l) {
            case 1:
                n.j2(this, rd0.e.b(((s) ((e60.a) this.f25427m)).f122868g), null, new ew1.d(this, null, 22), 3);
                break;
        }
    }

    @Override // yji.n
    public void F2() {
        switch (this.f25426l) {
            case 0:
                this.f25428n = null;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Z2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t38.u
            if (r0 == 0) goto L13
            r0 = r6
            t38.u r0 = (t38.u) r0
            int r1 = r0.f267711x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267711x = r1
            goto L18
        L13:
            t38.u r0 = new t38.u
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267711x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            wsg.n r2 = r0.u
            yhm.o.b(r6)
            goto L4f
        L38:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f25427m
            r2 = r6
            wsg.n r2 = (wsg.n) r2
            java.lang.Object r6 = r5.o
            g48.r0 r6 = (g48.r0) r6
            r0.u = r2
            r0.f267711x = r4
            java.lang.Object r6 = t38.s.c(r6, r0)
            if (r6 != r1) goto L4f
            goto L60
        L4f:
            com.revolut.core.model.account.AccountId r6 = (com.revolut.core.model.account.AccountId) r6
            ufm.i r6 = r2.y(r6)
            r2 = 0
            r0.u = r2
            r0.f267711x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cnh.f.Z2(gim.c):java.lang.Object");
    }

    public f(ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f25427m = instrumentTickerInteractor;
    }

    public f(e60.a mediaPickerControllerExtension, cpa.a profileAvatarEncoder, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(profileAvatarEncoder, "profileAvatarEncoder");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f25427m = mediaPickerControllerExtension;
        this.f25428n = profileAvatarEncoder;
        this.o = userInteractor;
    }

    public f(k18.c provider, x8h.m etpProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        this.f25427m = provider;
        this.f25428n = etpProductAvailabilityInteractor;
        this.o = new vii.b();
    }
}
