package com.revolut.feature_fourthline;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.VideoRecording;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.workflow.DocumentComponentResult;
import com.fourthline.orca.workflow.WorkflowError;
import com.fourthline.orca.workflow.WorkflowResults;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import t3i.d;
import t3i.e;
import t3i.f;
import t3i.g;
import t3i.q;
import yhm.m;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes23.dex */
public final class a implements OnProductCompleted {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f97002a;

    public a(Function1 function1) {
        this.f97002a = function1;
    }

    @Override // com.fourthline.orca.core.OnProductCompleted
    public final void onResult(Object obj2) {
        Throwable thA = m.a(obj2);
        Function1 function1 = this.f97002a;
        if (thA == null) {
            WorkflowResults.Component.Document document = ((DocumentComponentResult) obj2).getDocument();
            DeviceMetadata deviceMetadata = new DeviceMetadata(null, null, null, null, null, null, null, false, 255, null);
            List<WorkflowResults.IDV.Attachment> images = document.getImages();
            ArrayList arrayList = new ArrayList(w.t(images, 10));
            for (WorkflowResults.IDV.Attachment attachment : images) {
                arrayList.add(new d(attachment.getImage(), attachment.getFileSide() == DocumentFileSide.BACK ? t3i.c.BACK : t3i.c.FRONT, attachment.isAngled()));
            }
            VideoRecording videoRecording = document.getVideoRecording();
            function1.invoke(new f(arrayList, videoRecording != null ? videoRecording.getUrl() : null, new t3i.a(deviceMetadata.getLanguage(), deviceMetadata.getRegion(), deviceMetadata.getModel())));
            return;
        }
        Throwable thA2 = m.a(obj2);
        if (thA2 == null) {
            thA2 = new IllegalStateException("Failed to collect Fourthline documents");
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
