package el7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000f"}, d2 = {"Lel7/b;", "", "", "toString", "()Ljava/lang/String;", "Lel7/a;", "a", "Lel7/a;", "b", "()Lel7/a;", "subtype", "Ljava/lang/String;", "c", "title", "storyTemplateId", "feature_insurance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtype")
    @NotNull
    private final a subtype;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("storyTemplateId")
    private final String storyTemplateId;

    public b(a subtype, String title, String str) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(title, "title");
        this.subtype = subtype;
        this.title = title;
        this.storyTemplateId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getStoryTemplateId() {
        return this.storyTemplateId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getSubtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.subtype == bVar.subtype && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.storyTemplateId, bVar.storyTemplateId);
    }

    public final int hashCode() {
        int iC = p.a.c(this.subtype.hashCode() * 31, 31, this.title);
        String str = this.storyTemplateId;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
