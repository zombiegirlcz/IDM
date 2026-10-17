package me1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.EditCatalogueProductEntryScreen;
import gim.i;
import ip0.u8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditCatalogueProductEntryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EditCatalogueProductEntryScreen editCatalogueProductEntryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editCatalogueProductEntryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditCatalogueProductEntryScreen editCatalogueProductEntryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a) editCatalogueProductEntryScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a aVar3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a) editCatalogueProductEntryScreen.e3();
                aVar3.getClass();
                aVar3.l2(new g(aVar3, null, 1), new yi5.b(26));
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a aVar5 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a) editCatalogueProductEntryScreen.e3();
                aVar5.H2(aVar5.f60798r, new md0.c(7));
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a aVar7 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a) editCatalogueProductEntryScreen.e3();
                aVar7.H2(aVar7.f60798r, new md0.c(8));
                break;
        }
        return Unit.f186387a;
    }
}
