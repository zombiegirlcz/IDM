package bzg;

import aw0.e5;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import ip0.wi;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi f20011b;

    public /* synthetic */ o(wi wiVar, int i) {
        this.f20010a = i;
        this.f20011b = wiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20010a) {
            case 0:
                k update = (k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                e5 e5Var = this.f20011b.f167034b;
                Object obj3 = e5Var != null ? e5Var.f10292g : null;
                return k.a(update, null, null, null, null, null, null, null, obj3 instanceof Pair ? (Pair) obj3 : null, false, null, null, false, null, null, null, null, e5Var, 1571839);
            default:
                dyg.h update2 = (dyg.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return dyg.h.a(update2, null, null, null, null, this.f20011b, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
        }
    }
}
