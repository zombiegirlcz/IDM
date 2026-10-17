package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private int f37700zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private boolean f37701zaf;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private boolean f37702zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private final PendingResult[] f37703zah;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private final Object f37704zai;

    public static final class Builder {
        private final List zaa = new ArrayList();

        /* JADX INFO: renamed from: zab, reason: collision with root package name */
        private final GoogleApiClient f37705zab;

        public Builder(@NonNull GoogleApiClient googleApiClient) {
            this.f37705zab = googleApiClient;
        }

        @NonNull
        @ResultIgnorabilityUnspecified
        public <R extends Result> BatchResultToken<R> add(@NonNull PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.zaa.size());
            this.zaa.add(pendingResult);
            return batchResultToken;
        }

        @NonNull
        public Batch build() {
            return new Batch(this.zaa, this.f37705zab, null);
        }
    }

    public /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, zac zacVar) {
        super(googleApiClient);
        this.f37704zai = new Object();
        int size = list.size();
        this.f37700zae = size;
        PendingResult[] pendingResultArr = new PendingResult[size];
        this.f37703zah = pendingResultArr;
        if (list.isEmpty()) {
            setResult(new BatchResult(Status.RESULT_SUCCESS, pendingResultArr));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            PendingResult pendingResult = (PendingResult) list.get(i);
            this.f37703zah[i] = pendingResult;
            pendingResult.addStatusListener(new zab(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
        super.cancel();
        int i = 0;
        while (true) {
            PendingResult[] pendingResultArr = this.f37703zah;
            if (i >= pendingResultArr.length) {
                return;
            }
            pendingResultArr[i].cancel();
            i++;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    public BatchResult createFailedResult(@NonNull Status status) {
        return new BatchResult(status, this.f37703zah);
    }
}
