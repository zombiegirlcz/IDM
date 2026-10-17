package il2;

import com.revolut.feature.backend_driven_limits.api.model.ActionDetailedInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162046c;
    public final f d;
    public final ArrayList e;
    public final ActionDetailedInfo f;

    public b(String title, String subtitle, String icon, f state, ArrayList actions, ActionDetailedInfo detailedInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(detailedInfo, "detailedInfo");
        this.f162044a = title;
        this.f162045b = subtitle;
        this.f162046c = icon;
        this.d = state;
        this.e = actions;
        this.f = detailedInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f162044a, bVar.f162044a) && Intrinsics.f(this.f162045b, bVar.f162045b) && Intrinsics.f(this.f162046c, bVar.f162046c) && this.d == bVar.d && this.e.equals(bVar.e) && this.f.equals(bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + p.a.c(p.a.c(this.f162044a.hashCode() * 31, 31, this.f162045b), 31, this.f162046c)) * 31, 31);
    }
}
