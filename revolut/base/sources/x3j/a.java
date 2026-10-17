package x3j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import gim.c;
import sgm.e3;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends c {
    public b u;
    public BeneficiaryInfoState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Field$RouteSelector f302755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f302756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f302757y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e3 e3Var, c cVar) {
        super(cVar);
        this.f302757y = e3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f302756x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f302757y.f(null, null, this);
    }
}
