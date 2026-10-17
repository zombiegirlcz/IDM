package ip0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class pn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qn f165854b;

    public /* synthetic */ pn(qn qnVar, int i) {
        this.f165853a = i;
        this.f165854b = qnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f165853a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f165854b;
    }
}
