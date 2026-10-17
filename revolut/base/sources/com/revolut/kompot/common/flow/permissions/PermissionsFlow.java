package com.revolut.kompot.common.flow.permissions;

import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.rx_navigable.flow.BaseRxFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import hx7.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import yhm.d;
import yhm.j;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/flow/permissions/PermissionsFlow;", "Lcom/revolut/kompot/common/rx_navigable/flow/BaseRxFlow;", "Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$PermissionFlowStep;", "Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$InputData;", "Lcom/revolut/kompot/common/flow/permissions/a;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class PermissionsFlow extends BaseRxFlow<PermissionsFlowContract$PermissionFlowStep, PermissionsFlowContract$InputData, a> {
    public final int R;
    public final Lazy S;
    public final tii.b T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsFlow(List permissions) {
        super(new PermissionsFlowContract$InputData(permissions));
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.R = R$layout.base_flow_container;
        this.S = j.b(new sii.a(this, 0));
        tii.a aVar = new tii.a();
        PermissionsFlowContract$InputData permissionsFlowContract$InputData = (PermissionsFlowContract$InputData) this.G;
        permissionsFlowContract$InputData.getClass();
        aVar.f271530b = permissionsFlowContract$InputData;
        aVar.f271529a = this;
        s.h(aVar.f271530b, PermissionsFlowContract$InputData.class);
        this.T = new tii.b(aVar.f271529a, aVar.f271530b);
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return this.T;
    }

    @Override // qji.c
    public final qji.b R1() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final dki.s S2() {
        return (sii.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        PermissionsFlowContract$PermissionFlowStep step = (PermissionsFlowContract$PermissionFlowStep) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void o(int i, String[] permissionsKeys, int[] grantResults) throws Throwable {
        Object next;
        Intrinsics.checkNotNullParameter(permissionsKeys, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.o(i, permissionsKeys, grantResults);
        c cVar = (c) ((sii.b) this.S.getValue());
        cVar.getClass();
        Intrinsics.checkNotNullParameter(permissionsKeys, "permissionsKeys");
        if (i != 2008) {
            e.n(new IllegalStateException(a0.d.n("Your forgot to process requestCode: ", i)));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : permissionsKeys) {
            Iterator it8 = ((PermissionsFlowContract$State) cVar.A2().f98429a).f98351b.iterator();
            while (true) {
                if (it8.hasNext()) {
                    next = it8.next();
                    if (Intrinsics.f(((PermissionsFlowContract$Permission) next).f98347a, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PermissionsFlowContract$Permission permissionsFlowContract$Permission = (PermissionsFlowContract$Permission) next;
            if (permissionsFlowContract$Permission != null) {
                arrayList.add(permissionsFlowContract$Permission);
            }
        }
        ArrayList arrayListF1 = d0.f1(((PermissionsFlowContract$State) cVar.A2().f98429a).f98351b);
        arrayListF1.removeAll(d0.i1(arrayList));
        cVar.L2(PermissionsFlowContract$State.a((PermissionsFlowContract$State) cVar.A2().f98429a, arrayListF1, 1));
        uii.b bVar = cVar.f98354y;
        PermissionsFlowContract$Permission[] permissionsFlowContract$PermissionArr = (PermissionsFlowContract$Permission[]) arrayList.toArray(new PermissionsFlowContract$Permission[0]);
        if (bVar.a((PermissionsFlowContract$Permission[]) Arrays.copyOf(permissionsFlowContract$PermissionArr, permissionsFlowContract$PermissionArr.length)) == uii.c.EXPLANATION && cVar.S2(arrayList)) {
            return;
        }
        cVar.U2();
    }

    public PermissionsFlow(Map permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList(permissions.size());
        for (Map.Entry entry : permissions.entrySet()) {
            arrayList.add(new PermissionsFlowContract$Permission((String) entry.getKey(), (PermissionsFlowContract$Explanation) entry.getValue(), 10));
        }
        this(arrayList);
    }
}
