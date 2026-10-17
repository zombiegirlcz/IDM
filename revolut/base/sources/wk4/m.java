package wk4;

import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yk4.a f298247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f298248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f298249r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yk4.a dialogFactory, j60.a bottomDialogExtension, SetDateContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f298247p = dialogFactory;
        this.f298248q = bottomDialogExtension;
        this.f298249r = new a(inputData.f68666b, inputData.f68665a, inputData.f68667c, inputData.d, inputData.e);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f298249r;
    }

    public final void y2() {
        Integer num = ((a) t2()).f298233a;
        if (num == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        v2(new c(num.intValue()));
    }
}
