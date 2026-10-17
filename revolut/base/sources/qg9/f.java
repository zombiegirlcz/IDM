package qg9;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245705a;

    public f(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f245705a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f245705a, ((f) obj2).f245705a);
    }

    public final int hashCode() {
        return this.f245705a.hashCode();
    }
}
