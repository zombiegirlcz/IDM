package fmb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f136309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f136310b;

    public x(Clause text, ResourceImage icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f136309a = text;
        this.f136310b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f136309a.equals(xVar.f136309a) && this.f136310b.equals(xVar.f136310b);
    }

    public final int hashCode() {
        return this.f136310b.hashCode() + (this.f136309a.hashCode() * 31);
    }
}
