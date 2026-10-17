package a4i;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"La4i/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "f", "shortDescription", "c", "d", "description", "La4i/b;", "La4i/b;", "e", "()La4i/b;", "details", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "amount", "amountInBaseCurrency", "amountConverted", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

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
    @lg.b("details")
    private final b details;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.b amount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amountInBaseCurrency")
    private final jo3.b amountInBaseCurrency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountConverted")
    private final jo3.b amountConverted;

    public c(String title, String shortDescription, String description, b bVar, jo3.b amount, jo3.b bVar2, jo3.b bVar3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = description;
        this.details = bVar;
        this.amount = amount;
        this.amountInBaseCurrency = bVar2;
        this.amountConverted = bVar3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getAmountConverted() {
        return this.amountConverted;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getAmountInBaseCurrency() {
        return this.amountInBaseCurrency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getDetails() {
        return this.details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.shortDescription, cVar.shortDescription) && Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.details, cVar.details) && Intrinsics.f(this.amount, cVar.amount) && Intrinsics.f(this.amountInBaseCurrency, cVar.amountInBaseCurrency) && Intrinsics.f(this.amountConverted, cVar.amountConverted);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.shortDescription), 31, this.description);
        b bVar = this.details;
        int iE = y.e(this.amount, (iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        jo3.b bVar2 = this.amountInBaseCurrency;
        int iHashCode = (iE + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.amountConverted;
        return iHashCode + (bVar3 != null ? bVar3.hashCode() : 0);
    }
}
