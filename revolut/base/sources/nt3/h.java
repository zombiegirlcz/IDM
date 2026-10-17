package nt3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnt3/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "description", "Lnt3/g;", "c", "Lnt3/g;", "()Lnt3/g;", "primaryButton", "d", "secondaryButton", "", "Lnx4/m0;", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryButton")
    @NotNull
    private final g primaryButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("secondaryButton")
    private final g secondaryButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("items")
    private final List<m0> items;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
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
        return Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.description, hVar.description) && Intrinsics.f(this.primaryButton, hVar.primaryButton) && Intrinsics.f(this.secondaryButton, hVar.secondaryButton) && Intrinsics.f(this.items, hVar.items);
    }

    public final int hashCode() {
        int iHashCode = (this.primaryButton.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.description)) * 31;
        g gVar = this.secondaryButton;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List<m0> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
