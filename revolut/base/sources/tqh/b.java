package tqh;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f273567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f273568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f273569c;

    public b(zel.f instrumentGroup, ArrayList filters, int i) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f273567a = instrumentGroup;
        this.f273568b = filters;
        this.f273569c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f273567a == bVar.f273567a && this.f273568b.equals(bVar.f273568b) && this.f273569c == bVar.f273569c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273569c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f273568b, this.f273567a.hashCode() * 31, 31);
    }
}
