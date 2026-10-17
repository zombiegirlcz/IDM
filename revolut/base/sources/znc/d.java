package znc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f323690a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f323690a, ((d) obj2).f323690a);
    }

    public final int hashCode() {
        Data data = this.f323690a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public d(Data data) {
        this.f323690a = data;
    }
}
