package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161352a;

    public s(String display) {
        Intrinsics.checkNotNullParameter(display, "display");
        this.f161352a = display;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f161352a, ((s) obj2).f161352a);
    }

    public final int hashCode() {
        return this.f161352a.hashCode();
    }
}
