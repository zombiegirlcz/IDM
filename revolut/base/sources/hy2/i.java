package hy2;

import android.content.Context;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import e93.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qz0.n;
import v6l.s;
import zhm.a0;
import zhm.d0;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f156711b;

    public /* synthetic */ i(j jVar, int i) {
        this.f156710a = i;
        this.f156711b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f156710a) {
            case 0:
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                return this.f156711b.f156713b.E(AccountId.Personal.f51414a);
            case 1:
                String walletId = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                j jVar = this.f156711b;
                gte.a aVar = jVar.f;
                s sVar = jVar.f156712a;
                return m70.a.g(((jte.d) aVar).c(CardsCoreApi$Toggles.CardDesignApiFlagsMigration.f65556c) ? sVar.d(false, walletId, (1984 & 4) != 0 ? null : null, (1984 & 8) != 0 ? null : null, (1984 & 16) != 0 ? null : null, (1984 & 32) != 0 ? null : null, null, null, o.DEFAULT, null, false) : sVar.f(walletId, false, (7872 & 4) != 0 ? false : false, (7872 & 8) != 0 ? false : false, (7872 & 16) != 0 ? null : null, (7872 & 32) != 0 ? null : null, null, null, (7872 & 256) != 0 ? null : null, null, o.DEFAULT, null, false), null, new b(3), 1).firstOrError();
            default:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j jVar2 = this.f156711b;
                jVar2.getClass();
                List list = it8;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list) {
                    String str = ((e93.d) obj3).d;
                    Object objO = linkedHashMap.get(str);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str);
                    }
                    ((List) objO).add(obj3);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it9 = linkedHashMap.entrySet().iterator();
                while (it9.hasNext()) {
                    arrayList.add((e93.d) d0.b0((List) ((Map.Entry) it9.next()).getValue()));
                }
                ArrayList arrayListE0 = d0.E0(d0.B0(list, arrayList), arrayList);
                ArrayList<UrlImage> arrayList2 = new ArrayList();
                Iterator it10 = arrayListE0.iterator();
                while (it10.hasNext()) {
                    Map mapA = jVar2.f156714c.a(((e93.d) it10.next()).f123829h.f123873a);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(mapA.size()));
                    for (Map.Entry entry : mapA.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), new UrlImage((String) entry.getValue(), null, null, null, 0L, null, null, null, null, null, false, null, 500, 500, false, false, 425982));
                    }
                    a0.x(linkedHashMap2.values(), arrayList2);
                }
                for (UrlImage image : arrayList2) {
                    n nVar = (n) jVar2.d;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(image, "image");
                    Context context = nVar.f250333a;
                    com.bumptech.glide.j jVarZ = com.bumptech.glide.b.d(context).o().Z(nVar.b(image, null));
                    Integer num = image.f60026p;
                    Integer num2 = image.o;
                    Executor executor = y8.f.f311599a;
                    if (num == null || num2 == null) {
                        jVarZ.S(v8.j.h(jVarZ.f26098x, Integer.MIN_VALUE, Integer.MIN_VALUE), null, jVarZ, executor);
                    } else {
                        jVarZ.S(v8.j.h(jVarZ.f26098x, kli.a.k(context, num.intValue()), kli.a.k(context, num2.intValue())), null, jVarZ, executor);
                    }
                }
                return Unit.f186387a;
        }
    }
}
