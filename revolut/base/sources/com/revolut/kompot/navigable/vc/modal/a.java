package com.revolut.kompot.navigable.vc.modal;

import aii.t;
import android.os.Bundle;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.l;
import yki.h;
import zki.b;
import zki.c;
import zki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final b Companion = new b();
    public static int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f98442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f98443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f98444c;
    public final ArrayList d;

    public a(l hostModel, Function2 controllersFactory) {
        Intrinsics.checkNotNullParameter(hostModel, "hostModel");
        Intrinsics.checkNotNullParameter(controllersFactory, "controllersFactory");
        this.f98442a = hostModel;
        this.f98443b = controllersFactory;
        this.d = new ArrayList();
    }

    public final void a(FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) this.f98443b.invoke(this, step);
        knm.b.j(this.f98442a.l1(), new com.revolut.kompot.common.b(aVar, style, 4));
        d(aVar, step, style, false);
    }

    public final void b(FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) this.f98443b.invoke(this, step);
        knm.b.j(this.f98442a.l1(), new t(new com.revolut.kompot.common.b(aVar, style, 4)));
        d(aVar, step, style, true);
    }

    public final void c() {
        ArrayList<ModalCoordinator$ModalStackEntrySnapshot> parcelableArrayList;
        Bundle bundle = this.f98444c;
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("MODALS_STACK_ARG")) != null) {
            for (ModalCoordinator$ModalStackEntrySnapshot modalCoordinator$ModalStackEntrySnapshot : parcelableArrayList) {
                FlowStep flowStep = modalCoordinator$ModalStackEntrySnapshot.f98440b;
                boolean z = modalCoordinator$ModalStackEntrySnapshot.e;
                ModalDestination.Style style = modalCoordinator$ModalStackEntrySnapshot.d;
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) this.f98443b.invoke(this, flowStep);
                Bundle bundle2 = modalCoordinator$ModalStackEntrySnapshot.f98441c;
                if (aVar != null) {
                    aVar.j2(new zk7.a(aVar, bundle2, 2));
                }
                this.f98442a.l1().M0(new i(modalCoordinator$ModalStackEntrySnapshot.f98439a, aVar, style, z));
                d(aVar, modalCoordinator$ModalStackEntrySnapshot.f98440b, style, z);
            }
        }
        this.f98444c = null;
    }

    public final void d(com.revolut.kompot.navigable.a aVar, FlowStep flowStep, ModalDestination.Style style, boolean z) {
        int i = e;
        e = i + 1;
        final c cVar = new c(i, flowStep, aVar, style, z);
        final int i2 = 0;
        aVar.j2(new Function0(this) { // from class: zki.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.kompot.navigable.vc.modal.a f323047b;

            {
                this.f323047b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        this.f323047b.d.add(cVar);
                        break;
                    default:
                        this.f323047b.d.remove(cVar);
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i3 = 1;
        aVar.k2(new Function0(this) { // from class: zki.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.kompot.navigable.vc.modal.a f323047b;

            {
                this.f323047b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        this.f323047b.d.add(cVar);
                        break;
                    default:
                        this.f323047b.d.remove(cVar);
                        break;
                }
                return Unit.f186387a;
            }
        });
    }

    public final void e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        ArrayList<c> arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (c cVar : arrayList) {
            Bundle bundle = new Bundle();
            cVar.f323051c.g(bundle);
            h.Companion.getClass();
            ModalCoordinator$ModalStackEntrySnapshot modalCoordinator$ModalStackEntrySnapshot = h.a.a(bundle) ? null : new ModalCoordinator$ModalStackEntrySnapshot(cVar.f323049a, cVar.f323050b, bundle, cVar.d, cVar.e);
            if (modalCoordinator$ModalStackEntrySnapshot != null) {
                arrayList2.add(modalCoordinator$ModalStackEntrySnapshot);
            }
        }
        outBundle.putParcelableArrayList("MODALS_STACK_ARG", new ArrayList<>(arrayList2));
    }
}
