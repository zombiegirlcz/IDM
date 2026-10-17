package s6h;

import cli.o;
import cli.p;
import cli.q;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f260352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundType f260353c;

    public j(List items, i iVar, AnimatedBackgroundType.Base base) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f260351a = items;
        this.f260352b = iVar;
        this.f260353c = base;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof j) {
            return new e(!Intrinsics.f(((j) oldState).f260353c, this.f260353c));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f260351a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f260351a, jVar.f260351a) && Intrinsics.f(this.f260352b, jVar.f260352b) && Intrinsics.f(this.f260353c, jVar.f260353c);
    }

    public final int hashCode() {
        int iHashCode = this.f260351a.hashCode() * 31;
        i iVar = this.f260352b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f260353c;
        return iHashCode2 + (animatedBackgroundType != null ? animatedBackgroundType.hashCode() : 0);
    }
}
