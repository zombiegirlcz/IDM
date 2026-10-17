package vuc;

import com.revolut.feature.security_hub.api.models.Enrollment;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f292326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enrollment f292327b;

    public k(f0 revolutCard, Enrollment enrollment) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(enrollment, "enrollment");
        this.f292326a = revolutCard;
        this.f292327b = enrollment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f292326a, kVar.f292326a) && Intrinsics.f(this.f292327b, kVar.f292327b);
    }

    public final int hashCode() {
        return this.f292327b.hashCode() + (this.f292326a.hashCode() * 31);
    }
}
