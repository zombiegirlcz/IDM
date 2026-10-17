package dki;

import android.content.Intent;
import com.revolut.kompot.navigable.flow.BaseFlow;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ((BaseFlow) this.receiver).X2(((Number) obj2).intValue(), ((Number) obj3).intValue(), (Intent) obj4);
        return Unit.f186387a;
    }
}
