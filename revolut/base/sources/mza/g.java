package mza;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210739c;
    public final ArrayList d;
    public final h e;

    public g(String title, String text, String backgroundMedia, ArrayList buttons, h style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundMedia, "backgroundMedia");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f210737a = title;
        this.f210738b = text;
        this.f210739c = backgroundMedia;
        this.d = buttons;
        this.e = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f210737a, gVar.f210737a) && Intrinsics.f(this.f210738b, gVar.f210738b) && Intrinsics.f(this.f210739c, gVar.f210739c) && this.d.equals(gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.c(this.f210737a.hashCode() * 31, 31, this.f210738b), 31, this.f210739c), 31);
    }
}
