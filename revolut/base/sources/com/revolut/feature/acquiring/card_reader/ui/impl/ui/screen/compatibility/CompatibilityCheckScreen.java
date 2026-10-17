package com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.compatibility;

import com.revolut.feature.acquiring.card_reader.ui.impl.R$layout;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.compatibility.CompatibilityCheckScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseScreen;
import hc1.c;
import hc1.d;
import jki.h;
import jki.k;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import te0.w;
import xb1.m;
import xb1.p;
import xb1.r;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/compatibility/CompatibilityCheckScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lhc1/c;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CompatibilityCheckScreen extends BaseScreen<k, IOData$EmptyInput, c> {
    public final int M;
    public final Object N;
    public final Object O;

    public CompatibilityCheckScreen() {
        super(IOData$EmptyInput.f98299a);
        this.M = R$layout.screen_card_reader_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompatibilityCheckScreen f150767b;

            {
                this.f150767b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarQ2 = this.f150767b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.compatibility.di.CompatibilityCheckScreenInjector");
                        p pVar = ((xb1.h) bVarQ2).f303929b;
                        r rVar = new r();
                        rVar.f303962a = e4m.b.b(new m(pVar, rVar, 1, 2));
                        rVar.f303963b = e4m.b.b(new m(pVar, rVar, 2, 2));
                        rVar.f303964c = e4m.b.b(new m(pVar, rVar, 0, 2));
                        return rVar;
                    default:
                        return (d) ((r) this.f150767b.N.getValue()).f303964c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: hc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompatibilityCheckScreen f150767b;

            {
                this.f150767b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarQ2 = this.f150767b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.compatibility.di.CompatibilityCheckScreenInjector");
                        p pVar = ((xb1.h) bVarQ2).f303929b;
                        r rVar = new r();
                        rVar.f303962a = e4m.b.b(new m(pVar, rVar, 1, 2));
                        rVar.f303963b = e4m.b.b(new m(pVar, rVar, 2, 2));
                        rVar.f303964c = e4m.b.b(new m(pVar, rVar, 0, 2));
                        return rVar;
                    default:
                        return (d) ((r) this.f150767b.N.getValue()).f303964c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (r) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (d) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }
}
