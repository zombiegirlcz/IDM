package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n8 extends o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10439a;

    public n8(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10439a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n8) && Intrinsics.f(this.f10439a, ((n8) obj2).f10439a);
    }

    public final int hashCode() {
        return this.f10439a.hashCode();
    }
}
