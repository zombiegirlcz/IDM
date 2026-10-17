package fnc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jlc.r f136671b;

    public /* synthetic */ z(jlc.r rVar, int i) {
        this.f136670a = i;
        this.f136671b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f136670a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                jlc.r updateState = (jlc.r) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                break;
            case 4:
                jlc.r updateState2 = (jlc.r) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                break;
            default:
                break;
        }
        return this.f136671b;
    }
}
