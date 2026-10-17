package znd;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f323798b;

    public /* synthetic */ v0(a aVar, int i) {
        this.f323797a = i;
        this.f323798b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f323797a) {
            case 0:
                return this.f323798b;
            default:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i = b1.f323724a[this.f323798b.f323708b.ordinal()];
                if (i == 1) {
                    return null;
                }
                if (i == 2 || i == 3) {
                    return f.f323751a;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
