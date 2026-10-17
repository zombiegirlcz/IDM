package tud;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f274591a;

    public a(List tiersRate) {
        Intrinsics.checkNotNullParameter(tiersRate, "tiersRate");
        this.f274591a = tiersRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f274591a, ((a) obj2).f274591a);
    }

    public final int hashCode() {
        return this.f274591a.hashCode();
    }
}
