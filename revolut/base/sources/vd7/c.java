package vd7;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287810a;

    public c(List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f287810a = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f287810a, ((c) obj2).f287810a);
    }

    public final int hashCode() {
        return this.f287810a.hashCode();
    }
}
