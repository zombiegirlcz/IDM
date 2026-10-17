package t8g;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y50.b f268888a;

    public a(y50.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f268888a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f268888a, ((a) obj2).f268888a);
    }

    public final int hashCode() {
        return this.f268888a.hashCode();
    }
}
