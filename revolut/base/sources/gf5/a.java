package gf5;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f143341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f143342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f143343c;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data stakingProductsData, Clause clause, Clause clause2, int i) {
        if ((i & 1) != 0) {
            stakingProductsData = aVar.f143341a;
        }
        if ((i & 2) != 0) {
            clause = aVar.f143342b;
        }
        if ((i & 4) != 0) {
            clause2 = aVar.f143343c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(stakingProductsData, "stakingProductsData");
        return new a(stakingProductsData, clause, clause2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f143341a, aVar.f143341a) && Intrinsics.f(this.f143342b, aVar.f143342b) && Intrinsics.f(this.f143343c, aVar.f143343c);
    }

    public final int hashCode() {
        int iHashCode = this.f143341a.hashCode() * 31;
        Clause clause = this.f143342b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f143343c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }

    public a(Data stakingProductsData, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(stakingProductsData, "stakingProductsData");
        this.f143341a = stakingProductsData;
        this.f143342b = clause;
        this.f143343c = clause2;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, false, 7, null), null, null);
    }
}
