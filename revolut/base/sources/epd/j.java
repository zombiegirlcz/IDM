package epd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomContract$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.r;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CategoryManagementCustomController f128172w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(CategoryManagementCustomController categoryManagementCustomController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128172w = categoryManagementCustomController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f128172w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f128172w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        CategoryManagementCustomController categoryManagementCustomController = this.f128172w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE3 = categoryManagementCustomController.e3();
                Intrinsics.h(id10);
                com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) cVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("DELETE_BUTTON_ID")) {
                    CategoryManagementCustomContract$Mode categoryManagementCustomContract$Mode = bVar.o.f87644c;
                    CategoryManagementCustomContract$Mode.Edit edit = categoryManagementCustomContract$Mode instanceof CategoryManagementCustomContract$Mode.Edit ? (CategoryManagementCustomContract$Mode.Edit) categoryManagementCustomContract$Mode : null;
                    if (edit != null && (str = edit.f87646a) != null) {
                        bVar.l2(new eif.j(bVar, str, null, 18), new yi5.b(26));
                    }
                }
                break;
            default:
                String id11 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE32 = categoryManagementCustomController.e3();
                Intrinsics.h(id11);
                com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b bVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) cVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                dpd.k kVar = bVar2.f87652p;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                r rVar = kVar.f116874q;
                if (rVar != null) {
                    rVar.U(id11);
                }
                break;
        }
        return Unit.f186387a;
    }
}
