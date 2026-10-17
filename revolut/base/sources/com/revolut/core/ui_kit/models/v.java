package com.revolut.core.ui_kit.models;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f58160a;

    public v(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f58160a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f58160a.equals(((v) obj2).f58160a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.models.w
    public final Clause getTitle() {
        return this.f58160a;
    }

    public final int hashCode() {
        return this.f58160a.hashCode();
    }
}
