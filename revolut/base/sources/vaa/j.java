package vaa;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f287199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f287200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f287201c;

    public j() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f287199a, jVar.f287199a) && Intrinsics.f(this.f287200b, jVar.f287200b) && Intrinsics.f(this.f287201c, jVar.f287201c);
    }

    public final int hashCode() {
        return this.f287201c.hashCode() + kii.e.c(this.f287200b, this.f287199a.hashCode() * 31, 31);
    }

    public j(Data keysData, Data recentBeneficiariesData, Data transactionsInfo) {
        Intrinsics.checkNotNullParameter(keysData, "keysData");
        Intrinsics.checkNotNullParameter(recentBeneficiariesData, "recentBeneficiariesData");
        Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
        this.f287199a = keysData;
        this.f287200b = recentBeneficiariesData;
        this.f287201c = transactionsInfo;
    }

    public /* synthetic */ j(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
