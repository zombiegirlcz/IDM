package eq8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f128387b;

    public /* synthetic */ h0(k0 k0Var, int i) {
        this.f128386a = i;
        this.f128387b = k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 function1 = (Function1) obj3;
        switch (this.f128386a) {
            case 0:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                break;
        }
        return this.f128387b.f128392b;
    }
}
