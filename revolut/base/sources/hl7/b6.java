package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b6 {

    @NotNull
    public static final a6 Companion = new a6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f153037c;

    public /* synthetic */ b6(int i, dj0.d dVar, String str, String str2) {
        if (7 != (i & 7)) {
            qlm.j1.f(z5.f153392a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153035a = str;
        this.f153036b = str2;
        this.f153037c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj2;
        return Intrinsics.f(this.f153035a, b6Var.f153035a) && Intrinsics.f(this.f153036b, b6Var.f153036b) && Intrinsics.f(this.f153037c, b6Var.f153037c);
    }

    public final int hashCode() {
        return this.f153037c.hashCode() + p.a.c(this.f153035a.hashCode() * 31, 31, this.f153036b);
    }
}
