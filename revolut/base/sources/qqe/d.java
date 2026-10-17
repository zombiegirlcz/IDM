package qqe;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f248523a;

    public d(Data teenProfile) {
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        this.f248523a = teenProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f248523a, ((d) obj2).f248523a);
    }

    public final int hashCode() {
        return this.f248523a.hashCode();
    }
}
