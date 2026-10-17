package nnj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f217701b;

    public p(List items, o continueButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(continueButtonState, "continueButtonState");
        this.f217700a = items;
        this.f217701b = continueButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f217700a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f217700a, pVar.f217700a) && this.f217701b == pVar.f217701b;
    }

    public final int hashCode() {
        return this.f217701b.hashCode() + (this.f217700a.hashCode() * 31);
    }
}
