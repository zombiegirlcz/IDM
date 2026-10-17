package dbl;

import cli.n;
import cli.y;
import cli.z;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.suspicious_recipient.SuspiciousRecipientContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import t9l.g;
import w4l.j;
import yji.l;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends h implements z {
    public final SuspiciousRecipientContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cal.a f112770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f112771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f112772r;

    public e(n stateMapper, SuspiciousRecipientContract$InputData inputData, cal.a navigationDestinationProvider, g transactionInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigationDestinationProvider, "navigationDestinationProvider");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        this.o = inputData;
        this.f112770p = navigationDestinationProvider;
        this.f112771q = transactionInteractor;
        this.f112772r = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String groupId = this.o.f105016a;
        g gVar = this.f112771q;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        j loadingStrategy = j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, new ahd.c(gVar.d(y0.b(groupId), loadingStrategy), groupId, 2), null, null, new d8j.c(this, (Continuation) null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f112772r;
    }
}
