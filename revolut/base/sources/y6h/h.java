package y6h;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Ly6h/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "c", "shortDescription", "description", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "sellCurrencyAmount", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("shortDescription")
    @NotNull
    private final String shortDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("sellCurrencyAmount")
    @NotNull
    private final jo3.a sellCurrencyAmount;

    public h(String title, String shortDescription, String description, jo3.a sellCurrencyAmount) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sellCurrencyAmount, "sellCurrencyAmount");
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = description;
        this.sellCurrencyAmount = sellCurrencyAmount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getSellCurrencyAmount() {
        return this.sellCurrencyAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.shortDescription, hVar.shortDescription) && Intrinsics.f(this.description, hVar.description) && Intrinsics.f(this.sellCurrencyAmount, hVar.sellCurrencyAmount);
    }

    public final int hashCode() {
        return this.sellCurrencyAmount.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.shortDescription), 31, this.description);
    }
}
