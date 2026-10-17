package com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability;

import ang.f;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rcb.e;
import skm.a2;
import y21.c;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MakeMeDiscoverableDialogMapper f82787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f82788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f82789n;
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RowDelegate f82790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f82791q;

    public b(MakeMeDiscoverableDialogMapper makeMeDiscoverableDialogMapper, j60.a bottomDialogExtension, f userInteractor, c optOutRepository) {
        Intrinsics.checkNotNullParameter(makeMeDiscoverableDialogMapper, "makeMeDiscoverableDialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.f82787l = makeMeDiscoverableDialogMapper;
        this.f82788m = bottomDialogExtension;
        this.f82789n = userInteractor;
        this.o = optOutRepository;
        this.f82790p = new RowDelegate(null, null, 7);
    }

    @Override // yji.n
    public final void D2() {
        RowDelegate rowDelegate = this.f82790p;
        List listC = u.c(rowDelegate);
        j60.a aVar = this.f82788m;
        aVar.d(listC);
        n.j2(this, rd0.e.b(rowDelegate.f53225r), null, new rcb.f(this, null), 3);
        n.j2(this, rd0.e.b(aVar.E()), null, new r0e.c(this, null, 18), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (Y2(r3, r1) == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        if (Y2(r3, r1) == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        if (Y2(r3, r1) == r4) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.core.ui_kit.delegates.RowDelegate.Model r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b.Z2(com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }
}
