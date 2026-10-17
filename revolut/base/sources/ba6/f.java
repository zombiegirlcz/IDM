package ba6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13933c;
    public final String d;
    public final ArrayList e;
    public final boolean f;

    public f(String id10, String title, String description, String bannerUrl, ArrayList charities, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(bannerUrl, "bannerUrl");
        Intrinsics.checkNotNullParameter(charities, "charities");
        this.f13931a = id10;
        this.f13932b = title;
        this.f13933c = description;
        this.d = bannerUrl;
        this.e = charities;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f13931a, fVar.f13931a) && Intrinsics.f(this.f13932b, fVar.f13932b) && Intrinsics.f(this.f13933c, fVar.f13933c) && Intrinsics.f(this.d, fVar.d) && this.e.equals(fVar.e) && this.f == fVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.c(p.a.c(p.a.c(this.f13931a.hashCode() * 31, 31, this.f13932b), 31, this.f13933c), 31, this.d), 31);
    }
}
