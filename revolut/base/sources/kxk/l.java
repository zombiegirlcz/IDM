package kxk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f190607b;

    public /* synthetic */ l(j jVar, int i) {
        this.f190606a = i;
        this.f190607b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f update = (f) obj2;
        switch (this.f190606a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
        }
        return f.a(update, null, this.f190607b, 1);
    }
}
