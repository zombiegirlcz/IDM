package com.revolut.feature_fourthline;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.VideoRecording;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.workflow.BiometricsComponentResult;
import com.fourthline.orca.workflow.WorkflowError;
import com.fourthline.orca.workflow.WorkflowResults;
import java.net.URI;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import t3i.d;
import t3i.e;
import t3i.g;
import t3i.h;
import t3i.q;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes23.dex */
public final class b implements OnProductCompleted {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f97003a;

    public b(Function1 function1) {
        this.f97003a = function1;
    }

    @Override // com.fourthline.orca.core.OnProductCompleted
    public final void onResult(Object obj2) {
        VideoRecording recording;
        Throwable thA = m.a(obj2);
        URI url2 = null;
        Function1 function1 = this.f97003a;
        if (thA == null) {
            BiometricsComponentResult biometricsComponentResult = (BiometricsComponentResult) obj2;
            DeviceMetadata deviceMetadata = new DeviceMetadata(null, null, null, null, null, null, null, false, 255, null);
            FourthlineSdkImpl.INSTANCE.getClass();
            FourthlineSdkImpl.cachedSession = null;
            d dVar = new d(biometricsComponentResult.getSelfie().getImage(), t3i.c.SELFIE, false);
            WorkflowResults.IDV.SelfieVideo liveness = biometricsComponentResult.getLiveness();
            if (liveness != null && (recording = liveness.getRecording()) != null) {
                url2 = recording.getUrl();
            }
            function1.invoke(new h(dVar, url2, new t3i.a(deviceMetadata.getLanguage(), deviceMetadata.getRegion(), deviceMetadata.getModel())));
            return;
        }
        Throwable thA2 = m.a(obj2);
        if (thA2 == null) {
            thA2 = new IllegalStateException("Failed to collect Fourthline selfie");
        }
        if (thA2 instanceof WorkflowError.Canceled) {
            function1.invoke(e.f267791a);
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.ERROR;
        FourthlineSdkImpl.INSTANCE.getClass();
        q qVar = FourthlineSdkImpl.cachedSession;
        rd0.d.a(cVar, null, "validationCode: " + (qVar != null ? qVar.f267804b : null), thA2, h0Var);
        FourthlineSdkImpl.cachedSession = null;
        function1.invoke(new g(thA2));
    }
}
