package com.fourthline.orca.internal;

import com.google.common.base.Optional;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ln {
    public final bg a(Optional bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Object objOr = bundle.or(new we(null, null, null, 7, null));
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        return (bg) objOr;
    }
}
