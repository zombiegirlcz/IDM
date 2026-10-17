package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTProcessesTbsDataRequestBody;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/IdentifyJPKICTBasicPersonalInfo;", "basicPersonalInfo", "", "tbsDataTemplate", "<init>", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/IdentifyJPKICTBasicPersonalInfo;Ljava/lang/String;)V", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JPKICTProcessesTbsDataRequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifyJPKICTBasicPersonalInfo f107523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107524b;

    public JPKICTProcessesTbsDataRequestBody(@i(name = "basic_personal_info") @NotNull IdentifyJPKICTBasicPersonalInfo basicPersonalInfo, @i(name = "tbs_data_template") @NotNull String tbsDataTemplate) {
        Intrinsics.checkNotNullParameter(basicPersonalInfo, "basicPersonalInfo");
        Intrinsics.checkNotNullParameter(tbsDataTemplate, "tbsDataTemplate");
        this.f107523a = basicPersonalInfo;
        this.f107524b = tbsDataTemplate;
    }
}
