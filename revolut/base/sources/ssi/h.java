package ssi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f265415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265416b;

    public h(l parcel, String listIdToAttachPopUp) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(listIdToAttachPopUp, "listIdToAttachPopUp");
        this.f265415a = parcel;
        this.f265416b = listIdToAttachPopUp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f265415a, hVar.f265415a) && Intrinsics.f(this.f265416b, hVar.f265416b);
    }

    public final int hashCode() {
        return this.f265416b.hashCode() + (this.f265415a.hashCode() * 31);
    }
}
