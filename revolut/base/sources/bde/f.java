package bde;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"Lbde/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "content", "b", "d", "contentKey", "", "Lbde/d;", "Ljava/util/List;", "()Ljava/util/List;", "actions", "Lbde/c;", "Lbde/c;", "()Lbde/c;", "category", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contentKey")
    @NotNull
    private final String contentKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("actions")
    @NotNull
    private final List<d> actions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("category")
    private final c category;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getContentKey() {
        return this.contentKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.content, fVar.content) && Intrinsics.f(this.contentKey, fVar.contentKey) && Intrinsics.f(this.actions, fVar.actions) && Intrinsics.f(this.category, fVar.category);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.content.hashCode() * 31, 31, this.contentKey), 31, this.actions);
        c cVar = this.category;
        return iD + (cVar == null ? 0 : cVar.hashCode());
    }
}
