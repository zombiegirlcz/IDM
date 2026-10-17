package xra;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import efm.d0;
import efm.r;
import fqa.l;
import fqa.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import qe0.s;
import retrofit2.HttpException;
import retrofit2.Response;
import wf0.q;
import xlb.o;
import xo8.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f308306b;

    public /* synthetic */ a(h hVar, int i) {
        this.f308305a = i;
        this.f308306b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        String strString;
        switch (this.f308305a) {
            case 0:
                final h hVar = this.f308306b;
                final CardOwner cardOwner = (CardOwner) obj2;
                Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
                hVar.f308315g.d = true;
                final int i = 0;
                return new pfm.h(new kfm.a() { // from class: xra.b
                    @Override // kfm.a
                    public final void run() {
                        switch (i) {
                            case 0:
                                h hVar2 = hVar;
                                CardOwner cardOwner2 = cardOwner;
                                qra.a aVar = hVar2.f308313b;
                                Intrinsics.h(cardOwner2);
                                aVar.d(g4i.a.J(cardOwner2));
                                hVar2.i.k(cardOwner2.f81490a, cardOwner2);
                                break;
                            default:
                                h hVar3 = hVar;
                                CardOwner cardOwner3 = cardOwner;
                                hVar3.f308315g.d = true;
                                hVar3.i.j(cardOwner3.getF81490a(), cardOwner3);
                                break;
                        }
                    }
                }, 2).f(d0.m(cardOwner));
            case 1:
                h hVar2 = this.f308306b;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof HttpException) {
                    HttpException httpException = (HttpException) error;
                    if (httpException.code() == 409 && (response = httpException.response()) != null && (responseBodyErrorBody = response.errorBody()) != null && (strString = responseBodyErrorBody.string()) != null) {
                        Object objC = hVar2.e.c(strString, lqa.f.class);
                        Intrinsics.checkNotNullExpressionValue(objC, "fromJson(...)");
                        ufm.b bVarM = d0.m(new m(mra.d.U((lqa.f) objC), true));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        return bVarM;
                    }
                    ServerError serverErrorC = hVar2.f.c(httpException);
                    if (serverErrorC != null && serverErrorC.f51362a == 110036) {
                        ufm.b bVarM2 = d0.m(new fqa.k(l.CARD_FRAUD));
                        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                        return bVarM2;
                    }
                }
                ufm.c cVarL = d0.l(error);
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            case 2:
                h hVar3 = this.f308306b;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List listB = hVar3.f308313b.b();
                Intrinsics.checkNotNullParameter(listB, "<this>");
                List list = listB;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(g4i.a.A((sra.b) it9.next()));
                }
                return arrayList;
            case 3:
                s sVar = this.f308306b.f308315g;
                Unit unit = Unit.f186387a;
                sVar.f(unit);
                return unit;
            case 4:
                h hVar4 = this.f308306b;
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                sra.b bVarC = hVar4.f308313b.c(id10);
                if (bVarC != null) {
                    return g4i.a.A(bVarC);
                }
                return null;
            case 5:
                final h hVar5 = this.f308306b;
                final CardOwner cardOwner2 = (CardOwner) obj2;
                Intrinsics.checkNotNullParameter(cardOwner2, "cardOwner");
                final int i2 = 1;
                return new pfm.h(new kfm.a() { // from class: xra.b
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                h hVar22 = hVar5;
                                CardOwner cardOwner22 = cardOwner2;
                                qra.a aVar = hVar22.f308313b;
                                Intrinsics.h(cardOwner22);
                                aVar.d(g4i.a.J(cardOwner22));
                                hVar22.i.k(cardOwner22.f81490a, cardOwner22);
                                break;
                            default:
                                h hVar32 = hVar5;
                                CardOwner cardOwner3 = cardOwner2;
                                hVar32.f308315g.d = true;
                                hVar32.i.j(cardOwner3.getF81490a(), cardOwner3);
                                break;
                        }
                    }
                }, 2).f(d0.m(cardOwner2));
            default:
                h hVar6 = this.f308306b;
                List cardOwners = (List) obj2;
                Intrinsics.checkNotNullParameter(cardOwners, "cardOwners");
                j jVar = hVar6.f308314c;
                r rVarDoOnNext = jVar.f308317a.b().map(new u(18, new o(1, jVar.f308318b, ura.a.class, "toRecentsDomain", "toRecentsDomain(Ljava/util/List;)Ljava/util/List;", 0, 10))).doOnNext(new u(19, new xng.l(jVar, 16)));
                Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
                r rVarStartWith = te0.w.f0(rVarDoOnNext).startWith((efm.w) new q(jVar, 1));
                Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                r map = rVarStartWith.map(new u(11, new xpe.c(hVar6, cardOwners, 7)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
        }
    }
}
