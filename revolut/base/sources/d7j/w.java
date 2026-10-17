package d7j;

import com.revolut.data.model.Data;
import d7j.d0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f112067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f112068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f112069c;
    public final Set d;
    public final i7j.f e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f112070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f112071h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f112072j;

    public w() {
        this(0);
    }

    public static w a(w wVar, Set set, Data data, Set set2, Set set3, i7j.f fVar, Data data2, d0 d0Var, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            set = wVar.f112067a;
        }
        Set set4 = set;
        if ((i & 2) != 0) {
            data = wVar.f112068b;
        }
        Data data5 = data;
        if ((i & 4) != 0) {
            set2 = wVar.f112069c;
        }
        Set set5 = set2;
        if ((i & 8) != 0) {
            set3 = wVar.d;
        }
        Set set6 = set3;
        i7j.f fVar2 = (i & 16) != 0 ? wVar.e : fVar;
        Data currentBalance = (i & 32) != 0 ? wVar.f : data2;
        d0 orderDraftState = (i & 64) != 0 ? wVar.f112070g : d0Var;
        Data pockets = wVar.f112071h;
        Data quoteToQuoteParams = (i & 256) != 0 ? wVar.i : data3;
        Data data6 = (i & 512) != 0 ? wVar.f112072j : data4;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(currentBalance, "currentBalance");
        Intrinsics.checkNotNullParameter(orderDraftState, "orderDraftState");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(quoteToQuoteParams, "quoteToQuoteParams");
        return new w(set4, data5, set5, set6, fVar2, currentBalance, orderDraftState, pockets, quoteToQuoteParams, data6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f112067a, wVar.f112067a) && Intrinsics.f(this.f112068b, wVar.f112068b) && Intrinsics.f(this.f112069c, wVar.f112069c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f) && Intrinsics.f(this.f112070g, wVar.f112070g) && Intrinsics.f(this.f112071h, wVar.f112071h) && Intrinsics.f(this.i, wVar.i) && Intrinsics.f(this.f112072j, wVar.f112072j);
    }

    public final int hashCode() {
        Set set = this.f112067a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Data data = this.f112068b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Set set2 = this.f112069c;
        int iHashCode3 = (iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.d;
        int iHashCode4 = (iHashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31;
        i7j.f fVar = this.e;
        int iC = kii.e.c(this.i, kii.e.c(this.f112071h, (this.f112070g.hashCode() + kii.e.c(this.f, (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31)) * 31, 31), 31);
        Data data2 = this.f112072j;
        return iC + (data2 != null ? data2.hashCode() : 0);
    }

    public w(Set set, Data data, Set set2, Set set3, i7j.f fVar, Data currentBalance, d0 orderDraftState, Data pockets, Data quoteToQuoteParams, Data data2) {
        Intrinsics.checkNotNullParameter(currentBalance, "currentBalance");
        Intrinsics.checkNotNullParameter(orderDraftState, "orderDraftState");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(quoteToQuoteParams, "quoteToQuoteParams");
        this.f112067a = set;
        this.f112068b = data;
        this.f112069c = set2;
        this.d = set3;
        this.e = fVar;
        this.f = currentBalance;
        this.f112070g = orderDraftState;
        this.f112071h = pockets;
        this.i = quoteToQuoteParams;
        this.f112072j = data2;
    }

    public /* synthetic */ w(int i) {
        this(null, null, null, null, null, new Data(null, null, true, 3, null), d0.a.f111986a, new Data(null, null, true, 3, null), new Data(null, null, false, 3, null), null);
    }
}
