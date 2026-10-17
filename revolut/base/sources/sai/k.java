package sai;

import bt9.v;
import cli.y;
import com.revolut.feature_retail_user_declarations.email.otp_screen.EmailVerificationOtpScreenContract$InputData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rnb.u;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends oki.h implements h {
    public final EmailVerificationOtpScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pai.a f261417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pai.f f261418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vai.c f261419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rai.a f261420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xai.a f261421t;
    public final y u;
    public final AtomicBoolean v;

    public k(EmailVerificationOtpScreenContract$InputData inputData, pai.a emailVerificationInteractor, pai.f statusDialogFactory, vai.c cooldownTimer, rai.a emailAppDestinationProvider, xai.a emailVerificationEventObserver, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(emailVerificationInteractor, "emailVerificationInteractor");
        Intrinsics.checkNotNullParameter(statusDialogFactory, "statusDialogFactory");
        Intrinsics.checkNotNullParameter(cooldownTimer, "cooldownTimer");
        Intrinsics.checkNotNullParameter(emailAppDestinationProvider, "emailAppDestinationProvider");
        Intrinsics.checkNotNullParameter(emailVerificationEventObserver, "emailVerificationEventObserver");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f261417p = emailVerificationInteractor;
        this.f261418q = statusDialogFactory;
        this.f261419r = cooldownTimer;
        this.f261420s = emailAppDestinationProvider;
        this.f261421t = emailVerificationEventObserver;
        this.u = mra.d.b(this, new f(0, "", false, inputData.f97577b), stateMapper, null, false, 12);
        this.v = new AtomicBoolean();
    }

    @Override // yji.l
    public final void I1() {
        vai.c cVar = this.f261419r;
        Continuation continuation = null;
        yji.l.a1(this, q.Q(cVar.f287301a, new uec.d(continuation, cVar, 21)), null, null, new s64.a(this, continuation, 12), 3);
        yji.l.a1(this, this.f261421t.a(), null, null, new ryj.f(2, this, k.class, "verifyOtp", "verifyOtp(Ljava/lang/String;)V", 4, 6), 3);
    }

    public final void I2(Function1 function1) {
        y yVar = this.u;
        if (((f) ((j2) yVar.f22677a).getValue()).d || !this.v.compareAndSet(false, true)) {
            return;
        }
        H2(yVar, new sa6.y(4));
        l2(new v(5, null, function1), new u(1, this, k.class, "handleActionError", "handleActionError(Ljava/lang/Throwable;)Z", 0, 19)).k(new s78.d(this, 20));
    }

    public final void J2(String listId) {
        String code;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        Continuation continuation = null;
        y yVar = this.u;
        if (iHashCode == -715500456) {
            if (listId.equals("RESEND_LIST_ID") && ((f) ((j2) yVar.f22677a).getValue()).f261411b <= 0 && !this.f261419r.a()) {
                I2(new rik.e(this, continuation, 19));
                return;
            }
            return;
        }
        if (iHashCode == -623402109) {
            if (listId.equals("INBOX_LIST_ID")) {
                this.f261420s.getClass();
                C1(rai.a.a());
                return;
            }
            return;
        }
        if (iHashCode == 1560459103 && listId.equals("DEBUG_APPLY_LIST_ID") && (code = ((f) ((j2) yVar.f22677a).getValue()).f261412c) != null) {
            Intrinsics.checkNotNullParameter(code, "code");
            H2(yVar, new rvc.k(code, 19));
            Intrinsics.checkNotNullParameter(code, "code");
            I2(new j(this, code, continuation, 1));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
