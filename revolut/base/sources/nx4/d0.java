package nx4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0005\u0010\u000fR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnx4/d0;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "title", "", "c", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "required", "checked", "", "Lnx4/s0;", "Ljava/util/List;", "()Ljava/util/List;", "links", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final Boolean required;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("checked")
    private final Boolean checked;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("links")
    private final List<s0> links;

    public d0(Boolean bool, Boolean bool2, String str, String title, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = str;
        this.title = title;
        this.required = bool;
        this.checked = bool2;
        this.links = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.id, d0Var.id) && Intrinsics.f(this.title, d0Var.title) && Intrinsics.f(this.required, d0Var.required) && Intrinsics.f(this.checked, d0Var.checked) && Intrinsics.f(this.links, d0Var.links);
    }

    public final int hashCode() {
        String str = this.id;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        Boolean bool = this.required;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.checked;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<s0> list = this.links;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
