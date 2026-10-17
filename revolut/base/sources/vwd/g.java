package vwd;

import cli.p;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyClause f292706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f292707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyImage f292708c;
    public final TextLocalisedClause d;
    public final List e;

    public g(CurrencyClause titleClause, TextLocalisedClause descriptionClause, CurrencyImage currencyImage, TextLocalisedClause nextButtonClause, List items) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(descriptionClause, "descriptionClause");
        Intrinsics.checkNotNullParameter(currencyImage, "currencyImage");
        Intrinsics.checkNotNullParameter(nextButtonClause, "nextButtonClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f292706a = titleClause;
        this.f292707b = descriptionClause;
        this.f292708c = currencyImage;
        this.d = nextButtonClause;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f292706a.equals(gVar.f292706a) && this.f292707b.equals(gVar.f292707b) && this.f292708c.equals(gVar.f292708c) && this.d.equals(gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a((this.f292708c.hashCode() + t61.a.a(this.f292706a.hashCode() * 31, 31, this.f292707b)) * 31, 31, this.d);
    }
}
