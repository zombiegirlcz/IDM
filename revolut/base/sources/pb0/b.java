package pb0;

import com.revolut.feature.backend_flow.domain.models.BackendCard;
import com.revolut.feature.backend_flow.domain.models.CardCellItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardCellItem f234582b;

    public /* synthetic */ b(CardCellItem cardCellItem, int i) {
        this.f234581a = i;
        this.f234582b = cardCellItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BackendCard card = (BackendCard) obj2;
        switch (this.f234581a) {
            case 0:
                Intrinsics.checkNotNullParameter(card, "card");
                break;
            default:
                Intrinsics.checkNotNullParameter(card, "card");
                break;
        }
        return CardCellItem.d(this.f234582b, card);
    }
}
