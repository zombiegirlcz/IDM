package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f229627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2 f229628c;
    public final Integer d;
    public final String e;

    public /* synthetic */ d0(int i, String str, boolean z, f2 f2Var, Integer num, String str2) {
        if (15 != (i & 15)) {
            qlm.j1.f(b0.f229601a.getDescriptor(), i, 15);
            throw null;
        }
        this.f229626a = str;
        this.f229627b = z;
        this.f229628c = f2Var;
        this.d = num;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f229626a, d0Var.f229626a) && this.f229627b == d0Var.f229627b && Intrinsics.f(this.f229628c, d0Var.f229628c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f229628c.hashCode() + j6.a.c(this.f229626a.hashCode() * 31, 31, this.f229627b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public d0(String planName, boolean z, f2 termsAndConditions, Integer num, String str) {
        Intrinsics.checkNotNullParameter(planName, "planName");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        this.f229626a = planName;
        this.f229627b = z;
        this.f229628c = termsAndConditions;
        this.d = num;
        this.e = str;
    }
}
