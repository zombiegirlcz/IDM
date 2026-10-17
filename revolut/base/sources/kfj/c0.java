package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001d"}, d2 = {"Lkfj/c0;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/f0;", "a", "Lkfj/f0;", "c", "()Lkfj/f0;", "icon", "b", "Ljava/lang/String;", "d", "label", "action", "Lkfj/b0;", "Lkfj/b0;", "e", "()Lkfj/b0;", "params", "Lkfj/g0;", "Lkfj/g0;", "()Lkfj/g0;", "content", "f", "g", "url", "style", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("icon")
    private final f0 icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final String action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("params")
    private final b0 params;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("content")
    private final g0 content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("url")
    private final String url;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("style")
    private final String style;

    public c0(f0 f0Var, String label, String str, b0 b0Var, g0 g0Var, String str2, String str3) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.icon = f0Var;
        this.label = label;
        this.action = str;
        this.params = b0Var;
        this.content = g0Var;
        this.url = str2;
        this.style = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g0 getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getParams() {
        return this.params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.icon, c0Var.icon) && Intrinsics.f(this.label, c0Var.label) && Intrinsics.f(this.action, c0Var.action) && Intrinsics.f(this.params, c0Var.params) && Intrinsics.f(this.content, c0Var.content) && Intrinsics.f(this.url, c0Var.url) && Intrinsics.f(this.style, c0Var.style);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        f0 f0Var = this.icon;
        int iC = p.a.c((f0Var == null ? 0 : f0Var.hashCode()) * 31, 31, this.label);
        String str = this.action;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        b0 b0Var = this.params;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        g0 g0Var = this.content;
        int iHashCode3 = (iHashCode2 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
