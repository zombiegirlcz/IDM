package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s2 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55504a;

    public s2(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f55504a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s2) && this.f55504a.equals(((s2) obj2).f55504a);
    }

    public final int hashCode() {
        return this.f55504a.hashCode();
    }
}
