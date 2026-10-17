package com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow;

import c84.a0;
import c84.g;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow.DocumentsUploadFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import da4.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ny3.f;
import ny3.h;
import ny3.i;
import ny3.p;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends a0 implements da4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DocumentsUploadFlowContract$InputData f67594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f67595q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DocumentsUploadFlowContract$InputData inputData, g pluginControllerModelExtension) {
        FlowStep uploadDocument;
        super(pluginControllerModelExtension);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerModelExtension, "pluginControllerModelExtension");
        this.f67594p = inputData;
        p pVar = inputData.f67586b;
        if (pVar instanceof h) {
            uploadDocument = new DocumentsUploadFlowContract$Step.Summary((h) pVar);
        } else {
            if (!(pVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            uploadDocument = new DocumentsUploadFlowContract$Step.UploadDocument(((i) pVar).f220640a);
        }
        this.f67595q = d.a(this, uploadDocument, f0.f322471a, new cwj.h(this, 15));
    }

    public final void I2(List list, Map map) {
        ny3.g gVarL6 = this.f67594p.f67586b.l6();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((f) obj2).f220633h) {
                arrayList.add(obj2);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                List list2 = (List) map.get(((f) it8.next()).f220629a);
                if (list2 == null || list2.isEmpty()) {
                    z = true;
                    break;
                }
            }
        }
        if (gVarL6 == null || !z) {
            C2(new c(map));
            return;
        }
        oki.h.w2(this.f67595q, new DocumentsUploadFlowContract$Step.MissingOptionalDocumentConfirmation(gVarL6, map), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final b s() {
        return this.f67595q;
    }
}
