package b4j;

import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$ExpansionDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public i4j.g A;
    public wi0.b B;
    public i4j.h C;
    public xi0.b D;
    public ExpansionFieldDefinition E;
    public Field$Country F;
    public Field$Currency G;
    public Field$RouteSelector H;
    public Field$ExpansionDefinition I;
    public /* synthetic */ Object J;
    public final /* synthetic */ b K;
    public int L;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f12383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f12384y;
    public u2j.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.K = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.J = obj2;
        this.L |= Integer.MIN_VALUE;
        return this.K.b(null, null, null, null, null, null, null, this);
    }
}
