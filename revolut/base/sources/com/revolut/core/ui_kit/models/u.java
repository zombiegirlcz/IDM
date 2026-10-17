package com.revolut.core.ui_kit.models;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f58159a;

    public u(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f58159a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f58159a, ((u) obj2).f58159a);
    }

    @Override // com.revolut.core.ui_kit.models.w
    public final Clause getTitle() {
        return this.f58159a;
    }

    public final int hashCode() {
        return this.f58159a.hashCode();
    }
}
