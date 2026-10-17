package ez3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f130899c;
    public final String d;
    public final ArrayList e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f130900g;

    public j(String id10, String title, String description, String avatarUrl, ArrayList items, String buttonTitle, HashMap actions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f130897a = id10;
        this.f130898b = title;
        this.f130899c = description;
        this.d = avatarUrl;
        this.e = items;
        this.f = buttonTitle;
        this.f130900g = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f130897a, jVar.f130897a) && Intrinsics.f(this.f130898b, jVar.f130898b) && Intrinsics.f(this.f130899c, jVar.f130899c) && Intrinsics.f(this.d, jVar.d) && this.e.equals(jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f130900g.equals(jVar.f130900g);
    }

    public final int hashCode() {
        return this.f130900g.hashCode() + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.c(p.a.c(p.a.c(this.f130897a.hashCode() * 31, 31, this.f130898b), 31, this.f130899c), 31, this.d), 31), 31, this.f);
    }
}
