package ag8;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ psg.a f4803b;

    public /* synthetic */ c(psg.a aVar, int i) {
        this.f4802a = i;
        this.f4803b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f4802a) {
            case 0:
                List designs = (List) obj2;
                Intrinsics.checkNotNullParameter(designs, "designs");
                return new Pair(this.f4803b.f239484a, designs);
            default:
                List designs2 = (List) obj2;
                Intrinsics.checkNotNullParameter(designs2, "designs");
                return new Pair(this.f4803b.f239484a, designs2);
        }
    }
}
