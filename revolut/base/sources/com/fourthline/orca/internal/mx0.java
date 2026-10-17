package com.fourthline.orca.internal;

import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public abstract class mx0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(gx0 gx0Var) {
        if (gx0Var.getStatus() != sx0.f33158l) {
            return false;
        }
        IntRange intRange = new IntRange(6011, 6013, 1);
        Integer statusCode = gx0Var.getStatusCode();
        return statusCode != null && intRange.d(statusCode.intValue());
    }
}
