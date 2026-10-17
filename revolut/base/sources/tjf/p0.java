package tjf;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.pay.PayClient;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreen;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import d9.e1;
import elf.r1;
import ip0.tm0;
import ip0.um0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.u1;
import nii.y0;
import tof.i7;
import ts6.t0;
import ts6.w0;
import ts6.z0;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f271689w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f271689w = obj2;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            u1m.o oVar = (u1m.o) this.f271689w;
            x2m.c cVar = new x2m.c("", x2m.d.ERROR, zhm.f0.f322471a, x2m.a.UNKNOWN_ERROR);
            this.v = 1;
            if (oVar.d(cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p0((q0) this.f271689w, continuation, 0);
            case 1:
                return new p0((tjh.h0) this.f271689w, continuation, 1);
            case 2:
                return new p0((tlg.h) this.f271689w, continuation, 2);
            case 3:
                return new p0((tm1.h) this.f271689w, continuation, 3);
            case 4:
                return new p0((com.revolut.feature.junior_rewards.impl.ui.list.a) this.f271689w, continuation, 4);
            case 5:
                return new p0((to2.m) this.f271689w, continuation, 5);
            case 6:
                return new p0((com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b) this.f271689w, continuation, 6);
            case 7:
                return new p0((com.revolut.feature.wealth_discovery.impl.screener.screens.collection.a) this.f271689w, continuation, 7);
            case 8:
                return new p0((tpl.s) this.f271689w, continuation, 8);
            case 9:
                return new p0((z0) this.f271689w, continuation, 9);
            case 10:
                return new p0((com.revolut.feature.insurance_credit.impl.ui.screen.details.b) this.f271689w, continuation, 10);
            case 11:
                return new p0((tta.b) this.f271689w, continuation, 11);
            case 12:
                return new p0((ttl.x) this.f271689w, continuation, 12);
            case 13:
                return new p0((tu2.h) this.f271689w, continuation, 13);
            case 14:
                return new p0((com.revolut.feature.security_hub.impl.ui.linked_wallet_details.a) this.f271689w, continuation, 14);
            case 15:
                return new p0((AttributesScreen) this.f271689w, continuation, 15);
            case 16:
                return new p0((tv4.o) this.f271689w, continuation, 16);
            case 17:
                return new p0((tv7.j) this.f271689w, continuation, 17);
            case 18:
                return new p0((tw0.r) this.f271689w, continuation, 18);
            case 19:
                return new p0((tw9.i) this.f271689w, continuation, 19);
            case 20:
                return new p0((com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) this.f271689w, continuation, 20);
            case 21:
                return new p0((WallpaperAssetSwitcher) this.f271689w, continuation, 21);
            case 22:
                return new p0((tyj.j) this.f271689w, continuation, 22);
            case 23:
                return new p0((u1k.j) this.f271689w, continuation, 23);
            case 24:
                return new p0((u1m.o) this.f271689w, continuation, 24);
            case 25:
                return new p0((u2i.h) this.f271689w, continuation, 25);
            case 26:
                return new p0((com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a) this.f271689w, continuation, 26);
            case 27:
                return new p0((u65.i) this.f271689w, continuation, 27);
            case 28:
                return new p0((u6b.l) this.f271689w, continuation, 28);
            default:
                return new p0((u6f.g) this.f271689w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objA;
        Object objV;
        Object objA2;
        Collection collection;
        ScreenerCollection screenerCollection;
        uqh.t tVar;
        Object objB;
        rp0.y yVar;
        Object objB2;
        String str;
        Object objJ;
        Object objP2;
        int i = this.u;
        int i2 = 25;
        int i3 = 4;
        int i5 = 18;
        int i6 = 10;
        int i21 = 12;
        int i22 = 3;
        int i32 = 23;
        int i33 = 14;
        int i43 = 0;
        r0i.a aVar = null;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        boolean z41 = false;
        boolean z49 = false;
        boolean z54 = false;
        boolean z74 = false;
        boolean z83 = false;
        boolean z89 = false;
        Object obj3 = this.f271689w;
        int i59 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mhf.j jVar = ((q0) obj3).d;
                this.v = 1;
                Object objE = ((mjf.k0) jVar).e(this);
                return objE == aVar2 ? aVar2 : objE;
            case 1:
                tjh.h0 h0Var = (tjh.h0) obj3;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    nlh.b bVar = h0Var.f271739w;
                    sih.b bVar2 = sih.b.COMMODITIES;
                    this.v = 1;
                    bVar.getClass();
                    objA = nlh.b.a(bVar2);
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                KompotDestination kompotDestination = (KompotDestination) objA;
                if (kompotDestination == null) {
                    return null;
                }
                tjh.h hVar = tjh.h0.Companion;
                return h0Var.A2(kompotDestination);
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    tlg.h hVar2 = (tlg.h) obj3;
                    sb4.i iVar = new sb4.i(hVar2, z ? 1 : 0, i2);
                    this.v = 1;
                    if (u0.b0(hVar2.X(), "ADDRESS_CONFIRMATION_BUTTON_TAG", iVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                tm1.h hVar3 = (tm1.h) obj3;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    ku1.v vVar = new ku1.v(i32);
                    su4.n nVar = new su4.n(hVar3, z3 ? 1 : 0, i21);
                    this.v = 1;
                    objV = n14.k.V(hVar3, null, null, vVar, nVar, this, 3);
                    if (objV == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objV = obj2;
                }
                if (((nii.h) objV) instanceof nii.g) {
                    hVar3.B2();
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.junior_rewards.impl.ui.list.a aVar7 = (com.revolut.feature.junior_rewards.impl.ui.list.a) obj3;
                    su4.n nVar2 = new su4.n(aVar7, z4 ? 1 : 0, 13);
                    this.v = 1;
                    if (aVar7.p2(this, nVar2) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                to2.m mVar = (to2.m) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    vo2.e eVar = mVar.o;
                    this.v = 1;
                    objA2 = eVar.a(this);
                    if (objA2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                Data data = (Data) objA2;
                if (data.getError() == null && ((collection = (Collection) data.getContent()) == null || collection.isEmpty())) {
                    mVar.C2(to2.i.f272502a);
                } else {
                    mVar.H2(mVar.f272507p, new tb6.x(data, i6));
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b bVar3 = (com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b) obj3;
                    com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.a aVar10 = new com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.a(bVar3, null);
                    this.v = 1;
                    if (u0.c0(bVar3, "TAG_QR_CODE_INSTRUCTION_BUTTON", aVar10, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                com.revolut.feature.wealth_discovery.impl.screener.screens.collection.a aVar11 = (com.revolut.feature.wealth_discovery.impl.screener.screens.collection.a) obj3;
                cli.y yVar2 = aVar11.u;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    Data data2 = ((tph.f) ((j2) yVar2.f22677a).getValue()).f273379b;
                    if (data2 == null || (screenerCollection = (ScreenerCollection) data2.getContent()) == null) {
                        return Unit.f186387a;
                    }
                    uqh.z zVar = ((tph.f) ((j2) yVar2.f22677a).getValue()).f273378a;
                    if (zVar == null || (tVar = zVar.f282183a) == null) {
                        return Unit.f186387a;
                    }
                    uqh.z zVar2 = ((tph.f) ((j2) yVar2.f22677a).getValue()).f273378a;
                    ScreenerSortingOptions screenerSortingOptions = zVar2 != null ? zVar2.e : null;
                    ugl.c cVar = aVar11.f96228p;
                    String str2 = screenerCollection.f105154a;
                    String str3 = screenerCollection.f105156c;
                    String str4 = screenerCollection.f105155b;
                    List list = tVar.f282176b;
                    ArrayList arrayList = screenerCollection.f105157g;
                    ScreenerSortingOptions screenerSortingOptions2 = screenerSortingOptions != null ? new ScreenerSortingOptions(zhm.f0.f322471a, screenerSortingOptions.f105173b, screenerSortingOptions.f105174c) : null;
                    this.v = 1;
                    if (((yhl.f) cVar).d(str2, str3, str4, list, arrayList, screenerSortingOptions2, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yji.l.b1(aVar11, aVar11.X1(new mii.k("collection_updated_toast", new TextLocalisedClause(R$string.screener_collection_updated_message, null, null, 14), null, null, null, 28)), null, null, 7);
                aVar11.C2(tph.g.f273381a);
                return Unit.f186387a;
            case 8:
                tpl.s sVar = (tpl.s) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    cjl.s sVar2 = cjl.s.REGIONAL;
                    bjl.o0 o0Var = sVar.f273435s;
                    tpl.q qVar = new tpl.q(sVar, z6 ? 1 : 0, i59);
                    th9.t tVar2 = new th9.t(sVar, 11);
                    tl7.a aVar14 = new tl7.a(i21);
                    this.v = 1;
                    if (e1.f0(sVar, sVar2, o0Var, qVar, tVar2, aVar14, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    z0 z0Var = (z0) obj3;
                    this.v = 1;
                    j2 j2Var = ((l1b.g) z0Var.d).f191522j;
                    q06.d dVar = z0Var.f274040c;
                    t0 t0Var = z0Var.e;
                    Object objCollect = j2Var.collect(new eg.n0(new sij.c(new w0(new w0(new r1(z0Var.f, i22), t0Var, 1), t0Var, 0), dVar, 21), 7), this);
                    if (objCollect != aVar15) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar15) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar15) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar15) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar15) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.insurance_credit.impl.ui.screen.details.b bVar4 = (com.revolut.feature.insurance_credit.impl.ui.screen.details.b) obj3;
                    ys7.h hVar4 = bVar4.f75837p;
                    String str5 = bVar4.o.f75832a;
                    this.v = 1;
                    if (hVar4.b(str5, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                try {
                    if (i106 == 0) {
                        yhm.o.b(obj2);
                        tul.b bVar5 = (tul.b) ((tta.b) obj3).f274296a.invoke();
                        pfm.a aVar18 = new pfm.a(((aua.f) bVar5.f274637b).b(), new yta.c(i43, new yo7.p(bVar5, i2)), i3);
                        Intrinsics.checkNotNullExpressionValue(aVar18, "flatMapCompletable(...)");
                        this.v = 1;
                        if (nim.a.a(aVar18, this) == aVar17) {
                            return aVar17;
                        }
                    } else {
                        if (i106 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    break;
                } catch (Exception e) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "AppRatingKompotSuccessDialogCallbacks", "Failed to increment success screen counter", e, h0Var2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ttl.x xVar = (ttl.x) obj3;
                s15.j jVar2 = new s15.j((Object) xVar, (Continuation) (z11 ? 1 : 0), i33);
                this.v = 1;
                Object objB3 = pu7.a.B(xVar.k, "on_next_button_click", jVar2, this);
                return objB3 == aVar19 ? aVar19 : objB3;
            case 13:
                tu2.h hVar5 = (tu2.h) obj3;
                CardTerminateScreenContract$InputData cardTerminateScreenContract$InputData = hVar5.f274524p;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    ufm.b bVarD = ((ha3.x) hVar5.f274525q).D(cardTerminateScreenContract$InputData.f64388a);
                    this.v = 1;
                    objB = nim.a.b(bVarD, this);
                    if (objB == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                h93.f0 card = (h93.f0) objB;
                hVar5.x2(new avc.o(card, 22));
                if (card.f == h93.r.TERMINATED) {
                    hVar5.v2(new tu2.c(card));
                } else {
                    j60.a aVar21 = hVar5.f274526r;
                    pu2.d dVar2 = hVar5.f274527s;
                    su2.b reasonType = cardTerminateScreenContract$InputData.f64389b;
                    ((pu2.e) dVar2).getClass();
                    Intrinsics.checkNotNullParameter(reasonType, "reasonType");
                    Intrinsics.checkNotNullParameter(card, "card");
                    int i109 = pu2.f.f239806a[reasonType.ordinal()];
                    if (i109 == 1) {
                        rp0.t tVar3 = new rp0.t(new TextLocalisedClause(com.revolut.feature.card.terminate.impl.R$string.card_terminate_terminate_ato_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.card.terminate.impl.R$string.card_terminate_terminate_ato_dialog_subtitle, null, null, 14), null, 28);
                        rp0.l lVar = rp0.l.WINDOW;
                        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ACTION_CONFIRM_FRAUD", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.card.terminate.impl.R$string.card_terminate_terminate_ato_dialog_button_title, null, null, 14), false, null, null, card, null, 744);
                        int i110 = R$attr.uikit_dp24;
                        int i111 = R$attr.uikit_dp16;
                        yp0.b.l(model, i110, i110, i111, i111, null, false, 48);
                        yVar = new rp0.y(zhm.u.c(model), tVar3, lVar, null, null, null, 1016);
                    } else {
                        if (i109 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.card.terminate.impl.R$string.card_terminate_terminate_dialog_title, null, null, 14);
                        int i112 = com.revolut.feature.card.terminate.impl.R$string.card_terminate_terminate_dialog_subtitle;
                        String str6 = card.f150115j;
                        if (str6 == null) {
                            m70.a.c(kotlin.jvm.internal.t0.f186434a);
                            str6 = "";
                        }
                        String str7 = null;
                        yVar = new rp0.y(zhm.u.c(new um0("VIEW_ID_OTHER_CONFIRM_DIALOG", new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.card.terminate.impl.R$string.card_terminate_action_confirm, null, null, 14), false, null, str7, 56), new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.feature.card.terminate.impl.R$string.card_terminate_action_cancel, null, null, 14), false, str7, null, 56), (Object) card, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new rp0.t(textLocalisedClause, new TextLocalisedClause(i112, zhm.u.c(new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, 1016);
                    }
                    aVar21.x(yVar);
                }
                return Unit.f186387a;
            case 14:
                com.revolut.feature.security_hub.impl.ui.linked_wallet_details.a aVar22 = (com.revolut.feature.security_hub.impl.ui.linked_wallet_details.a) obj3;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    wtc.h hVar6 = aVar22.f85598r;
                    String str8 = aVar22.o.f85592b.f85395a;
                    this.v = 1;
                    cuc.d dVar3 = hVar6.f299872a;
                    dVar3.getClass();
                    cuc.b bVar6 = new cuc.b(dVar3, str8, z12 ? 1 : 0, i43);
                    skm.p0 p0Var = skm.p0.f264001a;
                    Object objJ2 = skm.e0.J(elm.f.f127540b, bVar6, this);
                    Object obj4 = objJ2;
                    if (objJ2 != aVar23) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 != aVar23) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar22.C2(tuc.i.f274578a);
                return Unit.f186387a;
            case 15:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    tuk.i iVar2 = (tuk.i) ((AttributesScreen) obj3).c0.getValue();
                    this.v = 1;
                    ((tuk.n) iVar2).u2();
                    if (Unit.f186387a == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                tv4.o oVar = (tv4.o) obj3;
                su4.n nVar3 = new su4.n(oVar, z29 ? 1 : 0, i33);
                this.v = 1;
                Object objB4 = pu7.a.B(oVar.k, "Reload transactions", nVar3, this);
                return objB4 == aVar25 ? aVar25 : objB4;
            case 17:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    tv7.j jVar3 = (tv7.j) obj3;
                    mu7.c cVar2 = jVar3.f274728s;
                    String str9 = jVar3.o.f76127a;
                    this.v = 1;
                    if (cVar2.b(this, str9, false) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                tw0.r rVar = (tw0.r) obj3;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                try {
                    if (i117 == 0) {
                        yhm.o.b(obj2);
                        this.v = 1;
                        if (skm.k0.b(150L, this) == aVar27) {
                            return aVar27;
                        }
                    } else {
                        if (i117 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    LinkedList linkedList = rVar.e;
                    Iterator it8 = linkedList.iterator();
                    while (it8.hasNext()) {
                        ((Function0) it8.next()).invoke();
                    }
                    linkedList.clear();
                    rVar.f = false;
                    return Unit.f186387a;
                } catch (Throwable th10) {
                    rVar.f = false;
                    throw th10;
                }
            case 19:
                tw9.i iVar3 = (tw9.i) obj3;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    fi0.b bVar7 = iVar3.f274964r;
                    this.v = 1;
                    bVar7.getClass();
                    eim.c cVar3 = new eim.c(fim.h.b(this));
                    ((PayClient) bVar7.f135282a.getValue()).getPayApiAvailabilityStatus(2).addOnSuccessListener(new i4b.f(new fi0.a(cVar3, 0))).addOnFailureListener(new zjh.j(cVar3));
                    objB2 = cVar3.b();
                    if (objB2 == aVar28) {
                        Intrinsics.checkNotNullParameter(this, "frame");
                    }
                    if (objB2 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                iVar3.H2(iVar3.f274966t, new rk.b(((Boolean) objB2).booleanValue(), i5));
                return Unit.f186387a;
            case 20:
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar29 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) obj3;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarE = ((nyb.o) aVar29.u).e(false);
                    ts5.o oVar2 = new ts5.o(15, new twb.t(aVar29, i22));
                    d0VarE.getClass();
                    ufm.i iVar4 = new ufm.i(d0VarE, oVar2, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                    this.v = 1;
                    if (nim.a.b(iVar4, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                WallpaperAssetSwitcher wallpaperAssetSwitcher = (WallpaperAssetSwitcher) obj3;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                try {
                } catch (Exception e2) {
                    if (e2 instanceof CancellationException) {
                        throw e2;
                    }
                    skm.p0 p0Var2 = skm.p0.f264001a;
                    tkm.e eVar2 = zkm.o.f323119a;
                    tk5.c cVar4 = new tk5.c(wallpaperAssetSwitcher, z31 ? 1 : 0, i32);
                    this.v = 2;
                    if (skm.e0.J(eVar2, cVar4, this) == aVar31) {
                        return aVar31;
                    }
                }
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    Bitmap bitmapG = wallpaperAssetSwitcher.f59491a.g(null);
                    if (bitmapG != null) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(wallpaperAssetSwitcher.getContext().getResources(), bitmapG);
                        NavBarWithContainerBackground currentBackground = wallpaperAssetSwitcher.getCurrentBackground();
                        this.v = 1;
                        if (WallpaperAssetSwitcher.c(wallpaperAssetSwitcher, bitmapDrawable, currentBackground, this) == aVar31) {
                            return aVar31;
                        }
                    }
                } else {
                    if (i120 != 1) {
                        if (i120 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                tyj.j jVar4 = (tyj.j) obj3;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    v0b.b bVarH = ta6.a.h(rd0.e.b(jVar4.f275677q.f139378a.d.f(Unit.f186387a, true)), rd0.e.b(osg.b.d(jVar4.f275678r)), rd0.e.b(whf.b.a(jVar4.f275676p, te0.w.h(i7.q.f272823a), null, null, null, 14)), new b1c.o(i3, i22, z41 ? 1 : 0));
                    blj.t tVar4 = new blj.t(jVar4, 24);
                    this.v = 1;
                    if (bVarH.collect(tVar4, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i121 != 1) {
                        if (i121 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                j61.b bVar8 = jVar4.f275679s;
                pfm.a aVarE = j61.b.c(bVar8).e(j61.b.b(bVar8));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                Object objA3 = nim.a.a(ue0.e.v(aVarE), this);
                Object obj5 = objA3;
                if (objA3 != aVar32) {
                    obj5 = Unit.f186387a;
                }
                if (obj5 == aVar32) {
                    return aVar32;
                }
                return Unit.f186387a;
            case 23:
                u1k.j jVar5 = (u1k.j) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    pcd.s sVar3 = (pcd.s) ((u1k.e) jVar5.t2()).f276419a.getContent();
                    if (sVar3 == null || (str = sVar3.f234881a) == null) {
                        throw new RuntimeException("VaultId should be available here");
                    }
                    dj0.d dVar4 = ((u1k.e) jVar5.t2()).f276420b;
                    if (dVar4 == null) {
                        throw new RuntimeException("WithdrawAmount should be available here");
                    }
                    u1k.i iVar5 = new u1k.i(jVar5, dVar4, str, null, 1);
                    this.v = 1;
                    if (jVar5.p2(this, iVar5) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                return b(obj2);
            case 25:
                u2i.h hVar7 = (u2i.h) obj3;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 == 0) {
                    yhm.o.b(obj2);
                    c1i.g gVar = hVar7.i;
                    this.v = 1;
                    gVar.getClass();
                    brc.h hVar8 = new brc.h(gVar, z49 ? 1 : 0, i32);
                    skm.p0 p0Var3 = skm.p0.f264001a;
                    objJ = skm.e0.J(elm.f.f127540b, hVar8, this);
                    if (objJ == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                r0i.a aVar35 = (r0i.a) objJ;
                if (aVar35 != null) {
                    hVar7.o = aVar35;
                    aVar = aVar35;
                }
                od0.i.Companion.getClass();
                return od0.h.a(aVar);
            case 26:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i124 = this.v;
                if (i124 != 0) {
                    if (i124 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar37 = (com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a) obj3;
                u37.s sVar4 = new u37.s(aVar37, z54 ? 1 : 0, i59);
                this.v = 1;
                Object objB0 = u0.b0(aVar37.X(), "BUTTON_TAG_CREATE_TAX_PROFILE", sVar4, this);
                return objB0 == aVar36 ? aVar36 : objB0;
            case 27:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i125 = this.v;
                if (i125 == 0) {
                    yhm.o.b(obj2);
                    u65.i iVar6 = (u65.i) obj3;
                    su4.n nVar4 = new su4.n(iVar6, z74 ? 1 : 0, i5);
                    this.v = 1;
                    if (iVar6.p2(this, nVar4) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i125 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                u6b.l lVar2 = (u6b.l) obj3;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i126 = this.v;
                if (i126 == 0) {
                    yhm.o.b(obj2);
                    su4.n nVar5 = new su4.n(lVar2, z83 ? 1 : 0, 19);
                    this.v = 1;
                    objP2 = lVar2.p2(this, nVar5);
                    if (objP2 == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i126 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                r5b.h result = (r5b.h) objP2;
                lVar2.f277537p.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                TextClause textClause = new TextClause(result.f251571a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str10 = result.f251572b;
                return yji.l.a1(lVar2, lVar2.X1(new y0(null, new nii.j0((Clause) textClause, (Clause) (str10 != null ? new TextClause(str10, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new u07.b(lVar2, z89 ? 1 : 0, i6), 3);
            default:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i127 = this.v;
                if (i127 == 0) {
                    yhm.o.b(obj2);
                    f9i.c cVar5 = new f9i.c(new f9i.e("https://cdn.revolut.com/legal/terms/RSE-ex-ante-costs-report.pdf", false));
                    this.v = 1;
                    if (((u6f.g) obj3).G1(cVar5, this) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i127 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
