package xel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f304712a;

    public e(ArrayList nationalities) {
        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
        this.f304712a = nationalities;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f304712a.equals(((e) obj2).f304712a);
    }

    public final int hashCode() {
        return this.f304712a.hashCode();
    }
}
