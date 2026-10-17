package ynb;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tnb.z;
import yg6.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ijb.a f315391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f315392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final znb.a f315393n;
    public final mjb.a o;

    public c(ijb.a savingsProductInteractor, j60.a bottomDialog, znb.a killSwitchDialogProvider, mjb.a savingsNavigationProvider) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(killSwitchDialogProvider, "killSwitchDialogProvider");
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        this.f315391l = savingsProductInteractor;
        this.f315392m = bottomDialog;
        this.f315393n = killSwitchDialogProvider;
        this.o = savingsNavigationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(ynb.c r5, do3.q r6, gim.c r7) {
        /*
            mjb.a r0 = r5.o
            boolean r1 = r7 instanceof ynb.b
            if (r1 == 0) goto L15
            r1 = r7
            ynb.b r1 = (ynb.b) r1
            int r2 = r1.f315390x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f315390x = r2
            goto L1a
        L15:
            ynb.b r1 = new ynb.b
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f315390x
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            ynb.c r5 = r1.u
            yhm.o.b(r7)
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof tnb.w
            if (r7 == 0) goto L4a
            r1.u = r5
            r1.f315390x = r4
            hob.d r0 = (hob.d) r0
            java.lang.Object r7 = r0.a(r1)
            if (r7 != r2) goto L47
            return r2
        L47:
            com.revolut.kompot.bridge.navigation.KompotDestination r7 = (com.revolut.kompot.bridge.navigation.KompotDestination) r7
            goto L65
        L4a:
            boolean r7 = r6 instanceof tnb.x
            if (r7 == 0) goto L5b
            tnb.x r6 = (tnb.x) r6
            java.lang.String r7 = r6.f272420a
            java.lang.String r6 = r6.f272421b
            hob.d r0 = (hob.d) r0
            com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination r7 = r0.b(r7, r6)
            goto L65
        L5b:
            boolean r6 = r6 instanceof tnb.y
            if (r6 == 0) goto L6b
            hob.d r0 = (hob.d) r0
            com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination r7 = r0.e()
        L65:
            r5.A2(r7)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L6b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.c.Z2(ynb.c, do3.q, gim.c):java.lang.Object");
    }

    public final Unit b3(do3.q qVar) {
        V2(new v(this, qVar, null, 13), new yi5.b(29));
        return Unit.f186387a;
    }
}
