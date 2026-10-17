package ob4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223881a;

    public h(String popupTitle) {
        Intrinsics.checkNotNullParameter(popupTitle, "popupTitle");
        this.f223881a = popupTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f223881a, ((h) obj2).f223881a);
    }

    public final int hashCode() {
        return this.f223881a.hashCode();
    }
}
