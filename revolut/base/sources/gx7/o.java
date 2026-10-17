package gx7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\t\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u000e\u0010\u0014R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001f"}, d2 = {"Lgx7/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "f", "name", "c", "displayName", "d", "coverageAmount", "", "Lgx7/w;", "Ljava/util/List;", "h", "()Ljava/util/List;", "quotes", "Lgx7/n;", "coverages", "Lgx7/h;", "g", "documents", "Lgx7/v;", "Lgx7/v;", "()Lgx7/v;", "promotionalBanner", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayName")
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("coverageAmount")
    @NotNull
    private final String coverageAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("quotes")
    @NotNull
    private final List<w> quotes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("coverages:")
    @NotNull
    private final List<n> coverages;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<h> documents;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("promotionalBanner")
    private final v promotionalBanner;

    public o(String id10, String name, String displayName, String coverageAmount, ArrayList quotes, ArrayList coverages, ArrayList documents, v vVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(coverageAmount, "coverageAmount");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(coverages, "coverages");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.id = id10;
        this.name = name;
        this.displayName = displayName;
        this.coverageAmount = coverageAmount;
        this.quotes = quotes;
        this.coverages = coverages;
        this.documents = documents;
        this.promotionalBanner = vVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCoverageAmount() {
        return this.coverageAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCoverages() {
        return this.coverages;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && Intrinsics.f(this.name, oVar.name) && Intrinsics.f(this.displayName, oVar.displayName) && Intrinsics.f(this.coverageAmount, oVar.coverageAmount) && Intrinsics.f(this.quotes, oVar.quotes) && Intrinsics.f(this.coverages, oVar.coverages) && Intrinsics.f(this.documents, oVar.documents) && Intrinsics.f(this.promotionalBanner, oVar.promotionalBanner);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final v getPromotionalBanner() {
        return this.promotionalBanner;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getQuotes() {
        return this.quotes;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.d(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.displayName), 31, this.coverageAmount), 31, this.quotes), 31, this.coverages), 31, this.documents);
        v vVar = this.promotionalBanner;
        return iD + (vVar == null ? 0 : vVar.hashCode());
    }
}
