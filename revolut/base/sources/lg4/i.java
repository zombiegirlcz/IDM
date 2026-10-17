package lg4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f195051a;

    public i(List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f195051a = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f195051a, ((i) obj2).f195051a);
    }

    public final int hashCode() {
        return this.f195051a.hashCode();
    }
}
