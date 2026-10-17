package wph;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreenContract$Input;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a f299325w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f299325w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f299325w, continuation, 0);
            default:
                return new c(this.f299325w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ScreenerCollection screenerCollection;
        boolean z = false;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar2 = this.f299325w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ugl.c cVar = aVar2.f96237q;
                    String str = aVar2.o.f96234a;
                    this.v = 1;
                    r83.g gVar = new r83.g(((yhl.f) cVar).f314178a, str, z ? 1 : 0, 21);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, gVar, this);
                    Object obj3 = objJ;
                    if (objJ != aVar) {
                        obj3 = Unit.f186387a;
                    }
                    if (obj3 != aVar) {
                        obj3 = Unit.f186387a;
                    }
                    if (obj3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yji.l.a1(aVar2, aVar2.X1(new mii.k("collection_deleted_toast", new TextLocalisedClause(R$string.screener_collection_deleted_message, null, null, 14), null, null, null, 28)), null, null, null, 7);
                aVar2.C2(p.f299336a);
                return Unit.f186387a;
            default:
                com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar3 = this.f299325w;
                EditScreenerScreenContract$Input editScreenerScreenContract$Input = aVar3.o;
                y yVar = aVar3.f96239s;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Data data = ((n) ((j2) yVar.f22677a).getValue()).e;
                    if (data == null || (screenerCollection = (ScreenerCollection) data.getContent()) == null) {
                        return Unit.f186387a;
                    }
                    ugl.c cVar2 = aVar3.f96237q;
                    String str2 = editScreenerScreenContract$Input.f96234a;
                    String str3 = ((n) ((j2) yVar.f22677a).getValue()).f299333b;
                    if (str3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String str4 = ((n) ((j2) yVar.f22677a).getValue()).d;
                    if (str4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    List list = screenerCollection.i;
                    ArrayList arrayList = screenerCollection.f105157g;
                    ScreenerSelectedSorting screenerSelectedSorting = screenerCollection.f105159j;
                    ScreenerSortingOptions screenerSortingOptions = screenerSelectedSorting != null ? new ScreenerSortingOptions(f0.f322471a, screenerSelectedSorting.f105170a, screenerSelectedSorting.f105171b) : null;
                    this.v = 1;
                    if (((yhl.f) cVar2).d(str2, str3, str4, list, arrayList, screenerSortingOptions, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar3.C2(new o(editScreenerScreenContract$Input.f96234a));
                return Unit.f186387a;
        }
    }
}
