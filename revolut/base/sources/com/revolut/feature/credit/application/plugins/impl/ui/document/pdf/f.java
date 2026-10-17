package com.revolut.feature.credit.application.plugins.impl.ui.document.pdf;

import b22.j;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Document;
import gim.i;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditPdfDocumentControllerContract$Document f67553w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, CreditPdfDocumentControllerContract$Document creditPdfDocumentControllerContract$Document, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f67553w = creditPdfDocumentControllerContract$Document;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f67553w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g gVar = this.v;
        if (i == 0) {
            o.b(obj2);
            CreditPdfDocumentControllerContract$Document.Remote remote = (CreditPdfDocumentControllerContract$Document.Remote) this.f67553w;
            this.u = 1;
            obj2 = g.I2(gVar, remote, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        gVar.H2(gVar.f67558t, new j((File) obj2, 9));
        return Unit.f186387a;
    }
}
