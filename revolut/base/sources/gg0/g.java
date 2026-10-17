package gg0;

import android.content.Context;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.faq.data.db.FaqDatabase;
import com.revolut.core.faq.data.network.FaqFeedbackService;
import com.revolut.core.faq.data.network.HelpCenterService;
import com.revolut.core.faq.data.network.LightenedFaqService;
import com.revolut.core.faq.data.network.PigeonService;
import com.revolut.core.faq.data.network.TroubleshooterService;
import ip0.pr;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import rp0.g1;
import vc.s;
import wf0.z0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class g implements e4m.e {
    public static xe0.e A(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        gma.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.g(storageFactory, databaseSessionProvider, "profile_settings", mapper, 0, null, false, SyslogConstants.LOG_CLOCK);
    }

    public static bg0.e B(f fVar) {
        return new bg0.e();
    }

    public static z0 C(f fVar, z0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return repository;
    }

    public static TroubleshooterService D(f fVar, Retrofit retrofit) {
        TroubleshooterService troubleshooterService = (TroubleshooterService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TroubleshooterService.class, "create(...)");
        s.k(troubleshooterService);
        return troubleshooterService;
    }

    public static void a(f fVar, hg0.o impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
    }

    public static fg0.k b(f fVar, fg0.k impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    public static void c(f fVar, hg0.p interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
    }

    public static pw4.a d(pw4.g factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new pw4.a();
    }

    public static pw4.e e(pw4.g factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new pw4.e(factory.f240328a, factory.f240329b, factory.d);
    }

    public static qw4.c f(qw4.g factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new qw4.c(factory.f249770a, factory.f249771b, factory.d);
    }

    public static sw4.h g(sw4.j factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new sw4.h(factory.f266106a, factory.f266107b, factory.e, factory.f);
    }

    public static tw4.d h(tw4.f factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new tw4.d(factory.f274909a, factory.f274910b, factory.d, factory.e);
    }

    public static uw4.a i(uw4.h factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new uw4.a();
    }

    public static uw4.e j(uw4.h factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new uw4.e(factory.f283553a, factory.f283554b, factory.d);
    }

    public static vw4.e k(vw4.g factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new vw4.e(factory.f292636c, factory.f292634a, factory.f, factory.f292637g, factory.f292638h);
    }

    public static ww4.f l(ww4.g factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new ww4.f(factory.f300607b, factory.f300606a, factory.e);
    }

    public static kg0.d m(f fVar) {
        return new kg0.d();
    }

    public static ifm.b n(f fVar) {
        return new ifm.b();
    }

    public static wf0.g o(f fVar, wf0.l repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return repository;
    }

    public static FaqFeedbackService p(f fVar, Retrofit retrofit) {
        FaqFeedbackService faqFeedbackService = (FaqFeedbackService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FaqFeedbackService.class, "create(...)");
        s.k(faqFeedbackService);
        return faqFeedbackService;
    }

    public static j60.c q(com.revolut.kompot.navigable.a controller, rp0.m dialogDisplayer, he2.b dialogHostFinder) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    public static ep6.n r(zo6.a factory, j60.a bottomExpandableDialogControllerExtension, g1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        ep6.n nVarA = factory.a(bottomExpandableDialogControllerExtension, shotDialogDisplayer, pr.f165860a);
        s.k(nVarA);
        return nVarA;
    }

    public static HelpCenterService s(Retrofit retrofit) {
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(HelpCenterService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        HelpCenterService helpCenterService = (HelpCenterService) objCreate;
        s.k(helpCenterService);
        return helpCenterService;
    }

    public static ve0.c t(je0.d mapper, xe0.f storageFactory) {
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return xe0.f.e(storageFactory, "help_center_cache", mapper, 8);
    }

    public static xf0.g u(f fVar, FaqDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        xf0.g gVarI = database.i();
        s.k(gVarI);
        return gVarI;
    }

    public static sri.m v(Context context) {
        gma.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static mk0.a w(mk0.a personalisationStorage) {
        gma.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        return personalisationStorage;
    }

    public static xf0.k x(f fVar, FaqDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        xf0.k kVarJ = database.j();
        s.k(kVarJ);
        return kVarJ;
    }

    public static PigeonService y(f fVar, Retrofit retrofit) {
        PigeonService pigeonService = (PigeonService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PigeonService.class, "create(...)");
        s.k(pigeonService);
        return pigeonService;
    }

    public static LightenedFaqService z(f fVar, Retrofit retrofit) {
        LightenedFaqService lightenedFaqService = (LightenedFaqService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", LightenedFaqService.class, "create(...)");
        s.k(lightenedFaqService);
        return lightenedFaqService;
    }
}
