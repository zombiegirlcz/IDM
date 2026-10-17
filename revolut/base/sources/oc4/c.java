package oc4;

import cli.y;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.InsuranceScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InsuranceScreen f224092w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InsuranceScreen insuranceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224092w = insuranceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f224092w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f224092w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InsuranceScreen insuranceScreen = this.f224092w;
        switch (i) {
            case 0:
                ai aiVar = (ai) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE3 = insuranceScreen.e3();
                String selectedTab = aiVar.f53687a;
                k kVar = (k) gVarE3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(selectedTab, "id");
                y yVar = kVar.f224100q;
                Object content = ((d) ((j2) yVar.f22677a).getValue()).f224094b.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                mu3.b bVar = (mu3.b) content;
                String id10 = bVar.f208946a;
                String str = bVar.f208947b;
                String str2 = bVar.f208948c;
                String str3 = bVar.d;
                List tabs = bVar.f;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
                Intrinsics.checkNotNullParameter(tabs, "tabs");
                kVar.I2(Data.copy$default(((d) ((j2) yVar.f22677a).getValue()).f224094b, new mu3.b(id10, str, str2, tabs, str3, selectedTab), null, false, 6, null));
                return Unit.f186387a;
            default:
                String str4 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(str4, "insurance_right_nav_bar_button")) {
                    k kVar2 = (k) insuranceScreen.e3();
                    kVar2.getClass();
                    kVar2.C2(new e("NO_INSURANCE"));
                }
                return Unit.f186387a;
        }
    }
}
