package uek;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f279469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f279470b;

    public f(g gVar, d buttonState) {
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f279469a = gVar;
        this.f279470b = buttonState;
    }

    public static f a(f fVar, g gVar, d buttonState, int i) {
        if ((i & 1) != 0) {
            gVar = fVar.f279469a;
        }
        if ((i & 2) != 0) {
            buttonState = fVar.f279470b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        return new f(gVar, buttonState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f279469a, fVar.f279469a) && Intrinsics.f(this.f279470b, fVar.f279470b);
    }

    public final int hashCode() {
        g gVar = this.f279469a;
        return this.f279470b.hashCode() + ((gVar == null ? 0 : gVar.hashCode()) * 31);
    }
}
