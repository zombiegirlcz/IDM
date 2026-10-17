package nje;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f216456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f216457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f216458c;
    public final DisclaimerParams d;
    public final List e;
    public final yh5.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDateTime f216459g;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data data, Data data2, List list, DisclaimerParams disclaimerParams, List list2, yh5.a aVar, LocalDateTime localDateTime, int i) {
        if ((i & 1) != 0) {
            data = fVar.f216456a;
        }
        Data slotManagerItems = data;
        if ((i & 2) != 0) {
            data2 = fVar.f216457b;
        }
        Data data3 = data2;
        if ((i & 4) != 0) {
            list = fVar.f216458c;
        }
        List splitInvestmentAccountsItems = list;
        if ((i & 8) != 0) {
            disclaimerParams = fVar.d;
        }
        DisclaimerParams disclaimerParams2 = disclaimerParams;
        if ((i & 16) != 0) {
            list2 = fVar.e;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            aVar = fVar.f;
        }
        yh5.a cryptoFeatureState = aVar;
        if ((i & 64) != 0) {
            localDateTime = fVar.f216459g;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(splitInvestmentAccountsItems, "splitInvestmentAccountsItems");
        Intrinsics.checkNotNullParameter(cryptoFeatureState, "cryptoFeatureState");
        return new f(slotManagerItems, data3, splitInvestmentAccountsItems, disclaimerParams2, list3, cryptoFeatureState, localDateTime);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f216456a, fVar.f216456a) && Intrinsics.f(this.f216457b, fVar.f216457b) && Intrinsics.f(this.f216458c, fVar.f216458c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && Intrinsics.f(this.f216459g, fVar.f216459g);
    }

    public final int hashCode() {
        int iHashCode = this.f216456a.hashCode() * 31;
        Data data = this.f216457b;
        int iD = p.a.d((iHashCode + (data == null ? 0 : data.hashCode())) * 31, 31, this.f216458c);
        DisclaimerParams disclaimerParams = this.d;
        int iHashCode2 = (iD + (disclaimerParams == null ? 0 : disclaimerParams.hashCode())) * 31;
        List list = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        LocalDateTime localDateTime = this.f216459g;
        return iHashCode3 + (localDateTime != null ? localDateTime.hashCode() : 0);
    }

    public f(Data slotManagerItems, Data data, List splitInvestmentAccountsItems, DisclaimerParams disclaimerParams, List list, yh5.a cryptoFeatureState, LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(splitInvestmentAccountsItems, "splitInvestmentAccountsItems");
        Intrinsics.checkNotNullParameter(cryptoFeatureState, "cryptoFeatureState");
        this.f216456a = slotManagerItems;
        this.f216457b = data;
        this.f216458c = splitInvestmentAccountsItems;
        this.d = disclaimerParams;
        this.e = list;
        this.f = cryptoFeatureState;
        this.f216459g = localDateTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(int i) {
        f0 f0Var = f0.f322471a;
        this(new Data(f0Var, null, false, 6, null), null, f0Var, null, null, yh5.a.FEATURE_UNAVAILABLE, null);
    }
}
