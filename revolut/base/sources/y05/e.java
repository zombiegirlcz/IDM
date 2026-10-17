package y05;

import cli.p;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarLargeCentred.Model f310147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f310148c;
    public final aw0.e d;

    public e(aim.e items, NavBarLargeCentred.Model header, ResourceImage headerIcon, aw0.e actionFooter) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(headerIcon, "headerIcon");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        this.f310146a = items;
        this.f310147b = header;
        this.f310148c = headerIcon;
        this.d = actionFooter;
    }

    @Override // cli.p
    public final List c() {
        return this.f310146a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f310146a, eVar.f310146a) && this.f310147b.equals(eVar.f310147b) && this.f310148c.equals(eVar.f310148c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f310148c, (this.f310147b.hashCode() + (this.f310146a.hashCode() * 31)) * 31, 31);
    }
}
