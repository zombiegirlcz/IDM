package com.revolut.chat.ui.chat_profile.profile_screen;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.chat.ui.chat_profile.ChatProfileInputData;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import com.revolut.chat_core.R$layout;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import h30.z;
import java.util.List;
import k50.n0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n30.y;
import o40.e;
import p0l.d;
import p40.f;
import p40.g;
import p40.l;
import p40.m;
import rp0.l0;
import te0.w;
import tki.c;
import v20.v0;
import vc.s;
import yhm.j;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo40/e;", "Ltki/c;", "Lp40/m;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatProfileScreen extends ViewController<e> implements c {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f51125a0 = {o0.f186429a.j(new h0(ChatProfileScreen.class, "viewBinding", "getViewBinding()Lcom/revolut/chat_core/databinding/ScreenChatProfileBinding;", 0))};
    public final ChatProfileInputData K;
    public final int L;
    public final h M;
    public final TextDelegate N;
    public final PlainTextDelegate O;
    public final FullScreenStateDelegate P;
    public final RectangularButtonDelegate Q;
    public final TabsDelegate R;
    public final SmallCardDelegate S;
    public final RowDelegate T;
    public final RowLoadingDelegate U;
    public final Object V;
    public List W;
    public final Object X;
    public final Lazy Y;
    public final Object Z;

    public ChatProfileScreen(ChatProfileInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_chat_profile;
        this.M = s.t(this, p40.h.f);
        this.N = new TextDelegate();
        this.O = new PlainTextDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new RectangularButtonDelegate();
        this.R = new TabsDelegate();
        SmallCardDelegate.INSTANCE.getClass();
        this.S = new SmallCardDelegate(SmallCardDelegate.f53351j);
        this.T = new RowDelegate(null, null, 7);
        this.U = new RowLoadingDelegate();
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: p40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatProfileScreen f232771b;

            {
                this.f232771b = this;
            }

            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChatProfileScreen chatProfileScreen = this.f232771b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChatProfileScreen.f51125a0;
                        return new l0(chatProfileScreen.m2());
                    case 1:
                        KProperty[] kPropertyArr2 = ChatProfileScreen.f51125a0;
                        phm.a aVar = (phm.a) ue0.e.j(chatProfileScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (z) ((q40.a) ((q40.b) aVar2.b()).b().mo3808a(chatProfileScreen)).I(chatProfileScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = ChatProfileScreen.f51125a0;
                        ChatProfileScreen chatProfileScreen2 = this.f232771b;
                        return tki.g.a(chatProfileScreen2, chatProfileScreen2.R2(), zhm.v.k(chatProfileScreen2.N, chatProfileScreen2.O, chatProfileScreen2.P, new GridBoxDelegate(zhm.u.c(chatProfileScreen2.Q), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), chatProfileScreen2.S, chatProfileScreen2.R, chatProfileScreen2.T, chatProfileScreen2.U), R$id.recyclerView, new p0g.b(24), null, null, 48);
                    default:
                        KProperty[] kPropertyArr4 = ChatProfileScreen.f51125a0;
                        z zVar = (z) chatProfileScreen.X.getValue();
                        switch (zVar.f148989a) {
                            case 0:
                                ChatProfileInputData chatProfileInputData = zVar.f148990b;
                                z50.g gVar = new z50.g();
                                h30.n nVar = zVar.f148991c;
                                a20.a aVarE = nVar.e();
                                of3.f fVar = nVar.f148906b;
                                j30.c cVarF = fVar.f();
                                vc.s.j(cVarF);
                                nf3.a aVarC = fVar.c();
                                vc.s.j(aVarC);
                                q qVar = new q(gVar, aVarE, cVarF, aVarC, (v0) nVar.P.get());
                                l40.a aVar3 = (l40.a) zVar.f149000r.get();
                                k30.a aVarD = nVar.d();
                                n30.z zVar2 = (n30.z) nVar.f148907b0.get();
                                p50.m mVar = new p50.m(nVar.x());
                                n0 n0Var = (n0) zVar.o.get();
                                y yVar = (y) fVar.f224699s.get();
                                vc.s.j(yVar);
                                nf3.a aVarC2 = fVar.c();
                                vc.s.j(aVarC2);
                                return new com.revolut.chat.ui.chat_profile.profile_screen.b(chatProfileInputData, qVar, aVar3, aVarD, zVar2, mVar, n0Var, yVar, aVarC2, nVar.C());
                            default:
                                ChatProfileInputData chatProfileInputData2 = zVar.f148990b;
                                z50.g gVar2 = new z50.g();
                                h30.n nVar2 = zVar.f148991c;
                                a20.a aVarE2 = nVar2.e();
                                of3.f fVar2 = nVar2.f148906b;
                                j30.c cVarF2 = fVar2.f();
                                vc.s.j(cVarF2);
                                nf3.a aVarC3 = fVar2.c();
                                vc.s.j(aVarC3);
                                q qVar2 = new q(gVar2, aVarE2, cVarF2, aVarC3, (v0) nVar2.P.get());
                                l40.a aVar4 = (l40.a) zVar.f149000r.get();
                                k30.a aVarD2 = nVar2.d();
                                n30.z zVar3 = (n30.z) nVar2.f148907b0.get();
                                p50.m mVar2 = new p50.m(nVar2.x());
                                n0 n0Var2 = (n0) zVar.o.get();
                                y yVar2 = (y) fVar2.f224699s.get();
                                vc.s.j(yVar2);
                                nf3.a aVarC4 = fVar2.c();
                                vc.s.j(aVarC4);
                                return new com.revolut.chat.ui.chat_profile.profile_screen.b(chatProfileInputData2, qVar2, aVar4, aVarD2, zVar3, mVar2, n0Var2, yVar2, aVarC4, nVar2.C());
                        }
                }
            }
        });
        this.W = f0.f322471a;
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: p40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatProfileScreen f232771b;

            {
                this.f232771b = this;
            }

            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChatProfileScreen chatProfileScreen = this.f232771b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChatProfileScreen.f51125a0;
                        return new l0(chatProfileScreen.m2());
                    case 1:
                        KProperty[] kPropertyArr2 = ChatProfileScreen.f51125a0;
                        phm.a aVar = (phm.a) ue0.e.j(chatProfileScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (z) ((q40.a) ((q40.b) aVar2.b()).b().mo3808a(chatProfileScreen)).I(chatProfileScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = ChatProfileScreen.f51125a0;
                        ChatProfileScreen chatProfileScreen2 = this.f232771b;
                        return tki.g.a(chatProfileScreen2, chatProfileScreen2.R2(), zhm.v.k(chatProfileScreen2.N, chatProfileScreen2.O, chatProfileScreen2.P, new GridBoxDelegate(zhm.u.c(chatProfileScreen2.Q), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), chatProfileScreen2.S, chatProfileScreen2.R, chatProfileScreen2.T, chatProfileScreen2.U), R$id.recyclerView, new p0g.b(24), null, null, 48);
                    default:
                        KProperty[] kPropertyArr4 = ChatProfileScreen.f51125a0;
                        z zVar = (z) chatProfileScreen.X.getValue();
                        switch (zVar.f148989a) {
                            case 0:
                                ChatProfileInputData chatProfileInputData = zVar.f148990b;
                                z50.g gVar = new z50.g();
                                h30.n nVar = zVar.f148991c;
                                a20.a aVarE = nVar.e();
                                of3.f fVar = nVar.f148906b;
                                j30.c cVarF = fVar.f();
                                vc.s.j(cVarF);
                                nf3.a aVarC = fVar.c();
                                vc.s.j(aVarC);
                                q qVar = new q(gVar, aVarE, cVarF, aVarC, (v0) nVar.P.get());
                                l40.a aVar3 = (l40.a) zVar.f149000r.get();
                                k30.a aVarD = nVar.d();
                                n30.z zVar2 = (n30.z) nVar.f148907b0.get();
                                p50.m mVar = new p50.m(nVar.x());
                                n0 n0Var = (n0) zVar.o.get();
                                y yVar = (y) fVar.f224699s.get();
                                vc.s.j(yVar);
                                nf3.a aVarC2 = fVar.c();
                                vc.s.j(aVarC2);
                                return new com.revolut.chat.ui.chat_profile.profile_screen.b(chatProfileInputData, qVar, aVar3, aVarD, zVar2, mVar, n0Var, yVar, aVarC2, nVar.C());
                            default:
                                ChatProfileInputData chatProfileInputData2 = zVar.f148990b;
                                z50.g gVar2 = new z50.g();
                                h30.n nVar2 = zVar.f148991c;
                                a20.a aVarE2 = nVar2.e();
                                of3.f fVar2 = nVar2.f148906b;
                                j30.c cVarF2 = fVar2.f();
                                vc.s.j(cVarF2);
                                nf3.a aVarC3 = fVar2.c();
                                vc.s.j(aVarC3);
                                q qVar2 = new q(gVar2, aVarE2, cVarF2, aVarC3, (v0) nVar2.P.get());
                                l40.a aVar4 = (l40.a) zVar.f149000r.get();
                                k30.a aVarD2 = nVar2.d();
                                n30.z zVar3 = (n30.z) nVar2.f148907b0.get();
                                p50.m mVar2 = new p50.m(nVar2.x());
                                n0 n0Var2 = (n0) zVar.o.get();
                                y yVar2 = (y) fVar2.f224699s.get();
                                vc.s.j(yVar2);
                                nf3.a aVarC4 = fVar2.c();
                                vc.s.j(aVarC4);
                                return new com.revolut.chat.ui.chat_profile.profile_screen.b(chatProfileInputData2, qVar2, aVar4, aVarD2, zVar3, mVar2, n0Var2, yVar2, aVarC4, nVar2.C());
                        }
                }
            }
        });
        final int i3 = 2;
        this.Y = j.b(new Function0(this) { // from class: p40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatProfileScreen f232771b;

            {
                this.f232771b = this;
            }

            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChatProfileScreen chatProfileScreen = this.f232771b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChatProfileScreen.f51125a0;
                        return new l0(chatProfileScreen.m2());
                    case 1:
                        KProperty[] kPropertyArr2 = ChatProfileScreen.f51125a0;
                        phm.a aVar = (phm.a) ue0.e.j(chatProfileScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (z) ((q40.a) ((q40.b) aVar2.b()).b().mo3808a(chatProfileScreen)).I(chatProfileScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = ChatProfileScreen.f51125a0;
                        ChatProfileScreen chatProfileScreen2 = this.f232771b;
                        return tki.g.a(chatProfileScreen2, chatProfileScreen2.R2(), zhm.v.k(chatProfileScreen2.N, chatProfileScreen2.O, chatProfileScreen2.P, new GridBoxDelegate(zhm.u.c(chatProfileScreen2.Q), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), chatProfileScreen2.S, chatProfileScreen2.R, chatProfileScreen2.T, chatProfileScreen2.U), R$id.recyclerView, new p0g.b(24), null, null, 48);
                    default:
                        KProperty[] kPropertyArr4 = ChatProfileScreen.f51125a0;
                        z zVar = (z) chatProfileScreen.X.getValue();
                        switch (zVar.f148989a) {
                            case 0:
                                ChatProfileInputData chatProfileInputData = zVar.f148990b;
                                z50.g gVar = new z50.g();
                                h30.n nVar = zVar.f148991c;
                                a20.a aVarE = nVar.e();
                                of3.f fVar = nVar.f148906b;
                                j30.c cVarF = fVar.f();
                                vc.s.j(cVarF);
                                nf3.a aVarC = fVar.c();
                                vc.s.j(aVarC);
                                q qVar = new q(gVar, aVarE, cVarF, aVarC, (v0) nVar.P.get());
                                l40.a aVar3 = (l40.a) zVar.f149000r.get();
                                k30.a aVarD = nVar.d();
                                n30.z zVar2 = (n30.z) nVar.f148907b0.get();
                                p50.m mVar = new p50.m(nVar.x());
                                n0 n0Var = (n0) zVar.o.get();
                                y yVar = (y) fVar.f224699s.get();
                                vc.s.j(yVar);
                                nf3.a aVarC2 = fVar.c();
                                vc.s.j(aVarC2);
                                return new com.revolut.chat.ui.chat_profile.profile_screen.b(chatProfileInputData, qVar, aVar3, aVarD, zVar2, mVar, n0Var, yVar, aVarC2, nVar.C());
                            default:
                                ChatProfileInputData chatProfileInputData2 = zVar.f148990b;
                                z50.g gVar2 = new z50.g();
                                h30.n nVar2 = zVar.f148991c;
                                a20.a aVarE2 = nVar2.e();
                                of3.f fVar2 = nVar2.f148906b;
                                j30.c cVarF2 = fVar2.f();
                                vc.s.j(cVarF2);
                                nf3.a aVarC3 = fVar2.c();
                                vc.s.j(aVarC3);
                                q qVar2 = new q(gVar2, aVarE2, cVarF2, aVarC3, (v0) nVar2.P.get());
                                l40.a aVar4 = (l40.a) zVar.f149000r.get();
                                k30.a aVarD2 = nVar2.d();
                                n30.z zVar3 = (n30.z) nVar2.f148907b0.get();
                                p50.m mVar2 = new p50.m(nVar2.x());
                                n0 n0Var2 = (n0) zVar.o.get();
                                y yVar2 = (y) fVar2.f224699s.get();
                                vc.s.j(yVar2);
                                nf3.a aVarC4 = fVar2.c();
                                vc.s.j(aVarC4);
                                return new com.revolut.chat.ui.chat_profile.profile_screen.b(chatProfileInputData2, qVar2, aVar4, aVarD2, zVar3, mVar2, n0Var2, yVar2, aVarC4, nVar2.C());
                        }
                }
            }
        });
        final int i5 = 3;
        this.Z = w.y0(new Function0(this) { // from class: p40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatProfileScreen f232771b;

            {
                this.f232771b = this;
            }

            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ChatProfileScreen chatProfileScreen = this.f232771b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChatProfileScreen.f51125a0;
                        return new l0(chatProfileScreen.m2());
                    case 1:
                        KProperty[] kPropertyArr2 = ChatProfileScreen.f51125a0;
                        phm.a aVar = (phm.a) ue0.e.j(chatProfileScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (z) ((q40.a) ((q40.b) aVar2.b()).b().mo3808a(chatProfileScreen)).I(chatProfileScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = ChatProfileScreen.f51125a0;
                        ChatProfileScreen chatProfileScreen2 = this.f232771b;
                        return tki.g.a(chatProfileScreen2, chatProfileScreen2.R2(), zhm.v.k(chatProfileScreen2.N, chatProfileScreen2.O, chatProfileScreen2.P, new GridBoxDelegate(zhm.u.c(chatProfileScreen2.Q), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), chatProfileScreen2.S, chatProfileScreen2.R, chatProfileScreen2.T, chatProfileScreen2.U), R$id.recyclerView, new p0g.b(24), null, null, 48);
                    default:
                        KProperty[] kPropertyArr4 = ChatProfileScreen.f51125a0;
                        z zVar = (z) chatProfileScreen.X.getValue();
                        switch (zVar.f148989a) {
                            case 0:
                                ChatProfileInputData chatProfileInputData = zVar.f148990b;
                                z50.g gVar = new z50.g();
                                h30.n nVar = zVar.f148991c;
                                a20.a aVarE = nVar.e();
                                of3.f fVar = nVar.f148906b;
                                j30.c cVarF = fVar.f();
                                vc.s.j(cVarF);
                                nf3.a aVarC = fVar.c();
                                vc.s.j(aVarC);
                                q qVar = new q(gVar, aVarE, cVarF, aVarC, (v0) nVar.P.get());
                                l40.a aVar3 = (l40.a) zVar.f149000r.get();
                                k30.a aVarD = nVar.d();
                                n30.z zVar2 = (n30.z) nVar.f148907b0.get();
                                p50.m mVar = new p50.m(nVar.x());
                                n0 n0Var = (n0) zVar.o.get();
                                y yVar = (y) fVar.f224699s.get();
                                vc.s.j(yVar);
                                nf3.a aVarC2 = fVar.c();
                                vc.s.j(aVarC2);
                                return new com.revolut.chat.ui.chat_profile.profile_screen.b(chatProfileInputData, qVar, aVar3, aVarD, zVar2, mVar, n0Var, yVar, aVarC2, nVar.C());
                            default:
                                ChatProfileInputData chatProfileInputData2 = zVar.f148990b;
                                z50.g gVar2 = new z50.g();
                                h30.n nVar2 = zVar.f148991c;
                                a20.a aVarE2 = nVar2.e();
                                of3.f fVar2 = nVar2.f148906b;
                                j30.c cVarF2 = fVar2.f();
                                vc.s.j(cVarF2);
                                nf3.a aVarC3 = fVar2.c();
                                vc.s.j(aVarC3);
                                q qVar2 = new q(gVar2, aVarE2, cVarF2, aVarC3, (v0) nVar2.P.get());
                                l40.a aVar4 = (l40.a) zVar.f149000r.get();
                                k30.a aVarD2 = nVar2.d();
                                n30.z zVar3 = (n30.z) nVar2.f148907b0.get();
                                p50.m mVar2 = new p50.m(nVar2.x());
                                n0 n0Var2 = (n0) zVar.o.get();
                                y yVar2 = (y) fVar2.f224699s.get();
                                vc.s.j(yVar2);
                                nf3.a aVarC4 = fVar2.c();
                                vc.s.j(aVarC4);
                                return new com.revolut.chat.ui.chat_profile.profile_screen.b(chatProfileInputData2, qVar2, aVar4, aVarD2, zVar3, mVar2, n0Var2, yVar2, aVarC4, nVar2.C());
                        }
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(R$style.UiKitTheme_Transparent);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        f3().f1515c.setContent(uiState.f232785a);
        f3().f1514b.setBackgroundType(uiState.f232786b);
        this.W = uiState.d;
        f3().d.post(new o6.a(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.LayoutManager layoutManager = f3().d.getLayoutManager();
        ScreenGridLayoutManager screenGridLayoutManager = layoutManager instanceof ScreenGridLayoutManager ? (ScreenGridLayoutManager) layoutManager : null;
        if (screenGridLayoutManager != null) {
            screenGridLayoutManager.setSpanSizeLookup(new p40.b(this, screenGridLayoutManager));
        }
        f3().d.addOnScrollListener(new p40.c(this));
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(f3().f1515c.Q), new d(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new p40.d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53149c), new p40.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((l0) this.V.getValue()).f256113c), new p40.d(this, continuation, 1), 3);
        ViewController.P2(this, ((b) R2()).f51132p.c3(), new p40.d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53515c.f121375b), new p40.d(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f53218h), new g(this, null), 3);
    }

    public final void d3() {
        RecyclerView.LayoutManager layoutManager = f3().d.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int itemCount = linearLayoutManager.getItemCount();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (itemCount <= 0 || iFindLastVisibleItemPosition < itemCount - 4) {
            return;
        }
        ((b) R2()).f51138x.k(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.Z.getValue();
    }

    public final a60.d f3() {
        ViewBinding value = this.M.getValue(this, f51125a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a60.d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Y.getValue();
    }
}
