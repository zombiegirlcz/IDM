package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class sa {

    @NotNull
    public static final ra Companion = new ra();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153308c;
    public final boolean d;

    public /* synthetic */ sa(int i, String str, boolean z, String str2, String str3) {
        if (15 != (i & 15)) {
            qlm.j1.f(qa.f153277a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153306a = str;
        this.f153307b = str2;
        this.f153308c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj2;
        return Intrinsics.f(this.f153306a, saVar.f153306a) && Intrinsics.f(this.f153307b, saVar.f153307b) && Intrinsics.f(this.f153308c, saVar.f153308c) && this.d == saVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f153306a.hashCode() * 31, 31, this.f153307b), 31, this.f153308c);
    }
}
