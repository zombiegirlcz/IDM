package n38;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f211947c;
    public final t d;
    public final boolean e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f211948g;

    public e0(String id10, String str, ArrayList users, t state, boolean z, v vVar, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f211945a = id10;
        this.f211946b = str;
        this.f211947c = users;
        this.d = state;
        this.e = z;
        this.f = vVar;
        this.f211948g = j2;
    }

    public final long a() {
        return this.f211948g;
    }

    public final String b() {
        return this.f211945a;
    }

    public final v c() {
        return this.f;
    }

    public final t d() {
        return this.d;
    }

    public final List e() {
        return this.f211947c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f211945a, e0Var.f211945a) && Intrinsics.f(this.f211946b, e0Var.f211946b) && this.f211947c.equals(e0Var.f211947c) && this.d == e0Var.d && this.e == e0Var.e && Intrinsics.f(this.f, e0Var.f) && this.f211948g == e0Var.f211948g;
    }

    public final String f() {
        return this.f211946b;
    }

    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.f211945a.hashCode() * 31;
        String str = this.f211946b;
        int iC = j6.a.c((this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f211947c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.e);
        v vVar = this.f;
        return Long.hashCode(this.f211948g) + ((iC + (vVar != null ? vVar.hashCode() : 0)) * 31);
    }
}
