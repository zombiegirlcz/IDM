package jgg;

import com.revolut.feature.travel.miles.impl.ui.screen.main.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.a f174042a;

    public e(b.a innerOutput) {
        Intrinsics.checkNotNullParameter(innerOutput, "innerOutput");
        this.f174042a = innerOutput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f174042a, ((e) obj2).f174042a);
    }

    public final int hashCode() {
        return this.f174042a.hashCode();
    }
}
