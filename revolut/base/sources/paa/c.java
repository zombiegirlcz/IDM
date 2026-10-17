package paa;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.AliasDetailsScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.AliasDetailsScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AliasDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AliasDetailsScreen aliasDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = aliasDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.N.getValue();
        String listId = model.f53228a;
        AliasDetailsScreenContract$InputData aliasDetailsScreenContract$InputData = iVar.o;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "list_id_create_qr")) {
            iVar.C2(new f(aliasDetailsScreenContract$InputData.f80664a));
        } else if (Intrinsics.f(listId, "list_id_delete_key")) {
            iVar.C2(new e(aliasDetailsScreenContract$InputData.f80664a));
        }
        return Unit.f186387a;
    }
}
