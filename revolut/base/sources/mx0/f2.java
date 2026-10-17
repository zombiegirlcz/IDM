package mx0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f2 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f209691a;

    public f2(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f209691a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f2) && this.f209691a.equals(((f2) obj2).f209691a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j6.a.c(this.f209691a.hashCode() * 31, 31, true);
    }
}
