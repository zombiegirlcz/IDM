package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ac1 implements ky, ky.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ny f26770a;

    public ac1(ny nyVar) {
        this.f26770a = nyVar;
    }

    @Override // com.fourthline.orca.internal.ky.b
    public ny a() {
        return this.f26770a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ac1) && Intrinsics.f(this.f26770a, ((ac1) obj2).f26770a);
    }

    public int hashCode() {
        ny nyVar = this.f26770a;
        if (nyVar == null) {
            return 0;
        }
        return nyVar.hashCode();
    }

    public String toString() {
        return "FinishFlow(nextFlow=" + this.f26770a + ")";
    }

    @Override // com.fourthline.orca.internal.ky.b
    public void a(ny nyVar) {
        this.f26770a = nyVar;
    }
}
