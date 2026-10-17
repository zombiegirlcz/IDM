package d27;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f110752b;

    public /* synthetic */ j0(int i, Set set) {
        this.f110751a = i;
        this.f110752b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f110751a) {
            case 0:
                u update = (u) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return u.a(update, this.f110752b, null, null, null, null, false, null, null, null, null, null, 2046);
            default:
                qua.p it8 = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Set set = this.f110752b;
                sua.b bVar = it8.J;
                return Boolean.valueOf(zhm.d0.T(set, bVar != null ? bVar.f265696a : null));
        }
    }
}
