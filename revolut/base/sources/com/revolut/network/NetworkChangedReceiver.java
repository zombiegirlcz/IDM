package com.revolut.network;

import a0.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import cn0.g;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import efm.d0;
import efm.k;
import efm.o;
import efm.r;
import fo3.c;
import h93.f0;
import hhm.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rfm.j;
import rfm.m;
import skm.p0;
import te0.w;
import v6l.b1;
import v6l.m0;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/revolut/network/NetworkChangedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/net/NetworkInfo;", "netInfo", "", "isNowConnected", "(Landroid/net/NetworkInfo;)Z", "isInAirplaneMode", "Landroid/content/Context;", "context", "", "runLocationUpdatesIfNeeded", "(Landroid/content/Context;)V", "Losg/b;", "walletInteractor", "Lefm/d0;", "Lfo3/c;", "getCurrentWallet", "(Losg/b;)Lefm/d0;", "Lhf0/a;", "Llp/q1;", "getAppDeclarationContext", "(Landroid/content/Context;)Lhf0/a;", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/net/NetworkInfo$State;", "lastState", "Landroid/net/NetworkInfo$State;", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkChangedReceiver extends BroadcastReceiver {

    @NotNull
    private NetworkInfo.State lastState = NetworkInfo.State.UNKNOWN;

    private final hf0.a getAppDeclarationContext(Context context) {
        dwl.a.a(context);
        return hf0.b.d.g();
    }

    private final d0<c> getCurrentWallet(osg.b walletInteractor) {
        d0<c> d0VarFirstOrError = m70.a.g(((n) walletInteractor).W(AccountId.Personal.f51414a), null, new clk.b(16), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable getCurrentWallet$lambda$0(Throwable error, c cVar) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (cVar == null) {
            return error;
        }
        return null;
    }

    private final boolean isInAirplaneMode(NetworkInfo netInfo) {
        return netInfo == null;
    }

    private final boolean isNowConnected(NetworkInfo netInfo) {
        return (isInAirplaneMode(netInfo) || netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable() || this.lastState == NetworkInfo.State.CONNECTED) ? false : true;
    }

    private final void runLocationUpdatesIfNeeded(Context context) {
        phm.a aVar = (phm.a) getAppDeclarationContext(context).a().get(an0.c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(d.q("Api ", an0.c.class, " is not found"));
        }
        if (((g) ((an0.c) aVar2.b()).j()).d() instanceof mm0.n) {
            try {
                phm.a aVar3 = (phm.a) getAppDeclarationContext(context).a().get(usg.a.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 == null) {
                    throw new IllegalStateException("Api " + usg.a.class + " is not found");
                }
                d0<c> currentWallet = getCurrentWallet(((usg.a) aVar4.b()).b());
                int i = 13;
                com.onfido.android.sdk.capture.ui.userconsent.c cVar = new com.onfido.android.sdk.capture.ui.userconsent.c(new cma.b(this, context, i), 6);
                currentWallet.getClass();
                d0<Long> d0VarCount = new sfm.b(currentWallet, cVar, 2).subscribeOn(f.f152431c).map(new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(i), 7)).filter(new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(14), 8)).count();
                com.onfido.android.sdk.capture.ui.userconsent.c cVar2 = new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(15), 9);
                d0VarCount.getClass();
                int i2 = 0;
                new j(d0VarCount, cVar2, i2).d(new o() { // from class: com.revolut.network.NetworkChangedReceiver$runLocationUpdatesIfNeeded$$inlined$breadcrumbTransformerMaybe$1
                    @Override // efm.o
                    public final efm.n apply(k<Long> upstream) {
                        Intrinsics.checkNotNullParameter(upstream, "upstream");
                        final BreadcrumbException breadcrumbException = new BreadcrumbException();
                        kfm.o oVar = new kfm.o(new Function1<Throwable, efm.n>() { // from class: com.revolut.network.NetworkChangedReceiver$runLocationUpdatesIfNeeded$$inlined$breadcrumbTransformerMaybe$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public final efm.n invoke(Throwable error) {
                                Intrinsics.checkNotNullParameter(error, "error");
                                w.c(error, breadcrumbException);
                                return k.f(error);
                            }
                        }) { // from class: com.revolut.network.NetworkChangedReceiver$inlined$sam$i$io_reactivex_functions_Function$0
                            private final /* synthetic */ Function1 function;

                            {
                                Intrinsics.checkNotNullParameter(function, "function");
                                this.function = function;
                            }

                            @Override // kfm.o, androidx.arch.core.util.Function
                            public final /* synthetic */ Object apply(Object obj2) {
                                return this.function.invoke(obj2);
                            }
                        };
                        upstream.getClass();
                        m mVar = new m(upstream, oVar, 2);
                        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
                        return mVar;
                    }
                }).i(new rfm.b(new com.onfido.android.sdk.capture.ui.userconsent.c(new a(context, i2), 4), new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(12), 5), mfm.f.f205043c));
            } catch (Throwable th10) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final efm.w runLocationUpdatesIfNeeded$lambda$0(NetworkChangedReceiver networkChangedReceiver, Context context, c wallet) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        phm.a aVar = (phm.a) networkChangedReceiver.getAppDeclarationContext(context).a().get(x6l.c.class);
        Continuation continuation = null;
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(d.q("Api ", x6l.c.class, " is not found"));
        }
        j6l.b bVarD = ((x6l.c) aVar2.b()).d();
        String walletId = wallet.f136801a;
        b93.d cardScope = b93.d.ALL;
        b1 b1Var = (b1) bVarD;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        p0 p0Var = p0.f264001a;
        r rVarX = w.o0(elm.f.f127540b, new m0(b1Var, walletId, cardScope, continuation, 0)).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final efm.w runLocationUpdatesIfNeeded$lambda$1(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (efm.w) function1.invoke(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runLocationUpdatesIfNeeded$lambda$10(Throwable t2) {
        Intrinsics.checkNotNullParameter(t2, "t");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, t2, h0Var);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List runLocationUpdatesIfNeeded$lambda$2(List cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = cards.iterator();
        while (it8.hasNext()) {
            i93.c cVar = ((f0) it8.next()).f150113g;
            if (cVar == null || !cVar.f159549a) {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List runLocationUpdatesIfNeeded$lambda$3(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (List) function1.invoke(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runLocationUpdatesIfNeeded$lambda$4(List settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        return !settings.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runLocationUpdatesIfNeeded$lambda$5(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) function1.invoke(p0)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runLocationUpdatesIfNeeded$lambda$6(Long it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.longValue() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runLocationUpdatesIfNeeded$lambda$7(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) function1.invoke(p0)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runLocationUpdatesIfNeeded$lambda$8(Context context, Long l2) {
        phm.a aVar = (phm.a) j6.a.i(context, cri.d.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(d.q("Api ", cri.d.class, " is not found"));
        }
        ((nzl.a) ((ozl.a) ((cri.d) aVar2.b())).a()).g();
        return Unit.f186387a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        NetworkInfo.State state;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (isNowConnected(activeNetworkInfo)) {
            runLocationUpdatesIfNeeded(context);
        }
        if (isInAirplaneMode(activeNetworkInfo)) {
            state = NetworkInfo.State.UNKNOWN;
        } else {
            Intrinsics.h(activeNetworkInfo);
            state = activeNetworkInfo.getState();
            Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
        }
        this.lastState = state;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "NetworkChangedReceiver", this.lastState.name(), null, null, 16);
    }
}
