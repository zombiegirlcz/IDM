package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class n81 implements l81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31352b;

    public n81(String str, String str2) {
        this.f31351a = str;
        this.f31352b = str2;
    }

    public void a(String str) {
        this.f31351a = str;
    }

    @Override // com.fourthline.orca.internal.l81
    public /* bridge */ boolean b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.l81
    public /* bridge */ boolean c() {
        return super.c();
    }

    @Override // com.fourthline.orca.internal.l81
    public /* bridge */ boolean d() {
        return super.d();
    }

    @Override // com.fourthline.orca.internal.l81
    public String e() {
        return this.f31351a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n81)) {
            return false;
        }
        n81 n81Var = (n81) obj2;
        return Intrinsics.f(this.f31351a, n81Var.f31351a) && Intrinsics.f(this.f31352b, n81Var.f31352b);
    }

    public int hashCode() {
        String str = this.f31351a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31352b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TinBundleData(taxationCountryCode=" + this.f31351a + ", taxpayerIdentificationNumber=" + this.f31352b + ")";
    }

    @Override // com.fourthline.orca.internal.l81
    public String a() {
        return this.f31352b;
    }

    public void b(String str) {
        this.f31352b = str;
    }

    public /* synthetic */ n81(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
