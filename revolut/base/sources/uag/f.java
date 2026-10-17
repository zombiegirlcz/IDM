package uag;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f278640a;

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f278640a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f278640a.equals(((f) obj2).f278640a);
    }

    public final int hashCode() {
        return this.f278640a.hashCode();
    }
}
