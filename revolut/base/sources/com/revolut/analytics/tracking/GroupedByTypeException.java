package com.revolut.analytics.tracking;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/analytics/tracking/GroupedByTypeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GroupedByTypeException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupedByTypeException(Class groupingType, String message) {
        super(message);
        Intrinsics.checkNotNullParameter(groupingType, "groupingType");
        Intrinsics.checkNotNullParameter(message, "message");
        String canonicalName = groupingType.getCanonicalName();
        StackTraceElement stackTraceElement = new StackTraceElement(canonicalName == null ? getClass().getCanonicalName() : canonicalName, "", groupingType.getSimpleName().concat(".kt"), 1);
        s0 s0Var = new s0(2);
        s0Var.a(stackTraceElement);
        s0Var.b(getStackTrace());
        ArrayList arrayList = s0Var.f186433a;
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }
}
