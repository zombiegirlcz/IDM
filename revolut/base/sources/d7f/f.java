package d7f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f111955a;

    public f() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f111955a, ((f) obj2).f111955a);
    }

    public final int hashCode() {
        Data data = this.f111955a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public f(Data data) {
        this.f111955a = data;
    }
}
