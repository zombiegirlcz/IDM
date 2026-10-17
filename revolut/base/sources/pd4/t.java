package pd4;

import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ File f235088w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ DocumentValidationConfig f235089x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar, File file, DocumentValidationConfig documentValidationConfig, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f235088w = file;
        this.f235089x = documentValidationConfig;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, this.f235088w, this.f235089x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar = this.v;
        File file = this.f235088w;
        if (i == 0) {
            yhm.o.b(obj2);
            hw3.s sVar = dVar.f67934s;
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            this.u = 1;
            obj2 = ((hw3.w) sVar).c(absolutePath, this.f235089x, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        DocumentValidationResult documentValidationResult = (DocumentValidationResult) obj2;
        dVar.H2(dVar.f67938y, new p5e.h(file, documentValidationResult, 11));
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "DocumentValidation", a0.d.s("Validation result for ", file.getName(), ": ", documentValidationResult.getClass().getSimpleName()), null, null, 16);
        if (documentValidationResult instanceof DocumentValidationResult.Error) {
            rd0.d.a(rd0.c.ERROR, null, "Document validation failed", ((DocumentValidationResult.Error) documentValidationResult).f67942a, h0.f322473a);
        } else if (documentValidationResult instanceof DocumentValidationResult.PasswordProtected) {
            rd0.d.a(rd0.c.ERROR, null, j6.a.q("Document is password protected: ", file.getName()), ((DocumentValidationResult.PasswordProtected) documentValidationResult).f67945a, h0.f322473a);
        } else {
            int i2 = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
