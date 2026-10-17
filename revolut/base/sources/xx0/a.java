package xx0;

import com.revolut.core.ui_kit.views.numpad.PosNumpadView;
import dj0.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PosNumpadView f309377b;

    public /* synthetic */ a(PosNumpadView posNumpadView, int i) {
        this.f309376a = i;
        this.f309377b = posNumpadView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f309376a;
        PosNumpadView posNumpadView = this.f309377b;
        switch (i) {
            case 0:
                if (!posNumpadView.f59564g.k()) {
                    d dVar = posNumpadView.f59564g;
                    posNumpadView.f59564g = d.c(dVar, dVar.f115082a / ((long) 10), null, 2);
                    posNumpadView.a();
                }
                return Unit.f186387a;
            case 1:
                Integer it8 = (Integer) obj2;
                int i2 = PosNumpadView.i;
                Intrinsics.checkNotNullParameter(it8, "it");
                long j2 = posNumpadView.f59564g.f115082a;
                int iIntValue = it8.intValue();
                return Boolean.valueOf(iIntValue >= 0 && iIntValue < 10 && j2 <= (Long.MAX_VALUE - ((long) iIntValue)) / ((long) 10));
            default:
                Integer num = (Integer) obj2;
                d dVar2 = posNumpadView.f59564g;
                long j3 = dVar2.f115082a * ((long) 10);
                Intrinsics.h(num);
                posNumpadView.f59564g = d.c(dVar2, j3 + ((long) num.intValue()), null, 2);
                posNumpadView.a();
                return Unit.f186387a;
        }
    }
}
