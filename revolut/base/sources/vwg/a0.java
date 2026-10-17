package vwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f292720c;

    public /* synthetic */ a0(int i, String str, boolean z, String str2) {
        if (7 != (i & 7)) {
            j1.f(y.f292760a.getDescriptor(), i, 7);
            throw null;
        }
        this.f292718a = str;
        this.f292719b = str2;
        this.f292720c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f292718a, a0Var.f292718a) && Intrinsics.f(this.f292719b, a0Var.f292719b) && this.f292720c == a0Var.f292720c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f292720c) + p.a.c(this.f292718a.hashCode() * 31, 31, this.f292719b);
    }

    public a0(String description, String progressText, boolean z) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(progressText, "progressText");
        this.f292718a = description;
        this.f292719b = progressText;
        this.f292720c = z;
    }
}
