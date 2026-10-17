package bfh;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f14989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14991c;
    public final x2h.b d;

    public f(e navBar, ArrayList tabs, String str, x2h.b actionsPanelState) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        this.f14989a = navBar;
        this.f14990b = tabs;
        this.f14991c = str;
        this.d = actionsPanelState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f14989a, fVar.f14989a) && this.f14990b.equals(fVar.f14990b) && Intrinsics.f(this.f14991c, fVar.f14991c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f14990b, this.f14989a.hashCode() * 31, 31);
        String str = this.f14991c;
        return this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
