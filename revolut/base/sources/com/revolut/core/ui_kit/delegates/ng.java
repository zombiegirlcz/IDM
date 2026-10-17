package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ng extends SingleChoiceDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54511b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ng(TextLocalisedClause text, ResourceImage icon) {
        this(text, icon.f59995a);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ng)) {
            return false;
        }
        ng ngVar = (ng) obj2;
        return Intrinsics.f(this.f54510a, ngVar.f54510a) && this.f54511b == ngVar.f54511b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54511b) + (this.f54510a.hashCode() * 31);
    }

    public ng(Clause text, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f54510a = text;
        this.f54511b = i;
    }
}
