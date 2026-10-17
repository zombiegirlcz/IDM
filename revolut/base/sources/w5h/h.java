package w5h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f295275a;

    public h(Data marginPosition) {
        Intrinsics.checkNotNullParameter(marginPosition, "marginPosition");
        this.f295275a = marginPosition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f295275a, ((h) obj2).f295275a);
    }

    public final int hashCode() {
        return this.f295275a.hashCode();
    }
}
