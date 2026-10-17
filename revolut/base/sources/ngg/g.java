package ngg;

import com.revolut.feature.travel.miles.impl.ui.screen.main.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.a f215155a;

    public g(b.a outputData) {
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        this.f215155a = outputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f215155a, ((g) obj2).f215155a);
    }

    public final int hashCode() {
        return this.f215155a.hashCode();
    }
}
