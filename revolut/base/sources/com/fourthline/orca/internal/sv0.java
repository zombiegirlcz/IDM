package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sv0 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f33147c;
    private final z10 d;
    private final z10 e;

    public sv0(String title, List pdfPages, c81 closeButtonText, z10 downloadImageSource, z10 shareImageSource) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pdfPages, "pdfPages");
        Intrinsics.checkNotNullParameter(closeButtonText, "closeButtonText");
        Intrinsics.checkNotNullParameter(downloadImageSource, "downloadImageSource");
        Intrinsics.checkNotNullParameter(shareImageSource, "shareImageSource");
        this.f33145a = title;
        this.f33146b = pdfPages;
        this.f33147c = closeButtonText;
        this.d = downloadImageSource;
        this.e = shareImageSource;
    }

    public final sv0 a(String title, List pdfPages, c81 closeButtonText, z10 downloadImageSource, z10 shareImageSource) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pdfPages, "pdfPages");
        Intrinsics.checkNotNullParameter(closeButtonText, "closeButtonText");
        Intrinsics.checkNotNullParameter(downloadImageSource, "downloadImageSource");
        Intrinsics.checkNotNullParameter(shareImageSource, "shareImageSource");
        return new sv0(title, pdfPages, closeButtonText, downloadImageSource, shareImageSource);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sv0)) {
            return false;
        }
        sv0 sv0Var = (sv0) obj2;
        return Intrinsics.f(this.f33145a, sv0Var.f33145a) && Intrinsics.f(this.f33146b, sv0Var.f33146b) && Intrinsics.f(this.f33147c, sv0Var.f33147c) && Intrinsics.f(this.d, sv0Var.d) && Intrinsics.f(this.e, sv0Var.e);
    }

    public int hashCode() {
        return (((((((this.f33145a.hashCode() * 31) + this.f33146b.hashCode()) * 31) + this.f33147c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final c81 n() {
        return this.f33147c;
    }

    public final z10 o() {
        return this.d;
    }

    public final List p() {
        return this.f33146b;
    }

    public final z10 q() {
        return this.e;
    }

    public final String r() {
        return this.f33145a;
    }

    public String toString() {
        return "State(title=" + this.f33145a + ", pdfPages=" + this.f33146b + ", closeButtonText=" + this.f33147c + ", downloadImageSource=" + this.d + ", shareImageSource=" + this.e + ")";
    }

    public static /* synthetic */ sv0 a(sv0 sv0Var, String str, List list, c81 c81Var, z10 z10Var, z10 z10Var2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = sv0Var.f33145a;
        }
        if ((i & 2) != 0) {
            list = sv0Var.f33146b;
        }
        if ((i & 4) != 0) {
            c81Var = sv0Var.f33147c;
        }
        if ((i & 8) != 0) {
            z10Var = sv0Var.d;
        }
        if ((i & 16) != 0) {
            z10Var2 = sv0Var.e;
        }
        z10 z10Var3 = z10Var2;
        c81 c81Var2 = c81Var;
        return sv0Var.a(str, list, c81Var2, z10Var, z10Var3);
    }
}
