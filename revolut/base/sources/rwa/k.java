package rwa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257873a;

    public k(List created) {
        Intrinsics.checkNotNullParameter(created, "created");
        this.f257873a = created;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f257873a, ((k) obj2).f257873a);
    }

    public final int hashCode() {
        return this.f257873a.hashCode();
    }
}
