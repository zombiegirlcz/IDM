package qei;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f245166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f245167b;

    public f(ArrayList rooms, boolean z) {
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        this.f245166a = z;
        this.f245167b = rooms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f245166a == fVar.f245166a && this.f245167b.equals(fVar.f245167b);
    }

    public final int hashCode() {
        return this.f245167b.hashCode() + (Boolean.hashCode(this.f245166a) * 31);
    }
}
