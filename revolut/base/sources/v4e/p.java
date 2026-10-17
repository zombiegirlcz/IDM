package v4e;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f286057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f286058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrendViewDelegate.a f286059c;
    public final Set d;
    public final Data e;
    public final Data f;

    public p() {
        this(0);
    }

    public static p a(p pVar, Data data, Data data2, TrendViewDelegate.a aVar, Set set, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            data = pVar.f286057a;
        }
        Data data5 = data;
        if ((i & 2) != 0) {
            data2 = pVar.f286058b;
        }
        Data data6 = data2;
        if ((i & 4) != 0) {
            aVar = pVar.f286059c;
        }
        TrendViewDelegate.a trendViewState = aVar;
        if ((i & 8) != 0) {
            set = pVar.d;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            data3 = pVar.e;
        }
        Data data7 = data3;
        if ((i & 32) != 0) {
            data4 = pVar.f;
        }
        pVar.getClass();
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        return new p(data5, data6, trendViewState, set2, data7, data4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f286057a, pVar.f286057a) && Intrinsics.f(this.f286058b, pVar.f286058b) && Intrinsics.f(this.f286059c, pVar.f286059c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        Data data = this.f286057a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f286058b;
        int iHashCode2 = (this.f286059c.hashCode() + ((iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31)) * 31;
        Set set = this.d;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Data data3 = this.e;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f;
        return iHashCode4 + (data4 != null ? data4.hashCode() : 0);
    }

    public p(Data data, Data data2, TrendViewDelegate.a trendViewState, Set set, Data data3, Data data4) {
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        this.f286057a = data;
        this.f286058b = data2;
        this.f286059c = trendViewState;
        this.d = set;
        this.e = data3;
        this.f = data4;
    }

    public /* synthetic */ p(int i) {
        this(null, null, TrendViewDelegate.a.C0428a.f53562a, null, null, null);
    }
}
