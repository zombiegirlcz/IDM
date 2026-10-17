package cie;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4 f24463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f24464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f24465c;

    public d0(h4 style, ResourceImage icon, TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f24463a = style;
        this.f24464b = icon;
        this.f24465c = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f24463a == d0Var.f24463a && this.f24464b.equals(d0Var.f24464b) && this.f24465c.equals(d0Var.f24465c);
    }

    public final int hashCode() {
        return this.f24465c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f24464b, this.f24463a.hashCode() * 31, 31);
    }
}
