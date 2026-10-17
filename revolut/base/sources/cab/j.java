package cab;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hii.a f22591b;

    public /* synthetic */ j(hii.a aVar, int i) {
        this.f22590a = i;
        this.f22591b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f22590a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, Long.valueOf(oc.c.F(this.f22591b.f152606a)), null, null, 13);
            case 1:
                lua.a update2 = (lua.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return lua.a.a(update2, this.f22591b.f152606a, null, 2);
            default:
                x42.a update3 = (x42.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return x42.a.a(update3, null, null, this.f22591b.f152606a, 3);
        }
    }
}
