package bz3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19918a;

    public e(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f19918a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f19918a, ((e) obj2).f19918a);
    }

    public final int hashCode() {
        return this.f19918a.hashCode();
    }
}
