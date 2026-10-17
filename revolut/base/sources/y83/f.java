package y83;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f311624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f311625b;

    public f(Data card, Data cardsToTerminateAfterActivation) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardsToTerminateAfterActivation, "cardsToTerminateAfterActivation");
        this.f311624a = card;
        this.f311625b = cardsToTerminateAfterActivation;
    }

    public static f a(f fVar, Data card, Data cardsToTerminateAfterActivation, int i) {
        if ((i & 1) != 0) {
            card = fVar.f311624a;
        }
        if ((i & 2) != 0) {
            cardsToTerminateAfterActivation = fVar.f311625b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardsToTerminateAfterActivation, "cardsToTerminateAfterActivation");
        return new f(card, cardsToTerminateAfterActivation);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f311624a, fVar.f311624a) && Intrinsics.f(this.f311625b, fVar.f311625b);
    }

    public final int hashCode() {
        return this.f311625b.hashCode() + (this.f311624a.hashCode() * 31);
    }
}
