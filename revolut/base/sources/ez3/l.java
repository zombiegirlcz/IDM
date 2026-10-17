package ez3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f130905c;
    public final ArrayList d;

    public l(String title, String secondDescription, ArrayList secondDescriptionLinks, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(secondDescriptionLinks, "secondDescriptionLinks");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f130903a = title;
        this.f130904b = secondDescription;
        this.f130905c = secondDescriptionLinks;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f130903a, lVar.f130903a) && Intrinsics.f(this.f130904b, lVar.f130904b) && this.f130905c.equals(lVar.f130905c) && this.d.equals(lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f130905c, p.a.c(this.f130903a.hashCode() * 31, 31, this.f130904b), 31);
    }
}
