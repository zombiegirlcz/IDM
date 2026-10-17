package gn6;

import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstitutionInstructions f144917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f144919c;

    public e(InstitutionInstructions instructions, String institutionId, Function1 onButtonClick) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        this.f144917a = instructions;
        this.f144918b = institutionId;
        this.f144919c = onButtonClick;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f144917a, eVar.f144917a) && Intrinsics.f(this.f144918b, eVar.f144918b) && Intrinsics.f(this.f144919c, eVar.f144919c);
    }

    public final int hashCode() {
        return this.f144919c.hashCode() + p.a.c(this.f144917a.hashCode() * 31, 31, this.f144918b);
    }
}
