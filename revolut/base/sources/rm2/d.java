package rm2;

import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController;
import ip0.h2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r40.n0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BackgroundCatalogController f255183w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BackgroundCatalogController backgroundCatalogController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f255183w = backgroundCatalogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f255183w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f255183w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f255183w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BackgroundCatalogController backgroundCatalogController = this.f255183w;
        switch (i) {
            case 0:
                h2 model = (h2) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = backgroundCatalogController.d();
                Intrinsics.h(model);
                com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) jVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f164492a;
                if (Intrinsics.f(str, "RETRY_BUTTON_LIST_ID")) {
                    bVar.f63757x.a();
                } else if (Intrinsics.f(str, "UPLOAD_BUTTON_LIST_ID")) {
                    bVar.I2();
                }
                break;
            case 1:
                String tabId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = backgroundCatalogController.d();
                Intrinsics.h(tabId);
                com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar2 = (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) jVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                bVar2.H2(bVar2.v, new n0(tabId, 18));
                break;
            default:
                String itemId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE33 = backgroundCatalogController.d();
                Intrinsics.h(itemId);
                com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar3 = (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) jVarE33;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("themes_menu_item_id")) {
                    bVar3.C2(l.f255193a);
                } else if (itemId.equals("upload_menu_item_id")) {
                    bVar3.H2(bVar3.v, new s(0));
                    bVar3.I2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
