package ud6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f279156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f279157b;

    public e(Data instructionsEligibility, Data instructions) {
        Intrinsics.checkNotNullParameter(instructionsEligibility, "instructionsEligibility");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.f279156a = instructionsEligibility;
        this.f279157b = instructions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f279156a, eVar.f279156a) && Intrinsics.f(this.f279157b, eVar.f279157b);
    }

    public final int hashCode() {
        return this.f279157b.hashCode() + (this.f279156a.hashCode() * 31);
    }
}
