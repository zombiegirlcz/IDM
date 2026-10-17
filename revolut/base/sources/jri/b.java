package jri;

import iri.h;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1d.b f178015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.a f178016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f178017c;
    public final Lazy d;

    public b(i1d.b frameworkFlowComponentsFactoryProvider, a2.a legacyFlowComponentsFactoryProvider) {
        Intrinsics.checkNotNullParameter(frameworkFlowComponentsFactoryProvider, "frameworkFlowComponentsFactoryProvider");
        Intrinsics.checkNotNullParameter(legacyFlowComponentsFactoryProvider, "legacyFlowComponentsFactoryProvider");
        this.f178015a = frameworkFlowComponentsFactoryProvider;
        this.f178016b = legacyFlowComponentsFactoryProvider;
        final int i = 0;
        this.f178017c = j.b(new Function0(this) { // from class: jri.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f178014b;

            {
                this.f178014b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (h) this.f178014b.f178016b.invoke();
                    default:
                        return (c) this.f178014b.f178015a.invoke();
                }
            }
        });
        final int i2 = 1;
        this.d = j.b(new Function0(this) { // from class: jri.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f178014b;

            {
                this.f178014b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (h) this.f178014b.f178016b.invoke();
                    default:
                        return (c) this.f178014b.f178015a.invoke();
                }
            }
        });
    }

    @Override // iri.h
    public final hri.a u1(Object obj2, String flowName) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        try {
            return ((h) this.d.getValue()).u1(obj2, flowName);
        } catch (IllegalStateException unused) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "javaClass", p.a.p("Flow with name ", flowName, " is not found in declaration framework. It's ok if flow is not migrated"), null, null, 16);
            return ((h) this.f178017c.getValue()).u1(obj2, flowName);
        }
    }
}
