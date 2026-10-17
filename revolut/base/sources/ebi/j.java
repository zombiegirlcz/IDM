package ebi;

import cli.y;
import com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.EmailVerificationOtpBottomSheetContract$InputData;
import e8e.w;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends oki.h implements h {
    public final EmailVerificationOtpBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pai.a f124372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rai.a f124373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xai.a f124374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pai.f f124375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f124376t;

    public j(EmailVerificationOtpBottomSheetContract$InputData inputData, pai.a emailVerificationInteractor, rai.a emailAppDestinationProvider, xai.a eventObserver, pai.f statusDialogFactory, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(emailVerificationInteractor, "emailVerificationInteractor");
        Intrinsics.checkNotNullParameter(emailAppDestinationProvider, "emailAppDestinationProvider");
        Intrinsics.checkNotNullParameter(eventObserver, "eventObserver");
        Intrinsics.checkNotNullParameter(statusDialogFactory, "statusDialogFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f124372p = emailVerificationInteractor;
        this.f124373q = emailAppDestinationProvider;
        this.f124374r = eventObserver;
        this.f124375s = statusDialogFactory;
        this.f124376t = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String str = this.o.f97616b;
        if (str != null) {
            J2(str, false);
        }
        yji.l.a1(this, this.f124374r.a(), null, null, new cyc.c(2, this, j.class, "verifyAutoFilledCode", "verifyAutoFilledCode(Ljava/lang/String;)V", 4, 13), 3);
    }

    public final void I2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (((d) ((j2) this.f124376t.f22677a).getValue()).f124367b) {
            return;
        }
        if (Intrinsics.f(id10, "INBOX_LIST_ID")) {
            this.f124373q.getClass();
            C1(rai.a.a());
        } else if (Intrinsics.f(id10, "UPDATE_EMAIL_CLICK_ID")) {
            C2(e.f124369a);
        }
    }

    public final void J2(String str, boolean z) {
        y yVar = this.f124376t;
        if (((d) ((j2) yVar.f22677a).getValue()).f124367b) {
            return;
        }
        H2(yVar, new a31.i(str, z, 3));
        l2(new w(this, str, null, 7), new dkm.a(1, this, j.class, "clearLoading", "clearLoading(Ljava/lang/Throwable;)Z", 0, 22));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f124376t;
    }
}
