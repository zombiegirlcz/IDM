package i31;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.network.models.moneyrequest.TransferLinkDetailsDto;
import com.revolut.data.network.models.moneyrequest.mapper.TransferLinkMappingsKt;
import com.revolut.data.network.services.TransferService;
import com.revolut.data.network.services.wallet.AccountsService;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import i2i.o;
import i31.j;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class l implements y71.c {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountsService f158084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferService f158085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f158086c;
    public final ne0.d d;
    public final ue0.c e;
    public final wj0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f158087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f158088h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f158089j;
    public final w4l.f k;

    public l(AccountsService accountService, TransferService transferService, ne0.d memoryCache, ne0.d currenciesByUsernameMemoryCache, ue0.c storage, wj0.a idempotencyKeyHolder, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(transferService, "transferService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(currenciesByUsernameMemoryCache, "currenciesByUsernameMemoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f158084a = accountService;
        this.f158085b = transferService;
        this.f158086c = memoryCache;
        this.d = currenciesByUsernameMemoryCache;
        this.e = storage;
        this.f = idempotencyKeyHolder;
        this.f158087g = featureToggleInteractor;
        this.f158088h = v0.a.d("create(...)");
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: i31.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158076b;

            {
                this.f158076b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String username = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(username, "username");
                        l lVar = this.f158076b;
                        return lVar.f158085b.getAvailableCurrenciesByUsername(username, ((jte.d) lVar.f158087g).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? "YOUTH_MULTI_CURRENCY" : null);
                    case 1:
                        k params = (k) obj2;
                        TransferLinkDetails updateItem = (TransferLinkDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(updateItem, "updateItem");
                        this.f158076b.f158086c.f("transfer_links_" + params.f158083a, updateItem);
                        return Unit.f186387a;
                    case 2:
                        String username2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(username2, "username");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f158076b.d.f(username2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        j.a it8 = (j.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<TransferLinkDetailsDto>> transferLinks = this.f158076b.f158085b.getTransferLinks();
                        e eVar = new e(1, new o(21));
                        transferLinks.getClass();
                        ufm.i iVar = new ufm.i(transferLinks, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List updateItems = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(updateItems, "updateItems");
                        this.f158076b.f158086c.f("transfer_links", updateItems);
                        return Unit.f186387a;
                    case 5:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        l lVar2 = this.f158076b;
                        Iterable iterableA = lVar2.a();
                        if (iterableA == null) {
                            iterableA = f0.f322471a;
                        }
                        Iterable iterable = iterableA;
                        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                        Iterator it9 = iterable.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((TransferLinkDetails) it9.next()).getF60363b());
                        }
                        List list = items;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(((TransferLinkDetails) it10.next()).getF60363b());
                        }
                        if (!zhm.d0.Q0(arrayList, arrayList2).isEmpty()) {
                            lVar2.f158088h.onNext(Unit.f186387a);
                        }
                        ue0.c cVar = lVar2.e;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(TransferLinkMappingsKt.toDto((TransferLinkDetails) it11.next()));
                        }
                        cVar.G(arrayList3, "transfer_links", kii.e.o(TransferLinkDetailsDto.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<TransferLinkDetailsDto> transferLink = this.f158076b.f158085b.getTransferLink(params2.f158083a);
                        e eVar2 = new e(2, new o(22));
                        transferLink.getClass();
                        ufm.i iVar2 = new ufm.i(transferLink, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: i31.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158078b;

            {
                this.f158078b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i) {
                    case 0:
                        String username = (String) obj2;
                        Intrinsics.checkNotNullParameter(username, "username");
                        return (Set) this.f158078b.d.get(username);
                    case 1:
                        j.a it8 = (j.a) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158078b.f158086c.get("transfer_links");
                    case 2:
                        j.a it9 = (j.a) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f158078b.a();
                    default:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.d dVar = this.f158078b.f158086c;
                        List list = (List) dVar.get("transfer_links");
                        if (list != null) {
                            Iterator it10 = list.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next = it10.next();
                                    if (Intrinsics.f(((TransferLinkDetails) next).getF60363b(), params.f158083a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            TransferLinkDetails transferLinkDetails = (TransferLinkDetails) next;
                            if (transferLinkDetails != null) {
                                return transferLinkDetails;
                            }
                        }
                        return (TransferLinkDetails) v1.c.s("transfer_links_", params.f158083a, dVar);
                }
            }
        };
        final int i2 = 2;
        this.i = new w4l.f(function2, function1, new Function2(this) { // from class: i31.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158076b;

            {
                this.f158076b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String username = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(username, "username");
                        l lVar = this.f158076b;
                        return lVar.f158085b.getAvailableCurrenciesByUsername(username, ((jte.d) lVar.f158087g).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? "YOUTH_MULTI_CURRENCY" : null);
                    case 1:
                        k params = (k) obj2;
                        TransferLinkDetails updateItem = (TransferLinkDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(updateItem, "updateItem");
                        this.f158076b.f158086c.f("transfer_links_" + params.f158083a, updateItem);
                        return Unit.f186387a;
                    case 2:
                        String username2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(username2, "username");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f158076b.d.f(username2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        j.a it8 = (j.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<TransferLinkDetailsDto>> transferLinks = this.f158076b.f158085b.getTransferLinks();
                        e eVar = new e(1, new o(21));
                        transferLinks.getClass();
                        ufm.i iVar = new ufm.i(transferLinks, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List updateItems = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(updateItems, "updateItems");
                        this.f158076b.f158086c.f("transfer_links", updateItems);
                        return Unit.f186387a;
                    case 5:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        l lVar2 = this.f158076b;
                        Iterable iterableA = lVar2.a();
                        if (iterableA == null) {
                            iterableA = f0.f322471a;
                        }
                        Iterable iterable = iterableA;
                        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                        Iterator it9 = iterable.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((TransferLinkDetails) it9.next()).getF60363b());
                        }
                        List list = items;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(((TransferLinkDetails) it10.next()).getF60363b());
                        }
                        if (!zhm.d0.Q0(arrayList, arrayList2).isEmpty()) {
                            lVar2.f158088h.onNext(Unit.f186387a);
                        }
                        ue0.c cVar = lVar2.e;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(TransferLinkMappingsKt.toDto((TransferLinkDetails) it11.next()));
                        }
                        cVar.G(arrayList3, "transfer_links", kii.e.o(TransferLinkDetailsDto.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<TransferLinkDetailsDto> transferLink = this.f158076b.f158085b.getTransferLink(params2.f158083a);
                        e eVar2 = new e(2, new o(22));
                        transferLink.getClass();
                        ufm.i iVar2 = new ufm.i(transferLink, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 3;
        Function2 function22 = new Function2(this) { // from class: i31.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158076b;

            {
                this.f158076b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String username = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(username, "username");
                        l lVar = this.f158076b;
                        return lVar.f158085b.getAvailableCurrenciesByUsername(username, ((jte.d) lVar.f158087g).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? "YOUTH_MULTI_CURRENCY" : null);
                    case 1:
                        k params = (k) obj2;
                        TransferLinkDetails updateItem = (TransferLinkDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(updateItem, "updateItem");
                        this.f158076b.f158086c.f("transfer_links_" + params.f158083a, updateItem);
                        return Unit.f186387a;
                    case 2:
                        String username2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(username2, "username");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f158076b.d.f(username2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        j.a it8 = (j.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<TransferLinkDetailsDto>> transferLinks = this.f158076b.f158085b.getTransferLinks();
                        e eVar = new e(1, new o(21));
                        transferLinks.getClass();
                        ufm.i iVar = new ufm.i(transferLinks, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List updateItems = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(updateItems, "updateItems");
                        this.f158076b.f158086c.f("transfer_links", updateItems);
                        return Unit.f186387a;
                    case 5:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        l lVar2 = this.f158076b;
                        Iterable iterableA = lVar2.a();
                        if (iterableA == null) {
                            iterableA = f0.f322471a;
                        }
                        Iterable iterable = iterableA;
                        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                        Iterator it9 = iterable.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((TransferLinkDetails) it9.next()).getF60363b());
                        }
                        List list = items;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(((TransferLinkDetails) it10.next()).getF60363b());
                        }
                        if (!zhm.d0.Q0(arrayList, arrayList2).isEmpty()) {
                            lVar2.f158088h.onNext(Unit.f186387a);
                        }
                        ue0.c cVar = lVar2.e;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(TransferLinkMappingsKt.toDto((TransferLinkDetails) it11.next()));
                        }
                        cVar.G(arrayList3, "transfer_links", kii.e.o(TransferLinkDetailsDto.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<TransferLinkDetailsDto> transferLink = this.f158076b.f158085b.getTransferLink(params2.f158083a);
                        e eVar2 = new e(2, new o(22));
                        transferLink.getClass();
                        ufm.i iVar2 = new ufm.i(transferLink, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i5 = 1;
        Function1 function12 = new Function1(this) { // from class: i31.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158078b;

            {
                this.f158078b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i5) {
                    case 0:
                        String username = (String) obj2;
                        Intrinsics.checkNotNullParameter(username, "username");
                        return (Set) this.f158078b.d.get(username);
                    case 1:
                        j.a it8 = (j.a) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158078b.f158086c.get("transfer_links");
                    case 2:
                        j.a it9 = (j.a) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f158078b.a();
                    default:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.d dVar = this.f158078b.f158086c;
                        List list = (List) dVar.get("transfer_links");
                        if (list != null) {
                            Iterator it10 = list.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next = it10.next();
                                    if (Intrinsics.f(((TransferLinkDetails) next).getF60363b(), params.f158083a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            TransferLinkDetails transferLinkDetails = (TransferLinkDetails) next;
                            if (transferLinkDetails != null) {
                                return transferLinkDetails;
                            }
                        }
                        return (TransferLinkDetails) v1.c.s("transfer_links_", params.f158083a, dVar);
                }
            }
        };
        final int i6 = 4;
        Function2 function23 = new Function2(this) { // from class: i31.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158076b;

            {
                this.f158076b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String username = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(username, "username");
                        l lVar = this.f158076b;
                        return lVar.f158085b.getAvailableCurrenciesByUsername(username, ((jte.d) lVar.f158087g).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? "YOUTH_MULTI_CURRENCY" : null);
                    case 1:
                        k params = (k) obj2;
                        TransferLinkDetails updateItem = (TransferLinkDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(updateItem, "updateItem");
                        this.f158076b.f158086c.f("transfer_links_" + params.f158083a, updateItem);
                        return Unit.f186387a;
                    case 2:
                        String username2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(username2, "username");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f158076b.d.f(username2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        j.a it8 = (j.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<TransferLinkDetailsDto>> transferLinks = this.f158076b.f158085b.getTransferLinks();
                        e eVar = new e(1, new o(21));
                        transferLinks.getClass();
                        ufm.i iVar = new ufm.i(transferLinks, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List updateItems = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(updateItems, "updateItems");
                        this.f158076b.f158086c.f("transfer_links", updateItems);
                        return Unit.f186387a;
                    case 5:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        l lVar2 = this.f158076b;
                        Iterable iterableA = lVar2.a();
                        if (iterableA == null) {
                            iterableA = f0.f322471a;
                        }
                        Iterable iterable = iterableA;
                        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                        Iterator it9 = iterable.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((TransferLinkDetails) it9.next()).getF60363b());
                        }
                        List list = items;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(((TransferLinkDetails) it10.next()).getF60363b());
                        }
                        if (!zhm.d0.Q0(arrayList, arrayList2).isEmpty()) {
                            lVar2.f158088h.onNext(Unit.f186387a);
                        }
                        ue0.c cVar = lVar2.e;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(TransferLinkMappingsKt.toDto((TransferLinkDetails) it11.next()));
                        }
                        cVar.G(arrayList3, "transfer_links", kii.e.o(TransferLinkDetailsDto.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<TransferLinkDetailsDto> transferLink = this.f158076b.f158085b.getTransferLink(params2.f158083a);
                        e eVar2 = new e(2, new o(22));
                        transferLink.getClass();
                        ufm.i iVar2 = new ufm.i(transferLink, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i21 = 2;
        Function1 function13 = new Function1(this) { // from class: i31.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158078b;

            {
                this.f158078b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i21) {
                    case 0:
                        String username = (String) obj2;
                        Intrinsics.checkNotNullParameter(username, "username");
                        return (Set) this.f158078b.d.get(username);
                    case 1:
                        j.a it8 = (j.a) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158078b.f158086c.get("transfer_links");
                    case 2:
                        j.a it9 = (j.a) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f158078b.a();
                    default:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.d dVar = this.f158078b.f158086c;
                        List list = (List) dVar.get("transfer_links");
                        if (list != null) {
                            Iterator it10 = list.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next = it10.next();
                                    if (Intrinsics.f(((TransferLinkDetails) next).getF60363b(), params.f158083a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            TransferLinkDetails transferLinkDetails = (TransferLinkDetails) next;
                            if (transferLinkDetails != null) {
                                return transferLinkDetails;
                            }
                        }
                        return (TransferLinkDetails) v1.c.s("transfer_links_", params.f158083a, dVar);
                }
            }
        };
        final int i22 = 5;
        this.f158089j = new w4l.f(function22, function12, function23, function13, new Function2(this) { // from class: i31.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158076b;

            {
                this.f158076b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String username = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(username, "username");
                        l lVar = this.f158076b;
                        return lVar.f158085b.getAvailableCurrenciesByUsername(username, ((jte.d) lVar.f158087g).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? "YOUTH_MULTI_CURRENCY" : null);
                    case 1:
                        k params = (k) obj2;
                        TransferLinkDetails updateItem = (TransferLinkDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(updateItem, "updateItem");
                        this.f158076b.f158086c.f("transfer_links_" + params.f158083a, updateItem);
                        return Unit.f186387a;
                    case 2:
                        String username2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(username2, "username");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f158076b.d.f(username2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        j.a it8 = (j.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<TransferLinkDetailsDto>> transferLinks = this.f158076b.f158085b.getTransferLinks();
                        e eVar = new e(1, new o(21));
                        transferLinks.getClass();
                        ufm.i iVar = new ufm.i(transferLinks, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List updateItems = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(updateItems, "updateItems");
                        this.f158076b.f158086c.f("transfer_links", updateItems);
                        return Unit.f186387a;
                    case 5:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        l lVar2 = this.f158076b;
                        Iterable iterableA = lVar2.a();
                        if (iterableA == null) {
                            iterableA = f0.f322471a;
                        }
                        Iterable iterable = iterableA;
                        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                        Iterator it9 = iterable.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((TransferLinkDetails) it9.next()).getF60363b());
                        }
                        List list = items;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(((TransferLinkDetails) it10.next()).getF60363b());
                        }
                        if (!zhm.d0.Q0(arrayList, arrayList2).isEmpty()) {
                            lVar2.f158088h.onNext(Unit.f186387a);
                        }
                        ue0.c cVar = lVar2.e;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(TransferLinkMappingsKt.toDto((TransferLinkDetails) it11.next()));
                        }
                        cVar.G(arrayList3, "transfer_links", kii.e.o(TransferLinkDetailsDto.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<TransferLinkDetailsDto> transferLink = this.f158076b.f158085b.getTransferLink(params2.f158083a);
                        e eVar2 = new e(2, new o(22));
                        transferLink.getClass();
                        ufm.i iVar2 = new ufm.i(transferLink, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i32 = 6;
        Function2 function24 = new Function2(this) { // from class: i31.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158076b;

            {
                this.f158076b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String username = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(username, "username");
                        l lVar = this.f158076b;
                        return lVar.f158085b.getAvailableCurrenciesByUsername(username, ((jte.d) lVar.f158087g).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? "YOUTH_MULTI_CURRENCY" : null);
                    case 1:
                        k params = (k) obj2;
                        TransferLinkDetails updateItem = (TransferLinkDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(updateItem, "updateItem");
                        this.f158076b.f158086c.f("transfer_links_" + params.f158083a, updateItem);
                        return Unit.f186387a;
                    case 2:
                        String username2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(username2, "username");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f158076b.d.f(username2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        j.a it8 = (j.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<TransferLinkDetailsDto>> transferLinks = this.f158076b.f158085b.getTransferLinks();
                        e eVar = new e(1, new o(21));
                        transferLinks.getClass();
                        ufm.i iVar = new ufm.i(transferLinks, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List updateItems = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(updateItems, "updateItems");
                        this.f158076b.f158086c.f("transfer_links", updateItems);
                        return Unit.f186387a;
                    case 5:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        l lVar2 = this.f158076b;
                        Iterable iterableA = lVar2.a();
                        if (iterableA == null) {
                            iterableA = f0.f322471a;
                        }
                        Iterable iterable = iterableA;
                        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                        Iterator it9 = iterable.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((TransferLinkDetails) it9.next()).getF60363b());
                        }
                        List list = items;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(((TransferLinkDetails) it10.next()).getF60363b());
                        }
                        if (!zhm.d0.Q0(arrayList, arrayList2).isEmpty()) {
                            lVar2.f158088h.onNext(Unit.f186387a);
                        }
                        ue0.c cVar = lVar2.e;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(TransferLinkMappingsKt.toDto((TransferLinkDetails) it11.next()));
                        }
                        cVar.G(arrayList3, "transfer_links", kii.e.o(TransferLinkDetailsDto.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<TransferLinkDetailsDto> transferLink = this.f158076b.f158085b.getTransferLink(params2.f158083a);
                        e eVar2 = new e(2, new o(22));
                        transferLink.getClass();
                        ufm.i iVar2 = new ufm.i(transferLink, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i33 = 3;
        Function1 function14 = new Function1(this) { // from class: i31.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158078b;

            {
                this.f158078b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i33) {
                    case 0:
                        String username = (String) obj2;
                        Intrinsics.checkNotNullParameter(username, "username");
                        return (Set) this.f158078b.d.get(username);
                    case 1:
                        j.a it8 = (j.a) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158078b.f158086c.get("transfer_links");
                    case 2:
                        j.a it9 = (j.a) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f158078b.a();
                    default:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.d dVar = this.f158078b.f158086c;
                        List list = (List) dVar.get("transfer_links");
                        if (list != null) {
                            Iterator it10 = list.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next = it10.next();
                                    if (Intrinsics.f(((TransferLinkDetails) next).getF60363b(), params.f158083a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            TransferLinkDetails transferLinkDetails = (TransferLinkDetails) next;
                            if (transferLinkDetails != null) {
                                return transferLinkDetails;
                            }
                        }
                        return (TransferLinkDetails) v1.c.s("transfer_links_", params.f158083a, dVar);
                }
            }
        };
        final int i43 = 1;
        this.k = new w4l.f(function24, function14, new Function2(this) { // from class: i31.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f158076b;

            {
                this.f158076b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String username = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(username, "username");
                        l lVar = this.f158076b;
                        return lVar.f158085b.getAvailableCurrenciesByUsername(username, ((jte.d) lVar.f158087g).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? "YOUTH_MULTI_CURRENCY" : null);
                    case 1:
                        k params = (k) obj2;
                        TransferLinkDetails updateItem = (TransferLinkDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(updateItem, "updateItem");
                        this.f158076b.f158086c.f("transfer_links_" + params.f158083a, updateItem);
                        return Unit.f186387a;
                    case 2:
                        String username2 = (String) obj2;
                        Set acceptableCurrencies = (Set) obj3;
                        Intrinsics.checkNotNullParameter(username2, "username");
                        Intrinsics.checkNotNullParameter(acceptableCurrencies, "acceptableCurrencies");
                        this.f158076b.d.f(username2, acceptableCurrencies);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        j.a it8 = (j.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<TransferLinkDetailsDto>> transferLinks = this.f158076b.f158085b.getTransferLinks();
                        e eVar = new e(1, new o(21));
                        transferLinks.getClass();
                        ufm.i iVar = new ufm.i(transferLinks, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List updateItems = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(updateItems, "updateItems");
                        this.f158076b.f158086c.f("transfer_links", updateItems);
                        return Unit.f186387a;
                    case 5:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((j.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        l lVar2 = this.f158076b;
                        Iterable iterableA = lVar2.a();
                        if (iterableA == null) {
                            iterableA = f0.f322471a;
                        }
                        Iterable iterable = iterableA;
                        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                        Iterator it9 = iterable.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((TransferLinkDetails) it9.next()).getF60363b());
                        }
                        List list = items;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(((TransferLinkDetails) it10.next()).getF60363b());
                        }
                        if (!zhm.d0.Q0(arrayList, arrayList2).isEmpty()) {
                            lVar2.f158088h.onNext(Unit.f186387a);
                        }
                        ue0.c cVar = lVar2.e;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(TransferLinkMappingsKt.toDto((TransferLinkDetails) it11.next()));
                        }
                        cVar.G(arrayList3, "transfer_links", kii.e.o(TransferLinkDetailsDto.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<TransferLinkDetailsDto> transferLink = this.f158076b.f158085b.getTransferLink(params2.f158083a);
                        e eVar2 = new e(2, new o(22));
                        transferLink.getClass();
                        ufm.i iVar2 = new ufm.i(transferLink, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final ArrayList a() {
        Type type = new TypeToken<List<? extends TransferLinkDetailsDto>>() { // from class: com.revolut.data.repositories.transfer.TransfersRepositoryImpl$getPaymentLinksFromStorage$type$1
        }.getType();
        Intrinsics.h(type);
        List list = (List) this.e.T2("transfer_links", type);
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(TransferLinkMappingsKt.toDomain((TransferLinkDetailsDto) it8.next()));
        }
        return arrayList;
    }
}
