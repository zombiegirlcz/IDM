package com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility;

import aii.q;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.MobilityAccountSwitchingFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vn2.h;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MobilityAccountSwitchingFlow extends ViewController<q> implements f {
    public final BankAccountSwitchingFlowInputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public MobilityAccountSwitchingFlow(BankAccountSwitchingFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: np2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MobilityAccountSwitchingFlow f218123b;

            {
                this.f218123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MobilityAccountSwitchingFlow mobilityAccountSwitchingFlow = this.f218123b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mobilityAccountSwitchingFlow, (b) mobilityAccountSwitchingFlow.O.getValue());
                    case 1:
                        MobilityAccountSwitchingFlow mobilityAccountSwitchingFlow2 = this.f218123b;
                        phm.a aVar = (phm.a) ue0.e.j(mobilityAccountSwitchingFlow2.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f290682l;
                        BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData = mobilityAccountSwitchingFlow2.K;
                        bankAccountSwitchingFlowInputData.getClass();
                        return new vn2.w(hVar, bankAccountSwitchingFlowInputData);
                    default:
                        return (b) ((vn2.w) this.f218123b.N.getValue()).f290727c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: np2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MobilityAccountSwitchingFlow f218123b;

            {
                this.f218123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MobilityAccountSwitchingFlow mobilityAccountSwitchingFlow = this.f218123b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mobilityAccountSwitchingFlow, (b) mobilityAccountSwitchingFlow.O.getValue());
                    case 1:
                        MobilityAccountSwitchingFlow mobilityAccountSwitchingFlow2 = this.f218123b;
                        phm.a aVar = (phm.a) ue0.e.j(mobilityAccountSwitchingFlow2.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f290682l;
                        BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData = mobilityAccountSwitchingFlow2.K;
                        bankAccountSwitchingFlowInputData.getClass();
                        return new vn2.w(hVar, bankAccountSwitchingFlowInputData);
                    default:
                        return (b) ((vn2.w) this.f218123b.N.getValue()).f290727c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: np2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MobilityAccountSwitchingFlow f218123b;

            {
                this.f218123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MobilityAccountSwitchingFlow mobilityAccountSwitchingFlow = this.f218123b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mobilityAccountSwitchingFlow, (b) mobilityAccountSwitchingFlow.O.getValue());
                    case 1:
                        MobilityAccountSwitchingFlow mobilityAccountSwitchingFlow2 = this.f218123b;
                        phm.a aVar = (phm.a) ue0.e.j(mobilityAccountSwitchingFlow2.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f290682l;
                        BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData = mobilityAccountSwitchingFlow2.K;
                        bankAccountSwitchingFlowInputData.getClass();
                        return new vn2.w(hVar, bankAccountSwitchingFlowInputData);
                    default:
                        return (b) ((vn2.w) this.f218123b.N.getValue()).f290727c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vn2.w) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (vn2.w) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (np2.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
