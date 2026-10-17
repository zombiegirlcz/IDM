package le3;

import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.AnalyticsAccountPocketSource;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f194457w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Continuation continuation) {
        super(3, continuation);
        this.f194457w = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        d dVar = new d(this.f194457w, (Continuation) obj4);
        dVar.u = (Data) obj2;
        dVar.v = (Set) obj3;
        return dVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RandomAccess randomAccess;
        boolean zContains;
        Data data = this.u;
        Set set = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        try {
            Object content = data.getContent();
            if (content != null) {
                List list = (List) content;
                String str = this.f194457w;
                if (str == null || !set.contains(str)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        AnalyticsAccountPocketSource analyticsAccountPocketSource = (AnalyticsAccountPocketSource) obj3;
                        if (analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.PocketSource) {
                            zContains = set.contains(((AnalyticsAccountPocketSource.PocketSource) analyticsAccountPocketSource).f65740a.f163145a);
                        } else {
                            if (!(analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.SubaccountSource)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zContains = set.contains(((AnalyticsAccountPocketSource.SubaccountSource) analyticsAccountPocketSource).f65741a.getF88959a().f234881a);
                        }
                        if (!zContains) {
                            arrayList.add(obj3);
                        }
                    }
                    randomAccess = arrayList;
                } else {
                    randomAccess = f0.f322471a;
                }
            } else {
                randomAccess = null;
            }
            return new Data(randomAccess, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }
}
