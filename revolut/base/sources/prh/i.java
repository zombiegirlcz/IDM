package prh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f239027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f239028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f239029c;
    public final h d;

    public i(h confirmationAcceptDialogSetup, h expiredDialogSetup, h invalidDialogSetup, h generalErrorDialogSetup) {
        Intrinsics.checkNotNullParameter(confirmationAcceptDialogSetup, "confirmationAcceptDialogSetup");
        Intrinsics.checkNotNullParameter(expiredDialogSetup, "expiredDialogSetup");
        Intrinsics.checkNotNullParameter(invalidDialogSetup, "invalidDialogSetup");
        Intrinsics.checkNotNullParameter(generalErrorDialogSetup, "generalErrorDialogSetup");
        this.f239027a = confirmationAcceptDialogSetup;
        this.f239028b = expiredDialogSetup;
        this.f239029c = invalidDialogSetup;
        this.d = generalErrorDialogSetup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f239027a.equals(iVar.f239027a) && this.f239028b.equals(iVar.f239028b) && this.f239029c.equals(iVar.f239029c) && this.d.equals(iVar.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() + ((this.f239029c.hashCode() + ((this.f239028b.hashCode() + (this.f239027a.hashCode() * 961)) * 31)) * 31)) * 31;
    }
}
