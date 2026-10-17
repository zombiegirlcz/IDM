package fv6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import et6.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends tzl.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f138355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f138356h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z acquiringPaymentInteractor) {
        super(0);
        Intrinsics.checkNotNullParameter(acquiringPaymentInteractor, "acquiringPaymentInteractor");
        this.f138355g = acquiringPaymentInteractor;
        this.f138356h = 100;
    }

    @Override // tzl.l
    public final boolean b(Object obj2, Object obj3, Object obj4) {
        String key = (String) obj2;
        pr6.q qVar = (pr6.q) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        return (qVar != null ? qVar.f238960b : null) != null && qVar.f238959a.size() == this.f138356h;
    }

    @Override // tzl.l
    public final /* bridge */ /* synthetic */ Object c(Object obj2) {
        return "";
    }

    @Override // tzl.l
    public final Object e(Object obj2, Object obj3) {
        String str;
        String currentKey = (String) obj2;
        pr6.q qVar = (pr6.q) obj3;
        Intrinsics.checkNotNullParameter(currentKey, "currentKey");
        return (qVar == null || (str = qVar.f238960b) == null) ? currentKey : str;
    }

    @Override // tzl.l
    public final Flow g(Object obj2, Object obj3, Object obj4) {
        String key = (String) obj2;
        AcquiringPaymentsQuery acquiringPaymentsQuery = (AcquiringPaymentsQuery) obj4;
        Intrinsics.checkNotNullParameter(key, "key");
        if (acquiringPaymentsQuery == null) {
            return vkm.i.f290039a;
        }
        if (key.length() == 0) {
            key = null;
        }
        return this.f138355g.a(AcquiringPaymentsQuery.a(acquiringPaymentsQuery, null, null, null, null, key, 63));
    }
}
