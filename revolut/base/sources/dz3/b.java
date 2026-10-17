package dz3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f121229b;

    public b(String title, a actionPopup) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionPopup, "actionPopup");
        this.f121228a = title;
        this.f121229b = actionPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f121228a, bVar.f121228a) && Intrinsics.f(this.f121229b, bVar.f121229b);
    }

    public final int hashCode() {
        return this.f121229b.hashCode() + (this.f121228a.hashCode() * 31);
    }
}
