package com.revolut.feature.profile.impl.ui.profile;

import a0.d;
import aii.q;
import com.revolut.feature.profile.impl.ui.profile.ProfileFlow;
import com.revolut.feature.profile.impl.ui.profile.ProfileFlowContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import fma.c0;
import fma.d0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileFlow extends ViewController<q> implements f {
    public final ProfileFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ProfileFlow(ProfileFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.base_flow_container;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileFlow f207494b;

            {
                this.f207494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ProfileFlow profileFlow = this.f207494b;
                        phm.a aVar = (phm.a) e.j(profileFlow.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        ProfileFlowContract$InputData profileFlowContract$InputData = profileFlow.K;
                        profileFlowContract$InputData.getClass();
                        return new d0(c0Var, profileFlow, profileFlowContract$InputData);
                    case 1:
                        return (b) ((d0) this.f207494b.M.getValue()).d.get();
                    default:
                        int i2 = R$id.container;
                        ProfileFlow profileFlow2 = this.f207494b;
                        return czi.c.d(i2, 4, null, profileFlow2, (b) profileFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileFlow f207494b;

            {
                this.f207494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ProfileFlow profileFlow = this.f207494b;
                        phm.a aVar = (phm.a) e.j(profileFlow.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        ProfileFlowContract$InputData profileFlowContract$InputData = profileFlow.K;
                        profileFlowContract$InputData.getClass();
                        return new d0(c0Var, profileFlow, profileFlowContract$InputData);
                    case 1:
                        return (b) ((d0) this.f207494b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.container;
                        ProfileFlow profileFlow2 = this.f207494b;
                        return czi.c.d(i22, 4, null, profileFlow2, (b) profileFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: mna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileFlow f207494b;

            {
                this.f207494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ProfileFlow profileFlow = this.f207494b;
                        phm.a aVar = (phm.a) e.j(profileFlow.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        ProfileFlowContract$InputData profileFlowContract$InputData = profileFlow.K;
                        profileFlowContract$InputData.getClass();
                        return new d0(c0Var, profileFlow, profileFlowContract$InputData);
                    case 1:
                        return (b) ((d0) this.f207494b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.container;
                        ProfileFlow profileFlow2 = this.f207494b;
                        return czi.c.d(i22, 4, null, profileFlow2, (b) profileFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (d0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (mna.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
