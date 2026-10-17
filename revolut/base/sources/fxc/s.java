package fxc;

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
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import e0f.z;
import fjd.g0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.l1;
import nii.n1;
import nii.u1;
import nii.w1;
import nii.y0;
import t61.c;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f138803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t61.g f138804x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(u uVar, t61.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f138803w = uVar;
        this.f138804x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f138803w, this.f138804x, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f138803w, this.f138804x, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            default:
                s sVar3 = new s(this.f138803w, this.f138804x, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        t61.g gVar = this.f138804x;
        switch (i) {
            case 0:
                t61.b bVar = (t61.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (bVar.f268130b instanceof c.b) {
                    y0 y0Var = new y0("VERIFICATION_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.emergency_payment_setup_select_card_verified_dialog_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.emergency_payment_setup_select_card_verified_dialog_description, zhm.u.c(new TextClause(j6.a.q("··", gVar.d), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.emergency_payment_setup_select_card_verified_dialog_primary_button_title, null, null, 14), new TextLocalisedClause(R$string.emergency_payment_setup_select_card_verified_dialog_secondary_button_title, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4);
                    u uVar = this.f138803w;
                    yji.l.a1(uVar, uVar.X1(y0Var), null, null, new s(uVar, gVar, continuation, 1), 3);
                }
                break;
            case 1:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    this.f138803w.C2(new k(gVar));
                }
                break;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    u uVar2 = this.f138803w;
                    y51.a aVar4 = uVar2.f138805p;
                    String cardId = gVar.f268137a;
                    z zVar = (z) aVar4;
                    zVar.getClass();
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    efm.r rVarHide = ((u21.k) zVar.f121703a).f276539h.hide();
                    Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                    efm.r rVarFilter = rVarHide.filter(new e0f.k(new d7a.p(cardId, 27), 4));
                    Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
                    yji.l.a1(uVar2, rd0.e.b(rVarFilter), null, null, new s(uVar2, gVar, continuation, i2), 3);
                    uVar2.n2(new g0(uVar2, gVar, null, 24), new whi.b(6));
                } else {
                    int i3 = jli.h.f175850a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
