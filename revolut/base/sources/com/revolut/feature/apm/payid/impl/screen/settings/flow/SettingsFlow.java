package com.revolut.feature.apm.payid.impl.screen.settings.flow;

import a0.d;
import com.revolut.feature.apm.payid.impl.screen.settings.flow.SettingsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import ea2.h;
import ea2.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/settings/flow/SettingsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingsFlow extends ViewController<Object> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public SettingsFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: hb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFlow f150558b;

            {
                this.f150558b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((k) this.f150558b.L.getValue()).f124092c.get();
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f150558b.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k(((h) aVar2.b()).f124079n);
                        }
                        throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                    default:
                        SettingsFlow settingsFlow = this.f150558b;
                        return czi.c.d(0, 6, null, settingsFlow, (b) settingsFlow.K.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: hb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFlow f150558b;

            {
                this.f150558b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((k) this.f150558b.L.getValue()).f124092c.get();
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f150558b.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k(((h) aVar2.b()).f124079n);
                        }
                        throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                    default:
                        SettingsFlow settingsFlow = this.f150558b;
                        return czi.c.d(0, 6, null, settingsFlow, (b) settingsFlow.K.getValue());
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: hb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFlow f150558b;

            {
                this.f150558b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((k) this.f150558b.L.getValue()).f124092c.get();
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f150558b.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k(((h) aVar2.b()).f124079n);
                        }
                        throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                    default:
                        SettingsFlow settingsFlow = this.f150558b;
                        return czi.c.d(0, 6, null, settingsFlow, (b) settingsFlow.K.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (hb2.b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
