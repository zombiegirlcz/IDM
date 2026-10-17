package g98;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f141501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f141502b;

    public e(List list, k kVar) {
        this.f141501a = list;
        this.f141502b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        od0.i productAccountId = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        ProductAccountId productAccountId2 = (ProductAccountId) productAccountId.f224257a;
        String str = productAccountId2 != null ? z88.a.a(productAccountId2).f76717a : null;
        List list = this.f141501a;
        ArrayList<c> arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (Intrinsics.f(((c) obj3).f141499b.f77103j, str)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (c cVar : arrayList) {
            arrayList2.add(k.h(this.f141502b, cVar.f141499b, cVar.f141498a));
        }
        return arrayList2;
    }
}
