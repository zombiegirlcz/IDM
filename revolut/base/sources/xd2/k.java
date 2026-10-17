package xd2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f304240a;

    public k(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f304240a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f304240a, ((k) obj2).f304240a);
    }

    public final int hashCode() {
        return this.f304240a.hashCode();
    }
}
