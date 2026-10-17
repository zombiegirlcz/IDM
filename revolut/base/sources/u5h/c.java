package u5h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f277452a;

    public c() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f277452a, ((c) obj2).f277452a);
    }

    public final int hashCode() {
        Data data = this.f277452a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public c(Data data) {
        this.f277452a = data;
    }
}
