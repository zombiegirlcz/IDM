package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTProcessesTbsDataResponse;", "", "", "tbsRawData", "<init>", "(Ljava/lang/String;)V", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JPKICTProcessesTbsDataResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107525a;

    public JPKICTProcessesTbsDataResponse(@i(name = "tbs_raw_data") @NotNull String tbsRawData) {
        Intrinsics.checkNotNullParameter(tbsRawData, "tbsRawData");
        this.f107525a = tbsRawData;
    }
}
