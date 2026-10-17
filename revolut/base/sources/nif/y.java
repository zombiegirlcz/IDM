package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f216071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216072b;

    public /* synthetic */ y(int i, int i2, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(w.f216055a.getDescriptor(), i, 3);
            throw null;
        }
        this.f216071a = i2;
        this.f216072b = str;
    }

    public final String a() {
        return this.f216072b;
    }

    public final int b() {
        return this.f216071a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f216071a == yVar.f216071a && Intrinsics.f(this.f216072b, yVar.f216072b);
    }

    public final int hashCode() {
        return this.f216072b.hashCode() + (Integer.hashCode(this.f216071a) * 31);
    }

    public y(int i, String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f216071a = i;
        this.f216072b = planId;
    }
}
