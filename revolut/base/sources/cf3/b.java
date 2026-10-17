package cf3;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f23534a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f23534a, ((b) obj2).f23534a);
    }

    public final int hashCode() {
        return this.f23534a.hashCode();
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, true, 3, null));
    }

    public b(Data overview) {
        Intrinsics.checkNotNullParameter(overview, "overview");
        this.f23534a = overview;
    }
}
