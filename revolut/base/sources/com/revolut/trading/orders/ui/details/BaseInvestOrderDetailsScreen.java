package com.revolut.trading.orders.ui.details;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen;
import exe.j;
import i7d.i;
import java.util.List;
import jij.h;
import jkc.g;
import jp9.l;
import jsl.b0;
import jsl.c;
import jsl.c0;
import jsl.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ksl.a;
import ldf.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/details/BaseInvestOrderDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lldf/b;", "Ljsl/b0;", "Li7d/i;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseInvestOrderDetailsScreen extends ViewController<b> implements b0, i {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f106811e0 = 0;
    public final InvestOrderDetailsContract$InputData K;
    public final c L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f106812a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final d f106813b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f106814d0;

    public BaseInvestOrderDetailsScreen(InvestOrderDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new c();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jsl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseInvestOrderDetailsScreen f178195b;

            {
                this.f178195b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen = this.f178195b;
                switch (i2) {
                    case 0:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen2 = this.f178195b;
                        phm.a aVar = (phm.a) ue0.e.j(baseInvestOrderDetailsScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = baseInvestOrderDetailsScreen2.K;
                        investOrderDetailsContract$InputData.getClass();
                        d dVar = baseInvestOrderDetailsScreen2.f106813b0;
                        dVar.getClass();
                        c cVar = baseInvestOrderDetailsScreen2.L;
                        cVar.getClass();
                        return new xsl.d(pVar, baseInvestOrderDetailsScreen2, dVar, baseInvestOrderDetailsScreen2, cVar, investOrderDetailsContract$InputData, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2);
                    case 1:
                        return zhm.v.k(baseInvestOrderDetailsScreen.getR(), (ListSubheaderLoadingDelegate) baseInvestOrderDetailsScreen.Q.getValue(), baseInvestOrderDetailsScreen.getR(), (CellDetailsDelegate) baseInvestOrderDetailsScreen.S.getValue(), (ForecastDelegate) baseInvestOrderDetailsScreen.T.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsChevronDelegate) baseInvestOrderDetailsScreen.U.getValue(), new PlainTextLoadingDelegate(), new PlainTextDelegate(), (CellDetailsActionableIconDelegate) baseInvestOrderDetailsScreen.V.getValue(), baseInvestOrderDetailsScreen.p1(), (CellDetailsNoteDelegate) baseInvestOrderDetailsScreen.X.getValue(), (LargeActionButtonDelegate) baseInvestOrderDetailsScreen.Y.getValue(), new RowLoadingDelegate(), new TextDelegate(), (FixedTabsDelegate) baseInvestOrderDetailsScreen.Z.getValue(), (HeaderDelegate) baseInvestOrderDetailsScreen.f106812a0.getValue());
                    case 2:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen3 = this.f178195b;
                        return dli.f.a(baseInvestOrderDetailsScreen3, baseInvestOrderDetailsScreen3.R2(), (List) baseInvestOrderDetailsScreen3.c0.getValue(), baseInvestOrderDetailsScreen3.e3(), null, null, null, 56);
                    case 3:
                        return (c0) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).Q.get();
                    default:
                        return (j60.a) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).f308594p.get();
                }
            }
        });
        final int i2 = 3;
        this.N = w.y0(new Function0(this) { // from class: jsl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseInvestOrderDetailsScreen f178195b;

            {
                this.f178195b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen = this.f178195b;
                switch (i22) {
                    case 0:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen2 = this.f178195b;
                        phm.a aVar = (phm.a) ue0.e.j(baseInvestOrderDetailsScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = baseInvestOrderDetailsScreen2.K;
                        investOrderDetailsContract$InputData.getClass();
                        d dVar = baseInvestOrderDetailsScreen2.f106813b0;
                        dVar.getClass();
                        c cVar = baseInvestOrderDetailsScreen2.L;
                        cVar.getClass();
                        return new xsl.d(pVar, baseInvestOrderDetailsScreen2, dVar, baseInvestOrderDetailsScreen2, cVar, investOrderDetailsContract$InputData, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2);
                    case 1:
                        return zhm.v.k(baseInvestOrderDetailsScreen.getR(), (ListSubheaderLoadingDelegate) baseInvestOrderDetailsScreen.Q.getValue(), baseInvestOrderDetailsScreen.getR(), (CellDetailsDelegate) baseInvestOrderDetailsScreen.S.getValue(), (ForecastDelegate) baseInvestOrderDetailsScreen.T.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsChevronDelegate) baseInvestOrderDetailsScreen.U.getValue(), new PlainTextLoadingDelegate(), new PlainTextDelegate(), (CellDetailsActionableIconDelegate) baseInvestOrderDetailsScreen.V.getValue(), baseInvestOrderDetailsScreen.p1(), (CellDetailsNoteDelegate) baseInvestOrderDetailsScreen.X.getValue(), (LargeActionButtonDelegate) baseInvestOrderDetailsScreen.Y.getValue(), new RowLoadingDelegate(), new TextDelegate(), (FixedTabsDelegate) baseInvestOrderDetailsScreen.Z.getValue(), (HeaderDelegate) baseInvestOrderDetailsScreen.f106812a0.getValue());
                    case 2:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen3 = this.f178195b;
                        return dli.f.a(baseInvestOrderDetailsScreen3, baseInvestOrderDetailsScreen3.R2(), (List) baseInvestOrderDetailsScreen3.c0.getValue(), baseInvestOrderDetailsScreen3.e3(), null, null, null, 56);
                    case 3:
                        return (c0) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).Q.get();
                    default:
                        return (j60.a) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).f308594p.get();
                }
            }
        });
        final int i3 = 4;
        this.O = w.y0(new Function0(this) { // from class: jsl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseInvestOrderDetailsScreen f178195b;

            {
                this.f178195b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen = this.f178195b;
                switch (i22) {
                    case 0:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen2 = this.f178195b;
                        phm.a aVar = (phm.a) ue0.e.j(baseInvestOrderDetailsScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = baseInvestOrderDetailsScreen2.K;
                        investOrderDetailsContract$InputData.getClass();
                        d dVar = baseInvestOrderDetailsScreen2.f106813b0;
                        dVar.getClass();
                        c cVar = baseInvestOrderDetailsScreen2.L;
                        cVar.getClass();
                        return new xsl.d(pVar, baseInvestOrderDetailsScreen2, dVar, baseInvestOrderDetailsScreen2, cVar, investOrderDetailsContract$InputData, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2);
                    case 1:
                        return zhm.v.k(baseInvestOrderDetailsScreen.getR(), (ListSubheaderLoadingDelegate) baseInvestOrderDetailsScreen.Q.getValue(), baseInvestOrderDetailsScreen.getR(), (CellDetailsDelegate) baseInvestOrderDetailsScreen.S.getValue(), (ForecastDelegate) baseInvestOrderDetailsScreen.T.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsChevronDelegate) baseInvestOrderDetailsScreen.U.getValue(), new PlainTextLoadingDelegate(), new PlainTextDelegate(), (CellDetailsActionableIconDelegate) baseInvestOrderDetailsScreen.V.getValue(), baseInvestOrderDetailsScreen.p1(), (CellDetailsNoteDelegate) baseInvestOrderDetailsScreen.X.getValue(), (LargeActionButtonDelegate) baseInvestOrderDetailsScreen.Y.getValue(), new RowLoadingDelegate(), new TextDelegate(), (FixedTabsDelegate) baseInvestOrderDetailsScreen.Z.getValue(), (HeaderDelegate) baseInvestOrderDetailsScreen.f106812a0.getValue());
                    case 2:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen3 = this.f178195b;
                        return dli.f.a(baseInvestOrderDetailsScreen3, baseInvestOrderDetailsScreen3.R2(), (List) baseInvestOrderDetailsScreen3.c0.getValue(), baseInvestOrderDetailsScreen3.e3(), null, null, null, 56);
                    case 3:
                        return (c0) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).Q.get();
                    default:
                        return (j60.a) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).f308594p.get();
                }
            }
        });
        this.P = w.y0(new l(25));
        this.Q = w.y0(new l(26));
        this.R = w.y0(new l(27));
        this.S = w.y0(new l(28));
        this.T = w.y0(new l(29));
        this.U = w.y0(new jsl.b(0));
        this.V = w.y0(new jsl.b(1));
        this.W = w.y0(new jsl.b(2));
        this.X = w.y0(new jsl.b(3));
        this.Y = w.y0(new jsl.b(4));
        this.Z = w.y0(new jsl.b(5));
        this.f106812a0 = w.y0(new jsl.b(6));
        this.f106813b0 = new d(this);
        final int i5 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: jsl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseInvestOrderDetailsScreen f178195b;

            {
                this.f178195b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen = this.f178195b;
                switch (i22) {
                    case 0:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen2 = this.f178195b;
                        phm.a aVar = (phm.a) ue0.e.j(baseInvestOrderDetailsScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = baseInvestOrderDetailsScreen2.K;
                        investOrderDetailsContract$InputData.getClass();
                        d dVar = baseInvestOrderDetailsScreen2.f106813b0;
                        dVar.getClass();
                        c cVar = baseInvestOrderDetailsScreen2.L;
                        cVar.getClass();
                        return new xsl.d(pVar, baseInvestOrderDetailsScreen2, dVar, baseInvestOrderDetailsScreen2, cVar, investOrderDetailsContract$InputData, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2);
                    case 1:
                        return zhm.v.k(baseInvestOrderDetailsScreen.getR(), (ListSubheaderLoadingDelegate) baseInvestOrderDetailsScreen.Q.getValue(), baseInvestOrderDetailsScreen.getR(), (CellDetailsDelegate) baseInvestOrderDetailsScreen.S.getValue(), (ForecastDelegate) baseInvestOrderDetailsScreen.T.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsChevronDelegate) baseInvestOrderDetailsScreen.U.getValue(), new PlainTextLoadingDelegate(), new PlainTextDelegate(), (CellDetailsActionableIconDelegate) baseInvestOrderDetailsScreen.V.getValue(), baseInvestOrderDetailsScreen.p1(), (CellDetailsNoteDelegate) baseInvestOrderDetailsScreen.X.getValue(), (LargeActionButtonDelegate) baseInvestOrderDetailsScreen.Y.getValue(), new RowLoadingDelegate(), new TextDelegate(), (FixedTabsDelegate) baseInvestOrderDetailsScreen.Z.getValue(), (HeaderDelegate) baseInvestOrderDetailsScreen.f106812a0.getValue());
                    case 2:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen3 = this.f178195b;
                        return dli.f.a(baseInvestOrderDetailsScreen3, baseInvestOrderDetailsScreen3.R2(), (List) baseInvestOrderDetailsScreen3.c0.getValue(), baseInvestOrderDetailsScreen3.e3(), null, null, null, 56);
                    case 3:
                        return (c0) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).Q.get();
                    default:
                        return (j60.a) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).f308594p.get();
                }
            }
        });
        final int i6 = 2;
        this.f106814d0 = w.y0(new Function0(this) { // from class: jsl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseInvestOrderDetailsScreen f178195b;

            {
                this.f178195b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen = this.f178195b;
                switch (i22) {
                    case 0:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen2 = this.f178195b;
                        phm.a aVar = (phm.a) ue0.e.j(baseInvestOrderDetailsScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = baseInvestOrderDetailsScreen2.K;
                        investOrderDetailsContract$InputData.getClass();
                        d dVar = baseInvestOrderDetailsScreen2.f106813b0;
                        dVar.getClass();
                        c cVar = baseInvestOrderDetailsScreen2.L;
                        cVar.getClass();
                        return new xsl.d(pVar, baseInvestOrderDetailsScreen2, dVar, baseInvestOrderDetailsScreen2, cVar, investOrderDetailsContract$InputData, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2, baseInvestOrderDetailsScreen2);
                    case 1:
                        return zhm.v.k(baseInvestOrderDetailsScreen.getR(), (ListSubheaderLoadingDelegate) baseInvestOrderDetailsScreen.Q.getValue(), baseInvestOrderDetailsScreen.getR(), (CellDetailsDelegate) baseInvestOrderDetailsScreen.S.getValue(), (ForecastDelegate) baseInvestOrderDetailsScreen.T.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsChevronDelegate) baseInvestOrderDetailsScreen.U.getValue(), new PlainTextLoadingDelegate(), new PlainTextDelegate(), (CellDetailsActionableIconDelegate) baseInvestOrderDetailsScreen.V.getValue(), baseInvestOrderDetailsScreen.p1(), (CellDetailsNoteDelegate) baseInvestOrderDetailsScreen.X.getValue(), (LargeActionButtonDelegate) baseInvestOrderDetailsScreen.Y.getValue(), new RowLoadingDelegate(), new TextDelegate(), (FixedTabsDelegate) baseInvestOrderDetailsScreen.Z.getValue(), (HeaderDelegate) baseInvestOrderDetailsScreen.f106812a0.getValue());
                    case 2:
                        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen3 = this.f178195b;
                        return dli.f.a(baseInvestOrderDetailsScreen3, baseInvestOrderDetailsScreen3.R2(), (List) baseInvestOrderDetailsScreen3.c0.getValue(), baseInvestOrderDetailsScreen3.e3(), null, null, null, 56);
                    case 3:
                        return (c0) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).Q.get();
                    default:
                        return (j60.a) ((xsl.d) ((ksl.a) baseInvestOrderDetailsScreen.M.getValue())).f308594p.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.O.getValue()).d(u.c((LargeActionButtonDelegate) this.Y.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((dli.c) this.f106814d0.getValue()).w();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, new jij.d(rd0.e.b(((LargeActionButtonDelegate) this.Y.getValue()).d.f121375b), 11), new g(this, continuation, 13), 3);
        ViewController.P2(this, new j(new jij.d(rd0.e.b(((j60.a) this.O.getValue()).C()), 12), 29), new h(this, continuation, 22), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // f1h.f
    /* JADX INFO: renamed from: c */
    public final RowDelegate getR() {
        return (RowDelegate) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final c0 d() {
        return (c0) this.N.getValue();
    }

    public abstract int e3();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // h1h.f
    /* JADX INFO: renamed from: j0 */
    public final ListSubheaderDelegate getR() {
        return (ListSubheaderDelegate) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f106814d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CellDetailsActionDelegate p1() {
        return (CellDetailsActionDelegate) this.W.getValue();
    }
}
