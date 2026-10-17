package ah1;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.shared.cards.model.SharedRevolutCard;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public SharedRevolutCard v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b f4868x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b bVar, SharedRevolutCard sharedRevolutCard, Continuation continuation) {
        super(2, continuation);
        this.f4868x = bVar;
        this.v = sharedRevolutCard;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f4868x, this.v, continuation);
            default:
                return new n(this.f4868x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SharedRevolutCard sharedRevolutCard;
        SharedRevolutCard sharedRevolutCard2;
        TextLocalisedClause textLocalisedClause;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f4867w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                SharedRevolutCard sharedRevolutCard3 = this.v;
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b bVar = this.f4868x;
                m mVar = new m(bVar, sharedRevolutCard3, null, 0);
                this.f4867w = 1;
                Object objB = pu7.a.B(bVar.k, "design_config", mVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f4867w;
                Continuation continuation = null;
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b bVar2 = this.f4868x;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    SharedRevolutCardWrapper sharedRevolutCardWrapper = (SharedRevolutCardWrapper) ((e) ((j2) bVar2.f60901t.f22677a).getValue()).f4851a.getContent();
                    if (sharedRevolutCardWrapper == null || (sharedRevolutCard = ((RetailCardWrapper) sharedRevolutCardWrapper).f64443a) == null) {
                        return Unit.f186387a;
                    }
                    com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.a aVar3 = new com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.a(bVar2, sharedRevolutCard, null);
                    this.v = sharedRevolutCard;
                    this.f4867w = 1;
                    if (bVar2.p2(this, aVar3) == aVar2) {
                        return aVar2;
                    }
                    sharedRevolutCard2 = sharedRevolutCard;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sharedRevolutCard2 = this.v;
                    yhm.o.b(obj2);
                }
                int i3 = k.f4863b[bVar2.I2().ordinal()];
                if (i3 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.google_pay_in_app_verification_success_title, null, null, 14);
                } else if (i3 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.apple_pay_in_app_verification_success_title, null, null, 14);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.samsung_wallet_in_app_verification_success_title, null, null, 14);
                }
                yji.l.a1(bVar2, bVar2.X1(new y0(null, new j0((Clause) textLocalisedClause, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new af4.e(bVar2, sharedRevolutCard2, continuation, 7), 3);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f4868x = bVar;
    }
}
