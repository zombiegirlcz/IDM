package nt4;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f218961a;

    public d(Data limitHistory) {
        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
        this.f218961a = limitHistory;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f218961a, ((d) obj2).f218961a);
    }

    public final int hashCode() {
        return this.f218961a.hashCode();
    }
}
