package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lkfj/s0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "briefDescription", "b", "verboseDescription", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("briefDescription")
    @NotNull
    private final String briefDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("verboseDescription")
    @NotNull
    private final String verboseDescription;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBriefDescription() {
        return this.briefDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getVerboseDescription() {
        return this.verboseDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.briefDescription, s0Var.briefDescription) && Intrinsics.f(this.verboseDescription, s0Var.verboseDescription);
    }

    public final int hashCode() {
        return this.verboseDescription.hashCode() + (this.briefDescription.hashCode() * 31);
    }
}
