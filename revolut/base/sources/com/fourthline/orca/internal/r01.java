package com.fourthline.orca.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class r01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b01 f32566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f32567b;

    public r01(b01 selfie, byte[] bArr) {
        Intrinsics.checkNotNullParameter(selfie, "selfie");
        this.f32566a = selfie;
        this.f32567b = bArr;
    }

    public final byte[] a() {
        return this.f32567b;
    }

    public final b01 b() {
        return this.f32566a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r01)) {
            return false;
        }
        r01 r01Var = (r01) obj2;
        return Intrinsics.f(this.f32566a, r01Var.f32566a) && Intrinsics.f(this.f32567b, r01Var.f32567b);
    }

    public int hashCode() {
        int iHashCode = this.f32566a.hashCode() * 31;
        byte[] bArr = this.f32567b;
        return iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public String toString() {
        return "SelfieFlowDataBundle(selfie=" + this.f32566a + ", inMemoryVideo=" + Arrays.toString(this.f32567b) + ")";
    }

    public final void a(byte[] bArr) {
        this.f32567b = bArr;
    }

    public /* synthetic */ r01(b01 b01Var, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(b01Var, (i & 2) != 0 ? null : bArr);
    }
}
