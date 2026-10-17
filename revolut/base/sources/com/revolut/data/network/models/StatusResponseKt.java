package com.revolut.data.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isSuccess", "", "Lcom/revolut/data/network/models/StatusResponse;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class StatusResponseKt {
    public static final boolean isSuccess(@NotNull StatusResponse statusResponse) {
        Intrinsics.checkNotNullParameter(statusResponse, "<this>");
        return Intrinsics.f(statusResponse.getStatus(), Status.SUCCESS.getKey());
    }
}
