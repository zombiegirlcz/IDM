package cfi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23701c;
    public final ArrayList d;

    public d(boolean z, boolean z3, ArrayList cancellationConditions, ArrayList cancellationWindows) {
        Intrinsics.checkNotNullParameter(cancellationConditions, "cancellationConditions");
        Intrinsics.checkNotNullParameter(cancellationWindows, "cancellationWindows");
        this.f23699a = z;
        this.f23700b = z3;
        this.f23701c = cancellationConditions;
        this.d = cancellationWindows;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f23699a == dVar.f23699a && this.f23700b == dVar.f23700b && this.f23701c.equals(dVar.f23701c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f23701c, j6.a.c(Boolean.hashCode(this.f23699a) * 31, 31, this.f23700b), 31);
    }
}
