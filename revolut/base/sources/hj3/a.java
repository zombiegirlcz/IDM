package hj3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f152651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f152652c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f152653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f152654h;

    public a(String id10, f layout, e ctaPlacement, String str, ArrayList buttons, ArrayList screens, String str2, h timeouts) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(ctaPlacement, "ctaPlacement");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(screens, "screens");
        Intrinsics.checkNotNullParameter(timeouts, "timeouts");
        this.f152650a = id10;
        this.f152651b = layout;
        this.f152652c = ctaPlacement;
        this.d = str;
        this.e = buttons;
        this.f = screens;
        this.f152653g = str2;
        this.f152654h = timeouts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f152650a, aVar.f152650a) && this.f152651b == aVar.f152651b && this.f152652c == aVar.f152652c && Intrinsics.f(this.d, aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && Intrinsics.f(this.f152653g, aVar.f152653g) && this.f152654h.equals(aVar.f152654h);
    }

    public final int hashCode() {
        int iHashCode = (this.f152652c.hashCode() + ((this.f152651b.hashCode() + (this.f152650a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f152653g;
        return this.f152654h.hashCode() + ((iB + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
