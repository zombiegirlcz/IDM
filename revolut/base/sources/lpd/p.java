package lpd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f198982b;

    public /* synthetic */ p(k kVar, int i) {
        this.f198981a = i;
        this.f198982b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l updateState = (l) obj2;
        switch (this.f198981a) {
            case 0:
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return l.a(updateState, this.f198982b);
            case 1:
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return l.a(updateState, this.f198982b);
            default:
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                e eVar = (e) this.f198982b;
                return l.a(updateState, e.a(eVar, 0, eVar.e, 7));
        }
    }
}
