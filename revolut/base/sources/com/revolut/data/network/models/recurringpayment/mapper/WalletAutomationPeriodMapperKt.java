package com.revolut.data.network.models.recurringpayment.mapper;

import ibd.j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Libd/j;", "toWalletAutomationPeriod", "(Ljava/lang/String;)Libd/j;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class WalletAutomationPeriodMapperKt {
    public static final j toWalletAutomationPeriod(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Iterator<E> it8 = j.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((j) next).b(), str)) {
                break;
            }
        }
        return (j) next;
    }
}
