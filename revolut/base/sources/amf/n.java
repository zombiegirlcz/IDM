package amf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.transactions.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.List;
import klf.j1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import tof.a3;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f6388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6389y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Continuation continuation, int i) {
        super(4, continuation);
        this.u = i;
        this.f6389y = obj2;
        this.z = obj3;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.u) {
            case 0:
                n nVar = new n((o) this.f6389y, (Function2) this.z, (Continuation) obj5, 0);
                nVar.v = (a3) obj2;
                nVar.f6387w = (j1) obj3;
                nVar.f6388x = (do3.n) obj4;
                return nVar.invokeSuspend(Unit.f186387a);
            default:
                n nVar2 = new n((FavouritesAssetTypeKey) this.f6389y, (u3d.b) this.z, (Continuation) obj5, 1);
                nVar2.v = (Data) obj2;
                nVar2.f6387w = (Data) obj3;
                nVar2.f6388x = (Data) obj4;
                return nVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        int i = this.u;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                a3 transaction = (a3) this.v;
                j1 youthWalletOwner = (j1) this.f6387w;
                do3.n currentUser = (do3.n) this.f6388x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Function2 additionalFilter = (Function2) obj3;
                aim.e eVarB = u.b();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
                Intrinsics.checkNotNullParameter(currentUser, "currentUser");
                Intrinsics.checkNotNullParameter(additionalFilter, "additionalFilter");
                if (transaction.f272624y.f273145c != io3.i.EXTERNAL && !youthWalletOwner.b() && ((Boolean) additionalFilter.invoke(transaction, currentUser)).booleanValue()) {
                    String str = transaction.f272614t;
                    eVarB.add((str == null || d0.W(str)) ? com.revolut.core.ui_kit.models.popup.a.a("ID_MENU_ITEM_NOTE", new TextLocalisedClause(R$string.transactionUI_transaction_details_add_note_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION) : com.revolut.core.ui_kit.models.popup.a.a("ID_MENU_ITEM_NOTE", new TextLocalisedClause(R$string.transaction_details_context_menu_edit_note, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                }
                return u.a(eVarB);
            default:
                Data data = (Data) this.v;
                Data data2 = (Data) this.f6387w;
                Data data3 = (Data) this.f6388x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) this.f6389y;
                List list = (List) data2.getContent();
                if (list != null) {
                    List<u3d.a> list2 = list;
                    u3d.b bVar = (u3d.b) obj3;
                    arrayList = new ArrayList(w.t(list2, 10));
                    for (u3d.a aVar3 : list2) {
                        arrayList.add(bVar.c(aVar3.f276920a, aVar3));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                List list3 = (List) data.getContent();
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                List list4 = (List) data3.getContent();
                if (list4 == null) {
                    list4 = f0.f322471a;
                }
                ogd.g gVar = new ogd.g(arrayList, list3, list4, f0.f322471a);
                boolean z = data.getLoading() || data2.getLoading() || data3.getLoading();
                Throwable[] elements = {data.getError(), data2.getError(), data3.getError()};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                if (listL.isEmpty()) {
                    listL = null;
                }
                return new Pair(favouritesAssetTypeKey, new Data(gVar, listL != null ? new CompositeException(listL) : null, z));
        }
    }
}
