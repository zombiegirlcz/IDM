package md8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f204503a;

    public c(Data juniorFirstName) {
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        this.f204503a = juniorFirstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f204503a, ((c) obj2).f204503a);
    }

    public final int hashCode() {
        return this.f204503a.hashCode();
    }
}
