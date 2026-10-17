package nwb;

import java.util.concurrent.CopyOnWriteArrayList;
import jwb.e;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import sf0.h;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f219814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f219815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v60.e f219816n;
    public final mwb.a o;

    public d(e revPointsGiftcardsInteractor, h serverErrorParser, v60.e serverErrorsProvider, mwb.a dialogFactory) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        this.f219814l = revPointsGiftcardsInteractor;
        this.f219815m = serverErrorParser;
        this.f219816n = serverErrorsProvider;
        this.o = dialogFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // nwb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct r21, java.lang.String r22, java.lang.String r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nwb.d.Z2(com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final y0 b3() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Something is not working correctly while fetching data in RevPointsGiftcardsCheckoutExtension, please check the stacktrace");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        this.o.getClass();
        return mwb.a.a();
    }
}
