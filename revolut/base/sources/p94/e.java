package p94;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import my3.p;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f234272a;

    public e(p form) {
        Intrinsics.checkNotNullParameter(form, "form");
        this.f234272a = form;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f234272a, ((e) obj2).f234272a);
    }

    public final int hashCode() {
        return this.f234272a.hashCode();
    }
}
