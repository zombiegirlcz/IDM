package vo8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.common.ui.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JuniorSecurityAndPrivacyController f290881w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f290881w = juniorSecurityAndPrivacyController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f290881w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f290881w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f290881w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController = this.f290881w;
        switch (i) {
            case 0:
                ty0.a model = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = juniorSecurityAndPrivacyController.d();
                Intrinsics.h(model);
                com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) kVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f275445a;
                if (Intrinsics.f(str, "ID_TERMS_AND_CONDITIONS")) {
                    String str2 = (String) ((p) ((j2) bVar.C.f22677a).getValue()).e.getContent();
                    if (str2 != null) {
                        bVar.C1(new ExternalDestination.Browser(str2, null));
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("Could not navigate to terms and conditions while link is null");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        bVar.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                    }
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Could not handle model with id = ", str));
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
                }
                break;
            case 1:
                String listId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar2 = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) juniorSecurityAndPrivacyController.d();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                j60.a.v(bVar2.u, false, null, 3);
                break;
            default:
                String listId2 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar3 = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) juniorSecurityAndPrivacyController.d();
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                bVar3.n2(new vmf.k(bVar3, null, 2), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
