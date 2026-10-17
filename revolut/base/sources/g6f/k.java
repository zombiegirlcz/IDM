package g6f;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v4e.p;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrendViewDelegate.a f140932b;

    public /* synthetic */ k(TrendViewDelegate.a aVar, int i) {
        this.f140931a = i;
        this.f140932b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140931a) {
            case 0:
                b update = (b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                od0.i.Companion.getClass();
                return b.a(update, null, od0.h.a(this.f140932b), null, 5);
            case 1:
                e3h.c update2 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return e3h.c.a(update2, null, null, null, null, null, null, null, null, null, null, this.f140932b, null, null, 4190207);
            case 2:
                j4h.e updateState = (j4h.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return j4h.e.a(updateState, null, null, null, this.f140932b, 31);
            case 3:
                u87.e update3 = (u87.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return u87.e.a(update3, null, null, null, null, this.f140932b, null, null, null, null, 495);
            case 4:
                p update4 = (p) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return p.a(update4, null, null, this.f140932b, null, null, null, 59);
            case 5:
                x4e.d update5 = (x4e.d) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return x4e.d.a(update5, null, null, this.f140932b, 3);
            default:
                yr5.f updateState2 = (yr5.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return yr5.f.a(updateState2, null, this.f140932b, null, null, 55);
        }
    }
}
