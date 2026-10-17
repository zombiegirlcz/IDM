package lu7;

import android.content.Context;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature.apm.core.impl.data.network.alias.AliasService;
import com.revolut.feature.apm.core.impl.data.network.consent.ApmConsentsService;
import com.revolut.feature.apm.core.impl.data.network.disputes.ApmDisputesService;
import com.revolut.feature.apm.core.impl.data.network.onboarding.ApmOnboardingService;
import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsAmendmentService;
import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsService;
import com.revolut.feature.apm.core.impl.data.network.settings.ApmRecipientSettingsService;
import com.revolut.feature.apm.core.impl.data.network.settings.ApmSettingsService;
import com.revolut.feature.apm.core.impl.data.network.transfer.ApmTransferService;
import com.revolut.feature.selfserve.core.instructions.InstructionsService;
import com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nii.t0;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 implements e4m.e {
    public static xe0.e A(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        o0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.g(storageFactory, databaseSessionProvider, "insurance_embedded", mapper, 0, null, false, SyslogConstants.LOG_CLOCK);
    }

    public static xe0.e B(yk0.a databaseSessionProvider, je0.d mapper, xe0.f storageFactory) {
        lz8.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "learn_storage", mapper, 0, null, 56);
    }

    public static uy1.o C(uy1.l aliasResolveErrorParser, vw1.b aliasRepository) {
        lz1.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(aliasResolveErrorParser, "aliasResolveErrorParser");
        return new uy1.o(aliasResolveErrorParser, aliasRepository);
    }

    public static InstructionsService D(Retrofit retrofit) {
        lxc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(InstructionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        InstructionsService instructionsService = (InstructionsService) objCreate;
        vc.s.k(instructionsService);
        return instructionsService;
    }

    public static ax4.c a(a31.a aVar, a31.a aVar2, a31.a aVar3, ecm.q qVar) {
        return new ax4.c(qVar, aVar, aVar2, aVar3, 11);
    }

    public static ax4.c b(a31.a aVar, a31.a aVar2, a31.a aVar3, ecm.q qVar) {
        return new ax4.c(qVar, aVar, aVar2, aVar3, 12);
    }

    public static uy1.j c(uy1.b factory) {
        lz1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        zz1.h.Companion.getClass();
        return factory.a(zz1.h.i);
    }

    public static uy1.j d(uy1.b factory) {
        lz1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        zz1.h.Companion.getClass();
        return factory.a(zz1.h.f326488j);
    }

    public static uy1.j e(uy1.b factory) {
        lz1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        zz1.h.Companion.getClass();
        return factory.a(zz1.h.f326490m);
    }

    public static AliasService f(lz1.g gVar, Retrofit retrofit) {
        AliasService aliasService = (AliasService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", AliasService.class, "create(...)");
        vc.s.k(aliasService);
        return aliasService;
    }

    public static ApmConsentsService g(lz1.g gVar, Retrofit retrofit) {
        ApmConsentsService apmConsentsService = (ApmConsentsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ApmConsentsService.class, "create(...)");
        vc.s.k(apmConsentsService);
        return apmConsentsService;
    }

    public static ApmDisputesService h(lz1.g gVar, Retrofit retrofit) {
        ApmDisputesService apmDisputesService = (ApmDisputesService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ApmDisputesService.class, "create(...)");
        vc.s.k(apmDisputesService);
        return apmDisputesService;
    }

    public static ApmOnboardingService i(lz1.g gVar, Retrofit retrofit) {
        ApmOnboardingService apmOnboardingService = (ApmOnboardingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ApmOnboardingService.class, "create(...)");
        vc.s.k(apmOnboardingService);
        return apmOnboardingService;
    }

    public static ApmPaymentAuthorisationsAmendmentService j(lz1.g gVar, Retrofit retrofit) {
        ApmPaymentAuthorisationsAmendmentService apmPaymentAuthorisationsAmendmentService = (ApmPaymentAuthorisationsAmendmentService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ApmPaymentAuthorisationsAmendmentService.class, "create(...)");
        vc.s.k(apmPaymentAuthorisationsAmendmentService);
        return apmPaymentAuthorisationsAmendmentService;
    }

    public static ApmPaymentAuthorisationsService k(lz1.g gVar, Retrofit retrofit) {
        ApmPaymentAuthorisationsService apmPaymentAuthorisationsService = (ApmPaymentAuthorisationsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ApmPaymentAuthorisationsService.class, "create(...)");
        vc.s.k(apmPaymentAuthorisationsService);
        return apmPaymentAuthorisationsService;
    }

    public static xe0.e l(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        lz1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "apm_preferences", mapper, 0, null, 56);
    }

    public static ApmRecipientSettingsService m(lz1.g gVar, Retrofit retrofit) {
        ApmRecipientSettingsService apmRecipientSettingsService = (ApmRecipientSettingsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ApmRecipientSettingsService.class, "create(...)");
        vc.s.k(apmRecipientSettingsService);
        return apmRecipientSettingsService;
    }

    public static ApmSettingsService n(lz1.g gVar, Retrofit retrofit) {
        ApmSettingsService apmSettingsService = (ApmSettingsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ApmSettingsService.class, "create(...)");
        vc.s.k(apmSettingsService);
        return apmSettingsService;
    }

    public static ApmTransferService o(lz1.g gVar, Retrofit retrofit) {
        ApmTransferService apmTransferService = (ApmTransferService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ApmTransferService.class, "create(...)");
        vc.s.k(apmTransferService);
        return apmTransferService;
    }

    public static h4d.a p(SeparateFavouritesItemDatabase db8) {
        m4d.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        h4d.a aVarH = db8.h();
        vc.s.k(aVarH);
        return aVarH;
    }

    public static f9b.f q(f9b.g retailErrorViewFactoryProvider, u2l.a activity, kwl.b errorEventHandler, Set serverErrorHandlers) {
        m41.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retailErrorViewFactoryProvider, "retailErrorViewFactoryProvider");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(errorEventHandler, "errorEventHandler");
        Intrinsics.checkNotNullParameter(serverErrorHandlers, "serverErrorHandlers");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(errorEventHandler, "errorEventHandler");
        Intrinsics.checkNotNullParameter(serverErrorHandlers, "serverErrorHandlers");
        yf.c cVar = new yf.c(activity);
        r10.t tVar = new r10.t(activity, retailErrorViewFactoryProvider.f132906c, new t0(activity));
        return new f9b.f(cVar, new f9b.i(retailErrorViewFactoryProvider.f132904a, cVar, tVar, retailErrorViewFactoryProvider.f132905b, retailErrorViewFactoryProvider.d, (tpi.j) u1.i(tpi.j.class, activity.L0().l0()), new jpf.a(retailErrorViewFactoryProvider.f, serverErrorHandlers, errorEventHandler), retailErrorViewFactoryProvider.e));
    }

    public static kg.o r(lz1.g gVar, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        he0.m mVarB = he0.m.b(fz1.f.class, "type");
        fz1.f.Companion.getClass();
        mVarB.c(fz1.b.class, "BOOLEAN");
        mVarB.c(fz1.d.class, "ENUM");
        mVarB.c(fz1.e.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVarB, "registerFallbackSubtype(...)");
        pVar.e.add(mVarB);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static jyh.a s(smd.s factory, kyh.c view) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        zyh.c cVar = new zyh.c((zyh.d) factory.f264432a, (azh.a) factory.f264433b, new zqc.l(0, view, kyh.c.class, "onAddMaximumAmountClicked", "onAddMaximumAmountClicked()V", 0, 1));
        return new jyh.a(new vzh.d(view, cVar), cVar);
    }

    public static xe0.e t(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        m4d.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "MULTIPLE_WATCHLISTS_STORAGE_FILE_NAME", mapper, 1, zhm.f0.f322471a, 32);
    }

    public static sri.m u(Context context) {
        o0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m v(Context context) {
        lz1.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static uy1.o w(uy1.l aliasResolveErrorParser, vw1.b aliasRepository) {
        lz1.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(aliasResolveErrorParser, "aliasResolveErrorParser");
        return new uy1.o(aliasResolveErrorParser, aliasRepository);
    }

    public static uy1.o x(uy1.l aliasResolveErrorParser, vw1.b aliasRepository) {
        lz1.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(aliasResolveErrorParser, "aliasResolveErrorParser");
        return new uy1.o(aliasResolveErrorParser, aliasRepository);
    }

    public static kwi.a y(com.revolut.kompot.navigable.a controller, gte.a featureToggleInteractor) {
        lwi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        return new kwi.a(controller, featureToggleInteractor);
    }

    public static mub.b z(jid.z factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj2 = ((phm.a) factory.f174461b).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        mub.b bVar = (mub.b) obj2;
        vc.s.k(bVar);
        return bVar;
    }
}
