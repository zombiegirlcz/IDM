package wy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f301068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f301069c;
    public final String d;
    public final String e;
    public final String f;

    public b(String title, String description, String primaryButtonTitle, String secondaryButtonTitle, String parameterKey, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(secondaryButtonTitle, "secondaryButtonTitle");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.f301067a = title;
        this.f301068b = description;
        this.f301069c = items;
        this.d = primaryButtonTitle;
        this.e = secondaryButtonTitle;
        this.f = parameterKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f301067a, bVar.f301067a) && Intrinsics.f(this.f301068b, bVar.f301068b) && this.f301069c.equals(bVar.f301069c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f301069c, p.a.c(this.f301067a.hashCode() * 31, 31, this.f301068b), 31), 31, this.d), 31, this.e);
    }
}
