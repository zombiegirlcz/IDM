package mx0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f209957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f209958c;
    public final Object d;

    public q5(String id10, ResourceImage image, TextLocalisedClause clause, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f209956a = id10;
        this.f209957b = image;
        this.f209958c = clause;
        this.d = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj2;
        return Intrinsics.f(this.f209956a, q5Var.f209956a) && this.f209957b.equals(q5Var.f209957b) && this.f209958c.equals(q5Var.f209958c) && this.d.equals(q5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f209957b, this.f209956a.hashCode() * 31, 31), 31, this.f209958c), 31, true);
    }
}
