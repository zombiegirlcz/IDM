package eu2;

import com.revolut.kompot.common.ExternalDestination;
import et6.r1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.call_security_info.impl.ui.call_detection.b f129481b;

    public /* synthetic */ g(com.revolut.feature.call_security_info.impl.ui.call_detection.b bVar, int i) {
        this.f129480a = i;
        this.f129481b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f129480a) {
            case 0:
                d update = (d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return d.a(update, this.f129481b.o.c("android.permission.READ_PHONE_STATE"), false, 2);
            default:
                r7a.i result = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof r7a.f;
                com.revolut.feature.call_security_info.impl.ui.call_detection.b bVar = this.f129481b;
                if (z) {
                    bVar.C1(new ExternalDestination.ByIntent(((s70.b) bVar.f64372p).b(), null));
                } else if (result instanceof r7a.h) {
                    bVar.H2(bVar.f64376t, new r1(20));
                } else if (!(result instanceof r7a.g) && !(result instanceof r7a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
