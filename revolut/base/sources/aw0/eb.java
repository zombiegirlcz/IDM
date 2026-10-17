package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10302a;

    public eb(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10302a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof eb) && Intrinsics.f(this.f10302a, ((eb) obj2).f10302a);
    }

    public final int hashCode() {
        return this.f10302a.hashCode();
    }
}
