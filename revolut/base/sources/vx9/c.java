package vx9;

import efm.d0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292856a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx9.a f292857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f292858c;
    public final Object d;
    public final Object e;
    public final Object f;

    public c(lx1.d apmContactsInteractor, uw1.e apmProductProvider, uw1.c apmFeatureChecker, kx9.a recentsDao, ufm.d mapper) {
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(apmProductProvider, "apmProductProvider");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f292858c = apmContactsInteractor;
        this.d = apmProductProvider;
        this.e = apmFeatureChecker;
        this.f292857b = recentsDao;
        this.f = mapper;
    }

    @Override // vx9.t
    public final efm.b a(List transactions) {
        switch (this.f292856a) {
            case 0:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                pfm.a aVar = new pfm.a(((ty1.e) ((uw1.e) this.d)).b(), new vx5.m(new a(this, transactions, 0), 1), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            default:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                d0 d0VarFirstOrError = rd0.e.c(((cw9.d) this.f).c(), kotlin.coroutines.g.f186406a).firstOrError();
                vx5.m mVar = new vx5.m(new k(this, transactions), 17);
                d0VarFirstOrError.getClass();
                pfm.a aVar2 = new pfm.a(d0VarFirstOrError, mVar, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
        }
    }

    public pfm.a b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ux9.a) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            String strC = ((ux9.a) obj3).c();
            Object objO = linkedHashMap.get(strC);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, strC);
            }
            ((List) objO).add(obj3);
        }
        pfm.a aVar = new pfm.a(((ufm.d) this.f).h(linkedHashMap, nx9.d.APM_CONTACT), new vx5.m(new b(this, 0), 4), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public c(mq9.f groupsInteractor, tx9.f timestampManager, kx9.a recentsDao, ang.f userInteractor, cw9.d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(timestampManager, "timestampManager");
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f292858c = groupsInteractor;
        this.d = timestampManager;
        this.f292857b = recentsDao;
        this.e = userInteractor;
        this.f = paymentsProductFeatureChecker;
    }
}
