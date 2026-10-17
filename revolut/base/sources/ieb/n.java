package ieb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f160699b;

    public /* synthetic */ n(p pVar, g gVar, int i) {
        this.f160698a = i;
        this.f160699b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        switch (this.f160698a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return p.d(this.f160699b);
    }
}
