package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f53983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53984b;

    public n(Clause transcript, boolean z) {
        Intrinsics.checkNotNullParameter(transcript, "transcript");
        this.f53983a = transcript;
        this.f53984b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f53983a, nVar.f53983a) && this.f53984b == nVar.f53984b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53984b) + (this.f53983a.hashCode() * 31);
    }
}
