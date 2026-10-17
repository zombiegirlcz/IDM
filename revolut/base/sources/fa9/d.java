package fa9;

import a08.o0;
import a08.p0;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.feature.onboarding.impl.missinginfo.inputfield.MissingFieldFragment;
import efm.k;
import efm.r;
import ew2.q;
import f2i.x;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import rfm.h;
import rfm.m;
import rfm.u;
import rfm.w;
import rx0.j;
import ypi.i;
import zp0.y;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f133267h;

    public d(i nextButtonView) {
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        this.f133267h = nextButtonView;
    }

    public abstract String N();

    public abstract String O();

    public abstract String P();

    public abstract String Q();

    public k R() {
        h hVar = h.f253943a;
        Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
        return hVar;
    }

    public abstract u S();

    public abstract u T();

    public abstract r U();

    public abstract r V();

    public void W() {
    }

    public abstract void X(String str, boolean z);

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        final p89.b view = (p89.b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        this.f133267h.setEnabled(false);
        w wVarH = o70.a.h(T());
        x xVar = new x(1, view, p89.b.class, "setTitle", "setTitle(Ljava/lang/String;)V", 0, 6);
        final int i = 0;
        Function0 function0 = new Function0() { // from class: fa9.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MissingFieldFragment missingFieldFragment = (MissingFieldFragment) view;
                        j90.c cVar = missingFieldFragment.c0;
                        KProperty[] kPropertyArr = MissingFieldFragment.g0;
                        ((TypefaceTextView) cVar.getValue(missingFieldFragment, kPropertyArr[1])).setVisibility(8);
                        ((TypefaceTextView) cVar.getValue(missingFieldFragment, kPropertyArr[1])).setText((CharSequence) null);
                        break;
                    case 1:
                        MissingFieldFragment missingFieldFragment2 = (MissingFieldFragment) view;
                        KProperty[] kPropertyArr2 = MissingFieldFragment.g0;
                        j90.c cVar2 = missingFieldFragment2.f78307d0;
                        ((TypefaceTextView) cVar2.getValue(missingFieldFragment2, kPropertyArr2[2])).setVisibility(8);
                        ((TypefaceTextView) cVar2.getValue(missingFieldFragment2, kPropertyArr2[2])).setText((CharSequence) null);
                        break;
                    default:
                        MissingFieldFragment missingFieldFragment3 = (MissingFieldFragment) view;
                        j90.c cVar3 = missingFieldFragment3.f78308e0;
                        KProperty[] kPropertyArr3 = MissingFieldFragment.g0;
                        w01.k.e((TypefaceTextView) cVar3.getValue(missingFieldFragment3, kPropertyArr3[3]), false);
                        ((TypefaceTextView) cVar3.getValue(missingFieldFragment3, kPropertyArr3[3])).setText((CharSequence) null);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K = K();
        m mVar = new m(wVarH, new p0(11, new q(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        rfm.b bVar = new rfm.b(new o0(13, xVar), new o0(13, function1K), new ea9.c(7, function0));
        mVar.i(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        te0.w.j0(bVar2, bVar);
        w wVarH2 = o70.a.h(S());
        x xVar2 = new x(1, view, p89.b.class, "setSubTitle", "setSubTitle(Ljava/lang/String;)V", 0, 7);
        final int i2 = 1;
        Function0 function02 = new Function0() { // from class: fa9.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MissingFieldFragment missingFieldFragment = (MissingFieldFragment) view;
                        j90.c cVar = missingFieldFragment.c0;
                        KProperty[] kPropertyArr = MissingFieldFragment.g0;
                        ((TypefaceTextView) cVar.getValue(missingFieldFragment, kPropertyArr[1])).setVisibility(8);
                        ((TypefaceTextView) cVar.getValue(missingFieldFragment, kPropertyArr[1])).setText((CharSequence) null);
                        break;
                    case 1:
                        MissingFieldFragment missingFieldFragment2 = (MissingFieldFragment) view;
                        KProperty[] kPropertyArr2 = MissingFieldFragment.g0;
                        j90.c cVar2 = missingFieldFragment2.f78307d0;
                        ((TypefaceTextView) cVar2.getValue(missingFieldFragment2, kPropertyArr2[2])).setVisibility(8);
                        ((TypefaceTextView) cVar2.getValue(missingFieldFragment2, kPropertyArr2[2])).setText((CharSequence) null);
                        break;
                    default:
                        MissingFieldFragment missingFieldFragment3 = (MissingFieldFragment) view;
                        j90.c cVar3 = missingFieldFragment3.f78308e0;
                        KProperty[] kPropertyArr3 = MissingFieldFragment.g0;
                        w01.k.e((TypefaceTextView) cVar3.getValue(missingFieldFragment3, kPropertyArr3[3]), false);
                        ((TypefaceTextView) cVar3.getValue(missingFieldFragment3, kPropertyArr3[3])).setText((CharSequence) null);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K2 = K();
        m mVar2 = new m(wVarH2, new p0(11, new c(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar2, "onErrorResumeNext(...)");
        rfm.b bVar3 = new rfm.b(new o0(13, xVar2), new o0(13, function1K2), new ea9.c(7, function02));
        mVar2.i(bVar3);
        Intrinsics.checkNotNullExpressionValue(bVar3, "subscribe(...)");
        te0.w.j0(bVar2, bVar3);
        w wVarH3 = o70.a.h(R());
        x xVar3 = new x(1, view, p89.b.class, "setLinkText", "setLinkText(Ljava/lang/String;)V", 0, 8);
        final int i3 = 2;
        Function0 function03 = new Function0() { // from class: fa9.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MissingFieldFragment missingFieldFragment = (MissingFieldFragment) view;
                        j90.c cVar = missingFieldFragment.c0;
                        KProperty[] kPropertyArr = MissingFieldFragment.g0;
                        ((TypefaceTextView) cVar.getValue(missingFieldFragment, kPropertyArr[1])).setVisibility(8);
                        ((TypefaceTextView) cVar.getValue(missingFieldFragment, kPropertyArr[1])).setText((CharSequence) null);
                        break;
                    case 1:
                        MissingFieldFragment missingFieldFragment2 = (MissingFieldFragment) view;
                        KProperty[] kPropertyArr2 = MissingFieldFragment.g0;
                        j90.c cVar2 = missingFieldFragment2.f78307d0;
                        ((TypefaceTextView) cVar2.getValue(missingFieldFragment2, kPropertyArr2[2])).setVisibility(8);
                        ((TypefaceTextView) cVar2.getValue(missingFieldFragment2, kPropertyArr2[2])).setText((CharSequence) null);
                        break;
                    default:
                        MissingFieldFragment missingFieldFragment3 = (MissingFieldFragment) view;
                        j90.c cVar3 = missingFieldFragment3.f78308e0;
                        KProperty[] kPropertyArr3 = MissingFieldFragment.g0;
                        w01.k.e((TypefaceTextView) cVar3.getValue(missingFieldFragment3, kPropertyArr3[3]), false);
                        ((TypefaceTextView) cVar3.getValue(missingFieldFragment3, kPropertyArr3[3])).setText((CharSequence) null);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K3 = K();
        m mVar3 = new m(wVarH3, new p0(11, new c(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar3, "onErrorResumeNext(...)");
        rfm.b bVar4 = new rfm.b(new o0(13, xVar3), new o0(13, function1K3), new ea9.c(7, function03));
        mVar3.i(bVar4);
        Intrinsics.checkNotNullExpressionValue(bVar4, "subscribe(...)");
        te0.w.j0(bVar2, bVar4);
        MissingFieldFragment missingFieldFragment = (MissingFieldFragment) view;
        missingFieldFragment.D().setInputType(8194);
        String strO = O();
        ihm.b bVar5 = missingFieldFragment.f0;
        if (strO != null) {
            missingFieldFragment.D().setPlaceholder(new TextClause(strO, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j.OnFocus);
        }
        String strQ = Q();
        if (strQ != null) {
            missingFieldFragment.D().setLabel(new TextClause(strQ, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        missingFieldFragment.D().setMaskingDelegate(new y(missingFieldFragment.D().getInnerEditText(), null, P(), new f9g.h(missingFieldFragment, 7), "missing_code_input", null, false, 98));
        Boolean bool = Boolean.FALSE;
        CharSequence text = missingFieldFragment.D().getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        bVar5.onNext(new Pair(bool, string));
        missingFieldFragment.D().setMaxLines(1);
        missingFieldFragment.D().setMainIconImage(null);
        missingFieldFragment.D().setEnableQuickClear(true);
        k kVarFirstElement = U().firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        w wVarH4 = o70.a.h(kVarFirstElement);
        final int i5 = 0;
        Function1 function1 = new Function1(this) { // from class: fa9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f133264b;

            {
                this.f133264b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        String text2 = (String) obj2;
                        p89.b bVar6 = (p89.b) this.f133264b.L();
                        if (bVar6 != null) {
                            Intrinsics.h(text2);
                            MissingFieldFragment missingFieldFragment2 = (MissingFieldFragment) bVar6;
                            Intrinsics.checkNotNullParameter(text2, "text");
                            InputText.setText$default(missingFieldFragment2.D(), new TextClause(text2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
                            missingFieldFragment2.D().setSelection(text2.length());
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                        this.f133264b.X((String) pair.f186386b, zBooleanValue);
                        break;
                    case 2:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f133264b.W();
                        break;
                    default:
                        p89.a state = (p89.a) obj2;
                        Intrinsics.checkNotNullParameter(state, "state");
                        d dVar = this.f133264b;
                        dVar.f133267h.setEnabled(state.a());
                        String error = dVar.N();
                        if (!state.b() || error == null) {
                            p89.b bVar7 = (p89.b) dVar.L();
                            if (bVar7 != null) {
                                MissingFieldFragment missingFieldFragment3 = (MissingFieldFragment) bVar7;
                                missingFieldFragment3.D().setError(false);
                                InputText inputTextD = missingFieldFragment3.D();
                                m70.a.c(t0.f186434a);
                                inputTextD.setHelperText(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                            }
                        } else {
                            p89.b bVar8 = (p89.b) dVar.L();
                            if (bVar8 != null) {
                                MissingFieldFragment missingFieldFragment4 = (MissingFieldFragment) bVar8;
                                Intrinsics.checkNotNullParameter(error, "error");
                                missingFieldFragment4.D().setHelperText(new TextClause(error, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                                missingFieldFragment4.D().setError(true);
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K4 = K();
        Function0 function0J = J();
        m mVar4 = new m(wVarH4, new p0(11, new q(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar4, "onErrorResumeNext(...)");
        rfm.b bVar6 = new rfm.b(new o0(13, function1), new o0(13, function1K4), new ea9.c(7, function0J));
        mVar4.i(bVar6);
        Intrinsics.checkNotNullExpressionValue(bVar6, "subscribe(...)");
        te0.w.j0(bVar2, bVar6);
        final int i6 = 1;
        Function1 function12 = new Function1(this) { // from class: fa9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f133264b;

            {
                this.f133264b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        String text2 = (String) obj2;
                        p89.b bVar62 = (p89.b) this.f133264b.L();
                        if (bVar62 != null) {
                            Intrinsics.h(text2);
                            MissingFieldFragment missingFieldFragment2 = (MissingFieldFragment) bVar62;
                            Intrinsics.checkNotNullParameter(text2, "text");
                            InputText.setText$default(missingFieldFragment2.D(), new TextClause(text2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
                            missingFieldFragment2.D().setSelection(text2.length());
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                        this.f133264b.X((String) pair.f186386b, zBooleanValue);
                        break;
                    case 2:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f133264b.W();
                        break;
                    default:
                        p89.a state = (p89.a) obj2;
                        Intrinsics.checkNotNullParameter(state, "state");
                        d dVar = this.f133264b;
                        dVar.f133267h.setEnabled(state.a());
                        String error = dVar.N();
                        if (!state.b() || error == null) {
                            p89.b bVar7 = (p89.b) dVar.L();
                            if (bVar7 != null) {
                                MissingFieldFragment missingFieldFragment3 = (MissingFieldFragment) bVar7;
                                missingFieldFragment3.D().setError(false);
                                InputText inputTextD = missingFieldFragment3.D();
                                m70.a.c(t0.f186434a);
                                inputTextD.setHelperText(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                            }
                        } else {
                            p89.b bVar8 = (p89.b) dVar.L();
                            if (bVar8 != null) {
                                MissingFieldFragment missingFieldFragment4 = (MissingFieldFragment) bVar8;
                                Intrinsics.checkNotNullParameter(error, "error");
                                missingFieldFragment4.D().setHelperText(new TextClause(error, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                                missingFieldFragment4.D().setError(true);
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K5 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext = bVar5.onErrorResumeNext(new p0(11, new q(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(13, function12), new o0(13, function1K5), new ea9.c(7, function0J2));
        te0.w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        fk.b bVarK = hx7.b.k((TypefaceTextView) missingFieldFragment.f78308e0.getValue(missingFieldFragment, MissingFieldFragment.g0[3]));
        final int i21 = 2;
        Function1 function13 = new Function1(this) { // from class: fa9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f133264b;

            {
                this.f133264b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        String text2 = (String) obj2;
                        p89.b bVar62 = (p89.b) this.f133264b.L();
                        if (bVar62 != null) {
                            Intrinsics.h(text2);
                            MissingFieldFragment missingFieldFragment2 = (MissingFieldFragment) bVar62;
                            Intrinsics.checkNotNullParameter(text2, "text");
                            InputText.setText$default(missingFieldFragment2.D(), new TextClause(text2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
                            missingFieldFragment2.D().setSelection(text2.length());
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                        this.f133264b.X((String) pair.f186386b, zBooleanValue);
                        break;
                    case 2:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f133264b.W();
                        break;
                    default:
                        p89.a state = (p89.a) obj2;
                        Intrinsics.checkNotNullParameter(state, "state");
                        d dVar = this.f133264b;
                        dVar.f133267h.setEnabled(state.a());
                        String error = dVar.N();
                        if (!state.b() || error == null) {
                            p89.b bVar7 = (p89.b) dVar.L();
                            if (bVar7 != null) {
                                MissingFieldFragment missingFieldFragment3 = (MissingFieldFragment) bVar7;
                                missingFieldFragment3.D().setError(false);
                                InputText inputTextD = missingFieldFragment3.D();
                                m70.a.c(t0.f186434a);
                                inputTextD.setHelperText(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                            }
                        } else {
                            p89.b bVar8 = (p89.b) dVar.L();
                            if (bVar8 != null) {
                                MissingFieldFragment missingFieldFragment4 = (MissingFieldFragment) bVar8;
                                Intrinsics.checkNotNullParameter(error, "error");
                                missingFieldFragment4.D().setHelperText(new TextClause(error, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                                missingFieldFragment4.D().setError(true);
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K6 = K();
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext2 = bVarK.onErrorResumeNext(new p0(11, new q(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o0(13, function13), new o0(13, function1K6), new ea9.c(7, function0J3));
        te0.w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        r rVarF = o70.a.f(V());
        final int i22 = 3;
        Function1 function14 = new Function1(this) { // from class: fa9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f133264b;

            {
                this.f133264b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        String text2 = (String) obj2;
                        p89.b bVar62 = (p89.b) this.f133264b.L();
                        if (bVar62 != null) {
                            Intrinsics.h(text2);
                            MissingFieldFragment missingFieldFragment2 = (MissingFieldFragment) bVar62;
                            Intrinsics.checkNotNullParameter(text2, "text");
                            InputText.setText$default(missingFieldFragment2.D(), new TextClause(text2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
                            missingFieldFragment2.D().setSelection(text2.length());
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                        this.f133264b.X((String) pair.f186386b, zBooleanValue);
                        break;
                    case 2:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f133264b.W();
                        break;
                    default:
                        p89.a state = (p89.a) obj2;
                        Intrinsics.checkNotNullParameter(state, "state");
                        d dVar = this.f133264b;
                        dVar.f133267h.setEnabled(state.a());
                        String error = dVar.N();
                        if (!state.b() || error == null) {
                            p89.b bVar7 = (p89.b) dVar.L();
                            if (bVar7 != null) {
                                MissingFieldFragment missingFieldFragment3 = (MissingFieldFragment) bVar7;
                                missingFieldFragment3.D().setError(false);
                                InputText inputTextD = missingFieldFragment3.D();
                                m70.a.c(t0.f186434a);
                                inputTextD.setHelperText(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                            }
                        } else {
                            p89.b bVar8 = (p89.b) dVar.L();
                            if (bVar8 != null) {
                                MissingFieldFragment missingFieldFragment4 = (MissingFieldFragment) bVar8;
                                Intrinsics.checkNotNullParameter(error, "error");
                                missingFieldFragment4.D().setHelperText(new TextClause(error, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                                missingFieldFragment4.D().setError(true);
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K7 = K();
        Function0 function0J4 = J();
        r rVarOnErrorResumeNext3 = rVarF.onErrorResumeNext(new p0(11, new q(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o0(13, function14), new o0(13, function1K7), new ea9.c(7, function0J4));
        te0.w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }
}
