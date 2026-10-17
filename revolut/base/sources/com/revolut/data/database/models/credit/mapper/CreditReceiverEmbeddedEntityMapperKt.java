package com.revolut.data.database.models.credit.mapper;

import com.revolut.data.database.models.credit.CreditReceiverEmbeddedEntity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tua.a;
import tua.b;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\" \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltua/b;", "Lcom/revolut/data/database/models/credit/CreditReceiverEmbeddedEntity;", "toEmbeddedEntity", "(Ltua/b;)Lcom/revolut/data/database/models/credit/CreditReceiverEmbeddedEntity;", "", "Ltua/a;", "", "amountTypeMapping", "Ljava/util/Map;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CreditReceiverEmbeddedEntityMapperKt {

    @NotNull
    private static final Map<a, String> amountTypeMapping = r0.k(new Pair(a.FIXED, "fixed"), new Pair(a.STATEMENT, "statement"), new Pair(a.MINIMUM, "min_repayment"));

    @NotNull
    public static final CreditReceiverEmbeddedEntity toEmbeddedEntity(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new CreditReceiverEmbeddedEntity((String) r0.h(bVar.f274544a, amountTypeMapping), bVar.f274545b);
    }
}
