package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s3 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120766c;

    public s3(String id10, String title, String description) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f120764a = id10;
        this.f120765b = title;
        this.f120766c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return Intrinsics.f(this.f120764a, s3Var.f120764a) && Intrinsics.f(this.f120765b, s3Var.f120765b) && Intrinsics.f(this.f120766c, s3Var.f120766c);
    }

    public final int hashCode() {
        return this.f120766c.hashCode() + p.a.c(this.f120764a.hashCode() * 31, 31, this.f120765b);
    }
}
