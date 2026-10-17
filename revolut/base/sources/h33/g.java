package h33;

import cli.y;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.DeliveryToFormScreenContract$InputData;
import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    public g(q stateMapper, DeliveryToFormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CardDeliveryRecipient cardDeliveryRecipient = inputData.f65193a;
        this.o = mra.d.b(this, new h(cardDeliveryRecipient.f65526a, cardDeliveryRecipient.f65527b, cardDeliveryRecipient.f65528c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
