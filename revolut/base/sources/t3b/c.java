package t3b;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f267725b;

    public /* synthetic */ c(e eVar, int i) {
        this.f267724a = i;
        this.f267725b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 function1 = (Function1) obj3;
        switch (this.f267724a) {
            case 0:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                return this.f267725b.a(f0.f322471a, null, null);
            default:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                return this.f267725b.a(f0.f322471a, null, null);
        }
    }
}
