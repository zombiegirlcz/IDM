package gx7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lgx7/l;", "", "", "toString", "()Ljava/lang/String;", "", "Lgx7/k;", "a", "Ljava/util/List;", "()Ljava/util/List;", "pets", "Ljo3/b;", "b", "Ljo3/b;", "()Ljo3/b;", "totalAmount", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pets")
    @NotNull
    private final List<k> pets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalAmount")
    @NotNull
    private final jo3.b totalAmount;

    public l(ArrayList pets, jo3.b totalAmount) {
        Intrinsics.checkNotNullParameter(pets, "pets");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.pets = pets;
        this.totalAmount = totalAmount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getPets() {
        return this.pets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getTotalAmount() {
        return this.totalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.pets, lVar.pets) && Intrinsics.f(this.totalAmount, lVar.totalAmount);
    }

    public final int hashCode() {
        return this.totalAmount.hashCode() + (this.pets.hashCode() * 31);
    }
}
