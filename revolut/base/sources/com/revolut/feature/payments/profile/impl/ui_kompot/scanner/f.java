package com.revolut.feature.payments.profile.impl.ui_kompot.scanner;

import aii.m;
import aii.n;
import akb.s;
import akl.e0;
import au6.a3;
import ax9.i;
import ax9.k;
import ax9.o;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.api.qr.QrCodeHandlingException;
import com.revolut.retail.core.navigation.NaviCommand;
import jki.p;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.m0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import q06.l;
import retrofit2.HttpException;
import sf0.h;
import vkm.j2;
import vkm.q;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends jki.g implements ax9.f {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i4b.f f79662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y80.a f79663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ar2.c f79664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f79665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f79666t;
    public final l u;
    public final vw9.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f79667w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Lazy f79668x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i4b.f qrInteractor, y80.a permissionProvider, ar2.c frameProcessor, h serverErrorParser, i dialogModelProvider, l deeplinkRouter, vw9.a flashlightBridge, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(qrInteractor, "qrInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(frameProcessor, "frameProcessor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(dialogModelProvider, "dialogModelProvider");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(flashlightBridge, "flashlightBridge");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f79662p = qrInteractor;
        this.f79663q = permissionProvider;
        this.f79664r = frameProcessor;
        this.f79665s = serverErrorParser;
        this.f79666t = dialogModelProvider;
        this.u = deeplinkRouter;
        this.v = flashlightBridge;
        this.f79667w = q.c(Boolean.FALSE);
        this.f79668x = j.b(new aw1.a(3));
    }

    @Override // yji.l
    public final void I1() {
        l2(new ax9.l(this, null), new yi5.b(26));
        y2();
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        y0 y0VarA;
        m0 l0Var;
        y0 y0Var;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Continuation continuation = null;
        ServerError serverError = throwable instanceof HttpException ? this.f79665s.c((HttpException) throwable) : throwable instanceof ServerErrorException ? ((ServerErrorException) throwable).f : null;
        i iVar = this.f79666t;
        if (serverError != null) {
            int i = serverError.f51362a;
            v60.e eVar = iVar.f10904a;
            Intrinsics.checkNotNullParameter(serverError, "serverError");
            nq1.a aVarA = vq1.e.a(i);
            if (aVarA != null) {
                y0Var = new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(aVarA.f218353a, null, null, 14), new TextLocalisedClause(aVarA.f218354b, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4);
            } else {
                v60.d dVarB = ((ao0.a) eVar).b(Integer.valueOf(i));
                if (dVarB == null) {
                    dVarB = new v60.b();
                }
                y0Var = new y0("ERROR_DIALOG_ID", new z(ofm.q.O(dVarB), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4);
            }
            n2(new avk.i(this, y0Var, continuation, 9), new whi.b(6));
            return true;
        }
        if (throwable instanceof QrCodeNotParsedException) {
            n2(new s(this, continuation, 28), new whi.b(6));
            return true;
        }
        if (!(throwable instanceof QrCodeHandlingException)) {
            super.o1(throwable);
            return false;
        }
        xo9.e reason = ((QrCodeHandlingException) throwable).f79172a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(reason, "reason");
        Integer num = reason.f307742a;
        xo9.c cVar = reason.f307744c;
        if (num != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(num.intValue(), null, null, 14);
            Integer num2 = reason.f307743b;
            TextLocalisedClause textLocalisedClause2 = num2 != null ? new TextLocalisedClause(num2.intValue(), null, null, 14) : null;
            TextLocalisedClause textLocalisedClause3 = cVar != null ? new TextLocalisedClause(cVar.f307740a, null, null, 14) : null;
            NaviCommand naviCommand = cVar != null ? cVar.f307741b : null;
            int i2 = ax9.h.f10903a[reason.d.ordinal()];
            if (i2 == 1) {
                l0Var = new l0(textLocalisedClause, textLocalisedClause2, null, textLocalisedClause3, null, naviCommand, false, null, 980);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                l0Var = new z(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, null, null, naviCommand, false, null, null, null, null, null, null, 32628);
            }
            y0VarA = new y0("ERROR_DIALOG_ID", l0Var, false, 4);
        } else {
            y0VarA = i.a();
        }
        n2(new avk.i(this, y0VarA, continuation, 9), new whi.b(6));
        return true;
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof ProfileScannerScreenContract$ProcessingState) {
            x2(new ax9.j(event, 0));
        }
        return super.o2(event);
    }

    @Override // jki.g
    public final jki.i r2() {
        return (ax9.e) this.f79668x.getValue();
    }

    public final void y2() {
        ar2.c cVar = this.f79664r;
        Continuation continuation = null;
        yji.l.a1(this, q.Q(new o(yh5.b.d(kii.e.t(cVar.f8507g, "hide(...)"), new a35.d(q2(), 25)), 0), new a3(continuation, this, 4)), null, null, new av7.l(this, continuation, 4), 3);
        yji.l.a1(this, rd0.e.b(cVar.f8505b.f128528a), null, null, new e0(this, continuation, 26), 3);
    }
}
