package lyf;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();
    public static final Set i = y0.b(qyf.a.CITY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qyf.a f200819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200820c;
    public final String d;
    public final g e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f200821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f200822h;

    public e(String destinationId, qyf.a type, String name, String image, g stats, ArrayList attractions, ArrayList categories) {
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(attractions, "attractions");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f200818a = destinationId;
        this.f200819b = type;
        this.f200820c = name;
        this.d = image;
        this.e = stats;
        this.f = attractions;
        this.f200821g = categories;
        this.f200822h = attractions.size() >= 3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f200818a, eVar.f200818a) && this.f200819b == eVar.f200819b && Intrinsics.f(this.f200820c, eVar.f200820c) && Intrinsics.f(this.d, eVar.d) && this.e.equals(eVar.e) && this.f.equals(eVar.f) && this.f200821g.equals(eVar.f200821g);
    }

    public final int hashCode() {
        return this.f200821g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + p.a.c(p.a.c((this.f200819b.hashCode() + (this.f200818a.hashCode() * 31)) * 31, 31, this.f200820c), 31, this.d)) * 31, 31);
    }
}
