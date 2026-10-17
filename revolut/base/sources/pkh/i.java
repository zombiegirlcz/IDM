package pkh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f237189a;

    public i() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f237189a, ((i) obj2).f237189a);
    }

    public final int hashCode() {
        Data data = this.f237189a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public i(Data data) {
        this.f237189a = data;
    }
}
