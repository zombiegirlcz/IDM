package q2e;

import java.time.Instant;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Instant f241630b;

    public /* synthetic */ v(int i, Instant instant) {
        this.f241629a = i;
        this.f241630b = instant;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f241629a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, null, null, null, null, null, null, null, false, false, false, false, null, null, null, this.f241630b, 32767);
            default:
                return t2e.g.a((t2e.g) obj2, null, null, null, null, this.f241630b, null, 47);
        }
    }
}
