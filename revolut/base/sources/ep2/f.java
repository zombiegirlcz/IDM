package ep2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f128068b;

    public f(Data review, String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(review, "review");
        this.f128067a = requestId;
        this.f128068b = review;
    }

    public static f a(f fVar, Data review) {
        String requestId = fVar.f128067a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(review, "review");
        return new f(review, requestId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f128067a, fVar.f128067a) && Intrinsics.f(this.f128068b, fVar.f128068b);
    }

    public final int hashCode() {
        return this.f128068b.hashCode() + (this.f128067a.hashCode() * 31);
    }
}
