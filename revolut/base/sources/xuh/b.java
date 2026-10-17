package xuh;

import av1.c;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.shared.feature.workflow.engine.api.models.SdkVendorInfo;
import grl.cc;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tx8.b0;
import tx8.d;
import tx8.e;
import tx8.f;
import tx8.g;
import tx8.h;
import tx8.i;
import tx8.j;
import tx8.k;
import tx8.l;
import tx8.m;
import tx8.n;
import tx8.o;
import tx8.p;
import tx8.q;
import tx8.r;
import tx8.u;
import tx8.v;
import tx8.w;
import tx8.x;
import tx8.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f309072a;

    public b(b0 sdkVendorAnalyticsTracker) {
        Intrinsics.checkNotNullParameter(sdkVendorAnalyticsTracker, "sdkVendorAnalyticsTracker");
        this.f309072a = sdkVendorAnalyticsTracker;
    }

    public static c a(WorkflowDocumentScanCofiguration workflowDocumentScanCofiguration) {
        if (workflowDocumentScanCofiguration instanceof WorkflowDocumentScanCofiguration.Incode) {
            WorkflowDocumentScanCofiguration.Incode incode = (WorkflowDocumentScanCofiguration.Incode) workflowDocumentScanCofiguration;
            return new m(incode.d, incode.f77929c);
        }
        if (workflowDocumentScanCofiguration instanceof WorkflowDocumentScanCofiguration.Onfido) {
            WorkflowDocumentScanCofiguration.Onfido onfido = (WorkflowDocumentScanCofiguration.Onfido) workflowDocumentScanCofiguration;
            return new q(onfido.f77932c, onfido.f77931b, onfido.f);
        }
        if (workflowDocumentScanCofiguration instanceof WorkflowDocumentScanCofiguration.OnfidoStudio) {
            return r.f275361c;
        }
        if (workflowDocumentScanCofiguration instanceof WorkflowDocumentScanCofiguration.Vision) {
            return x.f275367c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static c b(SdkVendorInfo sdkVendorInfo) {
        if (sdkVendorInfo instanceof SdkVendorInfo.Mobywatel) {
            return o.f275358c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.BankId) {
            return tx8.a.f275343c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.Cmd) {
            return tx8.b.f275344c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.Dap) {
            return tx8.c.f275346c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.DapQes) {
            return d.f275347c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.Diia) {
            return e.f275348c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.EgovKyc) {
            return f.f275349c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.Fourthline) {
            return new g(((SdkVendorInfo.Fourthline) sdkVendorInfo).f105474c);
        }
        boolean z = sdkVendorInfo instanceof SdkVendorInfo.HypervergeGovAuth;
        h hVar = h.f275351c;
        if (z || (sdkVendorInfo instanceof SdkVendorInfo.HypervergeVideoConference)) {
            return hVar;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.IdAustria) {
            return i.f275352c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.IdnowEid) {
            return k.f275354c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.IdnowVideoIdent) {
            return j.f275353c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.Idura) {
            return l.f275355c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.Itsme) {
            return n.f275357c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.MyInfo) {
            return p.f275359c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.TrustdockSdk) {
            return u.f275364c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.TrustdockWeb) {
            return v.f275365c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.UaePass) {
            return w.f275366c;
        }
        if (sdkVendorInfo instanceof SdkVendorInfo.WebId) {
            return y.f275368c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void c(c vendor, od9.e result) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z = result instanceof od9.d;
        b0 b0Var = this.f309072a;
        if (z) {
            Intrinsics.checkNotNullParameter(vendor, "vendor");
            b0Var.b(cc.Succeeded, vendor, null);
        } else if (Intrinsics.f(result, od9.a.f224330a) || (result instanceof od9.c)) {
            Intrinsics.checkNotNullParameter(vendor, "vendor");
            b0Var.b(cc.Skipped, vendor, null);
        } else if (!Intrinsics.f(result, od9.b.f224331a)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
