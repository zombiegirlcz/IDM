package pd4;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentWithValidation;
import com.revolut.feature.credit.core.R$string;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.l1;
import nii.n1;
import nii.y0;
import nii.z;
import t80.m;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d f235087w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235087w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f235087w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f235087w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            default:
                s sVar3 = new s(this.f235087w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 6;
        DocumentValidationResult.Validating validating = DocumentValidationResult.Validating.f67947a;
        int i3 = 11;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) data.getContent();
                if (list != null) {
                    com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar = this.f235087w;
                    y yVar = dVar.f67938y;
                    dVar.H2(yVar, new njf.e(list, 17));
                    DocumentValidationConfig documentValidationConfigK2 = dVar.K2();
                    for (DocumentWithValidation documentWithValidation : ((i) ((j2) yVar.f22677a).getValue()).e.values()) {
                        if (documentValidationConfigK2 != null) {
                            DocumentValidationResult documentValidationResult = documentWithValidation.f67950c;
                            if ((documentValidationResult instanceof DocumentValidationResult.Validating) || (documentValidationResult instanceof DocumentValidationResult.NotValidated)) {
                                File file = new File(documentWithValidation.f67948a);
                                dVar.H2(yVar, new p5e.h(file, validating, i3));
                                dVar.n2(new oqk.i(dVar, file, documentValidationConfigK2, null, 16), new whi.b(i2));
                            }
                        }
                    }
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "DocumentValidation", "Failed to load validation configs: " + data, null, null, 16);
                }
                break;
            case 1:
                e60.l lVar = (e60.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar2 = this.f235087w;
                y yVar2 = dVar2.f67938y;
                Intrinsics.h(lVar);
                Continuation continuation = null;
                if (lVar instanceof e60.m) {
                    File fileB = ((e60.m) lVar).b();
                    String str = ((i) ((j2) yVar2.f22677a).getValue()).f;
                    if (str != null) {
                        int i5 = 29;
                        dVar2.l2(new osk.m(dVar2, str, continuation, i5), new yi5.b(26));
                        dVar2.H2(yVar2, new pb2.a(i5));
                    }
                    DocumentValidationConfig documentValidationConfigK22 = dVar2.K2();
                    if (documentValidationConfigK22 != null) {
                        dVar2.H2(yVar2, new p5e.h(fileB, validating, i3));
                        dVar2.n2(new oqk.i(dVar2, fileB, documentValidationConfigK22, continuation, 16), new whi.b(i2));
                    } else {
                        dVar2.H2(yVar2, new p5e.h(fileB, DocumentValidationResult.NotValidated.f67944a, i3));
                    }
                } else if (lVar instanceof e60.j) {
                    t80.m mVar = ((e60.j) lVar).f122857a;
                    if (!mVar.equals(m.a.f268767a)) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "ManualUnderwriting", "MediaPicker.observeMediaPickerResult() returned error: " + mVar, null, h0Var);
                        yji.l.b1(dVar2, dVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_media_picker_error, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, 7);
                    }
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "ManualUnderwriting", "MediaPicker.observeMediaPickerResult() returned unsupported result: " + lVar, null, null, 16);
                }
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    this.f235087w.N2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
