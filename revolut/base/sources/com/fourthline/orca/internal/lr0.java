package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class lr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30734b;

    public lr0(String str, String str2) {
        this.f30733a = str;
        this.f30734b = str2;
    }

    public final String a() {
        return this.f30733a;
    }

    public final String b() {
        return this.f30734b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lr0)) {
            return false;
        }
        lr0 lr0Var = (lr0) obj2;
        return Intrinsics.f(this.f30733a, lr0Var.f30733a) && Intrinsics.f(this.f30734b, lr0Var.f30734b);
    }

    public int hashCode() {
        String str = this.f30733a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30734b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "QesActivePdfBundle(activePdfPath=" + this.f30733a + ", activePdfTitle=" + this.f30734b + ")";
    }

    public final void a(String str) {
        this.f30733a = str;
    }

    public final void b(String str) {
        this.f30734b = str;
    }

    public /* synthetic */ lr0(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
