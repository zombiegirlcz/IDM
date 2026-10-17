package nx4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lnx4/z0;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "text", "c", "d", "style", "horizontalInset", "", "Lnx4/s0;", "Ljava/util/List;", "()Ljava/util/List;", "links", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("style")
    private final String style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("horizontalInset")
    private final String horizontalInset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("links")
    private final List<s0> links;

    public z0(String id10, String text, String str, String str2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = id10;
        this.text = text;
        this.style = str;
        this.horizontalInset = str2;
        this.links = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHorizontalInset() {
        return this.horizontalInset;
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
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.id, z0Var.id) && Intrinsics.f(this.text, z0Var.text) && Intrinsics.f(this.style, z0Var.style) && Intrinsics.f(this.horizontalInset, z0Var.horizontalInset) && Intrinsics.f(this.links, z0Var.links);
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.text);
        String str = this.style;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.horizontalInset;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<s0> list = this.links;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
