package m08;

import a08.p0;
import android.net.Uri;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.profile.help.PetGetHelpActivity;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ChooserActivityDestination;
import efm.r;
import ip0.um0;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lk7.n;
import nd.o;
import org.jetbrains.annotations.NotNull;
import pfm.m;
import te0.w;
import zhm.u;
import zw7.r0;
import zw7.s;
import zx7.g;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends bsi.a implements c {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f201105j;
    public final f08.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f08.a f201106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f9b.f f201107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f201108n;
    public final g08.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final opi.d f201109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mm.d f201110q;

    public l(xpi.g navBar, f08.d router, f08.a presentationModel, f9b.f errorView, tpi.j progressView, g08.e uiBuilder, opi.d expandableDialogView, mm.d actionDispatcher) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        this.f201105j = navBar;
        this.k = router;
        this.f201106l = presentationModel;
        this.f201107m = errorView;
        this.f201108n = progressView;
        this.o = uiBuilder;
        this.f201109p = expandableDialogView;
        this.f201110q = actionDispatcher;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_get_help_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f201105j;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back));
        final int i = 2;
        pfm.a aVar2 = new pfm.a(w.D(cVar.Q(), new Function1(this) { // from class: m08.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f201099b;

            {
                this.f201099b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        l lVar = this.f201099b;
                        f08.d dVar = lVar.k;
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model, "model");
                        String str = model.f53228a;
                        Object obj3 = model.u;
                        switch (str.hashCode()) {
                            case -1616861698:
                                if (str.equals("GET_HELP_FAQ_LIST_ID")) {
                                    return ((f08.j) dVar).b();
                                }
                                break;
                            case -1476723244:
                                if (str.equals("GET_HELP_CLAIM_SUPPORT_LIST_ID")) {
                                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Policy.Available");
                                    pfm.h hVar = new pfm.h(new la8.j(lVar, (r0) obj3, 6), 2);
                                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                                    return hVar;
                                }
                                break;
                            case -1343039889:
                                if (str.equals("GET_HELP_POLICY_CANCEL_LIST_ID")) {
                                    return lVar.f201110q.c0(g.b.f326075a);
                                }
                                break;
                            case -224366853:
                                if (str.equals("GET_HELP_INSURER_CONTACTS_PHONE_LIST_ID")) {
                                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Insurer");
                                    s insurer = (s) obj3;
                                    f08.j jVar = (f08.j) dVar;
                                    jVar.getClass();
                                    Intrinsics.checkNotNullParameter(insurer, "insurer");
                                    return jVar.f131019b.a(o.h(insurer.f325850b));
                                }
                                break;
                            case -43684055:
                                if (str.equals("GET_HELP_INSURER_CONTACTS_EMAIL_LIST_ID")) {
                                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Policy.Available");
                                    r0 policy = (r0) obj3;
                                    String chooserTitle = policy.f325844j.f325851c;
                                    f08.j jVar2 = (f08.j) dVar;
                                    jVar2.getClass();
                                    Intrinsics.checkNotNullParameter(policy, "policy");
                                    f01.c cVar2 = jVar2.d;
                                    int i2 = R$string.pets_get_help_contact_claim_support_sheet_actions_contact_by_email_subject;
                                    String upperCase = policy.f325840b.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    String string = cVar2.b(new TextLocalisedClause(i2, u.c(upperCase), null, 12)).toString();
                                    Intrinsics.checkNotNullParameter(chooserTitle, "to");
                                    Intrinsics.checkNotNullParameter(chooserTitle, "chooserTitle");
                                    return jVar2.f131019b.a(new ActivityNavigateCommand(new ChooserActivityDestination("android.intent.action.SENDTO", Uri.parse("mailto:"), chooserTitle, 6), null, zhm.r0.k(new Pair("android.intent.extra.EMAIL", new String[]{chooserTitle}), new Pair("android.intent.extra.SUBJECT", string), new Pair("android.intent.extra.TEXT", null), new Pair("android.intent.extra.STREAM", null)), null, 0, null, null, null, null, false, 1018));
                                }
                                break;
                        }
                        m mVar = m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                        return mVar;
                    case 1:
                        mm.d dVar2 = this.f201099b.f201110q;
                        um0 model2 = (um0) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        String str2 = model2.f166695a;
                        boolean zF = Intrinsics.f(str2, "ID_CONFIRM_CANCELLATION");
                        g.a aVar3 = g.a.f326074a;
                        if (zF) {
                            pfm.a aVarE = dVar2.c0(aVar3).e(dVar2.c0(zx7.h.f326076a));
                            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                            return aVarE;
                        }
                        if (Intrinsics.f(str2, "ID_CANCEL_CANCELLATION")) {
                            return dVar2.c0(aVar3);
                        }
                        m mVar2 = m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                        return mVar2;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((f08.j) this.f201099b.k).a();
                }
            }
        }), new p0(25, new i(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        j7a.j jVar = new j7a.j(5, h.f201100a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new lhi.b(2, sVar), jVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        PetGetHelpActivity petGetHelpActivity = (PetGetHelpActivity) view;
        final int i2 = 0;
        pfm.a aVar3 = new pfm.a(w.D(((RowDelegate) petGetHelpActivity.u0.getValue()).f53218h, new Function1(this) { // from class: m08.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f201099b;

            {
                this.f201099b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        l lVar = this.f201099b;
                        f08.d dVar = lVar.k;
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model, "model");
                        String str = model.f53228a;
                        Object obj3 = model.u;
                        switch (str.hashCode()) {
                            case -1616861698:
                                if (str.equals("GET_HELP_FAQ_LIST_ID")) {
                                    return ((f08.j) dVar).b();
                                }
                                break;
                            case -1476723244:
                                if (str.equals("GET_HELP_CLAIM_SUPPORT_LIST_ID")) {
                                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Policy.Available");
                                    pfm.h hVar = new pfm.h(new la8.j(lVar, (r0) obj3, 6), 2);
                                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                                    return hVar;
                                }
                                break;
                            case -1343039889:
                                if (str.equals("GET_HELP_POLICY_CANCEL_LIST_ID")) {
                                    return lVar.f201110q.c0(g.b.f326075a);
                                }
                                break;
                            case -224366853:
                                if (str.equals("GET_HELP_INSURER_CONTACTS_PHONE_LIST_ID")) {
                                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Insurer");
                                    s insurer = (s) obj3;
                                    f08.j jVar2 = (f08.j) dVar;
                                    jVar2.getClass();
                                    Intrinsics.checkNotNullParameter(insurer, "insurer");
                                    return jVar2.f131019b.a(o.h(insurer.f325850b));
                                }
                                break;
                            case -43684055:
                                if (str.equals("GET_HELP_INSURER_CONTACTS_EMAIL_LIST_ID")) {
                                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Policy.Available");
                                    r0 policy = (r0) obj3;
                                    String chooserTitle = policy.f325844j.f325851c;
                                    f08.j jVar22 = (f08.j) dVar;
                                    jVar22.getClass();
                                    Intrinsics.checkNotNullParameter(policy, "policy");
                                    f01.c cVar2 = jVar22.d;
                                    int i22 = R$string.pets_get_help_contact_claim_support_sheet_actions_contact_by_email_subject;
                                    String upperCase = policy.f325840b.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    String string = cVar2.b(new TextLocalisedClause(i22, u.c(upperCase), null, 12)).toString();
                                    Intrinsics.checkNotNullParameter(chooserTitle, "to");
                                    Intrinsics.checkNotNullParameter(chooserTitle, "chooserTitle");
                                    return jVar22.f131019b.a(new ActivityNavigateCommand(new ChooserActivityDestination("android.intent.action.SENDTO", Uri.parse("mailto:"), chooserTitle, 6), null, zhm.r0.k(new Pair("android.intent.extra.EMAIL", new String[]{chooserTitle}), new Pair("android.intent.extra.SUBJECT", string), new Pair("android.intent.extra.TEXT", null), new Pair("android.intent.extra.STREAM", null)), null, 0, null, null, null, null, false, 1018));
                                }
                                break;
                        }
                        m mVar = m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                        return mVar;
                    case 1:
                        mm.d dVar2 = this.f201099b.f201110q;
                        um0 model2 = (um0) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        String str2 = model2.f166695a;
                        boolean zF = Intrinsics.f(str2, "ID_CONFIRM_CANCELLATION");
                        g.a aVar32 = g.a.f326074a;
                        if (zF) {
                            pfm.a aVarE = dVar2.c0(aVar32).e(dVar2.c0(zx7.h.f326076a));
                            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                            return aVarE;
                        }
                        if (Intrinsics.f(str2, "ID_CANCEL_CANCELLATION")) {
                            return dVar2.c0(aVar32);
                        }
                        m mVar2 = m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                        return mVar2;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((f08.j) this.f201099b.k).a();
                }
            }
        }), new p0(25, new i(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new lhi.b(2, sVar), new j7a.j(5, j.f201103a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        ?? r06 = petGetHelpActivity.f76395v0;
        r rVarMerge = r.merge(((TwinHorizontalButtonDelegate) r06.getValue()).f53572c.f121375b.map(new lxb.c(21, new lyd.b(17))), ((TwinHorizontalButtonDelegate) r06.getValue()).d.f121375b.map(new lxb.c(22, new lyd.b(18))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        final int i3 = 1;
        pfm.a aVar4 = new pfm.a(w.D(rVarMerge, new Function1(this) { // from class: m08.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f201099b;

            {
                this.f201099b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        l lVar = this.f201099b;
                        f08.d dVar = lVar.k;
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model, "model");
                        String str = model.f53228a;
                        Object obj3 = model.u;
                        switch (str.hashCode()) {
                            case -1616861698:
                                if (str.equals("GET_HELP_FAQ_LIST_ID")) {
                                    return ((f08.j) dVar).b();
                                }
                                break;
                            case -1476723244:
                                if (str.equals("GET_HELP_CLAIM_SUPPORT_LIST_ID")) {
                                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Policy.Available");
                                    pfm.h hVar = new pfm.h(new la8.j(lVar, (r0) obj3, 6), 2);
                                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                                    return hVar;
                                }
                                break;
                            case -1343039889:
                                if (str.equals("GET_HELP_POLICY_CANCEL_LIST_ID")) {
                                    return lVar.f201110q.c0(g.b.f326075a);
                                }
                                break;
                            case -224366853:
                                if (str.equals("GET_HELP_INSURER_CONTACTS_PHONE_LIST_ID")) {
                                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Insurer");
                                    s insurer = (s) obj3;
                                    f08.j jVar2 = (f08.j) dVar;
                                    jVar2.getClass();
                                    Intrinsics.checkNotNullParameter(insurer, "insurer");
                                    return jVar2.f131019b.a(o.h(insurer.f325850b));
                                }
                                break;
                            case -43684055:
                                if (str.equals("GET_HELP_INSURER_CONTACTS_EMAIL_LIST_ID")) {
                                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Policy.Available");
                                    r0 policy = (r0) obj3;
                                    String chooserTitle = policy.f325844j.f325851c;
                                    f08.j jVar22 = (f08.j) dVar;
                                    jVar22.getClass();
                                    Intrinsics.checkNotNullParameter(policy, "policy");
                                    f01.c cVar2 = jVar22.d;
                                    int i22 = R$string.pets_get_help_contact_claim_support_sheet_actions_contact_by_email_subject;
                                    String upperCase = policy.f325840b.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    String string = cVar2.b(new TextLocalisedClause(i22, u.c(upperCase), null, 12)).toString();
                                    Intrinsics.checkNotNullParameter(chooserTitle, "to");
                                    Intrinsics.checkNotNullParameter(chooserTitle, "chooserTitle");
                                    return jVar22.f131019b.a(new ActivityNavigateCommand(new ChooserActivityDestination("android.intent.action.SENDTO", Uri.parse("mailto:"), chooserTitle, 6), null, zhm.r0.k(new Pair("android.intent.extra.EMAIL", new String[]{chooserTitle}), new Pair("android.intent.extra.SUBJECT", string), new Pair("android.intent.extra.TEXT", null), new Pair("android.intent.extra.STREAM", null)), null, 0, null, null, null, null, false, 1018));
                                }
                                break;
                        }
                        m mVar = m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                        return mVar;
                    case 1:
                        mm.d dVar2 = this.f201099b.f201110q;
                        um0 model2 = (um0) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        String str2 = model2.f166695a;
                        boolean zF = Intrinsics.f(str2, "ID_CONFIRM_CANCELLATION");
                        g.a aVar32 = g.a.f326074a;
                        if (zF) {
                            pfm.a aVarE = dVar2.c0(aVar32).e(dVar2.c0(zx7.h.f326076a));
                            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                            return aVarE;
                        }
                        if (Intrinsics.f(str2, "ID_CANCEL_CANCELLATION")) {
                            return dVar2.c0(aVar32);
                        }
                        m mVar2 = m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                        return mVar2;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((f08.j) this.f201099b.k).a();
                }
            }
        }), new p0(25, new i(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new lhi.b(2, sVar), new j7a.j(5, k.f201104a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        r rVarR = mo3.a.r(o70.a.a(((f08.h) this.f201106l).m3()), this.f201108n);
        Intrinsics.checkNotNullExpressionValue(rVarR, "withAbsenceDataProgress(...)");
        r rVarN = hx7.a.N(m70.a.h(rVarR, new n(this, 12), null, new lxi.g(9), 2), this.f201107m, false, false);
        lrk.h hVar = new lrk.h(1, view, d.class, "setItems", "setItems(Ljava/util/List;)V", 0, 8);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new p0(25, new lak.l(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new lhi.b(2, hVar), new lhi.b(2, sVar), new j7a.j(5, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
