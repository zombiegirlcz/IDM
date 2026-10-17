package z0f;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupMethod f318245b;

    public /* synthetic */ b0(TopupMethod topupMethod, int i) {
        this.f318244a = i;
        this.f318245b = topupMethod;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f318244a) {
            case 0:
                q update = (q) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return q.a(update, null, null, null, null, null, false, this.f318245b, null, 3967);
            default:
                return q.a((q) obj2, null, this.f318245b, null, null, null, false, null, null, 4093);
        }
    }
}
