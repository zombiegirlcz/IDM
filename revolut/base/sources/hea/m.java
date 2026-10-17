package hea;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PocketDetailsScreen pocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar2 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        if (kotlin.text.a0.H(str, "COUNTRY_ITEM_ID_", false)) {
            j60.a.v(aVar2.u, false, null, 3);
            wi0.b bVar = obj3 instanceof wi0.b ? (wi0.b) obj3 : null;
            if (bVar != null) {
                aVar2.H2(aVar2.U, new h8b.b(bVar, aVar2, 12));
            }
        } else if (str.equals("LIST_ID_ACCOUNT_BALANCE_LIMIT")) {
            limit = obj3 instanceof aue.k ? (aue.k) obj3 : 0;
            if (limit != 0) {
                kea.c cVar = (kea.c) aVar2.R;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(limit, "limit");
                cVar.N2(cVar.o2(new ste.v(cVar.f183062n.e(limit))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new ke7.v(cVar, 2));
            }
        } else if (!str.equals("EXPECTING_LARGE_TRANSFER_BANNER_ID")) {
            if (str.equals("HIDE_ACCOUNT_DETAILS_ITEM_ID")) {
                aVar2.l2(new y(6, aVar2, limit), new yi5.b(26));
            } else {
                aVar2.J2(str);
            }
        }
        return Unit.f186387a;
    }
}
