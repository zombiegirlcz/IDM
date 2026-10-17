package qwf;

import com.revolut.data.model.Data;
import com.revolut.feature.transport.models.transit.TransitTicket;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitTicket f249916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f249917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final swf.a f249918c;
    public final Map d;
    public final List e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f249919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f249920h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f249921j;

    public o(TransitTicket ticket, long j2, swf.a passengerInputsState, Map generalInputValues, List generalInputErrors, Set requiredInputIds, Data revPointsData, Data pocketData, Data quoteData, Long l2) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(passengerInputsState, "passengerInputsState");
        Intrinsics.checkNotNullParameter(generalInputValues, "generalInputValues");
        Intrinsics.checkNotNullParameter(generalInputErrors, "generalInputErrors");
        Intrinsics.checkNotNullParameter(requiredInputIds, "requiredInputIds");
        Intrinsics.checkNotNullParameter(revPointsData, "revPointsData");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        Intrinsics.checkNotNullParameter(quoteData, "quoteData");
        this.f249916a = ticket;
        this.f249917b = j2;
        this.f249918c = passengerInputsState;
        this.d = generalInputValues;
        this.e = generalInputErrors;
        this.f = requiredInputIds;
        this.f249919g = revPointsData;
        this.f249920h = pocketData;
        this.i = quoteData;
        this.f249921j = l2;
    }

    public static o a(o oVar, long j2, swf.a aVar, Map map, List list, Data data, Data data2, Data data3, Long l2, int i) {
        TransitTicket ticket = oVar.f249916a;
        if ((i & 2) != 0) {
            j2 = oVar.f249917b;
        }
        long j3 = j2;
        swf.a passengerInputsState = (i & 4) != 0 ? oVar.f249918c : aVar;
        Map generalInputValues = (i & 8) != 0 ? oVar.d : map;
        List generalInputErrors = (i & 16) != 0 ? oVar.e : list;
        Set requiredInputIds = oVar.f;
        Data revPointsData = (i & 64) != 0 ? oVar.f249919g : data;
        Data pocketData = (i & 128) != 0 ? oVar.f249920h : data2;
        Data quoteData = (i & 256) != 0 ? oVar.i : data3;
        Long l3 = (i & 512) != 0 ? oVar.f249921j : l2;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(passengerInputsState, "passengerInputsState");
        Intrinsics.checkNotNullParameter(generalInputValues, "generalInputValues");
        Intrinsics.checkNotNullParameter(generalInputErrors, "generalInputErrors");
        Intrinsics.checkNotNullParameter(requiredInputIds, "requiredInputIds");
        Intrinsics.checkNotNullParameter(revPointsData, "revPointsData");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        Intrinsics.checkNotNullParameter(quoteData, "quoteData");
        return new o(ticket, j3, passengerInputsState, generalInputValues, generalInputErrors, requiredInputIds, revPointsData, pocketData, quoteData, l3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f249916a, oVar.f249916a) && this.f249917b == oVar.f249917b && Intrinsics.f(this.f249918c, oVar.f249918c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f249919g, oVar.f249919g) && Intrinsics.f(this.f249920h, oVar.f249920h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f249921j, oVar.f249921j);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.i, kii.e.c(this.f249920h, kii.e.c(this.f249919g, p.a.f(p.a.d(p.a.e((this.f249918c.hashCode() + a0.d.c(this.f249916a.hashCode() * 31, 31, this.f249917b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31), 31);
        Long l2 = this.f249921j;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
