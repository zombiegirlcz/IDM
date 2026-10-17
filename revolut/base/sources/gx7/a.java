package gx7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lgx7/a;", "", "", "toString", "()Ljava/lang/String;", "Lso3/c;", "a", "Lso3/c;", "()Lso3/c;", "newAddress", "", "Lgx7/b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pets", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("newAddress")
    @NotNull
    private final so3.c newAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pets")
    @NotNull
    private final List<b> pets;

    public a(so3.c newAddress, ArrayList pets) {
        Intrinsics.checkNotNullParameter(newAddress, "newAddress");
        Intrinsics.checkNotNullParameter(pets, "pets");
        this.newAddress = newAddress;
        this.pets = pets;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final so3.c getNewAddress() {
        return this.newAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPets() {
        return this.pets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.newAddress, aVar.newAddress) && Intrinsics.f(this.pets, aVar.pets);
    }

    public final int hashCode() {
        return this.pets.hashCode() + (this.newAddress.hashCode() * 31);
    }
}
