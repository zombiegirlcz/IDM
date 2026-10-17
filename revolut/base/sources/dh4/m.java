package dh4;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ax4.j f114754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yqi.b f114755c;

    public /* synthetic */ m(ax4.j jVar, yqi.b bVar, int i) {
        this.f114753a = i;
        this.f114754b = jVar;
        this.f114755c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ax4.b updateConstructorState = (ax4.b) obj2;
        switch (this.f114753a) {
            case 0:
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                Map map = updateConstructorState.f;
                ax4.j jVar = this.f114754b;
                return ax4.b.a(updateConstructorState, null, null, null, null, null, r0.q(map, new Pair(jVar.f10882a, jVar)), null, null, r0.q(updateConstructorState.i, new Pair(jVar.f10882a, this.f114755c)), null, null, null, null, 7903);
            default:
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                Map map2 = updateConstructorState.f;
                ax4.j jVar2 = this.f114754b;
                return ax4.b.a(updateConstructorState, null, null, null, null, null, r0.q(map2, new Pair(jVar2.f10882a, jVar2)), null, null, r0.q(updateConstructorState.i, new Pair(jVar2.f10882a, this.f114755c)), null, null, null, null, 7903);
        }
    }
}
