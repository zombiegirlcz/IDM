package com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow;

import a0.d;
import aii.q;
import ap8.c;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.JuniorSettingsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mn8.m;
import mn8.o;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/settings_flow/JuniorSettingsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorSettingsFlow extends ViewController<q> implements f {
    public final c K;
    public final Object L;
    public final Object M;
    public final Object N;

    public JuniorSettingsFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ap8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSettingsFlow f8117b;

            {
                this.f8117b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JuniorSettingsFlow juniorSettingsFlow = this.f8117b;
                        return czi.c.d(0, 6, null, juniorSettingsFlow, (b) juniorSettingsFlow.N.getValue());
                    case 1:
                        JuniorSettingsFlow juniorSettingsFlow2 = this.f8117b;
                        phm.a aVar = (phm.a) e.j(juniorSettingsFlow2.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        c cVar = juniorSettingsFlow2.K;
                        cVar.getClass();
                        return new m(oVar, cVar);
                    default:
                        return (b) ((m) this.f8117b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ap8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSettingsFlow f8117b;

            {
                this.f8117b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JuniorSettingsFlow juniorSettingsFlow = this.f8117b;
                        return czi.c.d(0, 6, null, juniorSettingsFlow, (b) juniorSettingsFlow.N.getValue());
                    case 1:
                        JuniorSettingsFlow juniorSettingsFlow2 = this.f8117b;
                        phm.a aVar = (phm.a) e.j(juniorSettingsFlow2.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        c cVar = juniorSettingsFlow2.K;
                        cVar.getClass();
                        return new m(oVar, cVar);
                    default:
                        return (b) ((m) this.f8117b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ap8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSettingsFlow f8117b;

            {
                this.f8117b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JuniorSettingsFlow juniorSettingsFlow = this.f8117b;
                        return czi.c.d(0, 6, null, juniorSettingsFlow, (b) juniorSettingsFlow.N.getValue());
                    case 1:
                        JuniorSettingsFlow juniorSettingsFlow2 = this.f8117b;
                        phm.a aVar = (phm.a) e.j(juniorSettingsFlow2.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        c cVar = juniorSettingsFlow2.K;
                        cVar.getClass();
                        return new m(oVar, cVar);
                    default:
                        return (b) ((m) this.f8117b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ap8.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
