package uoc;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f281609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f281610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f281611c;
    public final boolean d;

    public f(e toolbar, List items, ArrayList suggestions, boolean z) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f281609a = toolbar;
        this.f281610b = items;
        this.f281611c = suggestions;
        this.d = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f281610b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f281609a.equals(fVar.f281609a) && Intrinsics.f(this.f281610b, fVar.f281610b) && this.f281611c.equals(fVar.f281611c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f281611c, p.a.d(this.f281609a.hashCode() * 31, 31, this.f281610b), 31);
    }
}
