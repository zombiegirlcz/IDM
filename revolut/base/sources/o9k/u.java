package o9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f223365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bgf.h f223366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f223367c;

    public u(t type, bgf.h transactionWorkflow, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        this.f223365a = type;
        this.f223366b = transactionWorkflow;
        this.f223367c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f223365a == uVar.f223365a && Intrinsics.f(this.f223366b, uVar.f223366b) && Intrinsics.f(this.f223367c, uVar.f223367c);
    }

    public final int hashCode() {
        int iHashCode = (this.f223366b.hashCode() + (this.f223365a.hashCode() * 31)) * 31;
        String str = this.f223367c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
