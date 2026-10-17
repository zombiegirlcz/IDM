package zab;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.FragmentActivity;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignSmsStepFragment f320640b;

    public /* synthetic */ w(SignSmsStepFragment signSmsStepFragment, int i) {
        this.f320639a = i;
        this.f320640b = signSmsStepFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f320639a;
        int i2 = 0;
        SignSmsStepFragment signSmsStepFragment = this.f320640b;
        switch (i) {
            case 0:
                SignSmsStepFragment.Companion aVar = SignSmsStepFragment.INSTANCE;
                signSmsStepFragment.F().setVisibility(0);
                return Unit.f186387a;
            case 1:
                SignSmsStepFragment.Companion aVar2 = SignSmsStepFragment.INSTANCE;
                String smsCode = ((yab.a) obj2).getSmsCode();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p.a.p("CODE: ", smsCode, " (Tap here to apply)"));
                int iT = kotlin.text.d0.T(spannableStringBuilder, "Tap here to apply", 0, false, 6);
                Context contextRequireContext = signSmsStepFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(kli.a.s(R$attr.uikit_colorAccent, contextRequireContext)), iT, iT + 17, 33);
                signSmsStepFragment.F().setText(spannableStringBuilder);
                signSmsStepFragment.F().setContentDescription("Tap here to apply");
                signSmsStepFragment.F().setOnClickListener(new x(signSmsStepFragment, smsCode, i2));
                return Unit.f186387a;
            case 2:
                SignSmsStepFragment.Companion aVar3 = SignSmsStepFragment.INSTANCE;
                signSmsStepFragment.F().setText(((Throwable) obj2).getMessage());
                return Unit.f186387a;
            case 3:
                Unit it8 = (Unit) obj2;
                SignSmsStepFragment.Companion aVar4 = SignSmsStepFragment.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                FragmentActivity activity = signSmsStepFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return Unit.f186387a;
            default:
                qx0.c cVar = (qx0.c) obj2;
                Intrinsics.checkNotNullParameter(cVar, "<destruct>");
                return signSmsStepFragment.Q(cVar.f249975a);
        }
    }
}
