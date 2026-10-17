package b4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public Field$RouteSelector A;
    public /* synthetic */ Object B;
    public final /* synthetic */ e C;
    public int D;
    public i4j.g u;
    public wi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i4j.h f12390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f12391x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Field$Country f12392y;
    public Field$Currency z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.C = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(this);
    }
}
