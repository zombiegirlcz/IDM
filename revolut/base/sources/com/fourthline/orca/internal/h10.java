package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f29088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f29089c;
    private final String d;

    public h10(List parts, List requests, List extraRequests, String str) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(extraRequests, "extraRequests");
        this.f29087a = parts;
        this.f29088b = requests;
        this.f29089c = extraRequests;
        this.d = str;
    }

    public final List a() {
        return this.f29089c;
    }

    public final List b() {
        return this.f29088b;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h10)) {
            return false;
        }
        h10 h10Var = (h10) obj2;
        return Intrinsics.f(this.f29087a, h10Var.f29087a) && Intrinsics.f(this.f29088b, h10Var.f29088b) && Intrinsics.f(this.f29089c, h10Var.f29089c) && Intrinsics.f(this.d, h10Var.d);
    }

    public int hashCode() {
        int iHashCode = ((((this.f29087a.hashCode() * 31) + this.f29088b.hashCode()) * 31) + this.f29089c.hashCode()) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IdvUploadDataRequest(parts=" + this.f29087a + ", requests=" + this.f29088b + ", extraRequests=" + this.f29089c + ", retryRequestPrefix=" + this.d + ")";
    }

    public h10(List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? zhm.f0.f322471a : list2, (i & 4) != 0 ? zhm.f0.f322471a : list3, (i & 8) != 0 ? null : str);
    }
}
