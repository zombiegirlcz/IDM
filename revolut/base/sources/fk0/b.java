package fk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f135705b;

    public b(String pattern, List pins) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f135704a = pattern;
        this.f135705b = pins;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f135704a, bVar.f135704a) && Intrinsics.f(this.f135705b, bVar.f135705b);
    }

    public final int hashCode() {
        return this.f135705b.hashCode() + (this.f135704a.hashCode() * 31);
    }
}
