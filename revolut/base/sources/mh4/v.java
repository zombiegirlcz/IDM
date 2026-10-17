package mh4;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f205408w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f205408w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f205408w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(this.f205408w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
            default:
                v vVar3 = new v(this.f205408w, continuation, 2);
                vVar3.v = obj2;
                return vVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 9;
        y yVar = this.f205408w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) data.getContent();
                boolean loading = data.getLoading();
                y yVar2 = this.f205408w;
                yVar2.H2(yVar2.f205414s, new l1.e(hVar, data, loading, i2));
                int i3 = 1;
                if (yVar2.I2().f205396h == null) {
                    yVar2.d0(false, true);
                }
                Continuation continuation = null;
                mv3.j jVar = hVar != null ? hVar.f205387a : null;
                if (jVar != null && yVar2.o.f68296a && !yVar2.I2().f205394c) {
                    yji.l.a1(yVar2, yVar2.X1(new y0("ID_PRODUCTS_FOUND_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.refinancing_offer_credit_to_selection_intro_bottom_sheet_title, zhm.u.c(new TextClause(jVar.f209131a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Clause) new TextLocalisedClause(R$string.refinancing_offer_credit_to_selection_intro_bottom_sheet_subtitle, zhm.u.c(new TextClause(jVar.f209132b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.refinancing_offer_credit_to_selection_intro_bottom_sheet_action_primary, zhm.u.c(new TextClause(jVar.f209133c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4)), null, null, new u(yVar2, continuation, i3), 3);
                }
                break;
            case 1:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(str, null, 0, false, true, true, 65422))));
                break;
            default:
                ax4.b bVar = (ax4.b) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f205414s, new ah4.f(bVar, 9));
                break;
        }
        return Unit.f186387a;
    }
}
