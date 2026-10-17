package we6;

import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstitutionInstructions f296639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r25.a f296641c;

    public f0(InstitutionInstructions instructions, String institutionId, r25.a onButtonClick) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        this.f296639a = instructions;
        this.f296640b = institutionId;
        this.f296641c = onButtonClick;
    }

    public final String b() {
        return this.f296640b;
    }

    public final InstitutionInstructions c() {
        return this.f296639a;
    }

    public final Function1 d() {
        return this.f296641c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f296639a, f0Var.f296639a) && Intrinsics.f(this.f296640b, f0Var.f296640b) && this.f296641c.equals(f0Var.f296641c);
    }

    public final int hashCode() {
        return this.f296641c.hashCode() + p.a.c(this.f296639a.hashCode() * 31, 31, this.f296640b);
    }
}
