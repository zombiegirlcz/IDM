package sek;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f262213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f262214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f262215c;

    public n(List items, j navBarState, h continueButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(continueButtonState, "continueButtonState");
        this.f262213a = items;
        this.f262214b = navBarState;
        this.f262215c = continueButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f262213a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f262213a, nVar.f262213a) && Intrinsics.f(this.f262214b, nVar.f262214b) && Intrinsics.f(this.f262215c, nVar.f262215c);
    }

    public final int hashCode() {
        return this.f262215c.hashCode() + ((this.f262214b.hashCode() + (this.f262213a.hashCode() * 31)) * 31);
    }
}
