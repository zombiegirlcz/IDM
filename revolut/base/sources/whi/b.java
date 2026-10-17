package whi;

import android.content.Context;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.legacy.login.impl.R$string;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlow;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import java.time.LocalDateTime;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od0.i;
import xw0.h;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297675a;

    public /* synthetic */ b(int i) {
        this.f297675a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = false;
        TextLocalisedClause textLocalisedClause = null;
        int i = 4;
        switch (this.f297675a) {
            case 0:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr = KompotFlow.g0;
                Intrinsics.checkNotNullParameter(context, "context");
                return new bii.a(context);
            case 1:
                Context context2 = (Context) obj2;
                Intrinsics.checkNotNullParameter(context2, "context");
                Context applicationContext = context2.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                return new ww0.b(applicationContext, v.k(new h(context2, 9, new int[]{1, 4}), new xw0.b(context2)));
            case 2:
                i it8 = (i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                z95.b bVar = (z95.b) it8.f224257a;
                if (bVar != null && bVar.f320310b.isAfter(LocalDateTime.now())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 4:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                WelcomeAppearance welcomeAppearance = (WelcomeAppearance) data.getContent();
                return welcomeAppearance != null ? new PinCodeView.Header.TitleImage(welcomeAppearance.f104714a, welcomeAppearance.f104715b, welcomeAppearance.f104716c, null) : new PinCodeView.Header.Title(i, LoginFragment.a.a(LoginFragment.Companion, R$string.signin3_passcode_enter_title), textLocalisedClause);
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new PinCodeView.Header.Title(i, LoginFragment.a.a(LoginFragment.Companion, R$string.signin3_passcode_enter_title), textLocalisedClause);
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            default:
                ym.b data2 = (ym.b) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return Boolean.valueOf(data2.e.get());
        }
    }
}
