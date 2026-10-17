package ty0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f275449a;

    public final /* synthetic */ List a() {
        return this.f275449a;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof e) {
            return Intrinsics.f(this.f275449a, ((e) obj2).f275449a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f275449a.hashCode();
    }

    public final String toString() {
        return "ByTag(tags=" + this.f275449a + ")";
    }
}
