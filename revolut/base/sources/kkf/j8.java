package kkf;

import com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j8 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final use.d f184779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vlf.c f184780n;
    public final ose.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n8b.a f184781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vkm.j2 f184782q;

    public j8(klf.h0 commonDataSource, use.d detailedTicketsInteractor, vlf.c transferTicketMapper, ose.e detailedTicketsUiMapper, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(detailedTicketsInteractor, "detailedTicketsInteractor");
        Intrinsics.checkNotNullParameter(transferTicketMapper, "transferTicketMapper");
        Intrinsics.checkNotNullParameter(detailedTicketsUiMapper, "detailedTicketsUiMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f184778l = commonDataSource;
        this.f184779m = detailedTicketsInteractor;
        this.f184780n = transferTicketMapper;
        this.o = detailedTicketsUiMapper;
        this.f184781p = countryInteractor;
        this.f184782q = vkm.q.c(null);
    }

    public final cmf.p Z2() {
        boolean zG = ((o8b.c) this.f184781p).g();
        klf.h0 h0Var = this.f184778l;
        use.d dVar = this.f184779m;
        return new cmf.p(zG ? vkm.q.Q(rd0.e.b(dVar.c(h0Var.f185494j)), new m5(null, this, 6)) : new z7(rd0.e.b(dVar.c(h0Var.f185494j)), this, 3), new z5(8), zhm.u.c(this), "Ticket");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        String str2;
        vkm.j2 j2Var;
        Object value;
        if (!kotlin.text.a0.H(str, "TICKET_HEADER_", false)) {
            if (!str.equals("ID_EXTRAS_TICKET") || !(obj2 instanceof kse.a)) {
                return Boolean.FALSE;
            }
            A2(new EntityConfigDestination(new EntityConfigDestination.InputData.Ticket(((kse.a) obj2).f189436a)));
            return Boolean.TRUE;
        }
        pse.a aVar = obj2 instanceof pse.a ? (pse.a) obj2 : null;
        if (aVar == null || (str2 = aVar.f239483a) == null) {
            return Boolean.FALSE;
        }
        do {
            j2Var = this.f184782q;
            value = j2Var.getValue();
        } while (!j2Var.h(value, !str2.equals((String) value) ? str2 : null));
        return Boolean.TRUE;
    }
}
