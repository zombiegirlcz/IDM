package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f53985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53986b;

    public p(TextLocalisedClause loadingClause, boolean z) {
        Intrinsics.checkNotNullParameter(loadingClause, "loadingClause");
        this.f53985a = loadingClause;
        this.f53986b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f53985a.equals(pVar.f53985a) && this.f53986b == pVar.f53986b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53986b) + (this.f53985a.hashCode() * 31);
    }
}
