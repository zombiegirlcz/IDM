package com.revolut.feature.passcode_reminder.impl.ui.flow;

import aii.q;
import com.revolut.feature.passcode_reminder.impl.ui.flow.PasscodeReminderFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/passcode_reminder/impl/ui/flow/PasscodeReminderFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_passcode_reminder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PasscodeReminderFlow extends ViewController<q> implements f {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public PasscodeReminderFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ve9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeReminderFlow f288171b;

            {
                this.f288171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f288171b.m2()).a().get(re9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new re9.b(((re9.a) ((re9.c) aVar2.b())).f253552h);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", re9.c.class, " is not found"));
                    case 1:
                        return (b) ((re9.b) this.f288171b.L.getValue()).f253556c.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        PasscodeReminderFlow passcodeReminderFlow = this.f288171b;
                        return czi.c.d(i2, 4, null, passcodeReminderFlow, (b) passcodeReminderFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ve9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeReminderFlow f288171b;

            {
                this.f288171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f288171b.m2()).a().get(re9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new re9.b(((re9.a) ((re9.c) aVar2.b())).f253552h);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", re9.c.class, " is not found"));
                    case 1:
                        return (b) ((re9.b) this.f288171b.L.getValue()).f253556c.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        PasscodeReminderFlow passcodeReminderFlow = this.f288171b;
                        return czi.c.d(i22, 4, null, passcodeReminderFlow, (b) passcodeReminderFlow.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ve9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeReminderFlow f288171b;

            {
                this.f288171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f288171b.m2()).a().get(re9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new re9.b(((re9.a) ((re9.c) aVar2.b())).f253552h);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", re9.c.class, " is not found"));
                    case 1:
                        return (b) ((re9.b) this.f288171b.L.getValue()).f253556c.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        PasscodeReminderFlow passcodeReminderFlow = this.f288171b;
                        return czi.c.d(i22, 4, null, passcodeReminderFlow, (b) passcodeReminderFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (re9.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (re9.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (ve9.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
