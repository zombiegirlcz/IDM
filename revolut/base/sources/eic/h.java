package eic;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f126471a;

    public h(Data layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f126471a = layout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f126471a, ((h) obj2).f126471a);
    }

    public final int hashCode() {
        return this.f126471a.hashCode();
    }
}
