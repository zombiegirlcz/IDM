package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/IdentifyJPKICTBasicPersonalInfo;", "", "", "allName", "gender", "dateOfBirth", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IdentifyJPKICTBasicPersonalInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107513c;
    public final String d;

    public IdentifyJPKICTBasicPersonalInfo(@i(name = "all_name") @NotNull String allName, @i(name = "gender") @NotNull String gender, @i(name = "date_of_birth") @NotNull String dateOfBirth, @i(name = "address") @NotNull String address) {
        Intrinsics.checkNotNullParameter(allName, "allName");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f107511a = allName;
        this.f107512b = gender;
        this.f107513c = dateOfBirth;
        this.d = address;
    }
}
