package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f154861a;

    public a(q1 scrollDownButtonBehaviour) {
        Intrinsics.checkNotNullParameter(scrollDownButtonBehaviour, "scrollDownButtonBehaviour");
        this.f154861a = scrollDownButtonBehaviour;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f154861a == ((a) obj2).f154861a;
    }

    public final int hashCode() {
        return this.f154861a.hashCode();
    }
}
