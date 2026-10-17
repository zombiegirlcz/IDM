package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bj implements ky, ky.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ny f27140a;

    public bj(ny nyVar) {
        this.f27140a = nyVar;
    }

    @Override // com.fourthline.orca.internal.ky.b
    public ny a() {
        return this.f27140a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bj) && Intrinsics.f(this.f27140a, ((bj) obj2).f27140a);
    }

    public int hashCode() {
        ny nyVar = this.f27140a;
        if (nyVar == null) {
            return 0;
        }
        return nyVar.hashCode();
    }

    public String toString() {
        return "FinishFlow(nextFlow=" + this.f27140a + ")";
    }

    @Override // com.fourthline.orca.internal.ky.b
    public void a(ny nyVar) {
        this.f27140a = nyVar;
    }

    public /* synthetic */ bj(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nyVar);
    }
}
