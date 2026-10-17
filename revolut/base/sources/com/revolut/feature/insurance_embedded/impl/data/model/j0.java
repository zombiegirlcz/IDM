package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.m1;
import gu7.q1;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final q1 Companion = new q1();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new gu7.d(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76000c;
    public final f0 d;

    public /* synthetic */ j0(int i, String str, String str2, String str3, f0 f0Var) {
        if (15 != (i & 15)) {
            j1.f(m1.f146793a.getDescriptor(), i, 15);
            throw null;
        }
        this.f75998a = str;
        this.f75999b = str2;
        this.f76000c = str3;
        this.d = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f75998a, j0Var.f75998a) && Intrinsics.f(this.f75999b, j0Var.f75999b) && Intrinsics.f(this.f76000c, j0Var.f76000c) && Intrinsics.f(this.d, j0Var.d);
    }

    public final int hashCode() {
        String str = this.f75998a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f75999b);
        String str2 = this.f76000c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        f0 f0Var = this.d;
        return iHashCode + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public j0(String str, String title, String str2, f0 f0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f75998a = str;
        this.f75999b = title;
        this.f76000c = str2;
        this.d = f0Var;
    }
}
