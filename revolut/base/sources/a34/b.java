package a34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import dx4.m1;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.coroutines.CoroutineScope;
import nu3.h;
import nx4.o0;
import nx4.s0;
import o04.l;
import o04.n;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f1049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1050x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1049w = cVar;
        this.f1050x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f1049w, this.f1050x, continuation, 0);
            default:
                return new b(this.f1049w, this.f1050x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        ?? arrayList;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f1049w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = cVar.f1052b;
                    this.v = 1;
                    obj2 = creditPluginsService.getCreditCardOffers(this.f1050x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                l dto = (l) obj2;
                o04.i iVar = cVar.f1053c;
                Intrinsics.checkNotNullParameter(dto, "dto");
                h parameters = new h(dto.getParameters().getSelectedOfferId());
                List offers = dto.getOffers();
                ArrayList offers2 = new ArrayList(w.t(offers, 10));
                Iterator it8 = offers.iterator();
                while (it8.hasNext()) {
                    offers2.add(o04.i.a((o04.h) it8.next()));
                }
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(offers2, "offers");
                Iterator it9 = offers2.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (Intrinsics.f(((nu3.c) next).f219194a, parameters.f219210a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                nu3.c cVar2 = (nu3.c) next;
                return cVar2 == null ? (nu3.c) d0.b0(offers2) : cVar2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                c cVar3 = this.f1049w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = cVar3.f1052b;
                    this.v = 1;
                    obj2 = creditPluginsService2.getCreditCardPromoOffer(this.f1050x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                n promoOfferDto = (n) obj2;
                o04.i iVar2 = cVar3.f1053c;
                Intrinsics.checkNotNullParameter(promoOfferDto, "promoOfferDto");
                String strG = promoOfferDto.getTitle();
                String strA = promoOfferDto.getDescription();
                String strH = promoOfferDto.getVideoBackgroundUrl();
                String strD = promoOfferDto.getRevealAnimationDelay();
                Double dK = strD != null ? y.k(strD) : null;
                String strF = promoOfferDto.getTheme();
                List listB = promoOfferDto.getLinks();
                if (listB != null) {
                    arrayList = new ArrayList();
                    Iterator it10 = listB.iterator();
                    while (it10.hasNext()) {
                        m1 m1VarH = o0.h((s0) it10.next());
                        if (m1VarH != null) {
                            arrayList.add(m1VarH);
                        }
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                return new nu3.i(strG, strA, strH, dK, strF, uz3.h.b(promoOfferDto.getPrimaryButton()), uz3.h.b(promoOfferDto.getSecondaryButton()), arrayList);
        }
    }
}
