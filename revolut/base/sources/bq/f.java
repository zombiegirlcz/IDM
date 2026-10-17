package bq;

import kotlin.jvm.internal.Intrinsics;
import nii.t0;
import org.jetbrains.annotations.NotNull;
import sri.m;

/* JADX INFO: loaded from: classes.dex */
public final class f extends fsi.c implements qf0.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qf0.c f17651h;
    public final yp.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f17652j;
    public final v60.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t0 f17653l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qf0.c exceptionsOverseer, yp.b appStoreNavigationFactory, m navigator, v60.e serverErrorsProvider, t0 statusDialogDisplayerDelegate) {
        super(new fsi.b("AppUpdateExceptionOverseer"));
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(statusDialogDisplayerDelegate, "statusDialogDisplayerDelegate");
        this.f17651h = exceptionsOverseer;
        this.i = appStoreNavigationFactory;
        this.f17652j = navigator;
        this.k = serverErrorsProvider;
        this.f17653l = statusDialogDisplayerDelegate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r7.intValue() == 2000) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (((com.revolut.core.error.data.model.ServerErrorException) r7).f.getF51362a() == 2000) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        r7 = skm.p0.f264001a;
        r7 = zkm.o.f323119a;
        r8 = new bf5.a(r6, r2, 25);
        r0.u = r6;
        r0.f17650x = 1;
        r8 = skm.e0.J(r7, r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        if (r8 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qf0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(java.lang.Exception r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.f.P(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // fsi.a
    public final void onStart() {
        this.f17651h.b(this);
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        this.f17651h.a(this);
    }
}
