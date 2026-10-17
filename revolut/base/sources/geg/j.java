package geg;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f143292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f143293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f143294c;

    public j(ArrayList items, e navBarConfig, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f143292a = items;
        this.f143293b = navBarConfig;
        this.f143294c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f143292a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f143292a.equals(jVar.f143292a) && this.f143293b.equals(jVar.f143293b) && this.f143294c == jVar.f143294c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143294c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f143293b.f143289a, this.f143292a.hashCode() * 31, 31);
    }
}
