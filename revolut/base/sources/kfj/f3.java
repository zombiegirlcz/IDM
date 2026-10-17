package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u0011"}, d2 = {"Lkfj/f3;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "Lkfj/e0;", "b", "Lkfj/e0;", "c", "()Lkfj/e0;", "subtitle", "primaryActionLabel", "secondaryActionLabel", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final e0 subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryActionLabel")
    @NotNull
    private final String primaryActionLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("secondaryActionLabel")
    @NotNull
    private final String secondaryActionLabel;

    public f3(String title, e0 subtitle, String primaryActionLabel, String secondaryActionLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        Intrinsics.checkNotNullParameter(secondaryActionLabel, "secondaryActionLabel");
        this.title = title;
        this.subtitle = subtitle;
        this.primaryActionLabel = primaryActionLabel;
        this.secondaryActionLabel = secondaryActionLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPrimaryActionLabel() {
        return this.primaryActionLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSecondaryActionLabel() {
        return this.secondaryActionLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0 getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return Intrinsics.f(this.title, f3Var.title) && Intrinsics.f(this.subtitle, f3Var.subtitle) && Intrinsics.f(this.primaryActionLabel, f3Var.primaryActionLabel) && Intrinsics.f(this.secondaryActionLabel, f3Var.secondaryActionLabel);
    }

    public final int hashCode() {
        return this.secondaryActionLabel.hashCode() + p.a.c((this.subtitle.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.primaryActionLabel);
    }
}
