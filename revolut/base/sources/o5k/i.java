package o5k;

import android.content.Context;
import bp0.y;
import com.revolut.feature.trading_add_ons.impl.data.network.TradingAddOnsService;
import com.revolut.feature_reactions_keyboard.impl.data.network.ReactionsKeyboardGiphyService;
import com.revolut.feature_retail_user_declarations.purpose.service.PurposeOfAccountService;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingEligibilityService;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingLifecycleService;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingReceiverService;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import n5k.q;
import oai.s0;
import oai.u0;
import retrofit2.Retrofit;
import te0.u;
import vc.s;
import yji.n;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public abstract class i implements e4m.e {
    public static f01.c A(Context context) {
        s0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new f01.c(context);
    }

    public static aah.m B(aah.i factory) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.b();
    }

    public static aah.m C(aah.i factory) {
        m.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.b();
    }

    public static tv9.a D(s6k.c cVar) {
        tv9.a aVar = (tv9.a) cVar.b();
        s.k(aVar);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n a(q extension) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        n nVar = (n) extension;
        s.k(nVar);
        return nVar;
    }

    public static u b(ue0.c storage) {
        obf.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new u(storage);
    }

    public static n9i.f c(o9i.b bVar, ReactionsKeyboardGiphyService giphyService, l9i.a giphyImageMapper, p9i.a memoryCache) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(giphyService, "giphyService");
        Intrinsics.checkNotNullParameter(giphyImageMapper, "giphyImageMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        return new n9i.f(n9i.d.GIF, giphyService, giphyImageMapper, memoryCache);
    }

    public static n9i.f d(o9i.b bVar, ReactionsKeyboardGiphyService giphyService, l9i.a giphyImageMapper, p9i.a memoryCache) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(giphyService, "giphyService");
        Intrinsics.checkNotNullParameter(giphyImageMapper, "giphyImageMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        return new n9i.f(n9i.d.STICKER, giphyService, giphyImageMapper, memoryCache);
    }

    public static q9i.d e(o9i.a aVar, n9i.f gifRepository) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(gifRepository, "gifRepository");
        return new q9i.d(gifRepository);
    }

    public static q9i.d f(o9i.a aVar, n9i.f gifRepository) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(gifRepository, "gifRepository");
        return new q9i.d(gifRepository);
    }

    public static a2d.m g(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new a2d.m(aVar, aVar2, aVar3, 20);
    }

    public static o41.e h(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, ecm.q qVar, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36) {
        return new o41.e(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, qVar, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36);
    }

    public static xe0.e i(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        obf.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "add_on_storage", mapper, 5, v.k(sbf.a.d, sbf.b.d, sbf.c.d, sbf.d.d), 32);
    }

    public static y j(Context context) {
        u0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return com.bumptech.glide.c.k(context).a(context);
    }

    public static yji.d k(n60.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static yji.d l(n60.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static yji.d m(n60.b extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static yji.d n(n60.b extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static le0.a o(o gson, le0.b gsonObjectMapperFactory) {
        obf.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return gsonObjectMapperFactory.a(gson);
    }

    public static n60.a p(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new n60.a(controller);
    }

    public static n60.a q(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new n60.a(controller);
    }

    public static n60.b r(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new n60.b(controller);
    }

    public static n60.b s(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new n60.b(controller);
    }

    public static PlanGiftingEligibilityService t(obk.c cVar, Retrofit retrofit) {
        PlanGiftingEligibilityService planGiftingEligibilityService = (PlanGiftingEligibilityService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PlanGiftingEligibilityService.class, "create(...)");
        s.k(planGiftingEligibilityService);
        return planGiftingEligibilityService;
    }

    public static PlanGiftingLifecycleService u(obk.c cVar, Retrofit retrofit) {
        PlanGiftingLifecycleService planGiftingLifecycleService = (PlanGiftingLifecycleService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PlanGiftingLifecycleService.class, "create(...)");
        s.k(planGiftingLifecycleService);
        return planGiftingLifecycleService;
    }

    public static PlanGiftingReceiverService v(obk.c cVar, Retrofit retrofit) {
        PlanGiftingReceiverService planGiftingReceiverService = (PlanGiftingReceiverService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PlanGiftingReceiverService.class, "create(...)");
        s.k(planGiftingReceiverService);
        return planGiftingReceiverService;
    }

    public static PurposeOfAccountService w(Retrofit retrofit) {
        u0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(PurposeOfAccountService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PurposeOfAccountService purposeOfAccountService = (PurposeOfAccountService) objCreate;
        s.k(purposeOfAccountService);
        return purposeOfAccountService;
    }

    public static void x(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
    }

    public static ReactionsKeyboardGiphyService y(o9i.c cVar, Retrofit retrofit) {
        ReactionsKeyboardGiphyService reactionsKeyboardGiphyService = (ReactionsKeyboardGiphyService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ReactionsKeyboardGiphyService.class, "create(...)");
        s.k(reactionsKeyboardGiphyService);
        return reactionsKeyboardGiphyService;
    }

    public static TradingAddOnsService z(Retrofit retrofit) {
        obf.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TradingAddOnsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TradingAddOnsService tradingAddOnsService = (TradingAddOnsService) objCreate;
        s.k(tradingAddOnsService);
        return tradingAddOnsService;
    }
}
