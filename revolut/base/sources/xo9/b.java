package xo9;

import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UltimateDebtor f307737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f307738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f307739c;

    public b(UltimateDebtor ultimateDebtor, j recipient, ArrayList referenceFields) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(referenceFields, "referenceFields");
        this.f307737a = ultimateDebtor;
        this.f307738b = recipient;
        this.f307739c = referenceFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f307737a, bVar.f307737a) && this.f307738b.equals(bVar.f307738b) && this.f307739c.equals(bVar.f307739c);
    }

    public final int hashCode() {
        UltimateDebtor ultimateDebtor = this.f307737a;
        return this.f307739c.hashCode() + ((this.f307738b.hashCode() + ((ultimateDebtor == null ? 0 : ultimateDebtor.hashCode()) * 31)) * 31);
    }
}
