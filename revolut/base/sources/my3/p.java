package my3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210340c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;

    public p(String type, String title, String str, String button, ArrayList actions, ArrayList fields) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f210338a = type;
        this.f210339b = title;
        this.f210340c = str;
        this.d = button;
        this.e = actions;
        this.f = fields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f210338a, pVar.f210338a) && Intrinsics.f(this.f210339b, pVar.f210339b) && Intrinsics.f(this.f210340c, pVar.f210340c) && Intrinsics.f(this.d, pVar.d) && this.e.equals(pVar.e) && this.f.equals(pVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f210338a.hashCode() * 31, 31, this.f210339b);
        String str = this.f210340c;
        return this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31);
    }
}
