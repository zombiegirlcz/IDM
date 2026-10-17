package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PdfDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ia extends PdfDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f54288a;

    public ia(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f54288a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ia) && Intrinsics.f(this.f54288a, ((ia) obj2).f54288a);
    }

    public final int hashCode() {
        return this.f54288a.hashCode();
    }
}
