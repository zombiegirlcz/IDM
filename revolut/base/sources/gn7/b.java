package gn7;

import br7.h;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlowContract$State;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlowContract$Step;
import fr7.g;
import g9i.s;
import hr7.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zq7.d;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b f144931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RequestedDocument f144932c;

    public /* synthetic */ b(com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b bVar, RequestedDocument requestedDocument, int i) {
        this.f144930a = i;
        this.f144931b = bVar;
        this.f144932c = requestedDocument;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144930a) {
            case 0:
                f it8 = (f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b bVar = this.f144931b;
                bVar.getClass();
                if (!Intrinsics.f(it8, f.a.f154787a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.O2(this.f144932c);
                return Unit.f186387a;
            case 1:
                g it9 = (g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b bVar2 = this.f144931b;
                bVar2.getClass();
                if (!Intrinsics.f(it9, g.a.f137399a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2.O2(this.f144932c);
                return Unit.f186387a;
            case 2:
                d outputData = (d) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b bVar3 = this.f144931b;
                bVar3.getClass();
                if (!Intrinsics.f(outputData, d.a.f324412a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar3.O2(this.f144932c);
                return Unit.f186387a;
            default:
                h result = (h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof br7.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b bVar4 = this.f144931b;
                boolean z = bVar4.A2().f98430b instanceof UploadDocumentsFlowContract$Step.FilesLicenceFront;
                RequestedDocument requestedDocument = this.f144932c;
                if (z) {
                    UploadDocumentsFlowContract$State updateState = (UploadDocumentsFlowContract$State) bVar4.A2().f98429a;
                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                    List firstStepFiles = ((br7.g) result).f17938a;
                    updateState.getClass();
                    Intrinsics.checkNotNullParameter(firstStepFiles, "firstStepFiles");
                    bVar4.L2(new UploadDocumentsFlowContract$State(firstStepFiles));
                    bVar4.P2(new UploadDocumentsFlowContract$Step.FilesLicenceBack(requestedDocument));
                } else {
                    ArrayList arrayListE0 = d0.E0(((br7.g) result).f17938a, ((UploadDocumentsFlowContract$State) bVar4.A2().f98429a).f75497a);
                    bVar4.l2(new com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.a(bVar4, requestedDocument, arrayListE0, null), new s(1, bVar4, vl7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 27));
                }
                return Unit.f186387a;
        }
    }
}
