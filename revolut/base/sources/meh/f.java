package meh;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f204681c;
    public final int d;
    public final String e;

    public /* synthetic */ f(int i, int i2, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            j1.f(d.f204678a.getDescriptor(), i, 31);
            throw null;
        }
        this.f204679a = str;
        this.f204680b = str2;
        this.f204681c = str3;
        this.d = i2;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f204679a, fVar.f204679a) && Intrinsics.f(this.f204680b, fVar.f204680b) && Intrinsics.f(this.f204681c, fVar.f204681c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, p.a.c(p.a.c(this.f204679a.hashCode() * 31, 31, this.f204680b), 31, this.f204681c), 31);
    }

    public f(int i, String ref2, String strikePrice, String contractType, String state) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f204679a = ref2;
        this.f204680b = strikePrice;
        this.f204681c = contractType;
        this.d = i;
        this.e = state;
    }
}
