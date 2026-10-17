package vv8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3i.f f292487b;

    public /* synthetic */ l(t3i.f fVar, int i) {
        this.f292486a = i;
        this.f292487b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        b update = (b) obj2;
        switch (this.f292486a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b.a(update, new i(this.f292487b, 0), null, 5);
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b.a(update, new f(this.f292487b), null, 5);
        }
    }
}
