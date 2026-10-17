package ss4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f265290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f265291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f265292c;

    public p(TextLocalisedClause title, ResourceImage navigationIcon, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f265290a = title;
        this.f265291b = navigationIcon;
        this.f265292c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f265290a.equals(pVar.f265290a) && this.f265291b.equals(pVar.f265291b) && this.f265292c == pVar.f265292c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265292c) + org.bouncycastle.jcajce.provider.digest.a.b(this.f265291b, this.f265290a.hashCode() * 31, 31);
    }
}
