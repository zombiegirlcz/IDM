package pde;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0011"}, d2 = {"Lpde/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "content", "Lpde/b;", "c", "Lpde/b;", "()Lpde/b;", "action", "icon", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final b action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("icon")
    @NotNull
    private final String icon;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.title, jVar.title) && Intrinsics.f(this.content, jVar.content) && Intrinsics.f(this.action, jVar.action) && Intrinsics.f(this.icon, jVar.icon);
    }

    public final int hashCode() {
        int iC = p.a.c(this.title.hashCode() * 31, 31, this.content);
        b bVar = this.action;
        return this.icon.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
