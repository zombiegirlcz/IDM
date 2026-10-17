package wth;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f299986a;

    public e(Data groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f299986a = groups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f299986a, ((e) obj2).f299986a);
    }

    public final int hashCode() {
        return this.f299986a.hashCode();
    }
}
