package ip0;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.ja f164932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.ga f164933c;

    public /* synthetic */ k00(com.revolut.core.ui_kit.delegates.ja jaVar, com.revolut.core.ui_kit.delegates.ga gaVar, int i) {
        this.f164931a = i;
        this.f164932b = jaVar;
        this.f164933c = gaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f164931a) {
            case 0:
                jyl.a setup = (jyl.a) obj2;
                Intrinsics.checkNotNullParameter(setup, "$this$setup");
                setup.f179521c = false;
                com.revolut.core.ui_kit.delegates.ja jaVar = this.f164932b;
                setup.f179520b = new ad(jaVar, 27);
                setup.d = new k00(jaVar, this.f164933c, 1);
                break;
            default:
                Exception it8 = (Exception) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f164932b.f.onNext(new Pair(this.f164933c, new com.revolut.core.ui_kit.delegates.ia(it8)));
                break;
        }
        return Unit.f186387a;
    }
}
