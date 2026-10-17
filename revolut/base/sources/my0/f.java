package my0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f210287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f210288c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public f(String id10, TextLocalisedClause textLocalisedClause, ResourceImage resourceImage, boolean z, int i) {
        z = (i & 16) != 0 ? true : z;
        boolean z3 = (i & 64) == 0;
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f210286a = id10;
        this.f210287b = textLocalisedClause;
        this.f210288c = resourceImage;
        this.d = z;
        this.e = z;
        this.f = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f210286a.equals(fVar.f210286a) && this.f210287b.equals(fVar.f210287b) && this.f210288c.equals(fVar.f210288c) && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(org.bouncycastle.jcajce.provider.digest.a.b(this.f210288c, t61.a.a(this.f210286a.hashCode() * 31, 31, this.f210287b), 31), 31, false), 31, this.d), 31, this.e);
    }
}
