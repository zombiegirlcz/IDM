package t73;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_screen.common.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h93.f0 f268579w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, h93.f0 f0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = gVar;
        this.f268579w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z1(this.v, this.f268579w, continuation, 0);
            case 1:
                return new z1(this.v, this.f268579w, continuation, 1);
            default:
                return new z1(this.v, this.f268579w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.v;
        h93.f0 card = this.f268579w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = this.v;
                ((ha3.x) gVar2.B).m(card.f150110a);
                gVar2.f65441w.getClass();
                Intrinsics.checkNotNullParameter(card, "card");
                int i2 = R$string.card_screen_terminate_card_success_title;
                String str = card.f150114h.f13640b;
                String str2 = card.f150115j;
                if (str2 == null) {
                    str2 = "";
                }
                return yji.l.a1(gVar2, gVar2.X1(new nii.y0("STATUS_VIEW_ID_CARD_TERMINATED", new nii.j0((Clause) new TextLocalisedClause(i2, zhm.v.k(str, str2), null, 12), (Clause) new TextLocalisedClause(R$string.card_screen_terminate_card_success_message, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (StatusDialogDescriptionProgress) null, (Parcelable) null, (nii.u1) new nii.w1(6, new TextLocalisedClause(R$string.card_screen_terminate_card_success_button_title, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4076), false, 4)), null, null, new sy6.j(gVar2, card, continuation, 20), 3);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.C2(new b1(gVar.Q2(card), card.f150110a));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ha3.x) gVar.B).G(card.f150110a);
                gVar.f65441w.getClass();
                Intrinsics.checkNotNullParameter(card, "card");
                boolean z = card.f150112c;
                return gVar.X1(new nii.y0(null, new nii.j0((Clause) new TextLocalisedClause(z ? com.revolut.feature.cards_core.R$string.card_action_unblock_pin_cvv_virtual_success_title : com.revolut.feature.cards_core.R$string.card_action_unblock_pin_cvv_success_title, null, null, 14), (Clause) new TextLocalisedClause(z ? com.revolut.feature.cards_core.R$string.card_action_unblock_pin_cvv_virtual_success_subtitle : com.revolut.feature.cards_core.R$string.card_action_unblock_pin_cvv_success_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (StatusDialogDescriptionProgress) null, (Parcelable) null, (nii.u1) new nii.w1(6, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4076), false, 5));
        }
    }
}
