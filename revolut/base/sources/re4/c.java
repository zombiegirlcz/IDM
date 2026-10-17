package re4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$Configuration;
import dx4.a1;
import ft3.h1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        a1 a1Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        int i2 = 1;
        Object[] objArr = 0;
        if (i == 0) {
            o.b(obj2);
            e eVar = this.v;
            px3.a aVar2 = eVar.f253518b;
            h1 h1VarA9 = eVar.f253517a.a9();
            this.u = 1;
            t34.e eVar2 = aVar2.f240564a;
            eVar2.getClass();
            t34.b bVar = new t34.b(eVar2, h1VarA9, objArr == true ? 1 : 0, i2);
            p0 p0Var = p0.f264001a;
            objJ = e0.J(elm.f.f127540b, bVar, this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objJ = obj2;
        }
        du3.d dVar = (du3.d) objJ;
        ArrayList arrayList = dVar.f117561a;
        du3.c cVar = dVar.d;
        TextClause textClause = new TextClause(dVar.f117563c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = cVar != null ? new TextClause(cVar.f117560b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        Image imageT1 = (cVar == null || (a1Var = cVar.f117559a) == null) ? null : a1Var.T1();
        TextClause textClause3 = new TextClause(dVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = dVar.f117562b;
        return new CreditApplicationDocumentsScreenContract$Configuration(arrayList, textClause, textClause2, imageT1, textClause3, str != null ? new AgreementsScreenConfig.Disclaimer(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), com.revolut.feature.credit.application.plugins.api.models.config.a.ALWAYS) : null, new TextClause(dVar.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }
}
