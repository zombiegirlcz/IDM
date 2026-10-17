package rrj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f256854a;

    public d(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f256854a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f256854a, ((d) obj2).f256854a);
    }

    public final int hashCode() {
        return this.f256854a.hashCode();
    }
}
