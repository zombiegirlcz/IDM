package e0f;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agf.b f121597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pze.a f121598b;

    public e1(agf.b transactionWorkflowInteractor, pze.a finCrimeTopUpResultDialogHandler) {
        Intrinsics.checkNotNullParameter(transactionWorkflowInteractor, "transactionWorkflowInteractor");
        Intrinsics.checkNotNullParameter(finCrimeTopUpResultDialogHandler, "finCrimeTopUpResultDialogHandler");
        this.f121597a = transactionWorkflowInteractor;
        this.f121598b = finCrimeTopUpResultDialogHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(cue.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof e0f.d1
            if (r0 == 0) goto L13
            r0 = r6
            e0f.d1 r0 = (e0f.d1) r0
            int r1 = r0.f121594x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121594x = r1
            goto L18
        L13:
            e0f.d1 r0 = new e0f.d1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121594x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cue.d r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = r5.f108991a
            r0.u = r5
            r0.f121594x = r3
            agf.b r2 = r4.f121597a
            cgf.b r2 = (cgf.b) r2
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            bgf.j r6 = (bgf.j) r6
            boolean r0 = r6 instanceof bgf.g
            if (r0 == 0) goto L51
            e0f.a1 r6 = new e0f.a1
            r6.<init>(r5)
            return r6
        L51:
            boolean r0 = r6 instanceof bgf.f
            if (r0 == 0) goto L5b
            e0f.x0 r6 = new e0f.x0
            r6.<init>(r5)
            return r6
        L5b:
            boolean r0 = r6 instanceof bgf.h
            if (r0 == 0) goto L96
            bgf.h r6 = (bgf.h) r6
            bgf.e r0 = r6.f15198c
            if (r0 == 0) goto L68
            bgf.c r0 = r0.f15191a
            goto L69
        L68:
            r0 = 0
        L69:
            if (r0 != 0) goto L6d
            r0 = -1
            goto L75
        L6d:
            int[] r1 = e0f.c1.f121587a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L75:
            if (r0 == r3) goto L8c
            r1 = 2
            if (r0 == r1) goto L82
            e0f.w0 r0 = new e0f.w0
            java.lang.String r1 = r5.f108991a
            r0.<init>(r5, r6, r1)
            return r0
        L82:
            e0f.z0 r0 = new e0f.z0
            e0f.y0 r1 = e0f.y0.Waiting
            java.lang.String r2 = r5.f108991a
            r0.<init>(r5, r1, r6, r2)
            return r0
        L8c:
            e0f.z0 r0 = new e0f.z0
            e0f.y0 r1 = e0f.y0.Warning
            java.lang.String r2 = r5.f108991a
            r0.<init>(r5, r1, r6, r2)
            return r0
        L96:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.e1.a(cue.d, gim.c):java.lang.Object");
    }

    public final Object b(nii.e eVar, Function1 function1, Function2 function2, gim.c cVar) {
        FeatureCommand featureCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6)));
        if (eVar instanceof nii.c) {
            function1.invoke(((nii.c) eVar).f216123a);
        } else {
            if (!(eVar instanceof nii.d)) {
                throw new NoWhenBranchMatchedException();
            }
            nii.d dVar = (nii.d) eVar;
            nii.n1 n1Var = dVar.f216134b;
            b1 b1Var = (b1) dVar.f216133a;
            if (b1Var instanceof a1) {
                Object objInvoke = function2.invoke(((a1) b1Var).f121583a, cVar);
                return objInvoke == fim.a.COROUTINE_SUSPENDED ? objInvoke : Unit.f186387a;
            }
            if (b1Var instanceof z0) {
                z0 z0Var = (z0) b1Var;
                int i = c1.f121588b[z0Var.f121711b.ordinal()];
                pze.a aVar = this.f121598b;
                if (i == 1) {
                    String str = z0Var.d;
                    if (n1Var != null && str != null) {
                        bib.b bVar = new bib.b(this, b1Var, str, featureCommandF, 7);
                        aVar.getClass();
                        pze.a.c(n1Var, bVar);
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (n1Var != null) {
                        dv9.r rVar = new dv9.r(25);
                        aVar.getClass();
                        pze.a.b(n1Var, rVar);
                    }
                }
            } else {
                if (!(b1Var instanceof w0)) {
                    if (!(b1Var instanceof x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objInvoke2 = function2.invoke(((x0) b1Var).f121701a, cVar);
                    return objInvoke2 == fim.a.COROUTINE_SUSPENDED ? objInvoke2 : Unit.f186387a;
                }
                w0 w0Var = (w0) b1Var;
                ((cgf.b) this.f121597a).b(w0Var.f121698b, featureCommandF, w0Var.f121699c);
            }
        }
        return Unit.f186387a;
    }

    public final nii.m0 c(b1 transactionResult) {
        Intrinsics.checkNotNullParameter(transactionResult, "transactionResult");
        if ((transactionResult instanceof w0) || (transactionResult instanceof x0)) {
            return null;
        }
        boolean z = transactionResult instanceof a1;
        pze.a aVar = this.f121598b;
        if (z) {
            return aVar.a();
        }
        if (!(transactionResult instanceof z0)) {
            throw new NoWhenBranchMatchedException();
        }
        z0 z0Var = (z0) transactionResult;
        bgf.e popup = z0Var.f121712c.f15198c;
        int i = c1.f121588b[z0Var.f121711b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (popup != null) {
                aVar.getClass();
                Intrinsics.checkNotNullParameter(popup, "popup");
                cpf.b bVar = aVar.f240985a;
                String str = popup.f15192b;
                String str2 = popup.f15193c;
                bgf.d dVar = popup.e;
                return ((wpf.a) bVar).d(str, str2, dVar != null ? dVar.f15190a : null).f216244b;
            }
        } else if (popup != null) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(popup, "popup");
            cpf.b bVar2 = aVar.f240985a;
            String str3 = popup.f15192b;
            String str4 = popup.f15193c;
            bgf.d dVar2 = popup.e;
            return ((wpf.a) bVar2).e(str3, str4, dVar2 != null ? dVar2.f15190a : null).f216244b;
        }
        return null;
    }
}
