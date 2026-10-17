package gu7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q3 {

    @NotNull
    public static final p3 Companion = new p3();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new v1(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146815c;
    public final e3 d;

    public /* synthetic */ q3(int i, String str, String str2, String str3, e3 e3Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(o3.f146806a.getDescriptor(), i, 15);
            throw null;
        }
        this.f146813a = str;
        this.f146814b = str2;
        this.f146815c = str3;
        this.d = e3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj2;
        return Intrinsics.f(this.f146813a, q3Var.f146813a) && Intrinsics.f(this.f146814b, q3Var.f146814b) && Intrinsics.f(this.f146815c, q3Var.f146815c) && Intrinsics.f(this.d, q3Var.d);
    }

    public final int hashCode() {
        String str = this.f146813a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f146814b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f146815c;
        return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public q3(String str, String str2, String str3, e3 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f146813a = str;
        this.f146814b = str2;
        this.f146815c = str3;
        this.d = action;
    }
}
