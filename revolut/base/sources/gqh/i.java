package gqh;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f145737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f145738b;

    public i(h buttonState, ArrayList items) {
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145737a = buttonState;
        this.f145738b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f145738b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f145737a.equals(iVar.f145737a) && this.f145738b.equals(iVar.f145738b);
    }

    public final int hashCode() {
        return this.f145738b.hashCode() + (this.f145737a.hashCode() * 31);
    }
}
