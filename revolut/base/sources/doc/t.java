package doc;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f116518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final loc.b f116519n;
    public final eoc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eoc.b f116520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f116521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f116522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f116523s;

    public t(i input, loc.b chartProvider, eoc.a chartSettingsActionHandler, eoc.b chartSettingsMapper, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(chartProvider, "chartProvider");
        Intrinsics.checkNotNullParameter(chartSettingsActionHandler, "chartSettingsActionHandler");
        Intrinsics.checkNotNullParameter(chartSettingsMapper, "chartSettingsMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f116518m = input;
        this.f116519n = chartProvider;
        this.o = chartSettingsActionHandler;
        this.f116520p = chartSettingsMapper;
        this.f116521q = bottomExpandableDialogControllerExtension;
        final int i = 0;
        this.f116522r = yhm.j.b(new Function0(this) { // from class: doc.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f116512b;

            {
                this.f116512b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return vkm.q.c(((j) this.f116512b.b3()).f116505a);
                    default:
                        return vkm.q.c(((j) this.f116512b.b3()).d);
                }
            }
        });
        final int i2 = 1;
        this.f116523s = yhm.j.b(new Function0(this) { // from class: doc.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f116512b;

            {
                this.f116512b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return vkm.q.c(((j) this.f116512b.b3()).f116505a);
                    default:
                        return vkm.q.c(((j) this.f116512b.b3()).d);
                }
            }
        });
    }

    @Override // yji.n
    public final void D2() {
        Lazy lazy = this.f116522r;
        Continuation continuation = null;
        yji.n.j2(this, (MutableStateFlow) lazy.getValue(), null, new q(this, continuation, 0), 3);
        Lazy lazy2 = this.f116523s;
        yji.n.j2(this, (MutableStateFlow) lazy2.getValue(), null, new q(this, continuation, 1), 3);
        yji.n.j2(this, vkm.q.Q(new t38.e((MutableStateFlow) lazy2.getValue(), 24, new dfj.f((MutableStateFlow) lazy.getValue(), 3), new awd.b(3, 29, continuation)), new cvi.i(continuation, this, 23)), null, new q(this, continuation, 2), 3);
    }

    @Override // cki.a
    public final Object Z2() {
        i iVar = this.f116518m;
        iVar.getClass();
        return new j(null, r0.g(), null, iVar.f116504a, new eoc.e(true));
    }

    @Override // doc.f
    public final void e3(d chartInput) {
        Object value;
        Intrinsics.checkNotNullParameter(chartInput, "chartInput");
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f116522r.getValue();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.h(value, chartInput));
    }

    @Override // doc.f
    public final void f3(pdh.c timeSpan) {
        Object value;
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f116523s.getValue();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.h(value, timeSpan));
    }

    public final void g3(eoc.c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        eoc.e currentState = ((j) b3()).e;
        this.o.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        if (action == null) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = !action.f127897a;
        currentState.getClass();
        d3(new dmj.e0(new eoc.e(z), 6));
    }
}
