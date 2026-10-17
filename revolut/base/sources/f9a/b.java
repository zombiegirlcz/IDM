package f9a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.select_type.SelectTypeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectTypeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SelectTypeScreen selectTypeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectTypeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        AliasRegistrationType aliasType = obj3 instanceof AliasRegistrationType ? (AliasRegistrationType) obj3 : null;
        if (aliasType != null) {
            k kVar = (k) ((g) this.v.M.getValue());
            kVar.getClass();
            Intrinsics.checkNotNullParameter(aliasType, "aliasType");
            if (aliasType instanceof AliasRegistrationType.Inputtable) {
                kVar.C2(new e((AliasRegistrationType.Inputtable) aliasType));
            } else {
                kVar.H2(kVar.f132887r, new cmc.a(false, 21));
                kVar.l2(new esa.i(kVar, aliasType, null, 19), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
