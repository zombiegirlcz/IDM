package wv4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f300291a;

    public f(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f300291a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f300291a, ((f) obj2).f300291a);
    }

    public final int hashCode() {
        return this.f300291a.hashCode();
    }
}
