package z0m;

import android.util.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class l extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Pair f318647h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Pair pair, int i) {
        super(0);
        this.f = i;
        this.f318647h = pair;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                Pair pair = this.f318647h;
                if (pair != null) {
                    return (String) pair.first;
                }
                return null;
            case 1:
                Pair pair2 = this.f318647h;
                if (pair2 != null) {
                    return (String) pair2.second;
                }
                return null;
            case 2:
                Pair pair3 = this.f318647h;
                if (pair3 != null) {
                    return (String) pair3.first;
                }
                return null;
            default:
                Pair pair4 = this.f318647h;
                if (pair4 != null) {
                    return (Integer) pair4.second;
                }
                return null;
        }
    }
}
