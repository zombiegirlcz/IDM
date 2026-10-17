package ssi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265418a;

    public j(String listIdToAttachPopUp) {
        Intrinsics.checkNotNullParameter(listIdToAttachPopUp, "listIdToAttachPopUp");
        this.f265418a = listIdToAttachPopUp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f265418a, ((j) obj2).f265418a);
    }

    public final int hashCode() {
        return this.f265418a.hashCode();
    }
}
