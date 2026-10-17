package qib;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f246687c;
    public final ArrayList d;
    public final ArrayList e;

    public g(String description, String trackingDescription, dj0.d dVar, ArrayList checkpoints, ArrayList rewards) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(trackingDescription, "trackingDescription");
        Intrinsics.checkNotNullParameter(checkpoints, "checkpoints");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f246685a = description;
        this.f246686b = trackingDescription;
        this.f246687c = dVar;
        this.d = checkpoints;
        this.e = rewards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f246685a, gVar.f246685a) && Intrinsics.f(this.f246686b, gVar.f246686b) && Intrinsics.f(this.f246687c, gVar.f246687c) && this.d.equals(gVar.d) && this.e.equals(gVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f246685a.hashCode() * 31, 31, this.f246686b);
        dj0.d dVar = this.f246687c;
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
    }
}
