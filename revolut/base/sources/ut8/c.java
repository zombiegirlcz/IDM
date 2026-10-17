package ut8;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0012"}, d2 = {"Lut8/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "steps", "Lut8/a;", "b", "Lut8/a;", "()Lut8/a;", "provider", "Ljava/lang/String;", "checkId", "feature_kyc_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<String> steps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("provider")
    @NotNull
    private final a provider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkId")
    @NotNull
    private final String checkId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCheckId() {
        return this.checkId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.steps, cVar.steps) && Intrinsics.f(this.provider, cVar.provider) && Intrinsics.f(this.checkId, cVar.checkId);
    }

    public final int hashCode() {
        return this.checkId.hashCode() + ((this.provider.hashCode() + (this.steps.hashCode() * 31)) * 31);
    }
}
