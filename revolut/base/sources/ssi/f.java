package ssi;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f265413b;

    public f(String actionId, a3 transaction) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f265412a = actionId;
        this.f265413b = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f265412a, fVar.f265412a) && Intrinsics.f(this.f265413b, fVar.f265413b);
    }

    public final int hashCode() {
        return this.f265413b.hashCode() + (this.f265412a.hashCode() * 31);
    }
}
