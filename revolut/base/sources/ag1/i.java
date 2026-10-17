package ag1;

import bnh.q;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow[] f4761b;

    public /* synthetic */ i(Flow[] flowArr, int i) {
        this.f4760a = i;
        this.f4761b = flowArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4760a) {
            case 0:
                return new Pair[this.f4761b.length];
            case 1:
                return new SubSpaceContentModel[this.f4761b.length];
            case 2:
                return new SpaceContentModel[this.f4761b.length];
            case 3:
                return new Pair[this.f4761b.length];
            case 4:
                return new Data[this.f4761b.length];
            case 5:
                return new List[this.f4761b.length];
            case 6:
                return new Data[this.f4761b.length];
            case 7:
                return new Object[this.f4761b.length];
            case 8:
                return new Map[this.f4761b.length];
            case 9:
                return new String[this.f4761b.length];
            case 10:
                return new q[this.f4761b.length];
            case 11:
                return new od0.i[this.f4761b.length];
            case 12:
                return new List[this.f4761b.length];
            case 13:
                return new Data[this.f4761b.length];
            case 14:
                return new d3d.b[this.f4761b.length];
            case 15:
                return new List[this.f4761b.length];
            case 16:
                return new List[this.f4761b.length];
            case 17:
                return new aqd.l[this.f4761b.length];
            case 18:
                return new Data[this.f4761b.length];
            case 19:
                return new AccountsExtensionContract$AccountsState[this.f4761b.length];
            case 20:
                return new Data[this.f4761b.length];
            case 21:
                return new Boolean[this.f4761b.length];
            case 22:
                return new Data[this.f4761b.length];
            case 23:
                return new Object[this.f4761b.length];
            case 24:
                return new Data[this.f4761b.length];
            case 25:
                return new List[this.f4761b.length];
            case 26:
                return new List[this.f4761b.length];
            case 27:
                return new List[this.f4761b.length];
            case 28:
                return new List[this.f4761b.length];
            default:
                return new Data[this.f4761b.length];
        }
    }
}
