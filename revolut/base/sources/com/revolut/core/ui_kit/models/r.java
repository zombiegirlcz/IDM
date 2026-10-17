package com.revolut.core.ui_kit.models;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f58149a;

    public r(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f58149a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f58149a.equals(((r) obj2).f58149a);
    }

    public final int hashCode() {
        return this.f58149a.hashCode();
    }
}
