package pfk;

import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanCancelService;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class x {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanCancelService f235707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f235708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f235709c;
    public final w4l.f d;

    public x(PricingPlanCancelService pricingPlanCancelService, ne0.j infoCache) {
        Intrinsics.checkNotNullParameter(pricingPlanCancelService, "pricingPlanCancelService");
        Intrinsics.checkNotNullParameter(infoCache, "infoCache");
        this.f235707a = pricingPlanCancelService;
        this.f235708b = infoCache;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: pfk.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f235698b;

            {
                this.f235698b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                int i3 = 1;
                x xVar = this.f235698b;
                switch (i2) {
                    case 0:
                        od0.i planId = (od0.i) obj2;
                        iha.g benefitsToLoseInfo = (iha.g) obj3;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        Intrinsics.checkNotNullParameter(benefitsToLoseInfo, "benefitsToLoseInfo");
                        ne0.j jVar = xVar.f235708b;
                        String str = (String) planId.f224257a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("KEY_BENEFITS_TO_LOSE_INFO".concat(str), benefitsToLoseInfo);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<hfk.b> downgradeSurveyConfig = xVar.f235707a.getDowngradeSurveyConfig();
                        pfa.c cVar = new pfa.c(new pd4.u(28), i3);
                        downgradeSurveyConfig.getClass();
                        ufm.i iVar = new ufm.i(downgradeSurveyConfig, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        iha.c config = (iha.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        xVar.f235708b.f("KEY_DOWNGRADE_SURVEY_CONFIG", config);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        od0.i planId2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        efm.d0<hfk.h> currentPlanBenefitsToLose = xVar.f235707a.getCurrentPlanBenefitsToLose((String) planId2.f224257a);
                        w wVar = w.f;
                        o0.a aVar = new o0.a(21);
                        currentPlanBenefitsToLose.getClass();
                        ufm.i iVar2 = new ufm.i(currentPlanBenefitsToLose, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: pfk.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f235695b;

            {
                this.f235695b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        od0.i planId = (od0.i) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        ne0.j jVar = this.f235695b.f235708b;
                        String str = (String) planId.f224257a;
                        if (str == null) {
                            str = "";
                        }
                        return (iha.g) jVar.get("KEY_BENEFITS_TO_LOSE_INFO".concat(str));
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (iha.c) this.f235695b.f235708b.get("KEY_DOWNGRADE_SURVEY_CONFIG");
                }
            }
        };
        final int i2 = 2;
        this.f235709c = new w4l.f(function2, function1, new Function2(this) { // from class: pfk.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f235698b;

            {
                this.f235698b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                int i3 = 1;
                x xVar = this.f235698b;
                switch (i22) {
                    case 0:
                        od0.i planId = (od0.i) obj2;
                        iha.g benefitsToLoseInfo = (iha.g) obj3;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        Intrinsics.checkNotNullParameter(benefitsToLoseInfo, "benefitsToLoseInfo");
                        ne0.j jVar = xVar.f235708b;
                        String str = (String) planId.f224257a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("KEY_BENEFITS_TO_LOSE_INFO".concat(str), benefitsToLoseInfo);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<hfk.b> downgradeSurveyConfig = xVar.f235707a.getDowngradeSurveyConfig();
                        pfa.c cVar = new pfa.c(new pd4.u(28), i3);
                        downgradeSurveyConfig.getClass();
                        ufm.i iVar = new ufm.i(downgradeSurveyConfig, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        iha.c config = (iha.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        xVar.f235708b.f("KEY_DOWNGRADE_SURVEY_CONFIG", config);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        od0.i planId2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        efm.d0<hfk.h> currentPlanBenefitsToLose = xVar.f235707a.getCurrentPlanBenefitsToLose((String) planId2.f224257a);
                        w wVar = w.f;
                        o0.a aVar = new o0.a(21);
                        currentPlanBenefitsToLose.getClass();
                        ufm.i iVar2 = new ufm.i(currentPlanBenefitsToLose, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 3;
        Function2 function22 = new Function2(this) { // from class: pfk.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f235698b;

            {
                this.f235698b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                int i32 = 1;
                x xVar = this.f235698b;
                switch (i22) {
                    case 0:
                        od0.i planId = (od0.i) obj2;
                        iha.g benefitsToLoseInfo = (iha.g) obj3;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        Intrinsics.checkNotNullParameter(benefitsToLoseInfo, "benefitsToLoseInfo");
                        ne0.j jVar = xVar.f235708b;
                        String str = (String) planId.f224257a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("KEY_BENEFITS_TO_LOSE_INFO".concat(str), benefitsToLoseInfo);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<hfk.b> downgradeSurveyConfig = xVar.f235707a.getDowngradeSurveyConfig();
                        pfa.c cVar = new pfa.c(new pd4.u(28), i32);
                        downgradeSurveyConfig.getClass();
                        ufm.i iVar = new ufm.i(downgradeSurveyConfig, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        iha.c config = (iha.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        xVar.f235708b.f("KEY_DOWNGRADE_SURVEY_CONFIG", config);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        od0.i planId2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        efm.d0<hfk.h> currentPlanBenefitsToLose = xVar.f235707a.getCurrentPlanBenefitsToLose((String) planId2.f224257a);
                        w wVar = w.f;
                        o0.a aVar = new o0.a(21);
                        currentPlanBenefitsToLose.getClass();
                        ufm.i iVar2 = new ufm.i(currentPlanBenefitsToLose, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i5 = 0;
        this.d = new w4l.f(function22, new Function1(this) { // from class: pfk.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f235695b;

            {
                this.f235695b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        od0.i planId = (od0.i) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        ne0.j jVar = this.f235695b.f235708b;
                        String str = (String) planId.f224257a;
                        if (str == null) {
                            str = "";
                        }
                        return (iha.g) jVar.get("KEY_BENEFITS_TO_LOSE_INFO".concat(str));
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (iha.c) this.f235695b.f235708b.get("KEY_DOWNGRADE_SURVEY_CONFIG");
                }
            }
        }, new Function2(this) { // from class: pfk.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f235698b;

            {
                this.f235698b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                int i32 = 1;
                x xVar = this.f235698b;
                switch (i22) {
                    case 0:
                        od0.i planId = (od0.i) obj2;
                        iha.g benefitsToLoseInfo = (iha.g) obj3;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        Intrinsics.checkNotNullParameter(benefitsToLoseInfo, "benefitsToLoseInfo");
                        ne0.j jVar = xVar.f235708b;
                        String str = (String) planId.f224257a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("KEY_BENEFITS_TO_LOSE_INFO".concat(str), benefitsToLoseInfo);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<hfk.b> downgradeSurveyConfig = xVar.f235707a.getDowngradeSurveyConfig();
                        pfa.c cVar = new pfa.c(new pd4.u(28), i32);
                        downgradeSurveyConfig.getClass();
                        ufm.i iVar = new ufm.i(downgradeSurveyConfig, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        iha.c config = (iha.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        xVar.f235708b.f("KEY_DOWNGRADE_SURVEY_CONFIG", config);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        od0.i planId2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        efm.d0<hfk.h> currentPlanBenefitsToLose = xVar.f235707a.getCurrentPlanBenefitsToLose((String) planId2.f224257a);
                        w wVar = w.f;
                        o0.a aVar = new o0.a(21);
                        currentPlanBenefitsToLose.getClass();
                        ufm.i iVar2 = new ufm.i(currentPlanBenefitsToLose, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
