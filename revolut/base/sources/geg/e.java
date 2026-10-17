package geg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f143289a;

    public e(ArrayList backgroundImages) {
        Intrinsics.checkNotNullParameter(backgroundImages, "backgroundImages");
        this.f143289a = backgroundImages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f143289a.equals(((e) obj2).f143289a);
    }

    public final int hashCode() {
        return this.f143289a.hashCode();
    }
}
