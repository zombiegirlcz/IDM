package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkfj/o0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "text", "Lkfj/f0;", "b", "Lkfj/f0;", "()Lkfj/f0;", "icon", "Lkfj/m0;", "Lkfj/m0;", "()Lkfj/m0;", "details", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("icon")
    private final f0 icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final m0 details;

    public o0(String text, f0 f0Var, m0 m0Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = f0Var;
        this.details = m0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m0 getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.text, o0Var.text) && Intrinsics.f(this.icon, o0Var.icon) && Intrinsics.f(this.details, o0Var.details);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        f0 f0Var = this.icon;
        int iHashCode2 = (iHashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        m0 m0Var = this.details;
        return iHashCode2 + (m0Var != null ? m0Var.hashCode() : 0);
    }
}
