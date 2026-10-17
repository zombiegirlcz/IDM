package v23;

import cli.p;
import cli.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f285633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f285634b;

    public h(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f285633a = items;
        this.f285634b = z;
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof h) {
            return new l(((h) oldState).f285634b != this.f285634b);
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f285633a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f285633a.equals(hVar.f285633a) && this.f285634b == hVar.f285634b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285634b) + (this.f285633a.hashCode() * 31);
    }
}
