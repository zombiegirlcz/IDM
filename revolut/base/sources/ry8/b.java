package ry8;

import com.onfido.android.sdk.capture.ExitCode;
import com.onfido.android.sdk.capture.Onfido;
import com.onfido.android.sdk.capture.errors.OnfidoException;
import com.onfido.android.sdk.capture.upload.Captures;
import com.onfido.android.sdk.capture.upload.Document;
import com.revolut.feature.kyc.shared.exception.KycException;
import ihm.j;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import my8.s;
import my8.t;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Onfido.OnfidoResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f258259a;

    public b(d dVar) {
        this.f258259a = dVar;
    }

    @Override // com.onfido.android.sdk.capture.Onfido.OnfidoResultListener
    public final void onError(OnfidoException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        KycException kycException = new KycException("ONFIDO_EXCEPTION", exception);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, kycException, h0Var);
        d dVar = this.f258259a;
        j jVar = dVar.f258265m;
        t tVar = t.ERROR;
        dVar.f258264l.getClass();
        jVar.onNext(new s(tVar, vw8.a.a()));
    }

    @Override // com.onfido.android.sdk.capture.Onfido.OnfidoResultListener
    public final void userCompleted(Captures captures) {
        s sVar;
        Intrinsics.checkNotNullParameter(captures, "captures");
        Document document = captures.getDocument();
        d dVar = this.f258259a;
        if (document == null || (document.getBack() == null && document.getFront() == null)) {
            t tVar = t.ERROR;
            dVar.f258264l.getClass();
            sVar = new s(tVar, vw8.a.a());
        } else {
            sVar = new s(t.SUCCESS, null);
        }
        dVar.f258265m.onNext(sVar);
    }

    @Override // com.onfido.android.sdk.capture.Onfido.OnfidoResultListener
    public final void userExited(ExitCode exitCode) {
        Intrinsics.checkNotNullParameter(exitCode, "exitCode");
        this.f258259a.f258265m.onNext(new s(t.CANCEL, null));
    }
}
