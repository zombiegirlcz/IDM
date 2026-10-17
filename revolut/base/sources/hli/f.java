package hli;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f153468b;

    public /* synthetic */ f(h hVar, int i) {
        this.f153467a = i;
        this.f153468b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object token) {
        int i = this.f153467a;
        h hVar = this.f153468b;
        switch (i) {
            case 0:
                int i2 = h.f153470j;
                Intrinsics.checkNotNullParameter(token, "token");
                hVar.f.add(token);
                break;
            default:
                int i3 = h.f153470j;
                Intrinsics.checkNotNullParameter(token, "token");
                hVar.f.remove(token);
                break;
        }
        return Unit.f186387a;
    }
}
