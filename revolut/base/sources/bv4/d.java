package bv4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f18960a;

    public d(Data settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f18960a = settings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f18960a, ((d) obj2).f18960a);
    }

    public final int hashCode() {
        return this.f18960a.hashCode();
    }
}
