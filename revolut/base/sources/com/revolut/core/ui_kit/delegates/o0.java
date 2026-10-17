package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f54524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f54525b;

    public o0(TextClause textClause, ResourceImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f54524a = image;
        this.f54525b = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return this.f54524a.equals(o0Var.f54524a) && this.f54525b.equals(o0Var.f54525b);
    }

    public final int hashCode() {
        return this.f54525b.hashCode() + (this.f54524a.hashCode() * 31);
    }
}
