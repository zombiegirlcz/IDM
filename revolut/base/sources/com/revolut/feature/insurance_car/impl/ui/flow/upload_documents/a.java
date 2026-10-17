package com.revolut.feature.insurance_car.impl.ui.flow.upload_documents;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlowContract$Step;
import elm.f;
import gim.i;
import java.util.ArrayList;
import km2.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ll7.e0;
import ll7.v;
import skm.p0;
import yhm.o;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RequestedDocument f75505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f75506x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, RequestedDocument requestedDocument, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f75505w = requestedDocument;
        this.f75506x = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f75505w, this.f75506x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        RequestedDocument requestedDocument = this.f75505w;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            bVar.X1(vl7.a.c(null, null));
            v vVar = bVar.u;
            String str = bVar.f75507t.f75496a;
            String str2 = requestedDocument.f75301a;
            this.u = 1;
            e0 e0Var = (e0) vVar;
            e0Var.getClass();
            n nVar = new n(str2, str, this.f75506x, (Continuation) null, e0Var);
            p0 p0Var = p0.f264001a;
            Object objJ = skm.e0.J(f.f127540b, nVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.X1(vl7.a.e(new TextLocalisedClause(R$string.car_insurance_document_upload_uploaded_sheet_title, u.c(requestedDocument.d), null, 12), null, null, 14));
        bVar.P2(UploadDocumentsFlowContract$Step.DocumentsList.f75500a);
        bVar.r2();
        UploadDocumentsFlowContract$State uploadDocumentsFlowContract$State = (UploadDocumentsFlowContract$State) bVar.A2().f98429a;
        f0 firstStepFiles = f0.f322471a;
        uploadDocumentsFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(firstStepFiles, "firstStepFiles");
        bVar.L2(new UploadDocumentsFlowContract$State(firstStepFiles));
        return Unit.f186387a;
    }
}
