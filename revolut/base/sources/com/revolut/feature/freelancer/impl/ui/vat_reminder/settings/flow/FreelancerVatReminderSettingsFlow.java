package com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.flow;

import a0.d;
import aii.q;
import bt6.g;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.flow.FreelancerVatReminderSettingsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/settings/flow/FreelancerVatReminderSettingsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerVatReminderSettingsFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public FreelancerVatReminderSettingsFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: e57.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatReminderSettingsFlow f122775b;

            {
                this.f122775b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f122775b.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new g(((bt6.b) aVar2.b()).f18307t);
                        }
                        throw new IllegalStateException(d.q("Api ", bt6.b.class, " is not found"));
                    case 1:
                        return (b) ((g) this.f122775b.K.getValue()).f18347c.get();
                    default:
                        FreelancerVatReminderSettingsFlow freelancerVatReminderSettingsFlow = this.f122775b;
                        return c.d(0, 6, null, freelancerVatReminderSettingsFlow, (b) freelancerVatReminderSettingsFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: e57.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatReminderSettingsFlow f122775b;

            {
                this.f122775b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f122775b.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new g(((bt6.b) aVar2.b()).f18307t);
                        }
                        throw new IllegalStateException(d.q("Api ", bt6.b.class, " is not found"));
                    case 1:
                        return (b) ((g) this.f122775b.K.getValue()).f18347c.get();
                    default:
                        FreelancerVatReminderSettingsFlow freelancerVatReminderSettingsFlow = this.f122775b;
                        return c.d(0, 6, null, freelancerVatReminderSettingsFlow, (b) freelancerVatReminderSettingsFlow.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: e57.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatReminderSettingsFlow f122775b;

            {
                this.f122775b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f122775b.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new g(((bt6.b) aVar2.b()).f18307t);
                        }
                        throw new IllegalStateException(d.q("Api ", bt6.b.class, " is not found"));
                    case 1:
                        return (b) ((g) this.f122775b.K.getValue()).f18347c.get();
                    default:
                        FreelancerVatReminderSettingsFlow freelancerVatReminderSettingsFlow = this.f122775b;
                        return c.d(0, 6, null, freelancerVatReminderSettingsFlow, (b) freelancerVatReminderSettingsFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (e57.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
