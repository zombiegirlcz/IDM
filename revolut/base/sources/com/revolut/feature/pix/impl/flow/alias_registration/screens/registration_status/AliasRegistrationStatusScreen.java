package com.revolut.feature.pix.impl.flow.alias_registration.screens.registration_status;

import com.revolut.feature.pix.api.model.AliasRegistrationResult;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.registration_status.AliasRegistrationStatusScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import d9a.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import p8a.d0;
import p8a.f;
import p8a.g;
import pki.b;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_registration/screens/registration_status/AliasRegistrationStatusScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AliasRegistrationStatusScreen extends SimpleViewController<AliasRegistrationResult> implements d1 {
    public final AliasRegistrationType N;
    public final int O;
    public final Object P;
    public final Object Q;

    public AliasRegistrationStatusScreen(AliasRegistrationType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.N = type;
        this.O = R$layout.screen_transparent;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: d9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasRegistrationStatusScreen f112356b;

            {
                this.f112356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AliasRegistrationStatusScreen aliasRegistrationStatusScreen = this.f112356b;
                        qji.b bVarU2 = aliasRegistrationStatusScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_registration.screens.registration_status.di.AliasRegistrationStatusScreenInjector");
                        f fVar = (f) bVarU2;
                        d0 d0Var = fVar.f233958b;
                        f fVar2 = fVar.f233959c;
                        AliasRegistrationType aliasRegistrationType = aliasRegistrationStatusScreen.N;
                        aliasRegistrationType.getClass();
                        return new g(d0Var, fVar2, aliasRegistrationType);
                    default:
                        return (d) ((g) this.f112356b.P.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: d9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasRegistrationStatusScreen f112356b;

            {
                this.f112356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AliasRegistrationStatusScreen aliasRegistrationStatusScreen = this.f112356b;
                        qji.b bVarU2 = aliasRegistrationStatusScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_registration.screens.registration_status.di.AliasRegistrationStatusScreenInjector");
                        f fVar = (f) bVarU2;
                        d0 d0Var = fVar.f233958b;
                        f fVar2 = fVar.f233959c;
                        AliasRegistrationType aliasRegistrationType = aliasRegistrationStatusScreen.N;
                        aliasRegistrationType.getClass();
                        return new g(d0Var, fVar2, aliasRegistrationType);
                    default:
                        return (d) ((g) this.f112356b.P.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }
}
