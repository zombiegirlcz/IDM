package fmg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f136438a;

    public l0(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f136438a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && this.f136438a.equals(((l0) obj2).f136438a);
    }

    public final int hashCode() {
        return this.f136438a.hashCode();
    }
}
