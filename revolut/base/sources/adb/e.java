package adb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3314a;

    public e(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f3314a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f3314a.equals(((e) obj2).f3314a);
    }

    public final int hashCode() {
        return this.f3314a.hashCode();
    }
}
