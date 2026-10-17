package cab;

import ab4.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.goals.impl.ui.a f22589b;

    public /* synthetic */ i(com.revolut.feature.retail.goals.impl.ui.a aVar, int i) {
        this.f22588a = i;
        this.f22589b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f22588a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                com.revolut.feature.retail.goals.impl.ui.a aVar = this.f22589b;
                aVar.H2(aVar.f82659w, new q(error, 6));
                break;
            default:
                hii.a output = (hii.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                com.revolut.feature.retail.goals.impl.ui.a aVar2 = this.f22589b;
                aVar2.H2(aVar2.f82659w, new j(output, 0));
                break;
        }
        return Unit.f186387a;
    }
}
