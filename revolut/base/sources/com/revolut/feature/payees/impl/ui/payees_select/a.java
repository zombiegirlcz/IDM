package com.revolut.feature.payees.impl.ui.payees_select;

import an9.n;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Junior;
import com.revolut.feature.payees.impl.ui.OwnerType;
import com.revolut.feature.payees.impl.ui.payees_select.PayeesSelectScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import hy1.b0;
import ijj.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jq9.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import vkm.j2;
import vkm.q;
import w4l.j;
import yhm.o;
import zm3.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public b u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JuniorBlockInboundTransferNavigation$Junior f79029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f79030x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f79031y;
    public final /* synthetic */ OwnerType.Junior z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, OwnerType.Junior junior, Continuation continuation) {
        super(1, continuation);
        this.f79031y = bVar;
        this.z = junior;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f79031y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.kompot.navigable.vc.modal.a aVar;
        b bVar;
        JuniorBlockInboundTransferNavigation$Junior juniorBlockInboundTransferNavigation$Junior;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f79030x;
        if (i == 0) {
            o.b(obj2);
            b bVar2 = this.f79031y;
            aVar = bVar2.f79035s;
            OwnerType.Junior junior = this.z;
            JuniorBlockInboundTransferNavigation$Junior juniorBlockInboundTransferNavigation$Junior2 = new JuniorBlockInboundTransferNavigation$Junior(junior.f78993a, junior.f78994b);
            f4h.a aVar3 = bVar2.f79033q;
            String str = junior.f78993a;
            Set set = ((n) ((j2) bVar2.f79036t.f22677a).getValue()).f6595c;
            this.u = bVar2;
            this.v = aVar;
            this.f79029w = juniorBlockInboundTransferNavigation$Junior2;
            this.f79030x = 1;
            aVar3.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : set) {
                if (obj3 instanceof y) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                zm3.a aVar4 = ((y) it8.next()).f177526a;
                l lVar = aVar4 instanceof l ? (l) aVar4 : null;
                String code = lVar != null ? lVar.getCode() : null;
                if (code != null) {
                    arrayList2.add(code);
                }
            }
            Object objX = q.x(new b0(mo3.a.g(((ou5.b) aVar3.f132229b).t(str, j.f294644c), null, new r(11), 1), arrayList2, aVar3, 8), this);
            if (objX == aVar2) {
                return aVar2;
            }
            bVar = bVar2;
            obj2 = objX;
            juniorBlockInboundTransferNavigation$Junior = juniorBlockInboundTransferNavigation$Junior2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            juniorBlockInboundTransferNavigation$Junior = this.f79029w;
            aVar = this.v;
            bVar = this.u;
            o.b(obj2);
        }
        PayeesSelectScreenContract$Step.ConfirmationForJunior confirmationForJunior = new PayeesSelectScreenContract$Step.ConfirmationForJunior(juniorBlockInboundTransferNavigation$Junior, (List) obj2);
        bVar.getClass();
        h.v2(aVar, confirmationForJunior, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
