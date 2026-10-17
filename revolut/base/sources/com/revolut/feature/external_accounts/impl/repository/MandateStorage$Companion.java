package com.revolut.feature.external_accounts.impl.repository;

import ai6.b;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MandateStorage$Companion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MandateStorage$Companion f72485a = new MandateStorage$Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f72486b;

    static {
        Type type = new TypeToken<List<? extends b>>() { // from class: com.revolut.feature.external_accounts.impl.repository.MandateStorage$Companion$LIST_OF_MANDATE_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f72486b = type;
    }

    private MandateStorage$Companion() {
    }
}
