package ngg;

import com.revolut.feature.travel.miles.impl.ui.screen.home.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.a f215154a;

    public f(b.a outputData) {
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        this.f215154a = outputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f215154a, ((f) obj2).f215154a);
    }

    public final int hashCode() {
        return this.f215154a.hashCode();
    }
}
