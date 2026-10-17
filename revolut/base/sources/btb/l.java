package btb;

import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowConfiguration;
import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowControllerDescriptor;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.workflow.engine.api.models.SdkVendorInfo;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Redirect;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import we6.t0;
import wp5.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends til.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fne.b f18537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f18538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j89.a f18539n;
    public final qil.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f18540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jvh.a f18541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kma.b f18542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wik.m f18543s;

    public l(fne.b taxResidencyFlowProvider, r workflowDataPointMapper, j89.a qesTermsConfigurationProvider, qil.a formStepNavigationConfigurationMapper, b pepWorkflowScreenToUseCaseMapper, jvh.a workflowInteractor, kma.b countryPickerInteractorProvider, wik.m pricingPlanOffersInteractor) {
        Intrinsics.checkNotNullParameter(taxResidencyFlowProvider, "taxResidencyFlowProvider");
        Intrinsics.checkNotNullParameter(workflowDataPointMapper, "workflowDataPointMapper");
        Intrinsics.checkNotNullParameter(qesTermsConfigurationProvider, "qesTermsConfigurationProvider");
        Intrinsics.checkNotNullParameter(formStepNavigationConfigurationMapper, "formStepNavigationConfigurationMapper");
        Intrinsics.checkNotNullParameter(pepWorkflowScreenToUseCaseMapper, "pepWorkflowScreenToUseCaseMapper");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(countryPickerInteractorProvider, "countryPickerInteractorProvider");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        this.f18537l = taxResidencyFlowProvider;
        this.f18538m = workflowDataPointMapper;
        this.f18539n = qesTermsConfigurationProvider;
        this.o = formStepNavigationConfigurationMapper;
        this.f18540p = pepWorkflowScreenToUseCaseMapper;
        this.f18541q = workflowInteractor;
        this.f18542r = countryPickerInteractorProvider;
        this.f18543s = pricingPlanOffersInteractor;
    }

    public static y89.a e3(ril.j jVar) {
        switch (g.f18526c[jVar.ordinal()]) {
            case 1:
                return y89.a.FRANCE_BANK_MIGRATION_AGREEMENT;
            case 2:
                return y89.a.FRANCE_BANK_AGREEMENT;
            case 3:
                return y89.a.GERMANY_BANK_AGREEMENT;
            case 4:
                return y89.a.GERMANY_BANK_MIGRATION_AGREEMENT;
            case 5:
                return y89.a.MEXICO_BANK_AGREEMENT;
            case 6:
                return y89.a.ITALY_BANK_AGREEMENT;
            case 7:
                return y89.a.ITALY_BANK_MIGRATION_AGREEMENT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void f3(ViewController viewController, v vVar) {
        f block = new f(vVar, 12);
        Intrinsics.checkNotNullParameter(block, "block");
        viewController.H = block;
    }

    @Override // til.d
    public final void Z2(SharedStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // til.d
    public final til.g b3(com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep r49, plc.i r50) {
        /*
            Method dump skipped, instruction units count: 3108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: btb.l.b3(com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep, plc.i):til.g");
    }

    @Override // til.d
    public final ViewController c3(dj0.d amount, List applicableCountries, boolean z, String workflowId, String workflowStepId, String str, wuh.h onStepResult) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(applicableCountries, "applicableCountries");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        Intrinsics.checkNotNullParameter(onStepResult, "onStepResult");
        ViewController viewControllerO2 = o2(new t0(amount, workflowId, workflowStepId, str, applicableCountries, z));
        bq7.j block = new bq7.j(onStepResult, 10);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        return viewControllerO2;
    }

    @Override // til.d
    public final ViewController d3(SdkVendorInfo vendorInfo, v onStepResult) {
        Intrinsics.checkNotNullParameter(vendorInfo, "vendorInfo");
        Intrinsics.checkNotNullParameter(onStepResult, "onStepResult");
        if (vendorInfo instanceof SdkVendorInfo.Diia) {
            ViewController viewControllerO2 = o2(new qs8.a(((SdkVendorInfo.Diia) vendorInfo).f105468b));
            f3(viewControllerO2, onStepResult);
            return viewControllerO2;
        }
        if (vendorInfo instanceof SdkVendorInfo.WebId) {
            ViewController viewControllerO22 = o2(new lt8.a(((SdkVendorInfo.WebId) vendorInfo).f105504b));
            f block = new f(onStepResult, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerO22.H = block;
            return viewControllerO22;
        }
        if (vendorInfo instanceof SdkVendorInfo.MyInfo) {
            ViewController viewControllerO23 = o2(new ft8.a(((SdkVendorInfo.MyInfo) vendorInfo).f105494b));
            f block2 = new f(onStepResult, 13);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerO23.H = block2;
            return viewControllerO23;
        }
        if (vendorInfo instanceof SdkVendorInfo.Cmd) {
            ViewController viewControllerO24 = o2(new ms8.a(((SdkVendorInfo.Cmd) vendorInfo).f105464a));
            f block3 = new f(onStepResult, 3);
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerO24.H = block3;
            return viewControllerO24;
        }
        if (vendorInfo instanceof SdkVendorInfo.IdnowVideoIdent) {
            SdkVendorInfo.IdnowVideoIdent idnowVideoIdent = (SdkVendorInfo.IdnowVideoIdent) vendorInfo;
            ViewController viewControllerO25 = o2(new zs8.a(idnowVideoIdent.f105485b, idnowVideoIdent.f105486c));
            f block4 = new f(onStepResult, 4);
            Intrinsics.checkNotNullParameter(block4, "block");
            viewControllerO25.H = block4;
            return viewControllerO25;
        }
        if (vendorInfo instanceof SdkVendorInfo.IdnowEid) {
            ViewController viewControllerO26 = o2(new at8.a(((SdkVendorInfo.IdnowEid) vendorInfo).f105483b));
            f block5 = new f(onStepResult, 5);
            Intrinsics.checkNotNullParameter(block5, "block");
            viewControllerO26.H = block5;
            return viewControllerO26;
        }
        if (vendorInfo instanceof SdkVendorInfo.HypervergeGovAuth) {
            SdkVendorInfo.HypervergeGovAuth hypervergeGovAuth = (SdkVendorInfo.HypervergeGovAuth) vendorInfo;
            String str = hypervergeGovAuth.f105476b;
            List list = hypervergeGovAuth.f105477c;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((Redirect) it8.next()).f105640b);
            }
            ViewController viewControllerO27 = o2(new ws8.a(str, arrayList));
            f block6 = new f(onStepResult, 6);
            Intrinsics.checkNotNullParameter(block6, "block");
            viewControllerO27.H = block6;
            return viewControllerO27;
        }
        if (vendorInfo instanceof SdkVendorInfo.HypervergeVideoConference) {
            SdkVendorInfo.HypervergeVideoConference hypervergeVideoConference = (SdkVendorInfo.HypervergeVideoConference) vendorInfo;
            String str2 = hypervergeVideoConference.f105479b;
            List list2 = hypervergeVideoConference.f105480c;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((Redirect) it9.next()).f105640b);
            }
            ViewController viewControllerO28 = o2(new xs8.a(str2, arrayList2));
            f block7 = new f(onStepResult, 7);
            Intrinsics.checkNotNullParameter(block7, "block");
            viewControllerO28.H = block7;
            return viewControllerO28;
        }
        if (vendorInfo instanceof SdkVendorInfo.Dap) {
            ViewController viewControllerO29 = o2(new ps8.a(((SdkVendorInfo.Dap) vendorInfo).f105465a));
            f block8 = new f(onStepResult, 8);
            Intrinsics.checkNotNullParameter(block8, "block");
            viewControllerO29.H = block8;
            return viewControllerO29;
        }
        if (vendorInfo instanceof SdkVendorInfo.DapQes) {
            ViewController viewControllerO210 = o2(new ps8.c(((SdkVendorInfo.DapQes) vendorInfo).f105466a));
            f3(viewControllerO210, onStepResult);
            return viewControllerO210;
        }
        if (vendorInfo instanceof SdkVendorInfo.Mobywatel) {
            ViewController viewControllerO211 = o2(new dt8.a(((SdkVendorInfo.Mobywatel) vendorInfo).f105492b));
            f3(viewControllerO211, onStepResult);
            return viewControllerO211;
        }
        if (vendorInfo instanceof SdkVendorInfo.EgovKyc) {
            SdkVendorInfo.EgovKyc egovKyc = (SdkVendorInfo.EgovKyc) vendorInfo;
            ViewController viewControllerO212 = o2(new ss8.a(egovKyc.f105470a, egovKyc.f105471b));
            f block9 = new f(onStepResult, 9);
            Intrinsics.checkNotNullParameter(block9, "block");
            viewControllerO212.H = block9;
            return viewControllerO212;
        }
        if (vendorInfo instanceof SdkVendorInfo.TrustdockSdk) {
            SdkVendorInfo.TrustdockSdk trustdockSdk = (SdkVendorInfo.TrustdockSdk) vendorInfo;
            ViewController viewControllerO213 = o2(new jt8.a(trustdockSdk.f105497c, trustdockSdk.f105496b));
            f block10 = new f(onStepResult, 10);
            Intrinsics.checkNotNullParameter(block10, "block");
            viewControllerO213.H = block10;
            return viewControllerO213;
        }
        if (vendorInfo instanceof SdkVendorInfo.Itsme) {
            ViewController viewControllerO214 = o2(new ct8.a(((SdkVendorInfo.Itsme) vendorInfo).f105490b));
            f3(viewControllerO214, onStepResult);
            return viewControllerO214;
        }
        if (vendorInfo instanceof SdkVendorInfo.IdAustria) {
            ViewController viewControllerO215 = o2(new ys8.a(((SdkVendorInfo.IdAustria) vendorInfo).f105481a));
            f3(viewControllerO215, onStepResult);
            return viewControllerO215;
        }
        if (vendorInfo instanceof SdkVendorInfo.BankId) {
            ViewController viewControllerO216 = o2(new ls8.a(((SdkVendorInfo.BankId) vendorInfo).f105463b));
            f3(viewControllerO216, onStepResult);
            return viewControllerO216;
        }
        if (vendorInfo instanceof SdkVendorInfo.TrustdockWeb) {
            ViewController viewControllerO217 = o2(new kt8.a(((SdkVendorInfo.TrustdockWeb) vendorInfo).f105499b));
            f block11 = new f(onStepResult, 11);
            Intrinsics.checkNotNullParameter(block11, "block");
            viewControllerO217.H = block11;
            return viewControllerO217;
        }
        if (vendorInfo instanceof SdkVendorInfo.Idura) {
            ViewController viewControllerO218 = o2(new bt8.a(((SdkVendorInfo.Idura) vendorInfo).f105488b));
            f block12 = new f(onStepResult, 13);
            Intrinsics.checkNotNullParameter(block12, "block");
            viewControllerO218.H = block12;
            return viewControllerO218;
        }
        if (vendorInfo instanceof SdkVendorInfo.Fourthline) {
            SdkVendorInfo.Fourthline fourthline = (SdkVendorInfo.Fourthline) vendorInfo;
            ViewController viewControllerO219 = o2(new vs8.a(fourthline.f105474c, fourthline.f105472a, fourthline.f105473b, fourthline.d));
            f block13 = new f(onStepResult, 1);
            Intrinsics.checkNotNullParameter(block13, "block");
            viewControllerO219.H = block13;
            return viewControllerO219;
        }
        if (!(vendorInfo instanceof SdkVendorInfo.UaePass)) {
            throw new NoWhenBranchMatchedException();
        }
        SdkVendorInfo.UaePass uaePass = (SdkVendorInfo.UaePass) vendorInfo;
        String str3 = uaePass.f105501b;
        List list3 = uaePass.f105502c;
        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            arrayList3.add(((Redirect) it10.next()).f105640b);
        }
        ViewController viewControllerO220 = o2(new UaePassFlowControllerDescriptor(new UaePassFlowConfiguration(str3, "revolut://app/kyc/uae_pass", arrayList3)));
        f block14 = new f(onStepResult, 2);
        Intrinsics.checkNotNullParameter(block14, "block");
        viewControllerO220.H = block14;
        return viewControllerO220;
    }
}
