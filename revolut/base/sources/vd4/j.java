package vd4;

import cli.y;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.PasswordInputScreenContract$InputData;
import hw3.p;
import hw3.r;
import hw3.s;
import hw3.w;
import java.io.File;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vch.h0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function1 {
    public DocumentUnlockResult.Success u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f287788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f287789x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f287788w = kVar;
        this.f287789x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f287788w, this.f287789x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DocumentUnlockResult documentUnlockResult;
        k kVar = this.f287788w;
        y yVar = kVar.f287793s;
        PasswordInputScreenContract$InputData passwordInputScreenContract$InputData = kVar.f287792r;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            File file = new File(passwordInputScreenContract$InputData.f67963a);
            String absolutePath = new File(kVar.f287791q.getCacheDir(), "unlocked_" + UUID.randomUUID() + "_" + file.getName()).getAbsolutePath();
            p pVar = kVar.o;
            String str = passwordInputScreenContract$InputData.f67963a;
            Intrinsics.h(absolutePath);
            this.v = 1;
            obj2 = ((r) pVar).a(str, this.f287789x, absolutePath, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            documentUnlockResult = this.u;
            o.b(obj2);
            kVar.C2(new g(passwordInputScreenContract$InputData.f67963a, ((DocumentUnlockResult.Success) documentUnlockResult).f67941a, (DocumentValidationResult) obj2));
            return Unit.f186387a;
        }
        o.b(obj2);
        DocumentUnlockResult documentUnlockResult2 = (DocumentUnlockResult) obj2;
        if (!(documentUnlockResult2 instanceof DocumentUnlockResult.Success)) {
            if (documentUnlockResult2 instanceof DocumentUnlockResult.PasswordIncorrect) {
                kVar.H2(yVar, new h0(6));
            } else {
                if (!(documentUnlockResult2 instanceof DocumentUnlockResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar.H2(yVar, new h0(7));
            }
            return Unit.f186387a;
        }
        s sVar = kVar.f287790p;
        DocumentUnlockResult.Success success = (DocumentUnlockResult.Success) documentUnlockResult2;
        String str2 = success.f67941a;
        DocumentValidationConfig documentValidationConfig = passwordInputScreenContract$InputData.f67965c;
        this.u = success;
        this.v = 2;
        Object objC = ((w) sVar).c(str2, documentValidationConfig, this);
        if (objC != aVar) {
            documentUnlockResult = documentUnlockResult2;
            obj2 = objC;
            kVar.C2(new g(passwordInputScreenContract$InputData.f67963a, ((DocumentUnlockResult.Success) documentUnlockResult).f67941a, (DocumentValidationResult) obj2));
            return Unit.f186387a;
        }
        return aVar;
    }
}
