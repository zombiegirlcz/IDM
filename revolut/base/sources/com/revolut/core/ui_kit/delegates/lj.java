package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lj extends WebViewDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54448b;

    public lj(String html, String encoding) {
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter("text/html", "mimeType");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        this.f54447a = html;
        this.f54448b = encoding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lj)) {
            return false;
        }
        lj ljVar = (lj) obj2;
        return Intrinsics.f(this.f54447a, ljVar.f54447a) && Intrinsics.f(this.f54448b, ljVar.f54448b);
    }

    public final int hashCode() {
        return this.f54448b.hashCode() + (((this.f54447a.hashCode() * 31) - 1082243251) * 31);
    }
}
