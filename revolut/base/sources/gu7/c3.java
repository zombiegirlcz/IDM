package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c3 {

    @NotNull
    public static final b3 Companion = new b3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146725c;

    public /* synthetic */ c3(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(a3.f146712a.getDescriptor(), i, 7);
            throw null;
        }
        this.f146723a = str;
        this.f146724b = str2;
        this.f146725c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.f146723a, c3Var.f146723a) && Intrinsics.f(this.f146724b, c3Var.f146724b) && Intrinsics.f(this.f146725c, c3Var.f146725c);
    }

    public final int hashCode() {
        return this.f146725c.hashCode() + p.a.c(this.f146723a.hashCode() * 31, 31, this.f146724b);
    }
}
