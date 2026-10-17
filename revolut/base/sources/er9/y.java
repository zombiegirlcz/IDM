package er9;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f128612b;

    public /* synthetic */ y(b0 b0Var, int i) {
        this.f128611a = i;
        this.f128612b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128611a) {
            case 0:
                this.f128612b.f128560c.b("RELOAD_STRATEGY_KEY_SUGGESTIONS");
                return Unit.f186387a;
            case 1:
                String key = (String) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                return (Long) this.f128612b.f128559b.get(key);
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f128612b.f128559b.get("CACHE_KEY_SUGGESTIONS");
        }
    }
}
