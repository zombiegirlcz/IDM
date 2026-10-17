package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t3 implements u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f54738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f54739c;
    public final UrlImage d;
    public final TextLocalisedClause e;

    public t3(TextClause title, TextLocalisedClause subtitle, Clause label, UrlImage image, TextLocalisedClause buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f54737a = title;
        this.f54738b = subtitle;
        this.f54739c = label;
        this.d = image;
        this.e = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj2;
        return this.f54737a.equals(t3Var.f54737a) && this.f54738b.equals(t3Var.f54738b) && this.f54739c.equals(t3Var.f54739c) && this.d.equals(t3Var.d) && this.e.equals(t3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ip0.v7.g(this.d, p.a.a(t61.a.a(this.f54737a.hashCode() * 31, 31, this.f54738b), 31, this.f54739c), 31);
    }
}
