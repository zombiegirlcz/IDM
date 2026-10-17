package com.revolut.feature_fourthline;

import android.content.Context;
import androidx.annotation.Keep;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.Orca;
import com.fourthline.orca.document.DocumentCustomizationConfig;
import com.fourthline.orca.selfie.SelfieCustomizationConfig;
import com.fourthline.orca.workflow.DocumentComponentConfig;
import com.fourthline.orca.workflow.SessionBuilderKt;
import com.fourthline.orca.workflow.WorkflowConfig;
import com.fourthline.orca.workflow.WorkflowSession;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import fim.h;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import skm.l;
import t3i.g;
import t3i.i;
import t3i.j;
import t3i.p;
import t3i.q;
import zhm.h0;

/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/revolut/feature_fourthline/FourthlineSdkImpl;", "Lt3i/j;", "<init>", "()V", "Lcom/fourthline/orca/workflow/WorkflowSession;", ib.b.Session, "Landroid/content/Context;", "context", "Lcom/revolut/feature/kyc_documents_scan/api/models/DocType;", "documentType", "", "issuingCountry", "Lkotlin/Function1;", "Lt3i/i;", "", "onCompleted", "collectDocuments", "(Lcom/fourthline/orca/workflow/WorkflowSession;Landroid/content/Context;Lcom/revolut/feature/kyc_documents_scan/api/models/DocType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "collectSelfie", "(Lcom/fourthline/orca/workflow/WorkflowSession;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "validationCode", "Lt3i/p;", "startSession", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchDocuments", "(Landroid/content/Context;Lcom/revolut/feature/kyc_documents_scan/api/models/DocType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "launchSelfie", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "deleteFourthlineFiles", "(Landroid/content/Context;)V", "Companion", "a", "feature_fourthline_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FourthlineSdkImpl implements j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private static q cachedSession;

    /* JADX INFO: renamed from: com.revolut.feature_fourthline.FourthlineSdkImpl$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private final void collectDocuments(WorkflowSession session, Context context, DocType documentType, String issuingCountry, Function1<? super i, Unit> onCompleted) {
        DocumentType documentType2;
        Intrinsics.checkNotNullParameter(documentType, "<this>");
        DocType.INSTANCE.getClass();
        if (Intrinsics.f(documentType, DocType.f77924c)) {
            documentType2 = DocumentType.PASSPORT;
        } else if (Intrinsics.f(documentType, DocType.d)) {
            documentType2 = DocumentType.ID_CARD;
        } else if (Intrinsics.f(documentType, DocType.f77923b)) {
            documentType2 = DocumentType.DRIVERS_LICENSE;
        } else {
            if (!Intrinsics.f(documentType, DocType.e)) {
                throw new IllegalArgumentException("Unexpected document type: " + documentType.f77926a);
            }
            documentType2 = DocumentType.RESIDENCE_PERMIT;
        }
        session.documentComponent(context, new DocumentComponentConfig(documentType2, issuingCountry)).customize(new DocumentCustomizationConfig(t3i.b.a(context))).present(new a(onCompleted));
    }

    private final void collectSelfie(WorkflowSession session, Context context, Function1<? super i, Unit> onCompleted) {
        session.biometricsComponent(context).customize(new SelfieCustomizationConfig(t3i.b.a(context))).present(new b(onCompleted));
    }

    @Override // t3i.j
    public void deleteFourthlineFiles(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtensionsKt.deleteFourthlineFiles(context);
    }

    @Override // t3i.j
    public void launchDocuments(@NotNull Context context, @NotNull DocType documentType, @NotNull String issuingCountry, @NotNull Function1<? super i, Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        q qVar = cachedSession;
        if (qVar != null) {
            collectDocuments(qVar.f267803a, context, documentType, issuingCountry, onCompleted);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Fourthline session should not be null at documents step");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        rd0.c cVar = rd0.c.ERROR;
        q qVar2 = cachedSession;
        d.a(cVar, null, "validationCode: " + (qVar2 != null ? qVar2.f267804b : null), illegalStateException, h0Var);
        onCompleted.invoke(new g(illegalStateException));
    }

    @Override // t3i.j
    public void launchSelfie(@NotNull Context context, @NotNull Function1<? super i, Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        q qVar = cachedSession;
        if (qVar != null) {
            collectSelfie(qVar.f267803a, context, onCompleted);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Fourthline session should not be null at selfie step");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        rd0.c cVar = rd0.c.ERROR;
        q qVar2 = cachedSession;
        d.a(cVar, null, "validationCode: " + (qVar2 != null ? qVar2.f267804b : null), illegalStateException, h0Var);
        onCompleted.invoke(new g(illegalStateException));
    }

    @Override // t3i.j
    public Object startSession(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super p> frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        SessionBuilderKt.workflowSession(Orca.INSTANCE, context, str).configure(new WorkflowConfig(mb.b.f204053a)).start(new c(this, str, lVar));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }
}
