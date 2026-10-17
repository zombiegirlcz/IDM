package ea9;

import a08.f0;
import a08.s;
import android.widget.TextView;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.missinginfo.email.SignUpEmailFragment;
import e05.h;
import efm.k;
import efm.r;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.m;
import rx0.j;
import t70.g;
import te0.w;
import ypi.i;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f124160h;
    public final o89.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f124161j;

    public e(g localization, o89.a presentationModel, i nextButtonView) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        this.f124160h = localization;
        this.i = presentationModel;
        this.f124161j = nextButtonView;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        o89.b view = (o89.b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        int i = R$string.signup_registration_enter_email_subtitle;
        g gVar = this.f124160h;
        String subtitle = gVar.getString(i);
        SignUpEmailFragment signUpEmailFragment = (SignUpEmailFragment) view;
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        ((TextView) signUpEmailFragment.f78305d0.getValue(signUpEmailFragment, SignUpEmailFragment.f78303e0[2])).setText(subtitle);
        String hint = gVar.getString(R$string.signup_registration_enter_email_hint);
        Intrinsics.checkNotNullParameter(hint, "hint");
        signUpEmailFragment.D().setPlaceholder(new TextClause(hint, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j.OnFocus);
        o89.a aVar2 = this.i;
        r rVarF = o70.a.f(aVar2.W2());
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: ea9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f124156b;

            {
                this.f124156b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String title = (String) obj2;
                        Intrinsics.checkNotNullParameter(title, "title");
                        o89.b bVar = (o89.b) this.f124156b.L();
                        if (bVar != null) {
                            SignUpEmailFragment signUpEmailFragment2 = (SignUpEmailFragment) bVar;
                            Intrinsics.checkNotNullParameter(title, "title");
                            ((TextView) signUpEmailFragment2.c0.getValue(signUpEmailFragment2, SignUpEmailFragment.f78303e0[1])).setText(title);
                        }
                        break;
                    default:
                        String email = (String) obj2;
                        o89.b bVar2 = (o89.b) this.f124156b.L();
                        if (bVar2 != null) {
                            Intrinsics.h(email);
                            SignUpEmailFragment signUpEmailFragment3 = (SignUpEmailFragment) bVar2;
                            Intrinsics.checkNotNullParameter(email, "email");
                            InputText.setText$default(signUpEmailFragment3.D(), new TextClause(email, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
                            signUpEmailFragment3.D().setSelection(email.length());
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new f0(8, new h(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new s(11, function1), new s(11, function1K), new c(0, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        k kVarFirstElement = aVar2.a1().firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        rfm.w wVarH = o70.a.h(kVarFirstElement);
        final int i3 = 1;
        Function1 function12 = new Function1(this) { // from class: ea9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f124156b;

            {
                this.f124156b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        String title = (String) obj2;
                        Intrinsics.checkNotNullParameter(title, "title");
                        o89.b bVar2 = (o89.b) this.f124156b.L();
                        if (bVar2 != null) {
                            SignUpEmailFragment signUpEmailFragment2 = (SignUpEmailFragment) bVar2;
                            Intrinsics.checkNotNullParameter(title, "title");
                            ((TextView) signUpEmailFragment2.c0.getValue(signUpEmailFragment2, SignUpEmailFragment.f78303e0[1])).setText(title);
                        }
                        break;
                    default:
                        String email = (String) obj2;
                        o89.b bVar22 = (o89.b) this.f124156b.L();
                        if (bVar22 != null) {
                            Intrinsics.h(email);
                            SignUpEmailFragment signUpEmailFragment3 = (SignUpEmailFragment) bVar22;
                            Intrinsics.checkNotNullParameter(email, "email");
                            InputText.setText$default(signUpEmailFragment3.D(), new TextClause(email, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
                            signUpEmailFragment3.D().setSelection(email.length());
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        m mVar = new m(wVarH, new f0(8, new h(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        rfm.b bVar2 = new rfm.b(new s(11, function12), new s(11, function1K2), new c(0, function0J2));
        mVar.i(bVar2);
        Intrinsics.checkNotNullExpressionValue(bVar2, "subscribe(...)");
        w.j0(bVar, bVar2);
        r rVarF2 = o70.a.f(aVar2.G0());
        dkm.a aVar3 = new dkm.a(1, this.f124161j, i.class, "setEnabled", "setEnabled(Z)V", 0, 20);
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new f0(8, new h(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new s(11, aVar3), new s(11, function1K3), new c(0, function0J3));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }
}
