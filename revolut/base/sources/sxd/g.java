package sxd;

import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.standingordertopup.impl.ui.model.SuggestionItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutoTopUpState f266425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopupMethod.StoredMethod f266426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f266427c;
    public final SuggestionItem d;
    public final List e;
    public final SuggestionItem f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f266428g;

    public g(AutoTopUpState orderState, TopupMethod.StoredMethod storedMethod, List thresholdSuggestions, SuggestionItem suggestionItem, List amountSuggestions, SuggestionItem suggestionItem2, boolean z) {
        Intrinsics.checkNotNullParameter(orderState, "orderState");
        Intrinsics.checkNotNullParameter(thresholdSuggestions, "thresholdSuggestions");
        Intrinsics.checkNotNullParameter(amountSuggestions, "amountSuggestions");
        this.f266425a = orderState;
        this.f266426b = storedMethod;
        this.f266427c = thresholdSuggestions;
        this.d = suggestionItem;
        this.e = amountSuggestions;
        this.f = suggestionItem2;
        this.f266428g = z;
    }

    public static g a(g gVar, TopupMethod.StoredMethod storedMethod, List thresholdSuggestions, SuggestionItem suggestionItem, List amountSuggestions, SuggestionItem suggestionItem2, boolean z, int i) {
        TopupMethod.StoredMethod storedMethod2 = storedMethod;
        AutoTopUpState orderState = gVar.f266425a;
        if ((i & 2) != 0) {
            storedMethod2 = gVar.f266426b;
        }
        if ((i & 4) != 0) {
            thresholdSuggestions = gVar.f266427c;
        }
        if ((i & 8) != 0) {
            suggestionItem = gVar.d;
        }
        if ((i & 16) != 0) {
            amountSuggestions = gVar.e;
        }
        if ((i & 32) != 0) {
            suggestionItem2 = gVar.f;
        }
        if ((i & 64) != 0) {
            z = gVar.f266428g;
        }
        boolean z3 = z;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(orderState, "orderState");
        Intrinsics.checkNotNullParameter(thresholdSuggestions, "thresholdSuggestions");
        Intrinsics.checkNotNullParameter(amountSuggestions, "amountSuggestions");
        SuggestionItem suggestionItem3 = suggestionItem2;
        List list = amountSuggestions;
        SuggestionItem suggestionItem4 = suggestionItem;
        return new g(orderState, storedMethod2, thresholdSuggestions, suggestionItem4, list, suggestionItem3, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f266425a, gVar.f266425a) && Intrinsics.f(this.f266426b, gVar.f266426b) && Intrinsics.f(this.f266427c, gVar.f266427c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f266428g == gVar.f266428g;
    }

    public final int hashCode() {
        int iHashCode = this.f266425a.hashCode() * 31;
        TopupMethod.StoredMethod storedMethod = this.f266426b;
        int iD = p.a.d((iHashCode + (storedMethod == null ? 0 : storedMethod.hashCode())) * 31, 31, this.f266427c);
        SuggestionItem suggestionItem = this.d;
        int iD2 = p.a.d((iD + (suggestionItem == null ? 0 : suggestionItem.hashCode())) * 31, 31, this.e);
        SuggestionItem suggestionItem2 = this.f;
        return Boolean.hashCode(this.f266428g) + ((iD2 + (suggestionItem2 != null ? suggestionItem2.hashCode() : 0)) * 31);
    }
}
