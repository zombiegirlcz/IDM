package xu3;

import dx4.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f308940a;

    public s(a1 contentDrawableIcon) {
        Intrinsics.checkNotNullParameter(contentDrawableIcon, "contentDrawableIcon");
        this.f308940a = contentDrawableIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f308940a == ((s) obj2).f308940a;
    }

    public final int hashCode() {
        return this.f308940a.hashCode();
    }
}
