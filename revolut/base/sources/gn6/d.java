package gn6;

import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstitutionInstructions f144915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.b f144916b;

    public d(InstitutionInstructions instructions, io3.b bVar) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.f144915a = instructions;
        this.f144916b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f144915a, dVar.f144915a) && Intrinsics.f(this.f144916b, dVar.f144916b);
    }

    public final int hashCode() {
        int iHashCode = this.f144915a.hashCode() * 31;
        io3.b bVar = this.f144916b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
