package gd2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f143035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f143036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f143037c;
    public final List d;

    public e(boolean z, d entryPoint, List eligiblePockets, List selectedPockets) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(eligiblePockets, "eligiblePockets");
        Intrinsics.checkNotNullParameter(selectedPockets, "selectedPockets");
        this.f143035a = z;
        this.f143036b = entryPoint;
        this.f143037c = eligiblePockets;
        this.d = selectedPockets;
    }

    public static e a(e eVar, List eligiblePockets, ArrayList arrayList, int i) {
        boolean z = (i & 1) != 0 ? eVar.f143035a : false;
        d entryPoint = eVar.f143036b;
        if ((i & 4) != 0) {
            eligiblePockets = eVar.f143037c;
        }
        List selectedPockets = arrayList;
        if ((i & 8) != 0) {
            selectedPockets = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(eligiblePockets, "eligiblePockets");
        Intrinsics.checkNotNullParameter(selectedPockets, "selectedPockets");
        return new e(z, entryPoint, eligiblePockets, selectedPockets);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f143035a == eVar.f143035a && this.f143036b == eVar.f143036b && Intrinsics.f(this.f143037c, eVar.f143037c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f143036b.hashCode() + (Boolean.hashCode(this.f143035a) * 31)) * 31, 31, this.f143037c);
    }
}
