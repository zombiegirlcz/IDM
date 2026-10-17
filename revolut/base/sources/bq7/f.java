package bq7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f17778a;

    public f(Data refund) {
        Intrinsics.checkNotNullParameter(refund, "refund");
        this.f17778a = refund;
    }

    public static f a(Data refund) {
        Intrinsics.checkNotNullParameter(refund, "refund");
        return new f(refund);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f17778a, ((f) obj2).f17778a);
    }

    public final int hashCode() {
        return this.f17778a.hashCode();
    }
}
