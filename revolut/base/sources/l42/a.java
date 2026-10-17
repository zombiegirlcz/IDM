package l42;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f192033a;

    public a(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f192033a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f192033a, ((a) obj2).f192033a);
    }

    public final int hashCode() {
        return this.f192033a.hashCode();
    }
}
