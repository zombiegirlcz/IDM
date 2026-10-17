package j7j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.h f171922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd6.e f171923b;

    public b(wd6.h selectedOrderType, wd6.e exchangeMode) {
        Intrinsics.checkNotNullParameter(selectedOrderType, "selectedOrderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f171922a = selectedOrderType;
        this.f171923b = exchangeMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f171922a == bVar.f171922a && this.f171923b == bVar.f171923b;
    }

    public final int hashCode() {
        return this.f171923b.hashCode() + (this.f171922a.hashCode() * 31);
    }
}
