package i20;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\t\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Li20/a1;", "Li20/d0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "previewText", "b", "fallbackText", "Li20/e0;", "Li20/e0;", "()Li20/e0;", "meta", "Lj20/m;", "d", "Lj20/m;", "()Lj20/m;", "widget", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a1 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("previewText")
    @NotNull
    private final String previewText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fallbackText")
    private final String fallbackText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("meta")
    private final e0 meta;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("widget")
    @NotNull
    private final j20.m widget;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFallbackText() {
        return this.fallbackText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPreviewText() {
        return this.previewText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j20.m getWidget() {
        return this.widget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.previewText, a1Var.previewText) && Intrinsics.f(this.fallbackText, a1Var.fallbackText) && Intrinsics.f(this.meta, a1Var.meta) && Intrinsics.f(this.widget, a1Var.widget);
    }

    public final int hashCode() {
        int iHashCode = this.previewText.hashCode() * 31;
        String str = this.fallbackText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e0 e0Var = this.meta;
        return this.widget.hashCode() + ((iHashCode2 + (e0Var != null ? e0Var.hashCode() : 0)) * 31);
    }
}
