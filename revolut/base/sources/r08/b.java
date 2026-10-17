package r08;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f250721a;

    public b(File picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        this.f250721a = picture;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f250721a, ((b) obj2).f250721a);
    }

    public final int hashCode() {
        return this.f250721a.hashCode();
    }
}
