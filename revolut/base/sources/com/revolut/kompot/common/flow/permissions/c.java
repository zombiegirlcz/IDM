package com.revolut.kompot.common.flow.permissions;

import android.os.SystemClock;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.common.screens.prompt.PromptScreen;
import com.revolut.kompot.navigable.flow.FlowStep;
import fji.i;
import fji.j;
import fji.l;
import fji.m;
import fji.n;
import fji.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sdi.k;
import sii.f;
import sii.g;
import sii.h;
import ufm.e;
import vkm.j2;
import zhm.d0;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends aji.a implements sii.b {

    @NotNull
    public static final b Companion = new b();
    public final PermissionsFlowContract$IdleStep A;
    public final f B;
    public final PermissionsFlowContract$Permission[] C;
    public j2 D;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final PermissionsFlowContract$InputData f98353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final uii.b f98354y;
    public final s70.a z;

    public c(PermissionsFlowContract$InputData inputData, uii.b requester, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(requester, "requester");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f98353x = inputData;
        this.f98354y = requester;
        this.z = intentProvider;
        this.A = PermissionsFlowContract$IdleStep.f98344a;
        this.B = new f();
        this.C = (PermissionsFlowContract$Permission[]) inputData.f98345a.toArray(new PermissionsFlowContract$Permission[0]);
        q.Companion.getClass();
        this.D = vkm.q.c(fji.f.f135641b);
    }

    @Override // dki.g
    /* JADX INFO: renamed from: P2, reason: merged with bridge method [inline-methods] */
    public final PermissionsFlowContract$State x2() {
        List list = this.f98353x.f98345a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (this.f98354y.c(((PermissionsFlowContract$Permission) obj2).f98347a)) {
                arrayList.add(obj2);
            }
        }
        return new PermissionsFlowContract$State(list, d0.P0(arrayList, new h()));
    }

    public final PermissionsFlowContract$Permission Q2() {
        Object next;
        Iterator it8 = ((PermissionsFlowContract$State) A2().f98429a).f98351b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((PermissionsFlowContract$Permission) next).f98348b instanceof PermissionsFlowContract$Explanation.PromptScreen) {
                break;
            }
        }
        return (PermissionsFlowContract$Permission) next;
    }

    public final LinkedHashMap R2() {
        PermissionsFlowContract$Permission[] permissionsFlowContract$PermissionArr = this.C;
        int iB = q0.b(permissionsFlowContract$PermissionArr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (PermissionsFlowContract$Permission permissionsFlowContract$Permission : permissionsFlowContract$PermissionArr) {
            linkedHashMap.put(permissionsFlowContract$Permission.f98347a, this.f98354y.a(permissionsFlowContract$Permission));
        }
        return linkedHashMap;
    }

    public final boolean S2(List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            PermissionsFlowContract$Permission permission = (PermissionsFlowContract$Permission) next;
            uii.b bVar = this.f98354y;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(permission, "permission");
            if ((bVar.a(permission) == uii.c.EXPLANATION) && (permission.f98349c instanceof PermissionsFlowContract$Explanation.PromptScreen)) {
                break;
            }
        }
        PermissionsFlowContract$Permission permissionsFlowContract$Permission = (PermissionsFlowContract$Permission) next;
        PermissionsFlowContract$Explanation permissionsFlowContract$Explanation = permissionsFlowContract$Permission != null ? permissionsFlowContract$Permission.f98349c : null;
        if (permissionsFlowContract$Explanation == null || permissionsFlowContract$Explanation.equals(PermissionsFlowContract$Explanation.None.f98339a)) {
            return false;
        }
        if (!(permissionsFlowContract$Explanation instanceof PermissionsFlowContract$Explanation.PromptScreen)) {
            throw new NoWhenBranchMatchedException();
        }
        V2(PermissionsFlowContract$ExplanationStep.f98343a, (PermissionsFlowContract$Explanation.PromptScreen) permissionsFlowContract$Explanation);
        return true;
    }

    @Override // yji.l
    public final void T1(long j2) {
        PermissionsFlowContract$Permission permissionsFlowContract$PermissionQ2 = Q2();
        PermissionsFlowContract$Explanation permissionsFlowContract$Explanation = permissionsFlowContract$PermissionQ2 != null ? permissionsFlowContract$PermissionQ2.f98348b : null;
        PermissionsFlowContract$Explanation.PromptScreen promptScreen = permissionsFlowContract$Explanation instanceof PermissionsFlowContract$Explanation.PromptScreen ? (PermissionsFlowContract$Explanation.PromptScreen) permissionsFlowContract$Explanation : null;
        if (A2().f98430b instanceof PermissionsFlowContract$IdleStep) {
            U2();
            return;
        }
        if ((A2().f98430b instanceof PermissionsFlowContract$IntroductionStep) && promptScreen != null) {
            V2(PermissionsFlowContract$IntroductionStep.f98346a, promptScreen);
            return;
        }
        if (!(A2().f98430b instanceof PermissionsFlowContract$ExplanationStep)) {
            L2(PermissionsFlowContract$State.a(x2(), null, 3));
            U2();
        } else {
            if (S2(d0.B0(d.v0(this.C), d0.i1(((PermissionsFlowContract$State) A2().f98429a).f98351b)))) {
                return;
            }
            U2();
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void T2(a aVar) {
        e eVarU = efm.d0.u(16L, TimeUnit.MILLISECONDS, hhm.f.f152430b);
        Intrinsics.checkNotNullExpressionValue(eVarU, "timer(...)");
        k onSuccess = new k(this, aVar, 5);
        zii.c handleError = new zii.c(11);
        Intrinsics.checkNotNullParameter(eVarU, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        ((zii.h) this.f5585w.getValue()).g(eVarU, onSuccess, handleError);
    }

    public final void U2() {
        boolean zIsEmpty = ((PermissionsFlowContract$State) A2().f98429a).f98350a.isEmpty();
        a.C0596a c0596a = a.C0596a.f98352a;
        if (zIsEmpty) {
            T2(c0596a);
            return;
        }
        PermissionsFlowContract$Permission permissionsFlowContract$Permission = (PermissionsFlowContract$Permission) d0.d0(((PermissionsFlowContract$State) A2().f98429a).f98351b);
        PermissionsFlowContract$Explanation permissionsFlowContract$Explanation = permissionsFlowContract$Permission != null ? permissionsFlowContract$Permission.f98348b : null;
        if (!(permissionsFlowContract$Explanation instanceof PermissionsFlowContract$Explanation.None) && permissionsFlowContract$Explanation != null) {
            if (!(permissionsFlowContract$Explanation instanceof PermissionsFlowContract$Explanation.PromptScreen)) {
                throw new NoWhenBranchMatchedException();
            }
            V2(PermissionsFlowContract$IntroductionStep.f98346a, (PermissionsFlowContract$Explanation.PromptScreen) permissionsFlowContract$Explanation);
            return;
        }
        List list = ((PermissionsFlowContract$State) A2().f98429a).f98351b;
        boolean zIsEmpty2 = list.isEmpty();
        f fVar = this.B;
        if (!zIsEmpty2) {
            E2(PermissionsFlowContract$IdleStep.f98344a, false, null, false);
            s86.a block = new s86.a(this, list, 15);
            fVar.getClass();
            Intrinsics.checkNotNullParameter(block, "block");
            fVar.f263638a.set(SystemClock.elapsedRealtime());
            block.invoke();
            return;
        }
        if (S2(((PermissionsFlowContract$State) A2().f98429a).f98350a)) {
            return;
        }
        PermissionsFlowContract$Permission[] permissionsFlowContract$PermissionArr = this.C;
        int i = g.f263639a[this.f98354y.a((PermissionsFlowContract$Permission[]) Arrays.copyOf(permissionsFlowContract$PermissionArr, permissionsFlowContract$PermissionArr.length)).ordinal()];
        if (i == 1) {
            T2(c0596a);
            return;
        }
        if (i == 2) {
            T2(new sii.c(R2(), false));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashMap linkedHashMapR2 = R2();
            fVar.getClass();
            T2(new sii.d(linkedHashMapR2, SystemClock.elapsedRealtime() - fVar.f263638a.get() > 600));
        }
    }

    public final void V2(PermissionsFlowContract$InfoStep step, PermissionsFlowContract$Explanation.PromptScreen payload) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (A2().f98430b.getClass() == step.getClass()) {
            j2 j2Var = this.D;
            Companion.getClass();
            j2Var.setValue(new fji.h(b.a(payload)));
        } else {
            Companion.getClass();
            this.D = vkm.q.c(new fji.h(b.a(payload)));
            E2(step, false, null, false);
        }
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PermissionsFlowContract$PermissionFlowStep step = (PermissionsFlowContract$PermissionFlowStep) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PermissionsFlowContract$IdleStep) {
            return new LayoutViewerScreen(R$layout.screen_transparent);
        }
        if (step instanceof PermissionsFlowContract$ExplanationStep) {
            PromptScreen promptScreen = new PromptScreen(this.D);
            final int i = 0;
            Function1 block = new Function1(this) { // from class: sii.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.kompot.common.flow.permissions.c f263637b;

                {
                    this.f263637b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    n output = (n) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof j;
                            com.revolut.kompot.common.flow.permissions.c cVar = this.f263637b;
                            if (z) {
                                cVar.I2();
                            } else if (output instanceof m) {
                                cVar.T2(new c(cVar.R2(), true));
                            } else {
                                if (!(output instanceof i) && !(output instanceof fji.k) && !(output instanceof l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.C1(new ExternalDestination.ByIntent(((s70.b) cVar.z).b(), null));
                            }
                            return Unit.f186387a;
                        default:
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z3 = output instanceof j;
                            com.revolut.kompot.common.flow.permissions.c cVar2 = this.f263637b;
                            if (z3) {
                                cVar2.I2();
                            } else {
                                if (!(output instanceof m) && !(output instanceof i) && !(output instanceof fji.k) && !(output instanceof l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                PermissionsFlowContract$Permission permissionsFlowContract$PermissionQ2 = cVar2.Q2();
                                if (permissionsFlowContract$PermissionQ2 == null) {
                                    throw new IllegalStateException("Broken sate: introduction shown but not pending permission with intro");
                                }
                                f fVar = cVar2.B;
                                s86.a block2 = new s86.a(cVar2, permissionsFlowContract$PermissionQ2, 16);
                                fVar.getClass();
                                Intrinsics.checkNotNullParameter(block2, "block");
                                fVar.f263638a.set(SystemClock.elapsedRealtime());
                                block2.invoke();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            promptScreen.H = block;
            return promptScreen;
        }
        if (!(step instanceof PermissionsFlowContract$IntroductionStep)) {
            throw new NoWhenBranchMatchedException();
        }
        PromptScreen promptScreen2 = new PromptScreen(this.D);
        final int i2 = 1;
        Function1 block2 = new Function1(this) { // from class: sii.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.kompot.common.flow.permissions.c f263637b;

            {
                this.f263637b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                n output = (n) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof j;
                        com.revolut.kompot.common.flow.permissions.c cVar = this.f263637b;
                        if (z) {
                            cVar.I2();
                        } else if (output instanceof m) {
                            cVar.T2(new c(cVar.R2(), true));
                        } else {
                            if (!(output instanceof i) && !(output instanceof fji.k) && !(output instanceof l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C1(new ExternalDestination.ByIntent(((s70.b) cVar.z).b(), null));
                        }
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z3 = output instanceof j;
                        com.revolut.kompot.common.flow.permissions.c cVar2 = this.f263637b;
                        if (z3) {
                            cVar2.I2();
                        } else {
                            if (!(output instanceof m) && !(output instanceof i) && !(output instanceof fji.k) && !(output instanceof l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            PermissionsFlowContract$Permission permissionsFlowContract$PermissionQ2 = cVar2.Q2();
                            if (permissionsFlowContract$PermissionQ2 == null) {
                                throw new IllegalStateException("Broken sate: introduction shown but not pending permission with intro");
                            }
                            f fVar = cVar2.B;
                            s86.a block22 = new s86.a(cVar2, permissionsFlowContract$PermissionQ2, 16);
                            fVar.getClass();
                            Intrinsics.checkNotNullParameter(block22, "block");
                            fVar.f263638a.set(SystemClock.elapsedRealtime());
                            block22.invoke();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        promptScreen2.H = block2;
        return promptScreen2;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.A;
    }
}
