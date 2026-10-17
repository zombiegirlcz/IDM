package ueg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f279447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f279448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah0.a f279449c;
    public final boolean d;

    public z(x mapPosition, ArrayList markers, ah0.a aVar, boolean z) {
        Intrinsics.checkNotNullParameter(mapPosition, "mapPosition");
        Intrinsics.checkNotNullParameter(markers, "markers");
        this.f279447a = mapPosition;
        this.f279448b = markers;
        this.f279449c = aVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f279447a.equals(zVar.f279447a) && this.f279448b.equals(zVar.f279448b) && Intrinsics.f(this.f279449c, zVar.f279449c) && this.d == zVar.d;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f279448b, this.f279447a.hashCode() * 31, 31);
        ah0.a aVar = this.f279449c;
        return Boolean.hashCode(this.d) + ((iB + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
