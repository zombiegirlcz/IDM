package ip0;

import java.time.YearMonth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class jx implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f164912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mx f164913c;
    public final /* synthetic */ Ref$ObjectRef d;

    public /* synthetic */ jx(Ref$IntRef ref$IntRef, mx mxVar, Ref$ObjectRef ref$ObjectRef, int i) {
        this.f164911a = i;
        this.f164912b = ref$IntRef;
        this.f164913c = mxVar;
        this.d = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f164911a) {
            case 0:
                tq0.c clickData = (tq0.c) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.f273449a.i;
                YearMonth yearMonth = obj3 instanceof YearMonth ? (YearMonth) obj3 : null;
                this.d.f186409a = yearMonth;
                return new lx(this.f164913c, yearMonth, this.f164912b.f186408a);
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Ref$IntRef ref$IntRef = this.f164912b;
                int i = ref$IntRef.f186408a - 1;
                ref$IntRef.f186408a = i;
                return new lx(this.f164913c, (YearMonth) this.d.f186409a, i);
            default:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Ref$IntRef ref$IntRef2 = this.f164912b;
                int i2 = ref$IntRef2.f186408a + 1;
                ref$IntRef2.f186408a = i2;
                return new lx(this.f164913c, (YearMonth) this.d.f186409a, i2);
        }
    }

    public /* synthetic */ jx(Ref$ObjectRef ref$ObjectRef, mx mxVar, Ref$IntRef ref$IntRef) {
        this.f164911a = 0;
        this.d = ref$ObjectRef;
        this.f164913c = mxVar;
        this.f164912b = ref$IntRef;
    }
}
