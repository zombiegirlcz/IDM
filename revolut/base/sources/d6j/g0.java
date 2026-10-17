package d6j;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import hx5.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qta.f f111560b;

    public /* synthetic */ g0(hx5.b bVar, qta.f fVar) {
        this.f111559a = 1;
        this.f111560b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f111559a) {
            case 0:
                return o.f((o) obj2, null, false, null, null, this.f111560b, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, 33554367);
            case 1:
                Function0 it8 = (Function0) obj2;
                b.a aVar = hx5.b.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                return hx5.b.b(this.f111560b, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
            default:
                yr5.f updateState = (yr5.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return yr5.f.a(updateState, this.f111560b, null, null, null, 59);
        }
    }

    public /* synthetic */ g0(qta.f fVar, int i) {
        this.f111559a = i;
        this.f111560b = fVar;
    }
}
