package e0f;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agf.b f121614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pze.a f121615b;

    public i0(agf.b transactionWorkflowInteractor, pze.a finCrimeTopUpResultDialogHandler) {
        Intrinsics.checkNotNullParameter(transactionWorkflowInteractor, "transactionWorkflowInteractor");
        Intrinsics.checkNotNullParameter(finCrimeTopUpResultDialogHandler, "finCrimeTopUpResultDialogHandler");
        this.f121614a = transactionWorkflowInteractor;
        this.f121615b = finCrimeTopUpResultDialogHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zve.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof e0f.h0
            if (r0 == 0) goto L13
            r0 = r6
            e0f.h0 r0 = (e0f.h0) r0
            int r1 = r0.f121609x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121609x = r1
            goto L18
        L13:
            e0f.h0 r0 = new e0f.h0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121609x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zve.b r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = r5.f325668a
            r0.u = r5
            r0.f121609x = r3
            agf.b r2 = r4.f121614a
            cgf.b r2 = (cgf.b) r2
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            bgf.j r6 = (bgf.j) r6
            boolean r0 = r6 instanceof bgf.g
            if (r0 == 0) goto L4e
            e0f.e0 r5 = e0f.e0.f121596a
            return r5
        L4e:
            boolean r0 = r6 instanceof bgf.f
            if (r0 == 0) goto L55
            e0f.b0 r5 = e0f.b0.f121586a
            return r5
        L55:
            boolean r0 = r6 instanceof bgf.h
            if (r0 == 0) goto L90
            bgf.h r6 = (bgf.h) r6
            bgf.e r0 = r6.f15198c
            if (r0 == 0) goto L62
            bgf.c r0 = r0.f15191a
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 != 0) goto L67
            r0 = -1
            goto L6f
        L67:
            int[] r1 = e0f.g0.f121603a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L6f:
            if (r0 == r3) goto L86
            r1 = 2
            if (r0 == r1) goto L7c
            e0f.a0 r0 = new e0f.a0
            java.lang.String r5 = r5.f325668a
            r0.<init>(r6, r5)
            return r0
        L7c:
            e0f.d0 r0 = new e0f.d0
            e0f.c0 r1 = e0f.c0.Waiting
            java.lang.String r5 = r5.f325668a
            r0.<init>(r1, r6, r5)
            return r0
        L86:
            e0f.d0 r0 = new e0f.d0
            e0f.c0 r1 = e0f.c0.Warning
            java.lang.String r5 = r5.f325668a
            r0.<init>(r1, r6, r5)
            return r0
        L90:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.i0.a(zve.b, gim.c):java.lang.Object");
    }

    public final nii.m0 b(f0 finCrimeCheckResult) {
        Intrinsics.checkNotNullParameter(finCrimeCheckResult, "finCrimeCheckResult");
        if (!(finCrimeCheckResult instanceof a0) && !Intrinsics.f(finCrimeCheckResult, b0.f121586a)) {
            boolean zF = Intrinsics.f(finCrimeCheckResult, e0.f121596a);
            pze.a aVar = this.f121615b;
            if (zF) {
                return aVar.a();
            }
            if (!(finCrimeCheckResult instanceof d0)) {
                throw new NoWhenBranchMatchedException();
            }
            d0 d0Var = (d0) finCrimeCheckResult;
            bgf.e popup = d0Var.f121591b.f15198c;
            int i = g0.f121604b[d0Var.f121590a.ordinal()];
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
        }
        return null;
    }

    public final Object c(nii.e eVar, Function1 function1, Function1 function12, gim.c cVar) {
        FeatureCommand featureCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6)));
        if (eVar instanceof nii.c) {
            function1.invoke(((nii.c) eVar).f216123a);
        } else {
            if (!(eVar instanceof nii.d)) {
                throw new NoWhenBranchMatchedException();
            }
            nii.d dVar = (nii.d) eVar;
            nii.n1 n1Var = dVar.f216134b;
            f0 f0Var = (f0) dVar.f216133a;
            if (Intrinsics.f(f0Var, e0.f121596a)) {
                Object objInvoke = function12.invoke(cVar);
                return objInvoke == fim.a.COROUTINE_SUSPENDED ? objInvoke : Unit.f186387a;
            }
            if (f0Var instanceof d0) {
                d0 d0Var = (d0) f0Var;
                int i = g0.f121604b[d0Var.f121590a.ordinal()];
                pze.a aVar = this.f121615b;
                if (i == 1) {
                    String str = d0Var.f121592c;
                    if (n1Var != null && str != null) {
                        bib.b bVar = new bib.b(this, f0Var, str, featureCommandF, 6);
                        aVar.getClass();
                        pze.a.c(n1Var, bVar);
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (n1Var != null) {
                        dv9.r rVar = new dv9.r(24);
                        aVar.getClass();
                        pze.a.b(n1Var, rVar);
                    }
                }
            } else {
                if (!(f0Var instanceof a0)) {
                    if (!Intrinsics.f(f0Var, b0.f121586a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objInvoke2 = function12.invoke(cVar);
                    return objInvoke2 == fim.a.COROUTINE_SUSPENDED ? objInvoke2 : Unit.f186387a;
                }
                a0 a0Var = (a0) f0Var;
                ((cgf.b) this.f121614a).b(a0Var.f121581a, featureCommandF, a0Var.f121582b);
            }
        }
        return Unit.f186387a;
    }
}
