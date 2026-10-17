package uy7;

import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditResult;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import zw7.d0;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f284100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PetEditDetailsContract$PetEditResult f284101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f284102c;
    public final LocalDate d;
    public final PolicyDocument e;

    public d(d0 pet, PetEditDetailsContract$PetEditResult editedPet, h1 updateQuote, LocalDate fromDate, PolicyDocument document) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        Intrinsics.checkNotNullParameter(editedPet, "editedPet");
        Intrinsics.checkNotNullParameter(updateQuote, "updateQuote");
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f284100a = pet;
        this.f284101b = editedPet;
        this.f284102c = updateQuote;
        this.d = fromDate;
        this.e = document;
    }

    @Override // uy7.e
    public final PolicyDocument a() {
        return this.e;
    }

    @Override // uy7.e
    public final PetEditDetailsContract$PetEditResult b() {
        return this.f284101b;
    }

    @Override // uy7.e
    public final LocalDate c() {
        return this.d;
    }

    @Override // uy7.e
    public final d0 d() {
        return this.f284100a;
    }

    @Override // uy7.e
    public final h1 e() {
        return this.f284102c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f284100a, dVar.f284100a) && Intrinsics.f(this.f284101b, dVar.f284101b) && Intrinsics.f(this.f284102c, dVar.f284102c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.revolut.data.database.models.openbanking.d.g(this.d, (this.f284102c.hashCode() + ((this.f284101b.hashCode() + (this.f284100a.hashCode() * 31)) * 31)) * 31, 31);
    }
}
