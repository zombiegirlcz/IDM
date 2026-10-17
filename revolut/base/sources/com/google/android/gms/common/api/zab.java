package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* JADX INFO: loaded from: classes16.dex */
final class zab implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    public zab(Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        synchronized (this.zaa.f37704zai) {
            try {
                if (this.zaa.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.zaa.f37702zag = true;
                } else if (!status.isSuccess()) {
                    this.zaa.f37701zaf = true;
                }
                Batch batch = this.zaa;
                batch.f37700zae--;
                Batch batch2 = this.zaa;
                if (batch2.f37700zae == 0) {
                    if (batch2.f37702zag) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        Status status2 = batch2.f37701zaf ? new Status(13) : Status.RESULT_SUCCESS;
                        Batch batch3 = this.zaa;
                        batch3.setResult(new BatchResult(status2, batch3.f37703zah));
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
