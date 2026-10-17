package s6e;

import com.revolut.core.model.account.AccountId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f260273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f260274c;

    public /* synthetic */ e(z zVar, String str, int i) {
        this.f260272a = i;
        this.f260273b = zVar;
        this.f260274c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f260272a) {
            case 0:
                AccountId accountId = (AccountId) obj2;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                z zVar = this.f260273b;
                return nim.a.w(zVar.n(accountId), new e(zVar, this.f260274c, 1));
            default:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "it");
                this.f260273b.f260327j.getClass();
                String subaccountId = this.f260274c;
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                Intrinsics.checkNotNullParameter(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    sua.b bVar = ((qua.p) obj3).J;
                    if (Intrinsics.f(bVar != null ? bVar.f265696a : null, subaccountId)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
        }
    }
}
