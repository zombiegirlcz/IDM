package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lq90/w1;", "Lq90/v;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "e", "title", "c", "d", "style", "linkStyle", "", "Lq90/x1;", "Ljava/util/List;", "()Ljava/util/List;", "items", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w1 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("style")
    @NotNull
    private final String style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("linkStyle")
    private final String linkStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<x1> items;

    public w1(String id10, String str, String style, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = id10;
        this.title = str;
        this.style = style;
        this.linkStyle = str2;
        this.items = items;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLinkStyle() {
        return this.linkStyle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.id, w1Var.id) && Intrinsics.f(this.title, w1Var.title) && Intrinsics.f(this.style, w1Var.style) && Intrinsics.f(this.linkStyle, w1Var.linkStyle) && Intrinsics.f(this.items, w1Var.items);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.style);
        String str2 = this.linkStyle;
        return this.items.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
