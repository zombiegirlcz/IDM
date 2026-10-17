package com.fourthline.orca.internal;

import com.fourthline.core.VideoRecording;
import com.fourthline.orca.internal.je;
import com.fourthline.orca.workflow.WorkflowResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d11 implements ic1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f27622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r01 f27623b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[rc1.values().length];
            try {
                iArr[rc1.f32692g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rc1.f32693h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d11(Function0 workflowIdProvider, r01 dataBundle) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        this.f27622a = workflowIdProvider;
        this.f27623b = dataBundle;
    }

    @Override // com.fourthline.orca.internal.ic1
    public /* bridge */ h10 a(ny nyVar) {
        return super.a(nyVar);
    }

    @Override // com.fourthline.orca.internal.ic1
    public h10 a() {
        rc1[] elements = {rc1.f32692g, rc1.f32693h};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        String str = (String) this.f27622a.invoke();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = ((ArrayList) listL).iterator();
        while (it8.hasNext()) {
            i10 i10VarA = a(this.f27623b, str, (rc1) it8.next());
            if (i10VarA != null) {
                arrayList.add(i10VarA);
            }
        }
        return new h10(listL, arrayList, a(this.f27623b, str), null, 8, null);
    }

    private final List a(r01 r01Var, String str) {
        byte[] bArrA;
        Object obj2 = r01Var.b().a().get("selfie_capture_video");
        vz vzVar = null;
        VideoRecording videoRecording = obj2 instanceof VideoRecording ? (VideoRecording) obj2 : null;
        if (videoRecording != null && (bArrA = uc1.a(videoRecording.getUrl())) != null) {
            vzVar = new vz("biometricsPassiveVideoUpload", 0, "workflow_upload_selfie_capture_video", "selfie_capture_video.mp4", str, new je.a.InterfaceC0222a.C0223a(bArrA, "selfie_capture_video"));
        }
        return zhm.v.l(vzVar);
    }

    private final i10 a(r01 r01Var, String str, rc1 rc1Var) {
        int i = a.$EnumSwitchMapping$0[rc1Var.ordinal()];
        if (i == 1) {
            Pair pairA = qc1.a(r01Var.b());
            if (pairA == null) {
                return null;
            }
            return new i10(rc1Var, new e11(str, (List) pairA.f186386b), (WorkflowResults.IDV.Selfie) pairA.f186385a);
        }
        if (i != 2) {
            return null;
        }
        byte[] bArrA = r01Var.a();
        if (bArrA == null) {
            bArrA = new byte[0];
        }
        Pair pairA2 = qc1.a(r01Var.b(), bArrA);
        if (pairA2 == null) {
            return null;
        }
        return new i10(rc1Var, new p11(str, (List) pairA2.f186386b), (WorkflowResults.IDV.SelfieVideo) pairA2.f186385a);
    }
}
