package tpi;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f273401b;

    public /* synthetic */ e(i iVar, int i) {
        this.f273400a = i;
        this.f273401b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f273400a) {
            case 0:
                this.f273401b.W(true);
                break;
            case 1:
                Object obj3 = ((Pair) obj2).f186386b;
                Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                if (((Integer) obj3).intValue() == 0) {
                    this.f273401b.Q();
                }
                break;
            case 2:
                this.f273401b.Q();
                break;
            case 3:
                this.f273401b.W(true);
                break;
            case 4:
                this.f273401b.Q();
                break;
            case 5:
                this.f273401b.W(true);
                break;
            case 6:
                this.f273401b.Q();
                break;
            default:
                this.f273401b.W(true);
                break;
        }
        return Unit.f186387a;
    }
}
