package obc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223915a;

    public e(List foundCarriers) {
        Intrinsics.checkNotNullParameter(foundCarriers, "foundCarriers");
        this.f223915a = foundCarriers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f223915a, ((e) obj2).f223915a);
    }

    public final int hashCode() {
        return this.f223915a.hashCode();
    }
}
