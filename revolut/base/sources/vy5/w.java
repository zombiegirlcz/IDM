package vy5;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends pfe.a {

    @NotNull
    public static final d Companion = new d();
    public final ua7.f A;
    public final rfb.b B;
    public final gte.a C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rea.m f293231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zca.a f293232n;
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xea.c f293233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uy5.f f293234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cu8.r0 f293235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wli.x f293236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c8i.x f293237t;
    public final g89.a u;
    public final ang.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cfa.g f293238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h95.a f293239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n8b.a f293240y;
    public final oy1.b z;

    public w(rea.m pocketDetailsInteractor, zca.a deactivateDialogModelProvider, j60.a bottomDialogExtension, xea.c pocketItemMapper, uy5.f currencyAccountsInteractor, cu8.r0 kycRequiredActionTransformer, wli.x deeplinkHandler, c8i.x moveMoneyFeatureChecker, g89.a learnMoreDeeplinkRepository, ang.f userInteractor, cfa.g removePocketExtension, h95.a overdraftNavigationCommandFactory, n8b.a countryInteractor, oy1.b apmNavigationProvider, ua7.f hiddenAccountsActionsExtension, rfb.b salaryAccountFeatureChecker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(deactivateDialogModelProvider, "deactivateDialogModelProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(pocketItemMapper, "pocketItemMapper");
        Intrinsics.checkNotNullParameter(currencyAccountsInteractor, "currencyAccountsInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(moveMoneyFeatureChecker, "moveMoneyFeatureChecker");
        Intrinsics.checkNotNullParameter(learnMoreDeeplinkRepository, "learnMoreDeeplinkRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(removePocketExtension, "removePocketExtension");
        Intrinsics.checkNotNullParameter(overdraftNavigationCommandFactory, "overdraftNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        Intrinsics.checkNotNullParameter(salaryAccountFeatureChecker, "salaryAccountFeatureChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f293231m = pocketDetailsInteractor;
        this.f293232n = deactivateDialogModelProvider;
        this.o = bottomDialogExtension;
        this.f293233p = pocketItemMapper;
        this.f293234q = currencyAccountsInteractor;
        this.f293235r = kycRequiredActionTransformer;
        this.f293236s = deeplinkHandler;
        this.f293237t = moveMoneyFeatureChecker;
        this.u = learnMoreDeeplinkRepository;
        this.v = userInteractor;
        this.f293238w = removePocketExtension;
        this.f293239x = overdraftNavigationCommandFactory;
        this.f293240y = countryInteractor;
        this.z = apmNavigationProvider;
        this.A = hiddenAccountsActionsExtension;
        this.B = salaryAccountFeatureChecker;
        this.C = featureToggleInteractor;
    }

    public static io3.d g3(sfe.m mVar) {
        Object obj2 = mVar.f262421c;
        if (obj2 instanceof io3.d) {
            return (io3.d) obj2;
        }
        return null;
    }

    @Override // pfe.a
    public final Set Z2() {
        yji.n[] elements = {this.f293238w, this.A};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa A[EDGE_INSN: B:41:0x00aa->B:31:0x00aa BREAK  A[LOOP:0: B:26:0x0092->B:43:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b3(java.lang.String r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.w.b3(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0337 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(sfe.m r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.w.c3(sfe.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d3(io3.d dVar) {
        A2(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(dVar, (AccountId) AccountId.Personal.f51414a, true, true, (wi0.b) null, false, true, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4016)));
    }

    public final void e3(ApmProduct apmProduct) {
        A2(this.z.b(apmProduct));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof vy5.s
            if (r0 == 0) goto L13
            r0 = r5
            vy5.s r0 = (vy5.s) r0
            int r1 = r0.f293210w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293210w = r1
            goto L18
        L13:
            vy5.s r0 = new vy5.s
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293210w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            grl.r2 r5 = grl.r2.ACCOUNT_DETAILS
            r0.f293210w = r3
            w4l.h r2 = w4l.h.f294642c
            h95.a r3 = r4.f293239x
            n95.d r3 = (n95.d) r3
            java.lang.Object r5 = r3.b(r2, r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r5)
            r4.A2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.w.f3(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
