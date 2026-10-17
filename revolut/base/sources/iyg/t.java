package iyg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vyg.c f169746b;

    public /* synthetic */ t(vyg.c cVar, int i) {
        this.f169745a = i;
        this.f169746b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f169745a) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a.a(update, null, null, this.f169746b, false, null, null, null, null, null, null, null, null, null, null, 16379);
            default:
                nyg.a update2 = (nyg.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                vyg.c selectedTimeframe = this.f169746b;
                Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
                return new nyg.a(selectedTimeframe);
        }
    }
}
