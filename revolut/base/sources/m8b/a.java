package m8b;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f203460a;

    public a(ArrayList images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f203460a = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f203460a.equals(((a) obj2).f203460a);
    }

    public final int hashCode() {
        return this.f203460a.hashCode();
    }
}
