package m40;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f202616a;

    public d(Data categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f202616a = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f202616a, ((d) obj2).f202616a);
    }

    public final int hashCode() {
        return this.f202616a.hashCode();
    }
}
