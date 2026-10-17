package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f53667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f53668b;

    public a7(TextClause title, Image iconImage) {
        Intrinsics.checkNotNullParameter(iconImage, "iconImage");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f53667a = iconImage;
        this.f53668b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a7)) {
            return false;
        }
        a7 a7Var = (a7) obj2;
        return this.f53667a.equals(a7Var.f53667a) && this.f53668b.equals(a7Var.f53668b);
    }

    public final int hashCode() {
        return this.f53668b.hashCode() + (this.f53667a.hashCode() * 31);
    }
}
