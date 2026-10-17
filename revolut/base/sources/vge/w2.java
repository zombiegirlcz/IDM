package vge;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class w2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow[] f289048b;

    public /* synthetic */ w2(Flow[] flowArr, int i) {
        this.f289047a = i;
        this.f289048b = flowArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f289047a) {
            case 0:
                return new Pair[this.f289048b.length];
            case 1:
                return new Data[this.f289048b.length];
            case 2:
                return new Data[this.f289048b.length];
            case 3:
                return new SubSpaceContentModel[this.f289048b.length];
            case 4:
                return new SpaceContentModel[this.f289048b.length];
            case 5:
                return new List[this.f289048b.length];
            case 6:
                return new List[this.f289048b.length];
            case 7:
                return new Data[this.f289048b.length];
            case 8:
                return new Data[this.f289048b.length];
            case 9:
                return new od0.i[this.f289048b.length];
            case 10:
                return new od0.i[this.f289048b.length];
            case 11:
                return new yld.c[this.f289048b.length];
            case 12:
                return new vrf.f[this.f289048b.length];
            case 13:
                return new Data[this.f289048b.length];
            case 14:
                return new cg1.b[this.f289048b.length];
            case 15:
                return new Pair[this.f289048b.length];
            default:
                return new Pair[this.f289048b.length];
        }
    }
}
