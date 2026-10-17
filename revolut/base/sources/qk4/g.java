package qk4;

import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.SelectAutopayMethodContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends jki.g implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f246968p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, SelectAutopayMethodContract$InputData input) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f246968p = new a(input.f68647a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f246968p;
    }
}
