package c64;

import dx4.x4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4 f21643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ax4.l f21644c;

    public /* synthetic */ r(x4 x4Var, ax4.l lVar, int i) {
        this.f21642a = i;
        this.f21643b = x4Var;
        this.f21644c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ax4.b updateConstructorState = (ax4.b) obj2;
        switch (this.f21642a) {
            case 0:
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                break;
            default:
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                break;
        }
        return updateConstructorState.b(this.f21643b.f120834a, this.f21644c);
    }
}
