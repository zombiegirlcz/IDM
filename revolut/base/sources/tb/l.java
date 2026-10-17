package tb;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l extends kotlin.jvm.internal.u implements Function1 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f269385h;
    public final /* synthetic */ oim.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f269386j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i, a aVar, oim.n nVar, x xVar) {
        super(1);
        this.f = i;
        this.f269385h = aVar;
        this.i = nVar;
        this.f269386j = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LazyListScope LazyColumn = (LazyListScope) obj2;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, this.f, null, null, ComposableLambdaKt.composableLambdaInstance(1889356237, true, new k(this.f269385h, this.i, this.f269386j)), 4, null);
        return Unit.f186387a;
    }
}
