package occ;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromotedMerchant f224206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f224208c;

    public a(PromotedMerchant promotedMerchant, Data revPointsState, Data instructions) {
        Intrinsics.checkNotNullParameter(promotedMerchant, "promotedMerchant");
        Intrinsics.checkNotNullParameter(revPointsState, "revPointsState");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.f224206a = promotedMerchant;
        this.f224207b = revPointsState;
        this.f224208c = instructions;
    }

    public static a a(a aVar, Data revPointsState, Data instructions, int i) {
        PromotedMerchant promotedMerchant = aVar.f224206a;
        if ((i & 2) != 0) {
            revPointsState = aVar.f224207b;
        }
        if ((i & 4) != 0) {
            instructions = aVar.f224208c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(promotedMerchant, "promotedMerchant");
        Intrinsics.checkNotNullParameter(revPointsState, "revPointsState");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        return new a(promotedMerchant, revPointsState, instructions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f224206a, aVar.f224206a) && Intrinsics.f(this.f224207b, aVar.f224207b) && Intrinsics.f(this.f224208c, aVar.f224208c);
    }

    public final int hashCode() {
        return this.f224208c.hashCode() + kii.e.c(this.f224207b, this.f224206a.hashCode() * 31, 31);
    }
}
