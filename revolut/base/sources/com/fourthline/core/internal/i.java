package com.fourthline.core.internal;

import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i implements m {
    @Override // com.fourthline.core.internal.m
    public MrzInfo a(y parsedMrz, List validationErrors, String rawMrz) {
        Intrinsics.checkNotNullParameter(parsedMrz, "parsedMrz");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        Intrinsics.checkNotNullParameter(rawMrz, "rawMrz");
        if (parsedMrz instanceof w) {
            return new IdlMrzInfo(rawMrz, validationErrors, ((w) parsedMrz).a());
        }
        throw new IllegalArgumentException("This PARSED MRZ type is not supported.");
    }
}
