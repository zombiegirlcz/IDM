package ta;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f269077c;
    public final boolean d;
    public final ArrayList e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f269078g;

    public j(String title, String str, boolean z, boolean z3, ArrayList sections, b confirmButton, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        this.f269075a = title;
        this.f269076b = str;
        this.f269077c = z;
        this.d = z3;
        this.e = sections;
        this.f = confirmButton;
        this.f269078g = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f269075a, jVar.f269075a) && Intrinsics.f(this.f269076b, jVar.f269076b) && this.f269077c == jVar.f269077c && this.d == jVar.d && this.e.equals(jVar.e) && this.f.equals(jVar.f) && Intrinsics.f(this.f269078g, jVar.f269078g);
    }

    public final int hashCode() {
        int iHashCode = this.f269075a.hashCode() * 31;
        String str = this.f269076b;
        int iHashCode2 = (this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f269077c), 31, this.d), 31)) * 31;
        d dVar = this.f269078g;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("UserDetails(title=", this.f269075a, ", subtitle=", this.f269076b, ", showAvatar=");
        t61.a.y(sbM, this.f269077c, ", showTabs=", this.d, ", sections=");
        sbM.append(this.e);
        sbM.append(", confirmButton=");
        sbM.append(this.f);
        sbM.append(", consents=");
        sbM.append(this.f269078g);
        sbM.append(")");
        return sbM.toString();
    }
}
