package wrh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f299586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f299587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f299588c;
    public final ResourceImage d;
    public final ResourceImage e;

    public i(h style, TextLocalisedClause primaryButtonText, TextLocalisedClause secondaryButtonText, ResourceImage resourceImage, ResourceImage resourceImage2) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f299586a = style;
        this.f299587b = primaryButtonText;
        this.f299588c = secondaryButtonText;
        this.d = resourceImage;
        this.e = resourceImage2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f299586a == iVar.f299586a && this.f299587b.equals(iVar.f299587b) && this.f299588c.equals(iVar.f299588c) && this.d.equals(iVar.d) && this.e.equals(iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.d, t61.a.a(t61.a.a(this.f299586a.hashCode() * 31, 31, this.f299587b), 31, this.f299588c), 31);
    }
}
