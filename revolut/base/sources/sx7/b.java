package sx7;

import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import kotlin.jvm.internal.Intrinsics;
import zw7.c0;
import zw7.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f266362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f266363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PetBreedDetailsContract$BreedParam f266364c;
    public final AmountData d;
    public final boolean e;

    public b(c0 petType, h breedType, PetBreedDetailsContract$BreedParam breed, AmountData amount, boolean z) {
        Intrinsics.checkNotNullParameter(petType, "petType");
        Intrinsics.checkNotNullParameter(breedType, "breedType");
        Intrinsics.checkNotNullParameter(breed, "breed");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f266362a = petType;
        this.f266363b = breedType;
        this.f266364c = breed;
        this.d = amount;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f266362a == bVar.f266362a && this.f266363b == bVar.f266363b && Intrinsics.f(this.f266364c, bVar.f266364c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f266364c.hashCode() + ((this.f266363b.hashCode() + (this.f266362a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
