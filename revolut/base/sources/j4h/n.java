package j4h;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f171397b;

    public /* synthetic */ n(p pVar, e eVar, int i) {
        this.f171396a = i;
        this.f171397b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 function1 = (Function1) obj3;
        switch (this.f171396a) {
            case 0:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                break;
        }
        return p.a(this.f171397b.f171382a);
    }
}
