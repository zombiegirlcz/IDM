package com.revolut.feature.kyc.impl.document_collection.flow;

import cnc.t;
import com.revolut.feature.kyc.api.navigation.document_collection.DocumentCollectionInputData;
import com.revolut.feature.kyc.impl.document_collection.flow.DocumentCollectionFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import cv8.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final DocumentCollectionInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f77632p;

    public a(DocumentCollectionInputData inputData) {
        FlowStep documentSelection;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        if (inputData.f77518g.isEmpty() && !inputData.f77517c && inputData.i) {
            documentSelection = DocumentCollectionFlowContract$Step.Citizenship.f77629a;
        } else {
            documentSelection = new DocumentCollectionFlowContract$Step.DocumentSelection(inputData.f77518g, inputData.f77515a);
        }
        this.f77632p = d.a(this, documentSelection, f0.f322471a, new t(this, 25));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77632p;
    }
}
