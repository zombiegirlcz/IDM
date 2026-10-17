package a08;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f234a;

    public w0(List plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f234a = plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && Intrinsics.f(this.f234a, ((w0) obj2).f234a);
    }

    public final int hashCode() {
        return this.f234a.hashCode();
    }
}
