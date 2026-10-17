package n68;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f212734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f212735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f212736c;
    public final j d;
    public final TextLocalisedClause e;

    public s(aim.e items, ResourceImage navBarNavigationImage, n header, j approveActionState, TextLocalisedClause denyAction) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarNavigationImage, "navBarNavigationImage");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(approveActionState, "approveActionState");
        Intrinsics.checkNotNullParameter(denyAction, "denyAction");
        this.f212734a = items;
        this.f212735b = navBarNavigationImage;
        this.f212736c = header;
        this.d = approveActionState;
        this.e = denyAction;
    }

    @Override // cli.p
    public final List c() {
        return this.f212734a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f212734a, sVar.f212734a) && this.f212735b.equals(sVar.f212735b) && Intrinsics.f(this.f212736c, sVar.f212736c) && this.d.equals(sVar.d) && this.e.equals(sVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f212736c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f212735b, this.f212734a.hashCode() * 31, 31)) * 31)) * 31);
    }
}
