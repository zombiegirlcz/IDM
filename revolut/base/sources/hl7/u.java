package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153324c;

    public /* synthetic */ u(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(s.f153293a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153322a = str;
        this.f153323b = str2;
        this.f153324c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f153322a, uVar.f153322a) && Intrinsics.f(this.f153323b, uVar.f153323b) && Intrinsics.f(this.f153324c, uVar.f153324c);
    }

    public final int hashCode() {
        return this.f153324c.hashCode() + p.a.c(this.f153322a.hashCode() * 31, 31, this.f153323b);
    }
}
