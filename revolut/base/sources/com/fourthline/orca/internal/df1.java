package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class df1 implements ky, ky.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ny f27725a;

    public df1(ny nyVar) {
        this.f27725a = nyVar;
    }

    @Override // com.fourthline.orca.internal.ky.b
    public ny a() {
        return this.f27725a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof df1) && Intrinsics.f(this.f27725a, ((df1) obj2).f27725a);
    }

    public int hashCode() {
        ny nyVar = this.f27725a;
        if (nyVar == null) {
            return 0;
        }
        return nyVar.hashCode();
    }

    public String toString() {
        return "FinishFlow(nextFlow=" + this.f27725a + ")";
    }

    @Override // com.fourthline.orca.internal.ky.b
    public void a(ny nyVar) {
        this.f27725a = nyVar;
    }
}
