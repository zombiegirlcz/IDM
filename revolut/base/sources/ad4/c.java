package ad4;

import adf.h;
import aed.o;
import ael.q0;
import ael.y;
import af4.u;
import ahd.c0;
import ahe.j;
import ahe.q;
import ahf.z;
import ajd.s;
import akf.p0;
import akf.s1;
import akl.e1;
import akl.s0;
import com.google.firebase.messaging.t;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import ft3.h1;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.a3;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f3264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3265x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3264w = obj2;
        this.f3265x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d) this.f3264w, (h1) this.f3265x, continuation, 0);
            case 1:
                return new c((h) this.f3264w, (String) this.f3265x, continuation, 1);
            case 2:
                return new c((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a) this.f3264w, (List) this.f3265x, continuation, 2);
            case 3:
                return new c((a5h.g) this.f3264w, (String) this.f3265x, continuation, 3);
            case 4:
                return new c((Data) this.f3264w, (o) this.f3265x, continuation, 4);
            case 5:
                return new c((y) this.f3264w, (efl.f) this.f3265x, continuation, 5);
            case 6:
                return new c((y) this.f3264w, (efl.g) this.f3265x, continuation, 6);
            case 7:
                c cVar = new c((q0) this.f3265x, continuation, 7);
                cVar.f3264w = obj2;
                return cVar;
            case 8:
                return new c((u) this.f3264w, (String) this.f3265x, continuation, 8);
            case 9:
                return new c((ah4.h) this.f3264w, (String) this.f3265x, continuation, 9);
            case 10:
                return new c((c0) this.f3264w, (List) this.f3265x, continuation, 10);
            case 11:
                c cVar2 = new c((j) this.f3265x, continuation, 11);
                cVar2.f3264w = obj2;
                return cVar2;
            case 12:
                c cVar3 = new c((q) this.f3265x, continuation, 12);
                cVar3.f3264w = obj2;
                return cVar3;
            case 13:
                c cVar4 = new c((z) this.f3265x, continuation, 13);
                cVar4.f3264w = obj2;
                return cVar4;
            case 14:
                return new c((com.revolut.feature.tab.accounts.impl.ui.spaces.i) this.f3264w, (SpaceContentListMapper$ItemParcel) this.f3265x, continuation, 14);
            case 15:
                c cVar5 = new c((com.revolut.feature.tab.accounts.impl.ui.spaces.i) this.f3265x, continuation, 15);
                cVar5.f3264w = obj2;
                return cVar5;
            case 16:
                return new c((s) this.f3264w, (List) this.f3265x, continuation, 16);
            case 17:
                return new c((s) this.f3264w, (mid.j) this.f3265x, continuation, 17);
            case 18:
                return new c((s) this.f3264w, (String) this.f3265x, continuation, 18);
            case 19:
                return new c((p0) this.f3264w, (ApmPaymentAuthorisationSummary) this.f3265x, continuation, 19);
            case 20:
                return new c((s1) this.f3264w, (String) this.f3265x, continuation, 20);
            case 21:
                return new c((s1) this.f3264w, (v61.h) this.f3265x, continuation, 21);
            case 22:
                return new c((s1) this.f3264w, (oq9.h) this.f3265x, continuation, 22);
            case 23:
                return new c((s1) this.f3264w, (a3) this.f3265x, continuation, 23);
            case 24:
                return new c((akg.o) this.f3264w, (List) this.f3265x, continuation, 24);
            case 25:
                return new c((akl.c) this.f3264w, (String) this.f3265x, continuation, 25);
            case 26:
                return new c((e1) this.f3264w, (s0) this.f3265x, continuation, 26);
            case 27:
                return new c((t) this.f3265x, continuation, 27);
            case 28:
                return new c((com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.a) this.f3264w, (bl6.j) this.f3265x, continuation, 28);
            default:
                return new c((com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.a) this.f3264w, (String) this.f3265x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad4.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3265x = obj2;
    }
}
