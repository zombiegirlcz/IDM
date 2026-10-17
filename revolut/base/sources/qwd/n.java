package qwd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f249869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurrencyImage f249870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f249871c;
    public final boolean d;
    public final List e;
    public final List f;

    public n(TextLocalisedClause titleClause, CurrencyImage currencyImage, TextLocalisedClause confirmButtonClause, boolean z, List keyboardSuggestions, List items) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(confirmButtonClause, "confirmButtonClause");
        Intrinsics.checkNotNullParameter(keyboardSuggestions, "keyboardSuggestions");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f249869a = titleClause;
        this.f249870b = currencyImage;
        this.f249871c = confirmButtonClause;
        this.d = z;
        this.e = keyboardSuggestions;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f249869a.equals(nVar.f249869a) && this.f249870b.equals(nVar.f249870b) && this.f249871c.equals(nVar.f249871c) && this.d == nVar.d && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(j6.a.c(t61.a.a((this.f249870b.hashCode() + (this.f249869a.hashCode() * 31)) * 31, 31, this.f249871c), 31, this.d), 31, this.e);
    }
}
