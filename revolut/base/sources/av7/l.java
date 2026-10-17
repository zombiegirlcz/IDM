package av7;

import a41.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import aw1.q;
import az0.u;
import b6i.h0;
import b6i.i0;
import ba4.z;
import cd2.a;
import com.revolut.core.model.faq.FaqAction;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.services.ideal.impl.data.network.IDealService;
import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import com.revolut.feature.insurance_common.data.model.Banner;
import com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.separate_favourites.item_data.impl.alerts.universal.network.UniversalAlertsService;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import efm.d0;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
import pfm.r;
import vkm.j2;
import wli.x;
import yhm.m;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f9937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9938x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9937w = obj2;
        this.f9938x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l((m) this.f9937w, (nr7.c) this.f9938x, continuation, 0);
            case 1:
                return new l((m) this.f9937w, (Banner) this.f9938x, continuation, 1);
            case 2:
                return new l((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) this.f9937w, (puj.f) this.f9938x, continuation, 2);
            case 3:
                return new l((q) this.f9937w, (Alias) this.f9938x, continuation, 3);
            case 4:
                l lVar = new l((com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) this.f9938x, continuation, 4);
                lVar.f9937w = obj2;
                return lVar;
            case 5:
                return new l((aye.m) this.f9937w, (yte.e) this.f9938x, continuation, 5);
            case 6:
                return new l((u) this.f9937w, (ag.c) this.f9938x, continuation, 6);
            case 7:
                l lVar2 = new l((b20.b) this.f9938x, continuation, 7);
                lVar2.f9937w = obj2;
                return lVar2;
            case 8:
                return new l((com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.f9937w, (MarginQuote) this.f9938x, continuation, 8);
            case 9:
                return new l((b4d.i) this.f9937w, (mgd.i) this.f9938x, continuation, 9);
            case 10:
                return new l((mgd.j) this.f9937w, (b4d.i) this.f9938x, continuation, 10);
            case 11:
                return new l((com.revolut.feature.joint.impl.ui.invite_flow.d) this.f9937w, (d58.f) this.f9938x, continuation, 11);
            case 12:
                return new l((com.revolut.feature.joint.impl.ui.invite_flow.d) this.f9937w, (InvitationType) this.f9938x, continuation, 12);
            case 13:
                return new l((com.revolut.feature_move_money.impl.amount.c) this.f9937w, (oim.o) this.f9938x, continuation, 13);
            case 14:
                return new l((com.revolut.feature_move_money.impl.amount.c) this.f9937w, (AccountSource) this.f9938x, continuation, 14);
            case 15:
                l lVar3 = new l((com.revolut.feature_move_money.impl.amount.c) this.f9938x, continuation, 15);
                lVar3.f9937w = obj2;
                return lVar3;
            case 16:
                return new l((com.revolut.feature.giro.impl.ui.form.b) this.f9937w, (FormState) this.f9938x, continuation, 16);
            case 17:
                return new l((b7i.f) this.f9937w, (BalanceWrapper) this.f9938x, continuation, 17);
            case 18:
                return new l((b88.n) this.f9937w, (String) this.f9938x, continuation, 18);
            case 19:
                l lVar4 = new l((com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) this.f9938x, continuation, 19);
                lVar4.f9937w = obj2;
                return lVar4;
            case 20:
                return new l((com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) this.f9937w, (String) this.f9938x, continuation, 20);
            case 21:
                return new l((com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) this.f9937w, (FaqAction) this.f9938x, continuation, 21);
            case 22:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) this.f9937w, (qu3.a) this.f9938x, continuation, 22);
            case 23:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) this.f9937w, (qu3.n) this.f9938x, continuation, 23);
            case 24:
                return new l((b9d.n) this.f9937w, (String) this.f9938x, continuation, 24);
            case 25:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) this.f9937w, (File) this.f9938x, continuation, 25);
            case 26:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) this.f9937w, (String) this.f9938x, continuation, 26);
            case 27:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) this.f9937w, (ry3.a) this.f9938x, continuation, 27);
            case 28:
                return new l((com.revolut.feature_retail_user_declarations.bank_terms.a) this.f9937w, (Terms) this.f9938x, continuation, 28);
            default:
                return new l((String) this.f9937w, (bd2.e) this.f9938x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objE;
        Function0 function0;
        Object objG;
        Object objA;
        Object objD;
        Object objCreateVolatilityAlert;
        Object availablePockets;
        g02.b bVar;
        int i = this.u;
        boolean z = false;
        Object obj3 = this.f9938x;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar = ((m) this.f9937w).f9939p;
                String str = ((nr7.c) obj3).f218591a;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str, null, null, this, 6);
                return objX1 == aVar ? aVar : objX1;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    or7.a aVar3 = ((m) this.f9937w).f9941r;
                    Banner banner = (Banner) obj3;
                    this.v = 1;
                    or7.c cVar = (or7.c) aVar3;
                    cVar.getClass();
                    if (Intrinsics.f(banner.i, Boolean.TRUE)) {
                        objE = cVar.d.e(new tk0.d("INSURANCE_HOME_ANNOUNCEMENT_HAS_BEEN_HIDDEN"), banner.f75696b + banner.f75697c, this);
                        if (objE != aVar2) {
                            objE = Unit.f186387a;
                        }
                    } else {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar2 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) this.f9937w;
                    com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.a aVar5 = new com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.a(bVar2, (puj.f) obj3, null);
                    this.v = 1;
                    if (u0.b0(bVar2.X(), "add_event_save_button", aVar5, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    q qVar = (q) this.f9937w;
                    a2j.c cVar2 = new a2j.c(qVar, (Alias) obj3, , 25);
                    this.v = 1;
                    if (qVar.p2(this, cVar2) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f fVar = (com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) obj3;
                rw9.h hVar = (rw9.h) this.f9937w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    if (hVar instanceof rw9.c) {
                        fVar.C1(u0.b(((rw9.c) hVar).f257855a));
                    } else {
                        if (!(hVar instanceof rw9.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0 d0VarC = ((s06.j) fVar.u).c(((rw9.b) hVar).f257854a, false, lg0.a.IGNORE);
                        this.f9937w = null;
                        this.v = 1;
                        if (nim.a.b(d0VarC, this) == aVar7) {
                            return aVar7;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    aye.m mVar = (aye.m) this.f9937w;
                    a2j.c cVar3 = new a2j.c(mVar, (yte.e) obj3, , 26);
                    this.v = 1;
                    if (u0.b0(mVar.X(), "ACTION_VIEW_ITEM_DELETE_TAG", cVar3, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                ag.c cVar4 = (ag.c) obj3;
                ImageView imageView = (ImageView) cVar4.f4676c;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                try {
                    if (i33 == 0) {
                        yhm.o.b(obj2);
                        u uVar = (u) this.f9937w;
                        Context context = imageView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        Image image = (Image) cVar4.f;
                        this.v = 1;
                        objG = uVar.g(context, image, this);
                        if (objG == aVar9) {
                            return aVar9;
                        }
                    } else {
                        if (i33 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objG = obj2;
                    }
                    Drawable drawable = (Drawable) objG;
                    imageView.setImageDrawable(drawable);
                    Function1 function1 = (Function1) cVar4.d;
                    if (function1 != null) {
                        function1.invoke(drawable);
                    }
                    cVar4.f4677g = null;
                    cVar4.f4674a = true;
                    break;
                } catch (Exception e) {
                    if (!(e instanceof CancellationException) && (function0 = (Function0) cVar4.e) != null) {
                        function0.invoke();
                    }
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                try {
                    if (i43 == 0) {
                        yhm.o.b(obj2);
                        b20.b bVar3 = (b20.b) obj3;
                        m.Companion companion = yhm.m.INSTANCE;
                        t20.d dVar = bVar3.f11850a;
                        this.f9937w = null;
                        this.v = 1;
                        objD = ((t20.n) dVar).d(this);
                        if (objD == aVar10) {
                            return aVar10;
                        }
                    } else {
                        if (i43 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objD = obj2;
                    }
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = (t20.c) objD;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                return objA instanceof yhm.n ? 0 : objA;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar12 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.f9937w;
                ah1.m mVar2 = new ah1.m(aVar12, (MarginQuote) obj3, , i2);
                this.v = 1;
                Object objB = pu7.a.B(aVar12.k, "on_next_button_click", mVar2, this);
                return objB == aVar11 ? aVar11 : objB;
            case 9:
                mgd.i iVar = (mgd.i) obj3;
                FavouritesAssetDetails favouritesAssetDetails = iVar.f205273b;
                b4d.i iVar2 = (b4d.i) this.f9937w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    UniversalAlertsService universalAlertsService = iVar2.f12305b;
                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                    g4d.g gVar = new g4d.g(favouritesAssetDetails.f86863a, x5d.b.B(iVar.f205274c), iVar.d, iVar.e.name());
                    this.v = 1;
                    objCreateVolatilityAlert = universalAlertsService.createVolatilityAlert(gVar, this);
                    if (objCreateVolatilityAlert == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objCreateVolatilityAlert = obj2;
                }
                String id10 = ((g4d.h) objCreateVolatilityAlert).getId();
                Intrinsics.checkNotNullParameter(id10, "newId");
                FavouritesAssetDetails from = iVar.f205273b;
                BigDecimal percentage = iVar.f205274c;
                String note = iVar.d;
                mgd.e timeRange = iVar.e;
                DateTime createdAt = iVar.f;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(percentage, "percentage");
                Intrinsics.checkNotNullParameter(note, "note");
                Intrinsics.checkNotNullParameter(timeRange, "timeRange");
                Intrinsics.checkNotNullParameter(createdAt, "createdAt");
                iVar2.f12304a.c(zhm.u.c(d4d.b.b(new mgd.i(id10, from, percentage, note, timeRange, createdAt))));
                iVar2.a(favouritesAssetDetails.d);
                return Unit.f186387a;
            case 10:
                mgd.j jVar = (mgd.j) this.f9937w;
                b4d.i iVar3 = (b4d.i) obj3;
                UniversalAlertsService universalAlertsService2 = iVar3.f12305b;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    if (jVar instanceof mgd.h) {
                        mgd.h hVar2 = (mgd.h) jVar;
                        String str2 = hVar2.f205267a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        g4d.a aVar15 = new g4d.a(hVar2.f205271h, x5d.b.B(hVar2.f205269c), x5d.b.B(hVar2.f205270g), hVar2.d, hVar2.e.name());
                        this.v = 1;
                        if (universalAlertsService2.editPriceAlert(str2, aVar15, this) == aVar14) {
                            return aVar14;
                        }
                    } else {
                        if (!(jVar instanceof mgd.i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mgd.i iVar4 = (mgd.i) jVar;
                        String str3 = iVar4.f205272a;
                        Intrinsics.checkNotNullParameter(iVar4, "<this>");
                        g4d.b bVar4 = new g4d.b(x5d.b.B(iVar4.f205274c), iVar4.d, iVar4.e.name());
                        this.v = 2;
                        if (universalAlertsService2.editVolatilityAlert(str3, bVar4, this) == aVar14) {
                            return aVar14;
                        }
                    }
                } else {
                    if (i74 != 1 && i74 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                iVar3.f12304a.c(zhm.u.c(d4d.b.b(jVar)));
                iVar3.a(jVar.a().d);
                return Unit.f186387a;
            case 11:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.joint.impl.ui.invite_flow.d dVar2 = (com.revolut.feature.joint.impl.ui.invite_flow.d) this.f9937w;
                b58.l lVar = new b58.l(dVar2, (d58.f) obj3, (Continuation) null);
                this.v = 1;
                Object objP2 = dVar2.p2(this, lVar);
                return objP2 == aVar16 ? aVar16 : objP2;
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.joint.impl.ui.invite_flow.d dVar3 = (com.revolut.feature.joint.impl.ui.invite_flow.d) this.f9937w;
                a2j.c cVar5 = new a2j.c(dVar3, (InvitationType) obj3, , 28);
                this.v = 1;
                Object objP22 = dVar3.p2(this, cVar5);
                return objP22 == aVar17 ? aVar17 : objP22;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.amount.c cVar6 = (com.revolut.feature_move_money.impl.amount.c) this.f9937w;
                h0 h0Var = new h0(cVar6, (oim.o) obj3, null);
                this.v = 1;
                Object objP23 = cVar6.p2(this, h0Var);
                return objP23 == aVar18 ? aVar18 : objP23;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.amount.c cVar7 = (com.revolut.feature_move_money.impl.amount.c) this.f9937w;
                i0 i0Var = new i0(cVar7, (AccountSource) obj3, null);
                this.v = 1;
                Object objP24 = cVar7.p2(this, i0Var);
                return objP24 == aVar19 ? aVar19 : objP24;
            case 15:
                com.revolut.feature_move_money.impl.amount.c cVar8 = (com.revolut.feature_move_money.impl.amount.c) obj3;
                s6i.e eVar = (s6i.e) this.f9937w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    Pair pairS2 = com.revolut.feature_move_money.impl.amount.c.S2(((b6i.h) ((j2) cVar8.Y.f22677a).getValue()).f12785c, eVar);
                    AccountWrapper accountWrapper = (AccountWrapper) pairS2.f186385a;
                    AccountWrapper accountWrapper2 = (AccountWrapper) pairS2.f186386b;
                    ae5.a aVar21 = cVar8.E;
                    accountWrapper.getCurrency();
                    accountWrapper2.getCurrency();
                    ae5.c cVar9 = ae5.c.CTA_CLICKED;
                    c8g.c.h(cVar8.Q2().f12784b);
                    this.f9937w = null;
                    this.v = 1;
                    if (aVar21.b3() == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.giro.impl.ui.form.b bVar5 = (com.revolut.feature.giro.impl.ui.form.b) this.f9937w;
                com.revolut.feature.giro.impl.ui.form.a aVar23 = new com.revolut.feature.giro.impl.ui.form.a(bVar5, (FormState) obj3, null);
                this.v = 1;
                Object objB0 = u0.b0(bVar5.X(), "BUTTON_LOADING_TAG", aVar23, this);
                return objB0 == aVar22 ? aVar22 : objB0;
            case 17:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                h6i.o oVar = ((b7i.f) this.f9937w).f13048b;
                BalanceWrapper balanceWrapper = (BalanceWrapper) obj3;
                String str4 = balanceWrapper.f99404a;
                k1j.a f99407g = balanceWrapper.getF99407g();
                this.v = 1;
                Object objE2 = oVar.e(this, str4, f99407g);
                return objE2 == aVar24 ? aVar24 : objE2;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b88.n nVar = (b88.n) this.f9937w;
                b88.k kVar = new b88.k(nVar, (String) obj3, , i2);
                this.v = 1;
                Object objB2 = pu7.a.B(nVar.k, "NAVIGATE_TO_SAVING_CREATION", kVar, this);
                return objB2 == aVar25 ? aVar25 : objB2;
            case 19:
                ep6.m mVar3 = (ep6.m) this.f9937w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    if (mVar3 instanceof ep6.i) {
                        this.f9937w = null;
                        this.v = 1;
                        if (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.y2((com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) obj3, this) == aVar26) {
                            return aVar26;
                        }
                    } else if (!(mVar3 instanceof ep6.j) && !(mVar3 instanceof ep6.l) && !(mVar3 instanceof ep6.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar10 = (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) this.f9937w;
                    x xVar2 = cVar10.f86237q;
                    String str5 = (String) obj3;
                    String strA = cVar10.f86238r.a(str5, xVar2.y1(str5));
                    this.v = 1;
                    if (gc0.c.m(xVar2, strA, "FaqArticleScreenModel", this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    p9d.e eVar2 = ((com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) this.f9937w).f86239s;
                    FaqAction faqAction = (FaqAction) obj3;
                    this.v = 1;
                    x xVar3 = eVar2.f234296a;
                    String str6 = faqAction.f51418c;
                    String str7 = faqAction.f51417b;
                    Pair pair = (str6 == null || kotlin.text.d0.W(str6) || !xVar3.y1(str6)) ? new Pair(str7, Boolean.valueOf(str7 != null ? xVar3.y1(str7) : false)) : new Pair(str6, Boolean.TRUE);
                    Object objM = gc0.c.m(xVar3, eVar2.f234297b.a((String) pair.f186385a, ((Boolean) pair.f186386b).booleanValue()), "FaqArticleScreenModel", this);
                    Object obj4 = objM;
                    if (objM != aVar28) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a aVar30 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) this.f9937w;
                    s sVar = new s(aVar30, (qu3.a) obj3, (Continuation) null, 12);
                    this.v = 1;
                    if (u0.b0(aVar30.X(), "LOADING_TAG_ADD_DEBT", sVar, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a aVar32 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) this.f9937w;
                    b94.s sVar2 = new b94.s(aVar32, (qu3.n) obj3, , z ? 1 : 0);
                    this.v = 1;
                    if (u0.b0(aVar32.X(), "LOADING_TAG_ADD_DEBT", sVar2, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (gc0.c.m(((b9d.n) this.f9937w).f13726p, (String) obj3, "CardTroubleshooterScreenModel", this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar35 = (com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) this.f9937w;
                ba4.u uVar2 = new ba4.u(aVar35, (File) obj3, , i2);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar35.k, "addDocument", uVar2, this);
                return objB3 == aVar34 ? aVar34 : objB3;
            case 26:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar37 = (com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) this.f9937w;
                b94.s sVar3 = new b94.s(aVar37, (String) obj3, , i2);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar37.k, "download pdf", sVar3, this);
                return objB4 == aVar36 ? aVar36 : objB4;
            case 27:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar39 = (com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) this.f9937w;
                z zVar = new z(aVar39, (ry3.a) obj3, , i2);
                this.v = 1;
                Object objB5 = pu7.a.B(aVar39.k, "removeDocument", zVar, this);
                return objB5 == aVar38 ? aVar38 : objB5;
            case 28:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    r rVarB = pre.c.b(((com.revolut.feature_retail_user_declarations.bank_terms.a) this.f9937w).f97488p, ((Terms) obj3).f90355a);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                bd2.e eVar3 = (bd2.e) obj3;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    String str8 = (String) this.f9937w;
                    String strE = str8 != null ? ((s06.c) eVar3.f14521b).e(str8) : null;
                    IDealService iDealService = eVar3.f14520a;
                    this.v = 1;
                    availablePockets = iDealService.getAvailablePockets(strE, this);
                    if (availablePockets == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    availablePockets = obj2;
                }
                cd2.a aVar42 = (cd2.a) availablePockets;
                Intrinsics.checkNotNullParameter(aVar42, "<this>");
                List<a.C0144a> eligiblePocketDtos = aVar42.getEligiblePocketDtos();
                ArrayList arrayList = new ArrayList(w.t(eligiblePocketDtos, 10));
                for (a.C0144a c0144a : eligiblePocketDtos) {
                    Intrinsics.checkNotNullParameter(c0144a, "<this>");
                    String type = c0144a.getType();
                    int iHashCode = type.hashCode();
                    if (iHashCode == -1881086717) {
                        if (!type.equals("RETAIL")) {
                            throw new IllegalArgumentException("Unknown pocket type ".concat(type));
                        }
                        bVar = g02.b.RETAIL;
                        arrayList.add(new g02.a(bVar, c0144a.getId(), c0144a.getIban()));
                    } else if (iHashCode != -364204096) {
                        if (iHashCode != 70766698 || !type.equals("JOINT")) {
                            throw new IllegalArgumentException("Unknown pocket type ".concat(type));
                        }
                        bVar = g02.b.JOINT;
                        arrayList.add(new g02.a(bVar, c0144a.getId(), c0144a.getIban()));
                    } else {
                        if (!type.equals("BUSINESS")) {
                            throw new IllegalArgumentException("Unknown pocket type ".concat(type));
                        }
                        bVar = g02.b.BUSINESS;
                        arrayList.add(new g02.a(bVar, c0144a.getId(), c0144a.getIban()));
                    }
                }
                return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9938x = obj2;
    }
}
