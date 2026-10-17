package nv7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f219543a;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f219543a, ((g) obj2).f219543a);
    }

    public final int hashCode() {
        return this.f219543a.hashCode();
    }

    public g(Data layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f219543a = layout;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
