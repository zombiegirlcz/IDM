package prh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f239016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f239017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f239018c;
    public final ResourceImage d;
    public final ResourceImage e;

    public b(a style, TextLocalisedClause acceptButtonText, TextLocalisedClause declineButtonText, ResourceImage resourceImage, ResourceImage resourceImage2) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(acceptButtonText, "acceptButtonText");
        Intrinsics.checkNotNullParameter(declineButtonText, "declineButtonText");
        this.f239016a = style;
        this.f239017b = acceptButtonText;
        this.f239018c = declineButtonText;
        this.d = resourceImage;
        this.e = resourceImage2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f239016a == bVar.f239016a && this.f239017b.equals(bVar.f239017b) && this.f239018c.equals(bVar.f239018c) && this.d.equals(bVar.d) && this.e.equals(bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.d, t61.a.a(t61.a.a(this.f239016a.hashCode() * 31, 31, this.f239017b), 31, this.f239018c), 31);
    }
}
