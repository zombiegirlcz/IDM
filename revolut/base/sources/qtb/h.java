package qtb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ptb.g f249070a;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f249070a, ((h) obj2).f249070a);
    }

    public final int hashCode() {
        return this.f249070a.hashCode();
    }

    public h(ptb.g menuState) {
        Intrinsics.checkNotNullParameter(menuState, "menuState");
        this.f249070a = menuState;
    }

    public /* synthetic */ h(int i) {
        this(new ptb.g(false, true, null, null, false));
    }
}
