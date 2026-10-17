package dv5;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f118032b;

    public /* synthetic */ b(f fVar, int i) {
        this.f118031a = i;
        this.f118032b = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 getDefaultErrorItems = (Function1) obj3;
        switch (this.f118031a) {
            case 0:
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                this.f118032b.getClass();
                return i2b.a.q(f.d(false), (List) getDefaultErrorItems.invoke(new iii.d(10, null, true, false, "TRANSACTIONS_WIDGET_ERROR_STATE_ID")));
            case 1:
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                this.f118032b.getClass();
                return i2b.a.q(f.d(false), (List) getDefaultErrorItems.invoke(new iii.d(10, null, true, false, "ORDERS_WIDGET_ERROR_STATE_ID")));
            default:
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                this.f118032b.getClass();
                return i2b.a.q(f.g(false), (List) getDefaultErrorItems.invoke(new iii.d(10, null, true, false, "TRANSACTIONS_WIDGET_ERROR_STATE_ID")));
        }
    }
}
