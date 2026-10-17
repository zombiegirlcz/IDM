package ip0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f165412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final snd.c f165413c;

    public mp0(String id10, ArrayList widgets, snd.c cVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.f165411a = id10;
        this.f165412b = widgets;
        this.f165413c = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mp0)) {
            return false;
        }
        mp0 mp0Var = (mp0) obj2;
        return Intrinsics.f(this.f165411a, mp0Var.f165411a) && this.f165412b.equals(mp0Var.f165412b) && this.f165413c.equals(mp0Var.f165413c);
    }

    public final int hashCode() {
        return this.f165413c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f165412b, this.f165411a.hashCode() * 31, 31);
    }
}
