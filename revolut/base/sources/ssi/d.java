package ssi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f265407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f265408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265409c;

    public d(a3 transaction, List extraActions, String listIdToAttachPopUp) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraActions, "extraActions");
        Intrinsics.checkNotNullParameter(listIdToAttachPopUp, "listIdToAttachPopUp");
        this.f265407a = transaction;
        this.f265408b = extraActions;
        this.f265409c = listIdToAttachPopUp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f265407a, dVar.f265407a) && Intrinsics.f(this.f265408b, dVar.f265408b) && Intrinsics.f(this.f265409c, dVar.f265409c);
    }

    public final int hashCode() {
        return this.f265409c.hashCode() + p.a.d(this.f265407a.hashCode() * 31, 31, this.f265408b);
    }
}
