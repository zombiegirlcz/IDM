package tb;

import androidx.compose.foundation.gestures.FlingBehavior;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class b extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ FlingBehavior f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FlingBehavior flingBehavior) {
        super(0);
        this.f = flingBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FlingBehavior flingBehavior = this.f;
        w9m.k kVar = flingBehavior instanceof w9m.k ? (w9m.k) flingBehavior : null;
        if (kVar != null) {
            return (Integer) kVar.f.getValue();
        }
        return null;
    }
}
