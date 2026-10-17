package qdf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f244952a;

    public c(Data freeTradesLimit) {
        Intrinsics.checkNotNullParameter(freeTradesLimit, "freeTradesLimit");
        this.f244952a = freeTradesLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f244952a, ((c) obj2).f244952a);
    }

    public final int hashCode() {
        return this.f244952a.hashCode();
    }
}
