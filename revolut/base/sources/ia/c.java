package ia;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\b\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001d"}, d2 = {"Lia/c;", "", "", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "title", "b", "c", "description", "Lia/b;", "Lia/b;", "()Lia/b;", "avatar", "Lia/h;", "d", "Lia/h;", "e", "()Lia/h;", "status", "Lia/a;", "Lia/a;", "()Lia/a;", "action", "", "Z", "()Z", "required", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("avatar")
    @NotNull
    private final b avatar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final h status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("action")
    private final a action;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    public c(String title, String str, b avatar, h status, a aVar, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(status, "status");
        this.title = title;
        this.description = str;
        this.avatar = avatar;
        this.status = status;
        this.action = aVar;
        this.required = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.avatar, cVar.avatar) && Intrinsics.f(this.status, cVar.status) && Intrinsics.f(this.action, cVar.action) && this.required == cVar.required;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (this.status.hashCode() + ((this.avatar.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        a aVar = this.action;
        return Boolean.hashCode(this.required) + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.description;
        b bVar = this.avatar;
        h hVar = this.status;
        a aVar = this.action;
        boolean z = this.required;
        StringBuilder sbM = v0.a.m("CellDto(title=", str, ", description=", str2, ", avatar=");
        sbM.append(bVar);
        sbM.append(", status=");
        sbM.append(hVar);
        sbM.append(", action=");
        sbM.append(aVar);
        sbM.append(", required=");
        sbM.append(z);
        sbM.append(")");
        return sbM.toString();
    }
}
