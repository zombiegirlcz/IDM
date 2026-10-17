package q56;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zi5.d f242313b;

    public /* synthetic */ p(zi5.d dVar, int i) {
        this.f242312a = i;
        this.f242313b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f242312a) {
            case 0:
                k update = (k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                zi5.e eVar = (zi5.e) this.f242313b;
                String str = eVar.f322504a;
                String str2 = eVar.f322505b;
                if (str2 == null) {
                    str2 = update.f242304b;
                }
                return k.a(update, str, str2, null, false, 12);
            default:
                zq5.u update2 = (zq5.u) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return zq5.u.a(update2, null, false, null, null, ((zi5.e) this.f242313b).f322504a, 15);
        }
    }
}
