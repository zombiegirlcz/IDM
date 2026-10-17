package lt7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f199830a;

    public i() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f199830a, ((i) obj2).f199830a);
    }

    public final int hashCode() {
        return this.f199830a.hashCode();
    }

    public i(Data layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f199830a = layout;
    }

    public /* synthetic */ i(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
