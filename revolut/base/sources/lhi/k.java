package lhi;

import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.utils.job.workers.TransactionLocationWorker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195290a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f195291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f195292c;

    public k(q06.d deeplinkParser, mri.w revolutJobInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        this.f195291b = deeplinkParser;
        this.f195292c = revolutJobInteractor;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        String transactionId;
        switch (this.f195290a) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                ifm.b bVar = (ifm.b) this.f195292c;
                pfm.a aVar = new pfm.a(((wsg.n) this.f195291b).i0(AccountId.Personal.f51414a), new kl.c0(new lak.l(new BreadcrumbException(), 5)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar.w(new a08.s(23, j.f195289a), i.f195285a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                te0.w.j0(bVar, hVarW);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                String strE = ipa.k.e(message);
                if (strE != null && (transactionId = ((s06.c) ((q06.d) this.f195291b)).f(strE)) != null) {
                    nzl.a aVar2 = (nzl.a) ((mri.w) this.f195292c);
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    aVar2.f221092a.enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) TransactionLocationWorker.class).setInputData(new Data.Builder().putString("JOB_EXTRA_TRANSACTION_ID", transactionId).build()).build());
                    break;
                }
                break;
        }
        return false;
    }

    public k(wsg.n walletInteractor, ifm.b compositeDisposable) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f195291b = walletInteractor;
        this.f195292c = compositeDisposable;
    }
}
