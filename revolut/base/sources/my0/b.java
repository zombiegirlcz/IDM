package my0;

import kotlin.jvm.internal.Intrinsics;
import mx0.x8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f210278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f210279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f210280c;
    public final Object d;
    public final Object e;

    public static final class a {
        private a() {
        }
    }

    public b() {
        yhm.k kVar = yhm.k.NONE;
        this.f210278a = yhm.j.c(kVar, new mw1.a(19));
        this.f210279b = yhm.j.c(kVar, new mw1.a(20));
        this.f210280c = yhm.j.c(kVar, new mw1.a(21));
        this.d = yhm.j.c(kVar, new mw1.a(22));
        this.e = yhm.j.c(kVar, new x8(this, 4));
    }

    public static String a(ky0.d widgetId, String id10) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(id10, "id");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(widgetId.f190615a, "±", id10);
    }
}
