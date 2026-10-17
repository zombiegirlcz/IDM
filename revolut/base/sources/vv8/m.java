package vv8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3i.h f292489b;

    public /* synthetic */ m(t3i.h hVar, int i) {
        this.f292488a = i;
        this.f292489b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        b update = (b) obj2;
        switch (this.f292488a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b.a(update, null, new i(this.f292489b, 0), 3);
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b.a(update, null, new f(this.f292489b), 3);
        }
    }
}
