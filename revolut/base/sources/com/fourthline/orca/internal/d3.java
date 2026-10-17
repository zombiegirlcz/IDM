package com.fourthline.orca.internal;

import com.fourthline.orca.internal.b6;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t5 f27632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b6 f27633c;
    private String d;

    public d3(String redirectUrl, t5 t5Var, b6 b6Var, String str) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.f27631a = redirectUrl;
        this.f27632b = t5Var;
        this.f27633c = b6Var;
        this.d = str;
    }

    public final t5 a() {
        return this.f27632b;
    }

    public final String b() {
        b6 b6Var = this.f27633c;
        if (b6Var instanceof b6.c) {
            return ((b6.c) b6Var).getPreferredMarket();
        }
        return null;
    }

    public final b6 c() {
        return this.f27633c;
    }

    public final String d() {
        return this.f27631a;
    }

    public final List e() {
        b6 b6Var = this.f27633c;
        return b6Var instanceof b6.c ? ((b6.c) b6Var).getIbanConfiguration() : zhm.f0.f322471a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f27631a, d3Var.f27631a) && Intrinsics.f(this.f27632b, d3Var.f27632b) && Intrinsics.f(this.f27633c, d3Var.f27633c) && Intrinsics.f(this.d, d3Var.d);
    }

    public int hashCode() {
        int iHashCode = this.f27631a.hashCode() * 31;
        t5 t5Var = this.f27632b;
        int iHashCode2 = (iHashCode + (t5Var == null ? 0 : t5Var.hashCode())) * 31;
        b6 b6Var = this.f27633c;
        int iHashCode3 = (iHashCode2 + (b6Var == null ? 0 : b6Var.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BavBundle(redirectUrl=" + this.f27631a + ", paymentMethod=" + this.f27632b + ", providerConfig=" + this.f27633c + ", accountNumber=" + this.d + ")";
    }

    public final void a(t5 t5Var) {
        this.f27632b = t5Var;
    }

    public final void a(b6 b6Var) {
        this.f27633c = b6Var;
    }

    public final void a(String str) {
        this.d = str;
    }

    public /* synthetic */ d3(String str, t5 t5Var, b6 b6Var, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "fourthline://orca/bav_status/success" : str, (i & 2) != 0 ? null : t5Var, (i & 4) != 0 ? null : b6Var, (i & 8) != 0 ? null : str2);
    }
}
