package x97;

import akg.n;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import g48.r0;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l93.f;
import o97.f0;
import o97.h0;
import o97.r;
import o97.v;
import org.jetbrains.annotations.NotNull;
import pi3.s;
import te0.w;
import ti9.h;
import zhm.d0;
import zhm.u;
import zjh.j;
import zsc.g;
import zsc.l;
import zsc.m;
import zsc.p;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements z87.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f303589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt8.d f303590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sh3.a f303591c;
    public final xh9.a d;
    public final j e;
    public final r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f303592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final eli.j f303593h;
    public final v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f303594j;
    public final v k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.b f303595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f303596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Flow f303597n;
    public final r o;

    public e(f cardsInteractor, mt8.d kycInteractor, sh3.a checkoutInteractor, xh9.a payLaterInteractor, j revolutPayCardInteractor, h payLaterProductFeatureTogglesInteractor, r0 jointAccountsInteractor, f01.c uiKitResources, a mapper, eli.j twoFaErrorHandler) {
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(revolutPayCardInteractor, "revolutPayCardInteractor");
        Intrinsics.checkNotNullParameter(payLaterProductFeatureTogglesInteractor, "payLaterProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        this.f303589a = cardsInteractor;
        this.f303590b = kycInteractor;
        this.f303591c = checkoutInteractor;
        this.d = payLaterInteractor;
        this.e = revolutPayCardInteractor;
        this.f = jointAccountsInteractor;
        this.f303592g = mapper;
        this.f303593h = twoFaErrorHandler;
        Continuation continuation = null;
        this.i = new v(new TextLocalisedClause(R$string.search_block_card_action_details, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "view_details_unmasked");
        this.f303594j = new v(new TextLocalisedClause(R$string.search_block_card_action_freeze, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_snowflake, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "freeze");
        this.k = new v(new TextLocalisedClause(R$string.search_block_card_action_unfreeze, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_snowflake, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "unfreeze");
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f303595l = bVarE;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        oy9.d dVar = new oy9.d(uiKitResources, 3);
        p pVar = p.WORD_PREFIX;
        Pair pair = new Pair(dVar, pVar);
        aim.e eVarB = u.b();
        eVarB.add(Integer.valueOf(R$string.search_block_discover_cards_title));
        if (revolutPayCardInteractor.o(b93.d.ALL) != null) {
            eVarB.add(Integer.valueOf(R$string.search_block_wallet_title));
        }
        Unit unit = Unit.f186387a;
        int[] iArrC1 = d0.c1(u.a(eVarB));
        this.f303596m = new g(new zsc.h(pair, new Pair(tz4.d.a(uiKitResources, Arrays.copyOf(iArrC1, iArrC1.length)), pVar)), new zsc.h(new Pair(new btc.a(uiKitResources), pVar)));
        this.f303597n = xam.a.h(new rf9.h(continuation, this, 20), payLaterProductFeatureTogglesInteractor.j());
        this.o = r.CARDS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        m.Companion.getClass();
        m mVarA = l.a(searchQuery);
        n nVarC = this.f.c();
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarFlatMap = m70.a.f(rd0.e.c(nVarC, gVar), new x0b.h(4), new x48.a(21), new x48.a(22)).flatMap(new x8i.g(28, new x8h.d(this, 15)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        efm.r map = w.o(rVarFlatMap, m70.a.g(this.f303590b.a(false), null, new x48.a(17), 1), m70.a.g(sh3.a.c(this.f303591c, u.c(s.CARD), null, null, 6), null, new x48.a(19), 1), m70.a.g(rd0.e.c(this.f303597n, gVar), null, new x48.a(20), 1), this.f303595l).distinctUntilChanged().map(new x8i.g(27, new x52.a(this, mVarA, 16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ue0.e.E(map, zi0.c.P(zhm.v.k(new f0(a.a(this.e.o(b93.d.ALL) != null), "REVOLUT_CARD_SECTION"), h0.f223107a), false, null, 3));
    }

    @Override // z87.f
    public final r h() {
        return this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (nim.a.b(r14, r0) == r1) goto L59;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r13, o97.y r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x97.e.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
