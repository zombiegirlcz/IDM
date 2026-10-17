package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
final class me extends kh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31166a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(String identifier) {
        super("DataWorkRequest with id '" + identifier + "' is not mappable to NetworkRequest.", null, "data_work_request_failed", 2, null);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f31166a = identifier;
    }
}
