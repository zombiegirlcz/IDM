package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p8 {

    @NotNull
    public static final o8 Companion = new o8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f153259c;

    public /* synthetic */ p8(int i, String str, boolean z, String str2) {
        if (7 != (i & 7)) {
            qlm.j1.f(n8.f153230a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153257a = str;
        this.f153258b = str2;
        this.f153259c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj2;
        return Intrinsics.f(this.f153257a, p8Var.f153257a) && Intrinsics.f(this.f153258b, p8Var.f153258b) && this.f153259c == p8Var.f153259c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153259c) + p.a.c(this.f153257a.hashCode() * 31, 31, this.f153258b);
    }
}
