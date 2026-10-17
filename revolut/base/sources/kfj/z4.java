package kfj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\n\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkfj/z4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "Lkfj/e0;", "b", "Lkfj/e0;", "c", "()Lkfj/e0;", "subtitle", "d", "terms", "", "Lkfj/y4;", "Ljava/util/List;", "()Ljava/util/List;", "sections", "Lkfj/w4;", "Lkfj/w4;", "()Lkfj/w4;", "confirmation", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final e0 subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    @NotNull
    private final e0 terms;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("sections")
    @NotNull
    private final List<y4> sections;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("confirmation")
    private final w4 confirmation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w4 getConfirmation() {
        return this.confirmation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0 getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e0 getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj2;
        return Intrinsics.f(this.title, z4Var.title) && Intrinsics.f(this.subtitle, z4Var.subtitle) && Intrinsics.f(this.terms, z4Var.terms) && Intrinsics.f(this.sections, z4Var.sections) && Intrinsics.f(this.confirmation, z4Var.confirmation);
    }

    public final int hashCode() {
        String str = this.title;
        int iD = p.a.d((this.terms.hashCode() + ((this.subtitle.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31, this.sections);
        w4 w4Var = this.confirmation;
        return iD + (w4Var != null ? w4Var.hashCode() : 0);
    }
}
