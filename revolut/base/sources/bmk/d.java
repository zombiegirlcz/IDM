package bmk;

import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.o9;
import com.revolut.core.ui_kit.delegates.p9;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptLayout;
import ip0.dy;
import ip0.iy;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16859c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16860g;

    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Serializable serializable, Object obj5, Object obj6, int i) {
        this.f16857a = i;
        this.f16858b = obj2;
        this.f16859c = obj3;
        this.d = obj4;
        this.e = serializable;
        this.f = obj5;
        this.f16860g = obj6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16857a) {
            case 0:
                ((q) this.f16858b).e3((hha.d) this.f16859c, (iha.h) this.d, (whk.e) this.e, (PlanOfferPromptLayout) this.f, (Function1) this.f16860g);
                return Unit.f186387a;
            case 1:
                NewRevolutCardDelegate newRevolutCardDelegate = (NewRevolutCardDelegate) this.f16858b;
                o9 o9Var = (o9) this.f16859c;
                NewRevolutCardDelegate.Model model = (NewRevolutCardDelegate.Model) this.d;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.e;
                NewRevolutCardView newRevolutCardView = (NewRevolutCardView) this.f;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f16860g;
                NewRevolutCardView newRevolutCardView2 = o9Var.f54535h;
                NewRevolutCardView newRevolutCardView3 = o9Var.f54535h;
                model.d.getClass();
                newRevolutCardView2.setFrontPrimaryColor(-16777216);
                dy dyVar = model.d;
                dyVar.getClass();
                newRevolutCardView2.setFrontSecondaryColor(-7829368);
                if (ref$BooleanRef.f186407a && newRevolutCardView != null) {
                    NewRevolutCardDelegate.Model model2 = (NewRevolutCardDelegate.Model) ref$ObjectRef.f186409a;
                    if (model2 == null) {
                        model2 = model;
                    }
                    newRevolutCardDelegate.t(newRevolutCardView, model2);
                }
                iy iyVarE = p9.e(model);
                newRevolutCardView3.setFrontCardTag(iyVarE != null ? NewRevolutCardDelegate.u(iyVarE, NewRevolutCardDelegate.p(model, true), dyVar.f163975g) : null);
                iy iyVarA = p9.a(model);
                newRevolutCardView3.setBackCardTag(iyVarA != null ? NewRevolutCardDelegate.u(iyVarA, NewRevolutCardDelegate.p(model, true), dyVar.f163975g) : null);
                return Unit.f186387a;
            default:
                return Boolean.valueOf(((SupportedSurfaceCombination) this.f16858b).checkSupported((SupportedSurfaceCombination.FeatureSettings) this.f16859c, (List) this.d, (LinkedHashMap) this.e, (List) this.f, (List) this.f16860g));
        }
    }
}
