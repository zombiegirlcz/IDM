package gqd;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f145679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.p f145680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncomeSorter f145681c;
    public final long d;
    public final ArrayList e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f145682g;

    public e(a3 transaction, whf.p transactionsContent, IncomeSorter incomeSorter, long j2, ArrayList destinations, c cVar, List rates) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f145679a = transaction;
        this.f145680b = transactionsContent;
        this.f145681c = incomeSorter;
        this.d = j2;
        this.e = destinations;
        this.f = cVar;
        this.f145682g = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f145679a, eVar.f145679a) && Intrinsics.f(this.f145680b, eVar.f145680b) && Intrinsics.f(this.f145681c, eVar.f145681c) && this.d == eVar.d && this.e.equals(eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f145682g, eVar.f145682g);
    }

    public final int hashCode() {
        int iHashCode = (this.f145680b.hashCode() + (this.f145679a.hashCode() * 31)) * 31;
        IncomeSorter incomeSorter = this.f145681c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, a0.d.c((iHashCode + (incomeSorter == null ? 0 : incomeSorter.hashCode())) * 31, 31, this.d), 31);
        c cVar = this.f;
        return this.f145682g.hashCode() + ((iB + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }
}
