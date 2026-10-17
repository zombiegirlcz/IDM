package dsh;

import com.revolut.kompot.navigable.screen.BaseScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f117330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f117331b;

    public m(BaseScreen screen, Function1 mapper) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f117330a = screen;
        this.f117331b = mapper;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f117330a.equals(mVar.f117330a) && this.f117331b.equals(mVar.f117331b);
    }

    public final int hashCode() {
        return this.f117331b.hashCode() + (this.f117330a.hashCode() * 31);
    }
}
