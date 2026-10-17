package j53;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f171485b;

    public /* synthetic */ o(i iVar, int i) {
        this.f171484a = i;
        this.f171485b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l update = (l) obj2;
        switch (this.f171484a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(this.f171485b, null, true, false, null, 27);
            default:
                return i.a(this.f171485b, null, false, false, null, 29);
        }
    }
}
