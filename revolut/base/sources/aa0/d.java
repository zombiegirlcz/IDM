package aa0;

import com.revolut.feature.backend_flow.domain.models.CardInputItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f2726a;

    public d(y cardNumberValidator) {
        Intrinsics.checkNotNullParameter(cardNumberValidator, "cardNumberValidator");
        this.f2726a = cardNumberValidator;
    }

    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        CardInputItem targetItem = (CardInputItem) inputItem;
        String updatedValue = (String) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (this.f2726a.b(updatedValue) == e.VALID) {
            int length = updatedValue.length();
            if (length < 0) {
                length = 0;
            }
            if (length > 12) {
                length = 12;
            }
            IntRange range = kotlin.ranges.f.o(0, length);
            String replacement = kotlin.text.a0.C("*", length);
            Intrinsics.checkNotNullParameter(updatedValue, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            Intrinsics.checkNotNullParameter(replacement, "replacement");
            updatedValue = kotlin.text.d0.j0(updatedValue, range.f186448a, range.f186449b + 1, replacement).toString();
        }
        String id10 = targetItem.f63342a;
        boolean z = targetItem.f63343b;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new CardInputItem(id10, updatedValue, z);
    }
}
