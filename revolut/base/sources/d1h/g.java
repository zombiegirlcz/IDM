package d1h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f110649a;

    public g() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f110649a, ((g) obj2).f110649a);
    }

    public final int hashCode() {
        Data data = this.f110649a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public g(Data data) {
        this.f110649a = data;
    }
}
