package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f300891a;

    public v(f customisation) {
        Intrinsics.checkNotNullParameter(customisation, "customisation");
        this.f300891a = customisation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f300891a, ((v) obj2).f300891a);
    }

    public final int hashCode() {
        return this.f300891a.hashCode();
    }
}
