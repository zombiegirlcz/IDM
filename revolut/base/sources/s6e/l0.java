package s6e;

import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import g48.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.i1;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 implements g6e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f260297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.d f260298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f260299c;
    public final r0 d;

    public l0(j0 filterProvider, g6e.d subaccountInteractor, wsg.n walletInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(filterProvider, "filterProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f260297a = filterProvider;
        this.f260298b = subaccountInteractor;
        this.f260299c = walletInteractor;
        this.d = jointAccountsInteractor;
    }

    public final akg.n a(String subaccountId, SubaccountType subaccountType) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        return nim.a.v(((z) this.f260298b).v(subaccountId, subaccountType), new k0(this, 0));
    }

    public final jhi.k b(Set subaccountId, SubaccountType subaccountType) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        Set set = subaccountId;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((z) this.f260298b).v((String) it8.next(), subaccountType));
        }
        Flow[] flowArr = (Flow[]) arrayList.toArray(new Flow[0]);
        return nim.a.u(new s56.i(this, null, 7), u0.l((Flow[]) Arrays.copyOf(flowArr, flowArr.length)));
    }

    public final Flow c(String subaccountId, SubaccountType subaccountType) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        if (subaccountType.equals(SubaccountType.Personal.f88963a) || subaccountType.equals(SubaccountType.Group.f88960a) || subaccountType.equals(SubaccountType.Pro.f88964a) || subaccountType.equals(SubaccountType.ProTax.f88965a)) {
            return new go.g(new Data(i1.f272794a, null, false, 6, null), 2);
        }
        if (subaccountType.equals(SubaccountType.Teen.f88966a) || subaccountType.equals(SubaccountType.Junior.f88962a) || subaccountType.equals(SubaccountType.Joint.f88961a)) {
            return boh.f.e(((z) this.f260298b).v(subaccountId, subaccountType), new k0(this, 1));
        }
        throw new NoWhenBranchMatchedException();
    }
}
