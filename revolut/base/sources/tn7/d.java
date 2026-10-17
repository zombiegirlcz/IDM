package tn7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f272321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl7.g f272322b;

    public d(Data documentDelivery, kl7.g documentType) {
        Intrinsics.checkNotNullParameter(documentDelivery, "documentDelivery");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f272321a = documentDelivery;
        this.f272322b = documentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f272321a, dVar.f272321a) && this.f272322b == dVar.f272322b;
    }

    public final int hashCode() {
        return this.f272322b.hashCode() + (this.f272321a.hashCode() * 31);
    }
}
