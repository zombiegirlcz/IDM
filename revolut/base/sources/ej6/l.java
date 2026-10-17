package ej6;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei6.d f126743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final si6.d f126744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountWrapper f126745c;
    public final OutboundPaymentExtras d;
    public final List e;
    public final sh5.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f126746g;

    public l(ei6.d dVar, si6.d dVar2, AccountWrapper accountWrapper, OutboundPaymentExtras outboundPaymentExtras, List list, sh5.c cVar, i0 paymentAvailability) {
        Intrinsics.checkNotNullParameter(paymentAvailability, "paymentAvailability");
        this.f126743a = dVar;
        this.f126744b = dVar2;
        this.f126745c = accountWrapper;
        this.d = outboundPaymentExtras;
        this.e = list;
        this.f = cVar;
        this.f126746g = paymentAvailability;
    }

    public static l a(l lVar, ei6.d dVar, si6.d dVar2, AccountWrapper accountWrapper, OutboundPaymentExtras outboundPaymentExtras, List list, sh5.c cVar, i0 i0Var, int i) {
        if ((i & 1) != 0) {
            dVar = lVar.f126743a;
        }
        ei6.d dVar3 = dVar;
        if ((i & 2) != 0) {
            dVar2 = lVar.f126744b;
        }
        si6.d dVar4 = dVar2;
        if ((i & 4) != 0) {
            accountWrapper = lVar.f126745c;
        }
        AccountWrapper accountWrapper2 = accountWrapper;
        if ((i & 8) != 0) {
            outboundPaymentExtras = lVar.d;
        }
        OutboundPaymentExtras outboundPaymentExtras2 = outboundPaymentExtras;
        if ((i & 16) != 0) {
            list = lVar.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            cVar = lVar.f;
        }
        sh5.c cVar2 = cVar;
        if ((i & 64) != 0) {
            i0Var = lVar.f126746g;
        }
        i0 paymentAvailability = i0Var;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(paymentAvailability, "paymentAvailability");
        return new l(dVar3, dVar4, accountWrapper2, outboundPaymentExtras2, list2, cVar2, paymentAvailability);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f126743a, lVar.f126743a) && Intrinsics.f(this.f126744b, lVar.f126744b) && Intrinsics.f(this.f126745c, lVar.f126745c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f126746g == lVar.f126746g;
    }

    public final int hashCode() {
        ei6.d dVar = this.f126743a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        si6.d dVar2 = this.f126744b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        AccountWrapper accountWrapper = this.f126745c;
        int iHashCode3 = (iHashCode2 + (accountWrapper == null ? 0 : accountWrapper.hashCode())) * 31;
        OutboundPaymentExtras outboundPaymentExtras = this.d;
        int iHashCode4 = (iHashCode3 + (outboundPaymentExtras == null ? 0 : outboundPaymentExtras.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        sh5.c cVar = this.f;
        return this.f126746g.hashCode() + ((iHashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }
}
