package com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation;

import a0.d;
import aii.q;
import cm2.i;
import com.revolut.feature.backgroundpicker.api.Preselection;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation.ThemeCustomisationFlow;
import com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation.ThemeCustomisationFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pm2.c;
import pm2.h;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/ui/flow/theme_customisation/ThemeCustomisationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemeCustomisationFlow extends ViewController<q> implements f {
    public final ThemedBackgroundKey K;
    public final List L;
    public final i M;
    public final Preselection N;
    public final boolean O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public /* synthetic */ ThemeCustomisationFlow(ThemedBackgroundKey themedBackgroundKey, List list, i iVar) {
        this(themedBackgroundKey, list, iVar, null, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pm2.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (pm2.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (en2.b) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF93100a0() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }

    public ThemeCustomisationFlow(ThemedBackgroundKey themedBackgroundKey, List scopes, i iVar, Preselection preselection, boolean z) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.K = themedBackgroundKey;
        this.L = scopes;
        this.M = iVar;
        this.N = preselection;
        this.O = z;
        this.P = R$layout.screen_transparent;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: en2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThemeCustomisationFlow f127710b;

            {
                this.f127710b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ThemeCustomisationFlow themeCustomisationFlow = this.f127710b;
                        phm.a aVar = (phm.a) ue0.e.j(themeCustomisationFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new pm2.e(((c) aVar2.b()).f237462g, new ThemeCustomisationFlowContract$InputData(themeCustomisationFlow.K, themeCustomisationFlow.L, themeCustomisationFlow.M, themeCustomisationFlow.N, themeCustomisationFlow.O));
                        }
                        throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                    case 1:
                        return (b) ((pm2.e) this.f127710b.Q.getValue()).f237467b.get();
                    default:
                        ThemeCustomisationFlow themeCustomisationFlow2 = this.f127710b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, themeCustomisationFlow2, (b) themeCustomisationFlow2.R.getValue());
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: en2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThemeCustomisationFlow f127710b;

            {
                this.f127710b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ThemeCustomisationFlow themeCustomisationFlow = this.f127710b;
                        phm.a aVar = (phm.a) ue0.e.j(themeCustomisationFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new pm2.e(((c) aVar2.b()).f237462g, new ThemeCustomisationFlowContract$InputData(themeCustomisationFlow.K, themeCustomisationFlow.L, themeCustomisationFlow.M, themeCustomisationFlow.N, themeCustomisationFlow.O));
                        }
                        throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                    case 1:
                        return (b) ((pm2.e) this.f127710b.Q.getValue()).f237467b.get();
                    default:
                        ThemeCustomisationFlow themeCustomisationFlow2 = this.f127710b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, themeCustomisationFlow2, (b) themeCustomisationFlow2.R.getValue());
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: en2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThemeCustomisationFlow f127710b;

            {
                this.f127710b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ThemeCustomisationFlow themeCustomisationFlow = this.f127710b;
                        phm.a aVar = (phm.a) ue0.e.j(themeCustomisationFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new pm2.e(((c) aVar2.b()).f237462g, new ThemeCustomisationFlowContract$InputData(themeCustomisationFlow.K, themeCustomisationFlow.L, themeCustomisationFlow.M, themeCustomisationFlow.N, themeCustomisationFlow.O));
                        }
                        throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                    case 1:
                        return (b) ((pm2.e) this.f127710b.Q.getValue()).f237467b.get();
                    default:
                        ThemeCustomisationFlow themeCustomisationFlow2 = this.f127710b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, themeCustomisationFlow2, (b) themeCustomisationFlow2.R.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.S.getValue();
    }
}
