package gkl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144467b;

    public n0(String backgroundColor, String backgroundUrl) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        this.f144466a = backgroundColor;
        this.f144467b = backgroundUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f144466a, n0Var.f144466a) && Intrinsics.f(this.f144467b, n0Var.f144467b);
    }

    public final int hashCode() {
        return this.f144467b.hashCode() + (this.f144466a.hashCode() * 31);
    }
}
