package com.revolut.feature.us_direct_deposit.impl.atomic;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Build;
import android.view.View;
import com.revolut.feature.us_direct_deposit.impl.R$layout;
import com.revolut.feature.us_direct_deposit.impl.atomic.AtomicScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseScreen;
import dam.j;
import dam.s;
import jki.h;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import te0.w;
import wkg.c;
import wkg.f;
import wkg.g;
import xkg.a;
import zkg.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/us_direct_deposit/impl/atomic/AtomicScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lwkg/c;", "<init>", "()V", "feature_retail_us_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AtomicScreen extends BaseScreen<k, IOData$EmptyInput, c> {
    public final int M;
    public final Object N;
    public final Object O;

    public AtomicScreen() {
        super(IOData$EmptyInput.f98299a);
        this.M = R$layout.screen_atomic;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wkg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtomicScreen f298282b;

            {
                this.f298282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AtomicScreen atomicScreen = this.f298282b;
                        qji.b bVarQ2 = atomicScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.us_direct_deposit.impl.atomic.di.AtomicScreenInjector");
                        elg.d dVar = (elg.d) bVarQ2;
                        elg.e eVar = dVar.f127452a;
                        elg.d dVar2 = dVar.f127453b;
                        Activity activityM2 = atomicScreen.m2();
                        activityM2.getClass();
                        return new elg.c(eVar, dVar2, activityM2);
                    default:
                        return (f) ((elg.c) this.f298282b.N.getValue()).f127451h.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wkg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtomicScreen f298282b;

            {
                this.f298282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AtomicScreen atomicScreen = this.f298282b;
                        qji.b bVarQ2 = atomicScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.us_direct_deposit.impl.atomic.di.AtomicScreenInjector");
                        elg.d dVar = (elg.d) bVarQ2;
                        elg.e eVar = dVar.f127452a;
                        elg.d dVar2 = dVar.f127453b;
                        Activity activityM2 = atomicScreen.m2();
                        activityM2.getClass();
                        return new elg.c(eVar, dVar2, activityM2);
                    default:
                        return (f) ((elg.c) this.f298282b.N.getValue()).f127451h.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (elg.c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVar = (d) ((f) this.O.getValue()).f298285p;
        g gVar = dVar.f322980c;
        a receiver = dVar.f322979b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(receiver, "broadcastReceiver");
        j jVar = s.Companion;
        Activity context = gVar.f298287a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(receiver, new IntentFilter("financial.atomic.transact.EVENT"), 4);
        } else {
            context.registerReceiver(receiver, new IntentFilter("financial.atomic.transact.EVENT"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        d dVar = (d) ((f) this.O.getValue()).f298285p;
        g gVar = dVar.f322980c;
        a receiver = dVar.f322979b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(receiver, "broadcastReceiver");
        j jVar = s.Companion;
        Activity context = gVar.f298287a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        try {
            context.unregisterReceiver(receiver);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }
}
