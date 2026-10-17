package fnc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f136653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f136654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f136655c;

    public r(q qVar, ArrayList items, p pVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f136653a = qVar;
        this.f136654b = items;
        this.f136655c = pVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f136654b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f136653a, rVar.f136653a) && this.f136654b.equals(rVar.f136654b) && Intrinsics.f(this.f136655c, rVar.f136655c);
    }

    public final int hashCode() {
        q qVar = this.f136653a;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f136654b, (qVar == null ? 0 : qVar.hashCode()) * 31, 31);
        p pVar = this.f136655c;
        return iB + (pVar != null ? pVar.hashCode() : 0);
    }
}
