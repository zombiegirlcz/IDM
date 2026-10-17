package yj8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f314435a;

    public c(Data profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f314435a = profile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f314435a, ((c) obj2).f314435a);
    }

    public final int hashCode() {
        return this.f314435a.hashCode();
    }
}
