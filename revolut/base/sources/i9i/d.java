package i9i;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f159881a;

    public d(ArrayList images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f159881a = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f159881a.equals(((d) obj2).f159881a);
    }

    public final int hashCode() {
        return this.f159881a.hashCode();
    }
}
