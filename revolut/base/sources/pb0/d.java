package pb0;

import com.revolut.feature.backend_flow.domain.models.CardSelectionItem;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardSelectionItem f234587b;

    public /* synthetic */ d(CardSelectionItem cardSelectionItem, int i) {
        this.f234586a = i;
        this.f234587b = cardSelectionItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List cards = (List) obj2;
        switch (this.f234586a) {
            case 0:
                Intrinsics.checkNotNullParameter(cards, "cards");
                break;
            default:
                Intrinsics.checkNotNullParameter(cards, "cards");
                break;
        }
        return CardSelectionItem.d(this.f234587b, cards, null, 11);
    }
}
