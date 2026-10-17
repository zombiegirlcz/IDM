package uy7;

import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditResult;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import zw7.d0;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f284097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PetEditDetailsContract$PetEditResult f284098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f284099c;
    public final LocalDate d;
    public final PolicyDocument e;

    public c(d0 pet, PetEditDetailsContract$PetEditResult editedPet, h1 updateQuote, LocalDate fromDate, PolicyDocument document) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        Intrinsics.checkNotNullParameter(editedPet, "editedPet");
        Intrinsics.checkNotNullParameter(updateQuote, "updateQuote");
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f284097a = pet;
        this.f284098b = editedPet;
        this.f284099c = updateQuote;
        this.d = fromDate;
        this.e = document;
    }

    @Override // uy7.e
    public final PolicyDocument a() {
        return this.e;
    }

    @Override // uy7.e
    public final PetEditDetailsContract$PetEditResult b() {
        return this.f284098b;
    }

    @Override // uy7.e
    public final LocalDate c() {
        return this.d;
    }

    @Override // uy7.e
    public final d0 d() {
        return this.f284097a;
    }

    @Override // uy7.e
    public final h1 e() {
        return this.f284099c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f284097a, cVar.f284097a) && Intrinsics.f(this.f284098b, cVar.f284098b) && Intrinsics.f(this.f284099c, cVar.f284099c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.revolut.data.database.models.openbanking.d.g(this.d, (this.f284099c.hashCode() + ((this.f284098b.hashCode() + (this.f284097a.hashCode() * 31)) * 31)) * 31, 31);
    }
}
