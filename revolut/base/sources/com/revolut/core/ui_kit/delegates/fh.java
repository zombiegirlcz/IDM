package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fh extends SplitColumnCellDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f54171b;

    public fh(TextClause text, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f54170a = text;
        this.f54171b = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj2;
        return this.f54170a.equals(fhVar.f54170a) && this.f54171b.equals(fhVar.f54171b);
    }

    public final int hashCode() {
        return this.f54171b.hashCode() + (this.f54170a.hashCode() * 31);
    }
}
