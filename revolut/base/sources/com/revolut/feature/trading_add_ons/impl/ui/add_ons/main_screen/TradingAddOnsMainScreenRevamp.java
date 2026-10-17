package com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen;

import aii.q;
import android.view.View;
import au0.b1;
import au0.c1;
import au0.z0;
import aw0.d0;
import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreenRevamp;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import d83.i;
import dce.b;
import dcf.c;
import dcf.q0;
import dcf.r0;
import dcf.s0;
import dcf.t0;
import dcf.u0;
import dcf.v0;
import dcf.w0;
import dcf.y;
import dcf.z;
import h30.l;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import tx0.o2;
import ubf.f;
import vkm.d;
import z0h.s1;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/trading_add_ons/impl/ui/add_ons/main_screen/TradingAddOnsMainScreenRevamp;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ldcf/y;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lz0h/s1;", "<init>", "()V", "Companion", "a", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradingAddOnsMainScreenRevamp extends BaseRecyclerViewScreen<y, IOData$EmptyInput, q> implements s1 {

    @NotNull
    private static final a Companion = new a();
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final TextDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f91680a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f91681b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f91682d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f91683e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f91684h0;

    public static final class a {
        private a() {
        }
    }

    public TradingAddOnsMainScreenRevamp() {
        super(IOData$EmptyInput.f98299a);
        this.U = w.y0(new b(8));
        this.V = w.y0(new b(9));
        this.W = w.y0(new b(10));
        this.X = w.y0(new b(11));
        this.Y = new TextDelegate();
        final int i = 2;
        this.Z = w.y0(new Function0(this) { // from class: dcf.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreenRevamp f112953b;

            {
                this.f112953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp = this.f112953b;
                switch (i2) {
                    case 0:
                        qji.b bVarQ2 = tradingAddOnsMainScreenRevamp.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        ubf.d dVar = eVar.f278874b;
                        ubf.e eVar2 = eVar.f278875c;
                        zjh.f fVar = new zjh.f(tradingAddOnsMainScreenRevamp, 19);
                        Object value = tradingAddOnsMainScreenRevamp.f91680a0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r map = ((ActionFooterView) value).f.map(new d73.n(new dak.c(15), 22));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return new ubf.f(dVar, eVar2, fVar, rd0.e.b(map));
                    case 1:
                        return (w) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278885m.get();
                    case 2:
                        return (NavBarWithBigTile) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_navBarWithBigTile);
                    case 3:
                        return (ActionFooterView) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_actionFooterView);
                    case 4:
                        return (f) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278887p.get();
                    case 5:
                        return (c) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278886n.get();
                    default:
                        return zhm.v.k(tradingAddOnsMainScreenRevamp.h3().d, (FullScreenStateDelegate) tradingAddOnsMainScreenRevamp.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreenRevamp.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreenRevamp.W.getValue(), tradingAddOnsMainScreenRevamp.h3().f112920c, tradingAddOnsMainScreenRevamp.h3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreenRevamp.X.getValue(), tradingAddOnsMainScreenRevamp.Y);
                }
            }
        });
        final int i2 = 3;
        this.f91680a0 = w.y0(new Function0(this) { // from class: dcf.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreenRevamp f112953b;

            {
                this.f112953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp = this.f112953b;
                switch (i22) {
                    case 0:
                        qji.b bVarQ2 = tradingAddOnsMainScreenRevamp.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        ubf.d dVar = eVar.f278874b;
                        ubf.e eVar2 = eVar.f278875c;
                        zjh.f fVar = new zjh.f(tradingAddOnsMainScreenRevamp, 19);
                        Object value = tradingAddOnsMainScreenRevamp.f91680a0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r map = ((ActionFooterView) value).f.map(new d73.n(new dak.c(15), 22));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return new ubf.f(dVar, eVar2, fVar, rd0.e.b(map));
                    case 1:
                        return (w) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278885m.get();
                    case 2:
                        return (NavBarWithBigTile) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_navBarWithBigTile);
                    case 3:
                        return (ActionFooterView) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_actionFooterView);
                    case 4:
                        return (f) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278887p.get();
                    case 5:
                        return (c) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278886n.get();
                    default:
                        return zhm.v.k(tradingAddOnsMainScreenRevamp.h3().d, (FullScreenStateDelegate) tradingAddOnsMainScreenRevamp.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreenRevamp.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreenRevamp.W.getValue(), tradingAddOnsMainScreenRevamp.h3().f112920c, tradingAddOnsMainScreenRevamp.h3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreenRevamp.X.getValue(), tradingAddOnsMainScreenRevamp.Y);
                }
            }
        });
        final int i3 = 4;
        this.f91681b0 = w.y0(new Function0(this) { // from class: dcf.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreenRevamp f112953b;

            {
                this.f112953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp = this.f112953b;
                switch (i22) {
                    case 0:
                        qji.b bVarQ2 = tradingAddOnsMainScreenRevamp.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        ubf.d dVar = eVar.f278874b;
                        ubf.e eVar2 = eVar.f278875c;
                        zjh.f fVar = new zjh.f(tradingAddOnsMainScreenRevamp, 19);
                        Object value = tradingAddOnsMainScreenRevamp.f91680a0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r map = ((ActionFooterView) value).f.map(new d73.n(new dak.c(15), 22));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return new ubf.f(dVar, eVar2, fVar, rd0.e.b(map));
                    case 1:
                        return (w) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278885m.get();
                    case 2:
                        return (NavBarWithBigTile) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_navBarWithBigTile);
                    case 3:
                        return (ActionFooterView) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_actionFooterView);
                    case 4:
                        return (f) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278887p.get();
                    case 5:
                        return (c) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278886n.get();
                    default:
                        return zhm.v.k(tradingAddOnsMainScreenRevamp.h3().d, (FullScreenStateDelegate) tradingAddOnsMainScreenRevamp.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreenRevamp.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreenRevamp.W.getValue(), tradingAddOnsMainScreenRevamp.h3().f112920c, tradingAddOnsMainScreenRevamp.h3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreenRevamp.X.getValue(), tradingAddOnsMainScreenRevamp.Y);
                }
            }
        });
        final int i5 = 5;
        this.c0 = w.y0(new Function0(this) { // from class: dcf.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreenRevamp f112953b;

            {
                this.f112953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp = this.f112953b;
                switch (i22) {
                    case 0:
                        qji.b bVarQ2 = tradingAddOnsMainScreenRevamp.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        ubf.d dVar = eVar.f278874b;
                        ubf.e eVar2 = eVar.f278875c;
                        zjh.f fVar = new zjh.f(tradingAddOnsMainScreenRevamp, 19);
                        Object value = tradingAddOnsMainScreenRevamp.f91680a0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r map = ((ActionFooterView) value).f.map(new d73.n(new dak.c(15), 22));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return new ubf.f(dVar, eVar2, fVar, rd0.e.b(map));
                    case 1:
                        return (w) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278885m.get();
                    case 2:
                        return (NavBarWithBigTile) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_navBarWithBigTile);
                    case 3:
                        return (ActionFooterView) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_actionFooterView);
                    case 4:
                        return (f) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278887p.get();
                    case 5:
                        return (c) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278886n.get();
                    default:
                        return zhm.v.k(tradingAddOnsMainScreenRevamp.h3().d, (FullScreenStateDelegate) tradingAddOnsMainScreenRevamp.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreenRevamp.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreenRevamp.W.getValue(), tradingAddOnsMainScreenRevamp.h3().f112920c, tradingAddOnsMainScreenRevamp.h3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreenRevamp.X.getValue(), tradingAddOnsMainScreenRevamp.Y);
                }
            }
        });
        this.f91682d0 = R$layout.screen_recycler_navbarwithbigtile_actionfooter;
        this.f91683e0 = R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView;
        final int i6 = 6;
        this.f0 = w.y0(new Function0(this) { // from class: dcf.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreenRevamp f112953b;

            {
                this.f112953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp = this.f112953b;
                switch (i22) {
                    case 0:
                        qji.b bVarQ2 = tradingAddOnsMainScreenRevamp.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        ubf.d dVar = eVar.f278874b;
                        ubf.e eVar2 = eVar.f278875c;
                        zjh.f fVar = new zjh.f(tradingAddOnsMainScreenRevamp, 19);
                        Object value = tradingAddOnsMainScreenRevamp.f91680a0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r map = ((ActionFooterView) value).f.map(new d73.n(new dak.c(15), 22));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return new ubf.f(dVar, eVar2, fVar, rd0.e.b(map));
                    case 1:
                        return (w) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278885m.get();
                    case 2:
                        return (NavBarWithBigTile) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_navBarWithBigTile);
                    case 3:
                        return (ActionFooterView) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_actionFooterView);
                    case 4:
                        return (f) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278887p.get();
                    case 5:
                        return (c) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278886n.get();
                    default:
                        return zhm.v.k(tradingAddOnsMainScreenRevamp.h3().d, (FullScreenStateDelegate) tradingAddOnsMainScreenRevamp.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreenRevamp.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreenRevamp.W.getValue(), tradingAddOnsMainScreenRevamp.h3().f112920c, tradingAddOnsMainScreenRevamp.h3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreenRevamp.X.getValue(), tradingAddOnsMainScreenRevamp.Y);
                }
            }
        });
        final int i21 = 0;
        this.g0 = w.y0(new Function0(this) { // from class: dcf.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreenRevamp f112953b;

            {
                this.f112953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp = this.f112953b;
                switch (i22) {
                    case 0:
                        qji.b bVarQ2 = tradingAddOnsMainScreenRevamp.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        ubf.d dVar = eVar.f278874b;
                        ubf.e eVar2 = eVar.f278875c;
                        zjh.f fVar = new zjh.f(tradingAddOnsMainScreenRevamp, 19);
                        Object value = tradingAddOnsMainScreenRevamp.f91680a0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r map = ((ActionFooterView) value).f.map(new d73.n(new dak.c(15), 22));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return new ubf.f(dVar, eVar2, fVar, rd0.e.b(map));
                    case 1:
                        return (w) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278885m.get();
                    case 2:
                        return (NavBarWithBigTile) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_navBarWithBigTile);
                    case 3:
                        return (ActionFooterView) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_actionFooterView);
                    case 4:
                        return (f) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278887p.get();
                    case 5:
                        return (c) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278886n.get();
                    default:
                        return zhm.v.k(tradingAddOnsMainScreenRevamp.h3().d, (FullScreenStateDelegate) tradingAddOnsMainScreenRevamp.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreenRevamp.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreenRevamp.W.getValue(), tradingAddOnsMainScreenRevamp.h3().f112920c, tradingAddOnsMainScreenRevamp.h3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreenRevamp.X.getValue(), tradingAddOnsMainScreenRevamp.Y);
                }
            }
        });
        final int i22 = 1;
        this.f91684h0 = w.y0(new Function0(this) { // from class: dcf.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreenRevamp f112953b;

            {
                this.f112953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp = this.f112953b;
                switch (i222) {
                    case 0:
                        qji.b bVarQ2 = tradingAddOnsMainScreenRevamp.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        ubf.d dVar = eVar.f278874b;
                        ubf.e eVar2 = eVar.f278875c;
                        zjh.f fVar = new zjh.f(tradingAddOnsMainScreenRevamp, 19);
                        Object value = tradingAddOnsMainScreenRevamp.f91680a0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r map = ((ActionFooterView) value).f.map(new d73.n(new dak.c(15), 22));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return new ubf.f(dVar, eVar2, fVar, rd0.e.b(map));
                    case 1:
                        return (w) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278885m.get();
                    case 2:
                        return (NavBarWithBigTile) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_navBarWithBigTile);
                    case 3:
                        return (ActionFooterView) tradingAddOnsMainScreenRevamp.D2().findViewById(R$id.screenRecyclerNavBarWithBigTileActionFooter_actionFooterView);
                    case 4:
                        return (f) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278887p.get();
                    case 5:
                        return (c) ((ubf.f) tradingAddOnsMainScreenRevamp.g0.getValue()).f278886n.get();
                    default:
                        return zhm.v.k(tradingAddOnsMainScreenRevamp.h3().d, (FullScreenStateDelegate) tradingAddOnsMainScreenRevamp.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreenRevamp.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreenRevamp.W.getValue(), tradingAddOnsMainScreenRevamp.h3().f112920c, tradingAddOnsMainScreenRevamp.h3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreenRevamp.X.getValue(), tradingAddOnsMainScreenRevamp.Y);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ((dcf.f) this.f91681b0.getValue()).a();
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.U.getValue()).f52371h.f121375b), null, new s0(this, null), 3);
        i3().setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        i3().setLayoutType(au0.s0.CENTERED_HORIZONTALLY);
        i3().setTitleStyle(b1.MARKETING);
        i3().setHeightMode(new o2(new d0(375, 426)));
        i3().setThemeBasedColorSchemeEnabled(true);
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(h3().d.f53218h), 14), null, new t0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(h3().d.f53218h), 15), null, new u0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().f59357t), null, new v0(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(h3().f112919b.d.f121375b), 16), null, new w0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(h3().f112919b.d.f121375b), 17), null, new q0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(l.y(h3().f112920c.d, h3().e.d, "merge(...)"), 18), null, new r0(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(this.Y.d), 19), null, new r0(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF92230e0() {
        return (List) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.f91683e0;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(y uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        dcf.f fVar = (dcf.f) this.f91681b0.getValue();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        fVar.f = uiState.f112976g;
        fVar.f112931g = uiState.d;
        fVar.f112932h = uiState.e;
        fVar.i = uiState.f;
        aw0.e eVar = uiState.f112975c;
        NavBarWithBigTile navBarWithBigTileI3 = i3();
        z zVar = uiState.f112974b;
        navBarWithBigTileI3.setTagViewData(zVar.d);
        NavBarWithBigTile navBarWithBigTileI32 = i3();
        NavBarWithContainerBackground.ImageBackground imageBackground = new NavBarWithContainerBackground.ImageBackground(zVar.f112983b, (s8) null, (Color.SolidRes) null, 14);
        z0 z0Var = new z0(zVar.f112982a, false);
        Clause clause = zVar.f112984c;
        c1.S(navBarWithBigTileI32, u.c(new au0.u0(imageBackground, z0Var, null, clause != null ? new au0.w0(clause) : null)), null, null, 6);
        ?? r72 = this.f91680a0;
        Object value = r72.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ActionFooterView) value).setVisibility(eVar == null ? 8 : 0);
        if (eVar != null) {
            Object value2 = r72.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ActionFooterView) value2).setModel(eVar);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.f91682d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final c h3() {
        return (c) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NavBarWithBigTile i3() {
        Object value = this.Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (NavBarWithBigTile) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final dcf.w T2() {
        return (dcf.w) this.f91684h0.getValue();
    }

    @Override // z0h.s1
    public final d r() {
        return e.b(this.Y.d);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
