package com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow;

import com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.AddressSuggestionFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.navigation.AddressSuggestionControllerDescriptor$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nng.p;
import qbl.c;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/address_suggestion/flow/AddressSuggestionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqbl/c;", "Lyki/f;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressSuggestionFlow extends ViewController<c> implements f {
    public final AddressSuggestionControllerDescriptor$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public AddressSuggestionFlow(AddressSuggestionControllerDescriptor$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: png.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSuggestionFlow f237761b;

            {
                this.f237761b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AddressSuggestionFlow addressSuggestionFlow = this.f237761b;
                        phm.a aVar = (phm.a) e.j(addressSuggestionFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        AddressSuggestionControllerDescriptor$InputData addressSuggestionControllerDescriptor$InputData = addressSuggestionFlow.K;
                        addressSuggestionControllerDescriptor$InputData.getClass();
                        return new nng.a(pVar, addressSuggestionControllerDescriptor$InputData);
                    case 1:
                        return (b) ((nng.a) this.f237761b.L.getValue()).f.get();
                    default:
                        AddressSuggestionFlow addressSuggestionFlow2 = this.f237761b;
                        return czi.c.d(0, 6, null, addressSuggestionFlow2, (b) addressSuggestionFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: png.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSuggestionFlow f237761b;

            {
                this.f237761b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AddressSuggestionFlow addressSuggestionFlow = this.f237761b;
                        phm.a aVar = (phm.a) e.j(addressSuggestionFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        AddressSuggestionControllerDescriptor$InputData addressSuggestionControllerDescriptor$InputData = addressSuggestionFlow.K;
                        addressSuggestionControllerDescriptor$InputData.getClass();
                        return new nng.a(pVar, addressSuggestionControllerDescriptor$InputData);
                    case 1:
                        return (b) ((nng.a) this.f237761b.L.getValue()).f.get();
                    default:
                        AddressSuggestionFlow addressSuggestionFlow2 = this.f237761b;
                        return czi.c.d(0, 6, null, addressSuggestionFlow2, (b) addressSuggestionFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: png.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSuggestionFlow f237761b;

            {
                this.f237761b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AddressSuggestionFlow addressSuggestionFlow = this.f237761b;
                        phm.a aVar = (phm.a) e.j(addressSuggestionFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        AddressSuggestionControllerDescriptor$InputData addressSuggestionControllerDescriptor$InputData = addressSuggestionFlow.K;
                        addressSuggestionControllerDescriptor$InputData.getClass();
                        return new nng.a(pVar, addressSuggestionControllerDescriptor$InputData);
                    case 1:
                        return (b) ((nng.a) this.f237761b.L.getValue()).f.get();
                    default:
                        AddressSuggestionFlow addressSuggestionFlow2 = this.f237761b;
                        return czi.c.d(0, 6, null, addressSuggestionFlow2, (b) addressSuggestionFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (nng.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (nng.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (png.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
