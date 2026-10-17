package prd;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f238977a;

    public a(dj0.d enteredAmount) {
        Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
        this.f238977a = enteredAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f238977a, ((a) obj2).f238977a);
    }

    public final int hashCode() {
        return this.f238977a.hashCode();
    }
}
