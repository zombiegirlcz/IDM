package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkfj/o2;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/n2;", "a", "Lkfj/n2;", "getPortOutOptIn", "()Lkfj/n2;", "portOutOptIn", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("portOutOptIn")
    @NotNull
    private final n2 portOutOptIn;

    public o2(n2 portOutOptIn) {
        Intrinsics.checkNotNullParameter(portOutOptIn, "portOutOptIn");
        this.portOutOptIn = portOutOptIn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o2) && Intrinsics.f(this.portOutOptIn, ((o2) obj2).portOutOptIn);
    }

    public final int hashCode() {
        return this.portOutOptIn.hashCode();
    }
}
