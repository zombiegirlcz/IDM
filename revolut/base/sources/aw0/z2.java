package aw0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f10638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x6 f10640c;
    public final a7 d;
    public final b7 e;

    public z2(y2 header, ArrayList items, x6 colorScheme, a7 a7Var, b7 b7Var) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f10638a = header;
        this.f10639b = items;
        this.f10640c = colorScheme;
        this.d = a7Var;
        this.e = b7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return this.f10638a.equals(z2Var.f10638a) && this.f10639b.equals(z2Var.f10639b) && this.f10640c.equals(z2Var.f10640c) && this.d.equals(z2Var.d) && this.e.equals(z2Var.e);
    }

    public final int hashCode() {
        return p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d.f10233a, p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f10639b, this.f10638a.hashCode() * 31, 31), 31, this.f10640c.f10606a), 31), 31, this.e.f10249a);
    }
}
