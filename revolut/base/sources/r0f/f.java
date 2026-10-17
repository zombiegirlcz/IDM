package r0f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f250787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f250788b;

    public f(Data mcyTransferReview, boolean z) {
        Intrinsics.checkNotNullParameter(mcyTransferReview, "mcyTransferReview");
        this.f250787a = mcyTransferReview;
        this.f250788b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f250787a, fVar.f250787a) && this.f250788b == fVar.f250788b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250788b) + (this.f250787a.hashCode() * 31);
    }
}
