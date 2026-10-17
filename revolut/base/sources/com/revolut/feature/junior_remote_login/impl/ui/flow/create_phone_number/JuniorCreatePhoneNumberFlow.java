package com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number;

import com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.JuniorCreatePhoneNumberFlow;
import com.revolut.feature.junior_remote_login.navigation.JuniorCreatePhoneNumberDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import il8.h;
import il8.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ol8.c;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/create_phone_number/JuniorCreatePhoneNumberFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lol8/c;", "Lyki/f;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorCreatePhoneNumberFlow extends ViewController<c> implements f {
    public final JuniorCreatePhoneNumberDestination.InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public JuniorCreatePhoneNumberFlow(JuniorCreatePhoneNumberDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ol8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorCreatePhoneNumberFlow f226356b;

            {
                this.f226356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JuniorCreatePhoneNumberFlow juniorCreatePhoneNumberFlow = this.f226356b;
                        return czi.c.d(0, 6, null, juniorCreatePhoneNumberFlow, (b) juniorCreatePhoneNumberFlow.N.getValue());
                    case 1:
                        JuniorCreatePhoneNumberFlow juniorCreatePhoneNumberFlow2 = this.f226356b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorCreatePhoneNumberFlow2.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) ((pl8.b) aVar2.b())).f;
                        JuniorCreatePhoneNumberDestination.InputData inputData2 = juniorCreatePhoneNumberFlow2.K;
                        inputData2.getClass();
                        return new h(kVar, inputData2);
                    default:
                        return (b) ((h) ((pl8.a) this.f226356b.M.getValue())).f162157c.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ol8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorCreatePhoneNumberFlow f226356b;

            {
                this.f226356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JuniorCreatePhoneNumberFlow juniorCreatePhoneNumberFlow = this.f226356b;
                        return czi.c.d(0, 6, null, juniorCreatePhoneNumberFlow, (b) juniorCreatePhoneNumberFlow.N.getValue());
                    case 1:
                        JuniorCreatePhoneNumberFlow juniorCreatePhoneNumberFlow2 = this.f226356b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorCreatePhoneNumberFlow2.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) ((pl8.b) aVar2.b())).f;
                        JuniorCreatePhoneNumberDestination.InputData inputData2 = juniorCreatePhoneNumberFlow2.K;
                        inputData2.getClass();
                        return new h(kVar, inputData2);
                    default:
                        return (b) ((h) ((pl8.a) this.f226356b.M.getValue())).f162157c.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ol8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorCreatePhoneNumberFlow f226356b;

            {
                this.f226356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JuniorCreatePhoneNumberFlow juniorCreatePhoneNumberFlow = this.f226356b;
                        return czi.c.d(0, 6, null, juniorCreatePhoneNumberFlow, (b) juniorCreatePhoneNumberFlow.N.getValue());
                    case 1:
                        JuniorCreatePhoneNumberFlow juniorCreatePhoneNumberFlow2 = this.f226356b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorCreatePhoneNumberFlow2.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) ((pl8.b) aVar2.b())).f;
                        JuniorCreatePhoneNumberDestination.InputData inputData2 = juniorCreatePhoneNumberFlow2.K;
                        inputData2.getClass();
                        return new h(kVar, inputData2);
                    default:
                        return (b) ((h) ((pl8.a) this.f226356b.M.getValue())).f162157c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pl8.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (pl8.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ol8.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
