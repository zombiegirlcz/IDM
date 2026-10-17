package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowDataDelegate;
import com.fourthline.orca.workflow.WorkflowResults;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class h50 {

    public static final class a implements ie {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r70 f29145a;

        public a(r70 r70Var) {
            this.f29145a = r70Var;
        }

        @Override // com.fourthline.orca.internal.ie
        public final Object a(WorkflowResults.IDV idv, Continuation continuation) {
            WorkflowDataDelegate workflowDataDelegateD = this.f29145a.d();
            if (workflowDataDelegateD != null) {
                workflowDataDelegateD.onDataUploaded(idv);
            }
            return Unit.f186387a;
        }
    }

    public final ry a(r70 mainRepository, ie dataListener, phm.a networkServiceProvider, w70 mediaSigner, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(dataListener, "dataListener");
        Intrinsics.checkNotNullParameter(networkServiceProvider, "networkServiceProvider");
        Intrinsics.checkNotNullParameter(mediaSigner, "mediaSigner");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        if (mainRepository.c()) {
            return new y51();
        }
        Object obj2 = networkServiceProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return new fa0(new y90((ib0) obj2, mediaSigner, null, null, coroutineScope, 12, null), dataListener);
    }

    public final ie a(r70 mainRepository, sc1 uploadDataListener) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(uploadDataListener, "uploadDataListener");
        return new ab(zhm.v.k(new a(mainRepository), uploadDataListener));
    }

    public final sc1 a(je dataUploaderWorker, ef deviceDataBundle, r70 mainRepository, sg0 analyticsTracker) {
        Intrinsics.checkNotNullParameter(dataUploaderWorker, "dataUploaderWorker");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        return new sc1(dataUploaderWorker, deviceDataBundle, new wm1(mainRepository, 0), analyticsTracker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(r70 r70Var) {
        lg1 lg1VarB = r70Var.b();
        String strF = lg1VarB != null ? lg1VarB.f() : null;
        if (strF != null) {
            return strF;
        }
        throw new IllegalArgumentException("FL Developer error. The workflow network config must be present at this moment!".toString());
    }
}
