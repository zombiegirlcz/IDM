package com.revolut.feature.web_sign_in.ui.flow.web_sign_in;

import aii.q;
import com.revolut.feature.web_sign_in.navigation.WebSignInDestinationInput;
import com.revolut.feature.web_sign_in.ui.flow.web_sign_in.WebSignInFlow;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step;", "Lcom/revolut/feature/web_sign_in/navigation/WebSignInDestinationInput;", "Laii/q;", "Lin0/g;", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class WebSignInFlow extends BaseFlow<WebSignInFlowContract$Step, WebSignInDestinationInput, q> implements g {
    public final WebSignInDestinationInput P;
    public final boolean Q;
    public final Object R;
    public final Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSignInFlow(WebSignInDestinationInput input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.P = input;
        this.Q = true;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: vrh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebSignInFlow f291598b;

            {
                this.f291598b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        WebSignInFlow webSignInFlow = this.f291598b;
                        phm.a aVar = (phm.a) ue0.e.j(webSignInFlow.m2()).a().get(srh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", srh.b.class, " is not found"));
                        }
                        srh.b bVar = ((srh.b) aVar2.b()).d;
                        WebSignInDestinationInput webSignInDestinationInput = webSignInFlow.P;
                        webSignInDestinationInput.getClass();
                        return new srh.d(bVar, webSignInDestinationInput);
                    default:
                        return (b) ((srh.d) this.f291598b.R.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: vrh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebSignInFlow f291598b;

            {
                this.f291598b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        WebSignInFlow webSignInFlow = this.f291598b;
                        phm.a aVar = (phm.a) ue0.e.j(webSignInFlow.m2()).a().get(srh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", srh.b.class, " is not found"));
                        }
                        srh.b bVar = ((srh.b) aVar2.b()).d;
                        WebSignInDestinationInput webSignInDestinationInput = webSignInFlow.P;
                        webSignInDestinationInput.getClass();
                        return new srh.d(bVar, webSignInDestinationInput);
                    default:
                        return (b) ((srh.d) this.f291598b.R.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (srh.d) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (srh.d) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (vrh.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        WebSignInFlowContract$Step step = (WebSignInFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }
}
