package z8d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ie.a f320078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AllCardsScreenContract$InputData f320079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f320080r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, ie.a sharedCardsTroubleshooterInteractor, AllCardsScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(sharedCardsTroubleshooterInteractor, "sharedCardsTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f320078p = sharedCardsTroubleshooterInteractor;
        this.f320079q = inputData;
        this.f320080r = new c(new Data(null, null, true, 3, null), inputData.f86311b);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, q.q(this.f320078p.d(false, false)), null, new yy6.f(this, null, 18), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f320080r;
    }
}
