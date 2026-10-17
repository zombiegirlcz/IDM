package cv6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f109293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f109294c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ n(boolean z, Function1 function1, Function1 function12, int i) {
        this.f109292a = i;
        this.f109293b = z;
        this.f109294c = function1;
        this.d = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f109292a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return (j) (this.f109293b ? this.f109294c : this.d).invoke(update);
            default:
                lu6.l update2 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return (lu6.l) (this.f109293b ? this.f109294c : this.d).invoke(update2);
        }
    }
}
