package xu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f308930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f308931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f308932c;
    public final f d;

    public n(boolean z, h consents, e bankSelection, f cantFindBankPopup) {
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(bankSelection, "bankSelection");
        Intrinsics.checkNotNullParameter(cantFindBankPopup, "cantFindBankPopup");
        this.f308930a = z;
        this.f308931b = consents;
        this.f308932c = bankSelection;
        this.d = cantFindBankPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f308930a == nVar.f308930a && Intrinsics.f(this.f308931b, nVar.f308931b) && Intrinsics.f(this.f308932c, nVar.f308932c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f308932c.hashCode() + ((this.f308931b.hashCode() + (Boolean.hashCode(this.f308930a) * 31)) * 31)) * 31);
    }
}
