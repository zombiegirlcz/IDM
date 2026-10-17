package vob;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f290931a;

    public d(Data screenData) {
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        this.f290931a = screenData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f290931a, ((d) obj2).f290931a);
    }

    public final int hashCode() {
        return this.f290931a.hashCode();
    }
}
