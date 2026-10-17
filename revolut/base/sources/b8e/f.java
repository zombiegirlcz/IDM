package b8e;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TeenProfile f13207a;

    public f(TeenProfile teenProfile) {
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        this.f13207a = teenProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f13207a, ((f) obj2).f13207a);
    }

    public final int hashCode() {
        return this.f13207a.hashCode();
    }
}
