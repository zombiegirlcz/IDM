package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class pd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31927c;
    private final String d;

    public pd1(String str, String str2, String str3, String str4) {
        this.f31925a = str;
        this.f31926b = str2;
        this.f31927c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f31926b;
    }

    public final String c() {
        return this.f31925a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pd1)) {
            return false;
        }
        pd1 pd1Var = (pd1) obj2;
        return Intrinsics.f(this.f31925a, pd1Var.f31925a) && Intrinsics.f(this.f31926b, pd1Var.f31926b) && Intrinsics.f(this.f31927c, pd1Var.f31927c) && Intrinsics.f(this.d, pd1Var.d);
    }

    public int hashCode() {
        String str = this.f31925a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31926b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31927c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ValidationDocumentRecognitionData(issuingCountry=" + this.f31925a + ", documentType=" + this.f31926b + ", documentModel=" + this.f31927c + ", documentSide=" + this.d + ")";
    }

    public /* synthetic */ pd1(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
