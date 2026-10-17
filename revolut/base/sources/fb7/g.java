package fb7;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ HiddenAccountsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HiddenAccountsListScreen hiddenAccountsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = hiddenAccountsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarE3 = this.v.d();
        Intrinsics.h(model);
        i0 i0Var = (i0) b0VarE3;
        cli.y yVar = i0Var.v;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        x parcel = obj3 instanceof x ? (x) obj3 : null;
        if (parcel != null) {
            r10.t tVar = i0Var.f133477p;
            j domain = (j) ((j2) yVar.f22677a).getValue();
            tVar.getClass();
            Intrinsics.checkNotNullParameter(domain, "domain");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Map map = (Map) tVar.f250857a;
            HiddenAccountsConfig hiddenAccountsConfig = domain.f133483b;
            n hiddenAccountDataWrapper = domain.f133482a;
            phm.a aVar2 = (phm.a) map.get(hiddenAccountsConfig.f74646a);
            if (aVar2 != null && ((hb7.b) aVar2.get()) != null) {
                Intrinsics.checkNotNullParameter(hiddenAccountDataWrapper, "hiddenAccountDataWrapper");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if ((hiddenAccountDataWrapper instanceof k) && (parcel instanceof u)) {
                    ArrayList<SpaceContentModel> arrayList = ((k) hiddenAccountDataWrapper).f133487a;
                    u uVar = (u) parcel;
                    ProductSpaceIdentifier productSpaceIdentifier = uVar.f133496a;
                    pie.v vVar = uVar.f133497b;
                    ArrayList accountSpaces = new ArrayList(zhm.w.t(arrayList, 10));
                    for (SpaceContentModel spaceContentModelA : arrayList) {
                        if (Intrinsics.f(spaceContentModelA.f89556a, productSpaceIdentifier)) {
                            List<SubSpaceContentModel> list = spaceContentModelA.f89558c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                            for (SubSpaceContentModel subSpaceContentModelC : list) {
                                if (subSpaceContentModelC.getE() == vVar) {
                                    if (subSpaceContentModelC instanceof SubSpaceContentModel.GroupedSubSpaceContentModel) {
                                        subSpaceContentModelC = SubSpaceContentModel.GroupedSubSpaceContentModel.c((SubSpaceContentModel.GroupedSubSpaceContentModel) subSpaceContentModelC, !r10.f89564b, null, 30);
                                    } else if (!(subSpaceContentModelC instanceof SubSpaceContentModel.FlatSubSpaceContentModel)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                arrayList2.add(subSpaceContentModelC);
                            }
                            spaceContentModelA = SpaceContentModel.a(spaceContentModelA, arrayList2);
                        }
                        accountSpaces.add(spaceContentModelA);
                    }
                    Intrinsics.checkNotNullParameter(accountSpaces, "accountSpaces");
                    hiddenAccountDataWrapper = new k(accountSpaces);
                }
            }
            i0Var.H2(yVar, new e0(hiddenAccountDataWrapper, 0));
        }
        return Unit.f186387a;
    }
}
