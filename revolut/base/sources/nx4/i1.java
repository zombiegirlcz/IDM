package nx4;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001b¨\u0006\u001d"}, d2 = {"Lnx4/i1;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "getTitle", "title", "c", "description", "Lnx4/k0;", "d", "Lnx4/k0;", "()Lnx4/k0;", "image", "Lnx4/n;", "e", "Lnx4/n;", "()Lnx4/n;", "action", "", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "valueUpdated", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("image")
    @NotNull
    private final k0 image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("action")
    private final n action;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("valueUpdated")
    private final Boolean valueUpdated;

    public i1(String id10, String title, String description, k0 image, n nVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.id = id10;
        this.title = title;
        this.description = description;
        this.image = image;
        this.action = nVar;
        this.valueUpdated = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k0 getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getValueUpdated() {
        return this.valueUpdated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.id, i1Var.id) && Intrinsics.f(this.title, i1Var.title) && Intrinsics.f(this.description, i1Var.description) && Intrinsics.f(this.image, i1Var.image) && Intrinsics.f(this.action, i1Var.action) && Intrinsics.f(this.valueUpdated, i1Var.valueUpdated);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = (this.image.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.title), 31, this.description)) * 31;
        n nVar = this.action;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Boolean bool = this.valueUpdated;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
