package o3d;

import a83.o0;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import hy1.b0;
import java.util.List;
import jid.z;
import kkf.x5;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l3d.h0;
import l3d.r;
import lhk.a0;
import mii.k;
import mtj.i;
import n1g.p;
import n4d.m0;
import n4d.r0;
import nuh.j;
import te0.w;
import vkm.q;
import yji.n;
import zhm.d0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends u1d.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z f221793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f221794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n3d.e f221795n;
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f221796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ghd.a f221797q;

    public e(z presentationModel, n3d.e shotDialogMapper, j60.a bottomExpandableDialog, TwinHorizontalButtonDelegate twinHorizontalButtonDelegate, ghd.a sharedSeparateFavouritesDialogsFactory) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter("COMBINED_WATCHLIST_ORDERING_HOME", "combinedWatchlistOrderingKey");
        Intrinsics.checkNotNullParameter(shotDialogMapper, "shotDialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(twinHorizontalButtonDelegate, "twinHorizontalButtonDelegate");
        Intrinsics.checkNotNullParameter(sharedSeparateFavouritesDialogsFactory, "sharedSeparateFavouritesDialogsFactory");
        this.f221793l = presentationModel;
        this.f221794m = "COMBINED_WATCHLIST_ORDERING_HOME";
        this.f221795n = shotDialogMapper;
        this.o = bottomExpandableDialog;
        this.f221796p = twinHorizontalButtonDelegate;
        this.f221797q = sharedSeparateFavouritesDialogsFactory;
    }

    @Override // yji.n
    public final void D2() {
        this.o.d(u.c(this.f221796p));
    }

    @Override // yji.n
    public final void H2() {
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f221796p;
        n.l2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new j(this, null, 13), 3);
        n.l2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new a(this, null), 3);
    }

    @Override // u1d.a
    public final Unit Z2(FavouritesAssetTypeKey assetTypeKey, Pair pair) {
        z zVar = this.f221793l;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(assetTypeKey, "typeKey");
        h0 h0Var = (h0) zVar.f174461b;
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        r0 r0Var = h0Var.f191909a;
        x5 x5Var = new x5(r0Var.g(u.c(assetTypeKey), false), 24);
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        List assetTypeKeys = u.c(assetTypeKey);
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Continuation continuation = null;
        n.l2(this, q.P(mo3.a.g(rd0.e.b(rd0.e.c(new t38.e(x5Var, 24, new b0(rd0.e.b(r0Var.f212402l.f(d0.P0(assetTypeKeys, new m0()), false)), h0Var, assetTypeKey, 20), new o0(3, 15, continuation)), g.f186406a)), null, null, 3), 1), null, new i(this, assetTypeKey, pair, continuation, 26), 3);
        return Unit.f186387a;
    }

    @Override // u1d.a
    public final Object b3(FavouritesAssetTypeKey typeKey, Pair item, gim.i iVar) {
        z zVar = this.f221793l;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        r rVar = (r) zVar.f174462c;
        Flow flowF = rVar.f(y0.b(typeKey));
        g gVar = g.f186406a;
        efm.r rVarC = rd0.e.c(flowF, gVar);
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(item, "item");
        efm.d0 d0VarFirstOrError = m70.a.g(kli.a.h(rVarC, rd0.e.c(rVar.e(typeKey, item), gVar)), null, new nz7.g(23), 1).firstOrError();
        o28.g gVar2 = new o28.g(new neg.q(this, 19, typeKey, item), 15);
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, gVar2, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        Object objA = nim.a.a(aVar, iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // u1d.a
    public final akg.n c3(FavouritesAssetTypeKey typeKey, Pair item) {
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(item, "asset");
        z zVar = this.f221793l;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(item, "item");
        return nim.a.v(rd0.e.b(rd0.e.c(((r) zVar.f174462c).e(typeKey, item), g.f186406a)), new o2g.f(8));
    }

    @Override // u1d.a
    public final vkm.d d3(FavouritesAssetTypeKey typeKey, String assetId) {
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        z zVar = this.f221793l;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        return rd0.e.b(w.a0(rd0.e.c(((h0) zVar.f174461b).e(typeKey, assetId), g.f186406a), new o2g.f(6)));
    }

    @Override // u1d.a
    public final vkm.d e3(FavouritesAssetTypeKey assetTypeKey, Pair item) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "typeKey");
        Intrinsics.checkNotNullParameter(item, "item");
        z zVar = this.f221793l;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(assetTypeKey, "typeKey");
        Intrinsics.checkNotNullParameter(item, "item");
        h0 h0Var = (h0) zVar.f174461b;
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(item, "item");
        r0 r0Var = h0Var.f191909a;
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(item, "item");
        return rd0.e.b(w.a0(rd0.e.c(new p(r0Var.g(u.c(assetTypeKey), false), item, 5), g.f186406a), new o2g.f(7)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // u1d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r11, kotlin.Pair r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof o3d.c
            if (r0 == 0) goto L13
            r0 = r13
            o3d.c r0 = (o3d.c) r0
            int r1 = r0.f221789w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221789w = r1
            goto L18
        L13:
            o3d.c r0 = new o3d.c
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221789w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L59
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            jid.z r5 = r10.f221793l
            r5.getClass()
            java.lang.String r13 = "typeKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            java.lang.String r13 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            p3d.a r4 = new p3d.a
            r9 = 1
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            kotlin.coroutines.g r11 = kotlin.coroutines.g.f186406a
            pfm.h r11 = pd.b.n(r11, r4)
            r0.f221789w = r3
            java.lang.Object r11 = nim.a.a(r11, r0)
            if (r11 != r1) goto L59
            return r1
        L59:
            mii.k r2 = new mii.k
            n3d.e r11 = r10.f221795n
            java.lang.String r3 = r11.f211987c
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = r11.d
            r7 = 0
            r8 = 28
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.i3(r2)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o3d.e.f3(com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey, kotlin.Pair, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x015c, code lost:
    
        if (r1 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0173, code lost:
    
        if (Z2(r1, r3) == r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // u1d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r29, java.lang.String r30, java.lang.String r31, gim.c r32) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3d.e.g3(com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r11, java.lang.String r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof o3d.b
            if (r0 == 0) goto L13
            r0 = r13
            o3d.b r0 = (o3d.b) r0
            int r1 = r0.f221788w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221788w = r1
            goto L18
        L13:
            o3d.b r0 = new o3d.b
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221788w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L5a
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            jid.z r5 = r10.f221793l
            r5.getClass()
            java.lang.String r13 = "typeKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            java.lang.String r13 = "assetId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            oqk.i r4 = new oqk.i
            r9 = 9
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            kotlin.coroutines.g r11 = kotlin.coroutines.g.f186406a
            pfm.h r11 = pd.b.n(r11, r4)
            r0.f221788w = r3
            java.lang.Object r11 = nim.a.a(r11, r0)
            if (r11 != r1) goto L5a
            return r1
        L5a:
            mii.k r2 = new mii.k
            n3d.e r11 = r10.f221795n
            java.lang.String r3 = r11.f211987c
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = r11.d
            r7 = 0
            r8 = 28
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.i3(r2)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o3d.e.h3(com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey, java.lang.String, gim.c):java.lang.Object");
    }

    public final void i3(k kVar) {
        n.j2(this, L2(kVar), null, new a0(kVar, this, null, 29), 3);
    }
}
