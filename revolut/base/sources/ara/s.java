package ara;

import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardOwnerInfoState f8619b;

    public /* synthetic */ s(CardOwnerInfoState cardOwnerInfoState, int i) {
        this.f8618a = i;
        this.f8619b = cardOwnerInfoState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8618a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, this.f8619b, l.f8607a, null, null, 12);
            default:
                i update2 = (i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return i.a(update2, this.f8619b, null, null, null, 14);
        }
    }
}
