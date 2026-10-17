package com.revolut.appupdate.ui;

import a0.d;
import aii.q;
import bq.j;
import bq.k;
import com.revolut.appupdate.ui.AppUpdateContract$InputData;
import com.revolut.appupdate.ui.AppUpdateFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/appupdate/ui/AppUpdateFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/appupdate/ui/AppUpdateContract$Step;", "Lcom/revolut/appupdate/ui/AppUpdateContract$InputData;", "Laii/q;", "appupdate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppUpdateFlow extends BaseFlow<AppUpdateContract$Step, AppUpdateContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateFlow(AppUpdateContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: eq.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppUpdateFlow f128214b;

            {
                this.f128214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        k kVar = (k) this.f128214b.Q.getValue();
                        return new com.revolut.appupdate.ui.a(kVar.f17658a, kVar.f17659b.f17657c.h());
                    default:
                        AppUpdateFlow appUpdateFlow = this.f128214b;
                        phm.a aVar = (phm.a) e.j(appUpdateFlow.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).d;
                        AppUpdateContract$InputData appUpdateContract$InputData = (AppUpdateContract$InputData) appUpdateFlow.G;
                        appUpdateContract$InputData.getClass();
                        return new k(jVar, appUpdateContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: eq.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppUpdateFlow f128214b;

            {
                this.f128214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        k kVar = (k) this.f128214b.Q.getValue();
                        return new com.revolut.appupdate.ui.a(kVar.f17658a, kVar.f17659b.f17657c.h());
                    default:
                        AppUpdateFlow appUpdateFlow = this.f128214b;
                        phm.a aVar = (phm.a) e.j(appUpdateFlow.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).d;
                        AppUpdateContract$InputData appUpdateContract$InputData = (AppUpdateContract$InputData) appUpdateFlow.G;
                        appUpdateContract$InputData.getClass();
                        return new k(jVar, appUpdateContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (k) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2 */
    public final int getQ() {
        return R$id.screen_transparent_container;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        AppUpdateContract$Step step = (AppUpdateContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return R$layout.screen_transparent;
    }
}
