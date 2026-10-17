package tx0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import aw0.x8;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import java.security.Signature;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes20.dex */
public final class z4 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f275296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f275297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f275298y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f275296w = obj3;
        this.f275297x = obj4;
        this.f275298y = obj5;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z4(0, (WallpaperAssetSwitcher) this.v, (x8) this.f275296w, (Drawable) this.f275297x, (NavBarWithContainerBackground) this.f275298y, continuation);
            case 1:
                z4 z4Var = new z4((u29.d) this.f275296w, (y19.i) this.f275297x, (w4l.k) this.f275298y, continuation, 1);
                z4Var.v = obj2;
                return z4Var;
            case 2:
                z4 z4Var2 = new z4((upd.p) this.f275296w, (xi0.b) this.f275297x, (List) this.f275298y, continuation, 2);
                z4Var2.v = obj2;
                return z4Var2;
            case 3:
                z4 z4Var3 = new z4(continuation, (uwe.g) this.f275296w, (CheckoutScreenContract$CheckoutContent$Order) this.f275297x, (CheckoutScreenContract$CheckoutTarget) this.f275298y);
                z4Var3.v = obj2;
                return z4Var3;
            case 4:
                z4 z4Var4 = new z4((vge.t0) this.f275296w, (sfe.a) this.f275297x, (ProductId) this.f275298y, continuation, 4);
                z4Var4.v = obj2;
                return z4Var4;
            case 5:
                z4 z4Var5 = new z4((Function0) this.f275296w, (vja.d) this.f275297x, (Function0) this.f275298y, continuation, 5);
                z4Var5.v = obj2;
                return z4Var5;
            case 6:
                z4 z4Var6 = new z4((vrl.e) this.f275296w, (String) this.f275297x, (w4l.k) this.f275298y, continuation, 6);
                z4Var6.v = obj2;
                return z4Var6;
            case 7:
                z4 z4Var7 = new z4((xoc.b) this.f275296w, (uvl.c) this.f275297x, (String) this.f275298y, continuation, 7);
                z4Var7.v = obj2;
                return z4Var7;
            case 8:
                z4 z4Var8 = new z4((utk.f) this.f275296w, (String) this.f275297x, (eel.c) this.f275298y, continuation, 8);
                z4Var8.v = obj2;
                return z4Var8;
            case 9:
                return new z4(9, (String) this.v, (xkl.i) this.f275296w, (Signature) this.f275297x, (String) this.f275298y, continuation);
            case 10:
                z4 z4Var9 = new z4((xxg.m) this.f275296w, (WidgetisedAnalyticsType) this.f275297x, (vyg.a) this.f275298y, continuation, 10);
                z4Var9.v = obj2;
                return z4Var9;
            case 11:
                z4 z4Var10 = new z4((y5g.k) this.f275296w, (n7g.c) this.f275297x, (String) this.f275298y, continuation, 11);
                z4Var10.v = obj2;
                return z4Var10;
            case 12:
                return new z4(12, (com.revolut.feature.card_screen.impl.kompot.cards_list.c) this.v, (CompositeClause) this.f275296w, (h93.f0) this.f275297x, (CardsCarouselFlowDestination) this.f275298y, continuation);
            case 13:
                z4 z4Var11 = new z4((y7k.h) this.f275296w, (xge.h) this.f275297x, (xi0.b) this.f275298y, continuation, 13);
                z4Var11.v = obj2;
                return z4Var11;
            case 14:
                z4 z4Var12 = new z4((Set) this.f275296w, (ylh.t) this.f275297x, (Pair) this.f275298y, continuation, 14);
                z4Var12.v = obj2;
                return z4Var12;
            case 15:
                z4 z4Var13 = new z4((ynj.k) this.f275296w, (String) this.f275297x, (Bitmap) this.f275298y, continuation, 15);
                z4Var13.v = obj2;
                return z4Var13;
            case 16:
                z4 z4Var14 = new z4((Flow) this.f275296w, (zkh.h) this.f275297x, (n9l.b) this.f275298y, continuation, 16);
                z4Var14.v = obj2;
                return z4Var14;
            default:
                return new z4(17, (zpl.g) this.v, (jn0.b) this.f275296w, (rm0.e) this.f275297x, (String) this.f275298y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z4) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((z4) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((z4) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((z4) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((z4) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((z4) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((z4) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((z4) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((z4) create((RoboPortfolioInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((z4) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((z4) create((mwg.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((z4) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((z4) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((z4) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((z4) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((z4) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((z4) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z4) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05ab  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx0.z4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f275296w = obj2;
        this.f275297x = obj3;
        this.f275298y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(Continuation continuation, uwe.g gVar, CheckoutScreenContract$CheckoutContent$Order checkoutScreenContract$CheckoutContent$Order, CheckoutScreenContract$CheckoutTarget checkoutScreenContract$CheckoutTarget) {
        super(2, continuation);
        this.u = 3;
        this.f275296w = gVar;
        this.f275297x = checkoutScreenContract$CheckoutContent$Order;
        this.f275298y = checkoutScreenContract$CheckoutTarget;
    }
}
