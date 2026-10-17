package ka4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f182417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f182418b;

    public f(ax4.b constructorState, Data configuration) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f182417a = constructorState;
        this.f182418b = configuration;
    }

    public static f a(f fVar, ax4.b constructorState, Data configuration, int i) {
        if ((i & 1) != 0) {
            constructorState = fVar.f182417a;
        }
        if ((i & 2) != 0) {
            configuration = fVar.f182418b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new f(constructorState, configuration);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f182417a, fVar.f182417a) && Intrinsics.f(this.f182418b, fVar.f182418b);
    }

    public final int hashCode() {
        return this.f182418b.hashCode() + (this.f182417a.hashCode() * 31);
    }
}
