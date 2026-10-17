package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cn0 implements ym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ms0.h4 f163764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f163765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f163766c;
    public final String d;

    public cn0(int i, Clause clause, ResourceImage resourceImage, ms0.h4 style) {
        String str = (i & 32) != 0 ? null : "LIST_ID_QR_BTN";
        Intrinsics.checkNotNullParameter(style, "style");
        this.f163764a = style;
        this.f163765b = resourceImage;
        this.f163766c = clause;
        this.d = str;
    }

    @Override // ip0.ym0
    public final ms0.l4 a(ym0 otherButton) {
        Intrinsics.checkNotNullParameter(otherButton, "otherButton");
        return new ms0.i4();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cn0)) {
            return false;
        }
        cn0 cn0Var = (cn0) obj2;
        return this.f163764a == cn0Var.f163764a && this.f163765b.equals(cn0Var.f163765b) && this.f163766c.equals(cn0Var.f163766c) && Intrinsics.f(this.d, cn0Var.d);
    }

    @Override // ip0.ym0
    public final String getActionId() {
        return this.d;
    }

    @Override // ip0.ym0
    public final Image getIcon() {
        return this.f163765b;
    }

    @Override // ip0.ym0
    public final String getTag() {
        return null;
    }

    @Override // ip0.ym0
    public final Clause getText() {
        return this.f163766c;
    }

    @Override // ip0.ym0
    public final ms0.h4 h() {
        return this.f163764a;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f163765b, this.f163764a.hashCode() * 31, 31), 31, this.f163766c), 961, true);
        String str = this.d;
        return (iC + (str == null ? 0 : str.hashCode())) * 31;
    }

    @Override // ip0.ym0
    public final boolean x() {
        return true;
    }
}
