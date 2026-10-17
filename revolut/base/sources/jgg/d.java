package jgg;

import com.revolut.feature.travel.miles.impl.ui.screen.home.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.a f174041a;

    public d(b.a innerOutput) {
        Intrinsics.checkNotNullParameter(innerOutput, "innerOutput");
        this.f174041a = innerOutput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f174041a, ((d) obj2).f174041a);
    }

    public final int hashCode() {
        return this.f174041a.hashCode();
    }
}
