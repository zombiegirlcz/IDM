package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34488b;

    public w1(String tenantName, String destinationFolder) {
        Intrinsics.checkNotNullParameter(tenantName, "tenantName");
        Intrinsics.checkNotNullParameter(destinationFolder, "destinationFolder");
        this.f34487a = tenantName;
        this.f34488b = destinationFolder;
    }

    public final String a() {
        return this.f34488b;
    }

    public final String b() {
        return this.f34487a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f34487a, w1Var.f34487a) && Intrinsics.f(this.f34488b, w1Var.f34488b);
    }

    public int hashCode() {
        return (this.f34487a.hashCode() * 31) + this.f34488b.hashCode();
    }

    public String toString() {
        return "Input(tenantName=" + this.f34487a + ", destinationFolder=" + this.f34488b + ")";
    }
}
