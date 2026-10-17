package ku3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f189648c;
    public final String d;

    public a(String title, String description, String buttonText, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f189646a = title;
        this.f189647b = description;
        this.f189648c = items;
        this.d = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f189646a, aVar.f189646a) && Intrinsics.f(this.f189647b, aVar.f189647b) && this.f189648c.equals(aVar.f189648c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f189648c, p.a.c(this.f189646a.hashCode() * 31, 31, this.f189647b), 31);
    }
}
