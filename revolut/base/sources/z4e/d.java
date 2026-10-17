package z4e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f319376a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f319376a, ((d) obj2).f319376a);
    }

    public final int hashCode() {
        Data data = this.f319376a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public d(Data data) {
        this.f319376a = data;
    }
}
