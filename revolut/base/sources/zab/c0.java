package zab;

import android.os.CountDownTimer;
import android.text.Html;
import android.widget.TextView;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.revolut.feature.retail.legacy.login.impl.R$string;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignSmsStepFragment f320599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(SignSmsStepFragment signSmsStepFragment) {
        super(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, 1000L);
        this.f320599a = signSmsStepFragment;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Boolean bool = Boolean.TRUE;
        SignSmsStepFragment signSmsStepFragment = this.f320599a;
        signSmsStepFragment.f82709e0 = bool;
        if (signSmsStepFragment.I().getVisibility() == 0) {
            signSmsStepFragment.J().setVisibility(8);
            signSmsStepFragment.L().setVisibility(0);
            return;
        }
        TextView textViewH = signSmsStepFragment.H();
        t70.g gVar = signSmsStepFragment.j0;
        if (gVar != null) {
            textViewH.setText(Html.fromHtml(gVar.getString(R$string.email_verification_status_check_email_did_not_receive_link)));
        } else {
            Intrinsics.r("localization");
            throw null;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j2) {
        SignSmsStepFragment.Companion aVar = SignSmsStepFragment.INSTANCE;
        SignSmsStepFragment signSmsStepFragment = this.f320599a;
        if (signSmsStepFragment.I().getVisibility() == 0) {
            TextView textViewJ = signSmsStepFragment.J();
            t70.g gVar = signSmsStepFragment.j0;
            if (gVar != null) {
                textViewJ.setText(gVar.i(R$string.otp_input_sms_resend_timeout, SignSmsStepFragment.N(j2)));
                return;
            } else {
                Intrinsics.r("localization");
                throw null;
            }
        }
        TextView textViewH = signSmsStepFragment.H();
        t70.g gVar2 = signSmsStepFragment.j0;
        if (gVar2 != null) {
            textViewH.setText(gVar2.i(R$string.signup_registration_sms_code_hint_should_arrive, SignSmsStepFragment.N(j2)));
        } else {
            Intrinsics.r("localization");
            throw null;
        }
    }
}
