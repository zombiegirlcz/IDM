package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PdfDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ha extends PdfDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54238a;

    public ha(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f54238a = filePath;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ha) && Intrinsics.f(this.f54238a, ((ha) obj2).f54238a);
    }

    public final int hashCode() {
        return this.f54238a.hashCode();
    }
}
