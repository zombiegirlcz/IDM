package u09;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f276107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f276108c;

    public d0(String id10, ArrayList questions, f0 f0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.f276106a = id10;
        this.f276107b = questions;
        this.f276108c = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f276106a, d0Var.f276106a) && this.f276107b.equals(d0Var.f276107b) && Intrinsics.f(this.f276108c, d0Var.f276108c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f276107b, this.f276106a.hashCode() * 31, 31);
        f0 f0Var = this.f276108c;
        return iB + (f0Var == null ? 0 : f0Var.hashCode());
    }
}
