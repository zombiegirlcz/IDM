package b4c;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f12279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f12280c;
    public final /* synthetic */ Data d;
    public final /* synthetic */ Data e;

    public /* synthetic */ t(Data data, Data data2, Data data3, Data data4, int i) {
        this.f12278a = i;
        this.f12279b = data;
        this.f12280c = data2;
        this.d = data3;
        this.e = data4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data juniorSavingProduct;
        switch (this.f12278a) {
            case 0:
                return k.a((k) obj2, 0L, this.f12279b, this.f12280c, null, this.d, this.e, 9);
            case 1:
                Data accountUiStates = this.d;
                Intrinsics.h(accountUiStates);
                ((b88.c) obj2).getClass();
                Data walletsWithSavings = this.f12279b;
                Intrinsics.checkNotNullParameter(walletsWithSavings, "walletsWithSavings");
                Data juniorProfiles = this.f12280c;
                Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
                Intrinsics.checkNotNullParameter(accountUiStates, "accountUiStates");
                Data creationAvailable = this.e;
                Intrinsics.checkNotNullParameter(creationAvailable, "creationAvailable");
                return new b88.c(walletsWithSavings, juniorProfiles, accountUiStates, creationAvailable);
            case 2:
                Data data = this.e;
                dn8.a aVar = (dn8.a) obj2;
                Data user = this.d;
                Intrinsics.h(user);
                try {
                    Object content = data.getContent();
                    juniorSavingProduct = new Data(content != null ? (SavingsProductData) d0.b0((List) content) : null, data.getError(), data.getLoading());
                    break;
                } catch (Throwable th10) {
                    juniorSavingProduct = new Data(null, th10, data.getLoading());
                }
                String requestId = aVar.f116232a;
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                Data juniorProfiles2 = this.f12279b;
                Intrinsics.checkNotNullParameter(juniorProfiles2, "juniorProfiles");
                Data savingsRequests = this.f12280c;
                Intrinsics.checkNotNullParameter(savingsRequests, "savingsRequests");
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(juniorSavingProduct, "juniorSavingProduct");
                return new dn8.a(juniorProfiles2, savingsRequests, user, juniorSavingProduct, requestId);
            case 3:
                return eig.k.a((eig.k) obj2, this.f12279b, this.f12280c, this.d, this.e, false, false, null, null, 240);
            default:
                boolean z = ((m98.f) obj2).e;
                Data juniorProfile = this.f12279b;
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                Data parentAddress = this.f12280c;
                Intrinsics.checkNotNullParameter(parentAddress, "parentAddress");
                Data cardRequest = this.d;
                Intrinsics.checkNotNullParameter(cardRequest, "cardRequest");
                Data cardConfig = this.e;
                Intrinsics.checkNotNullParameter(cardConfig, "cardConfig");
                return new m98.f(juniorProfile, parentAddress, cardRequest, cardConfig, z);
        }
    }
}
