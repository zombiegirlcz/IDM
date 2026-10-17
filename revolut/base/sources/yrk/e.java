package yrk;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.statements.api.StatementsApi$FeatureToggles;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import com.revolut.feature.topup_screen.impl.google_pay.flow.GooglePayFlowContract$Step;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.junior_upgrade.impl.model.PlanConfigurations;
import ip0.nb0;
import ip0.pb0;
import ip0.qi;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import oki.h;
import ste.l;
import ste.s;
import yhm.r;
import zhm.u;
import zzd.k0;
import zzd.q;
import zzd.t;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f316327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f316328c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj2, int i, Object obj3, Object obj4) {
        this.f316326a = i;
        this.f316327b = obj2;
        this.f316328c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yrk.e.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2) {
        zxj.a aVar = (zxj.a) this.f316327b;
        xfa.b bVar = (xfa.b) this.f316328c;
        FeatureCommand featureCommand = (FeatureCommand) this.d;
        r rVar = (r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        return aVar.e.a(new PlanConfigurations((List) rVar.f314201a, (List) rVar.f314202b), ((PricingPlanSubscription) rVar.f314203c).f81129a, bVar, featureCommand, null);
    }

    private final Object c(Object obj2) {
        Object objA;
        k0 k0Var = (k0) this.f316327b;
        gte.a aVar = k0Var.f;
        q qVar = (q) this.f316328c;
        w0 w0Var = (w0) this.d;
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        aim.e eVarB = u.b();
        if (k0.f326682h.contains(new DocumentsHubType(k0Var.f326686g.f88356a))) {
            if (!((jte.d) aVar).c(StatementsApi$FeatureToggles.DocumentsHubMvp.f88210c)) {
                wxd.r rVarD = k0.d(qVar);
                if (rVarD != null) {
                    objA = k0Var.a(rVarD, qVar, w0Var);
                } else {
                    pb0 pb0VarB = nb0.b(pb0.Companion, "documents-hub:product-loading", ((jte.d) aVar).c(StatementsApi$FeatureToggles.DocumentsHub.f88209c), 0, false, 20);
                    yp0.b.l(pb0VarB, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, null, false, 60);
                    objA = pb0VarB;
                }
                eVarB.add(objA);
            }
            eVarB.add(new qi("documents-hub:tabs-loading", 3));
        }
        eVarB.addAll(zzd.e.a());
        Unit unit = Unit.f186387a;
        return new t(u.a(eVarB), k0Var.b(), new AnalyticsContext(w0Var));
    }

    private final Object d(Object obj2) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f316327b;
        com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar = (com.revolut.feature.topup_screen.impl.google_pay.flow.b) this.f316328c;
        GooglePayFlowContract$Step googlePayFlowContract$Step = (GooglePayFlowContract$Step) this.d;
        dii.g result = (dii.g) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        ref$BooleanRef.f186407a = true;
        if (result instanceof dii.e) {
            GooglePayFlowContract$Step.FeeRequiredDialog feeRequiredDialog = (GooglePayFlowContract$Step.FeeRequiredDialog) googlePayFlowContract$Step;
            GooglePayFee.FeeRequired feeRequired = feeRequiredDialog.f91033a;
            xze.d dVar = feeRequiredDialog.f91034b;
            bVar.n2(new z9m.a(bVar, dVar, feeRequired, (Continuation) null, 15), new zg8.d(1, bVar, com.revolut.feature.topup_screen.impl.google_pay.flow.b.class, "handleGenericFlowError", "handleGenericFlowError(Ljava/lang/Throwable;)Z", 0, 22));
        } else if (result instanceof dii.f) {
            bVar.C2(new l(true));
        }
        return Unit.f186387a;
    }

    private final Object e(Object obj2) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f316327b;
        com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar = (com.revolut.feature.topup_screen.impl.google_pay.flow.b) this.f316328c;
        yki.b bVar2 = (yki.b) this.d;
        ste.u result = (ste.u) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        ref$BooleanRef.f186407a = true;
        if (result instanceof s) {
            if (Intrinsics.f(((s) result).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                bVar.B2();
                bVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
            }
        } else {
            if (!(result instanceof ste.t)) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(bVar2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x02f3  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 2908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yrk.e.invoke(java.lang.Object):java.lang.Object");
    }
}
