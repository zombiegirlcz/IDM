package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zm0 implements ym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ms0.h4 f167501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f167502b;

    public zm0(ms0.h4 style, ResourceImage icon) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f167501a = style;
        this.f167502b = icon;
    }

    @Override // ip0.ym0
    public final ms0.l4 a(ym0 otherButton) {
        Intrinsics.checkNotNullParameter(otherButton, "otherButton");
        return ms0.k4.f208313a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zm0)) {
            return false;
        }
        zm0 zm0Var = (zm0) obj2;
        return this.f167501a == zm0Var.f167501a && this.f167502b.equals(zm0Var.f167502b);
    }

    @Override // ip0.ym0
    public final String getActionId() {
        return "LIST_ID_SHARE_BTN";
    }

    @Override // ip0.ym0
    public final Image getIcon() {
        return this.f167502b;
    }

    @Override // ip0.ym0
    public final String getTag() {
        return null;
    }

    @Override // ip0.ym0
    public final Clause getText() {
        return null;
    }

    @Override // ip0.ym0
    public final ms0.h4 h() {
        return this.f167501a;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(true) + org.bouncycastle.jcajce.provider.digest.a.b(this.f167502b, this.f167501a.hashCode() * 31, 31)) * 961) - 1273536103) * 31;
    }

    @Override // ip0.ym0
    public final boolean x() {
        return true;
    }
}
