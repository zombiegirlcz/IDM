package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27216c;
    private boolean d;
    private List e;
    private skm.g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private as f27217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f27218h;
    private boolean i;

    public bs(String str, String str2, String str3, boolean z) {
        this.f27214a = str;
        this.f27215b = str2;
        this.f27216c = str3;
        this.d = z;
        this.f27217g = as.f26892a;
        this.i = true;
    }

    public final void a(String str) {
        this.f27215b = str;
    }

    public final as b() {
        return this.f27217g;
    }

    public final void c(String str) {
        this.f27214a = str;
    }

    public final void d(String str) {
        this.f27216c = str;
    }

    public final String e() {
        return this.f27218h;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj2;
        return Intrinsics.f(this.f27214a, bsVar.f27214a) && Intrinsics.f(this.f27215b, bsVar.f27215b) && Intrinsics.f(this.f27216c, bsVar.f27216c) && this.d == bsVar.d;
    }

    public final String f() {
        return this.f27214a;
    }

    public final skm.g0 g() {
        return this.f;
    }

    public final boolean h() {
        return this.i;
    }

    public int hashCode() {
        String str = this.f27214a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27215b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27216c;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "EidBundle(pin=" + this.f27214a + ", canNumber=" + this.f27215b + ", resultUrl=" + this.f27216c + ", eidDeveloperMode=" + this.d + ")";
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void b(String str) {
        this.f27218h = str;
    }

    public final String c() {
        return this.f27215b;
    }

    public final boolean d() {
        return this.d;
    }

    public final List a() {
        return this.e;
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public final void a(List list) {
        this.e = list;
    }

    public final void a(skm.g0 g0Var) {
        this.f = g0Var;
    }

    public final void a(as asVar) {
        Intrinsics.checkNotNullParameter(asVar, "<set-?>");
        this.f27217g = asVar;
    }

    public /* synthetic */ bs(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z);
    }
}
