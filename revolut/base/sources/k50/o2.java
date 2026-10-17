package k50;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f181199b;

    public /* synthetic */ o2(v0 v0Var, int i) {
        this.f181198a = i;
        this.f181199b = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        b1 b1Var;
        List list;
        h0 update = (h0) obj2;
        switch (this.f181198a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                v0 v0Var = v0.PROMPT;
                v0 v0Var2 = this.f181199b;
                return h0.a(update, null, null, null, null, null, null, null, null, null, null, false, false, null, null, (v0Var2 != v0Var || (list = (b1Var = update.f181090r).f181033c) == null) ? update.f181090r : b1.a(b1Var, list, null, null, null, 26), null, false, null, null, null, v0Var2, null, null, null, 259915775);
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h0.a(update, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, this.f181199b, null, null, null, 260046847);
        }
    }
}
