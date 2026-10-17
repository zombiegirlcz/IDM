package com.revolut.feature.tab.accounts.models.product_payload;

import kotlin.jvm.internal.Intrinsics;
import rlm.g;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements g {
    public a() {
        Intrinsics.checkNotNullParameter("savingsType", "discriminator");
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        return "savingsType";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        return (obj2 instanceof g) && "savingsType".equals(((g) obj2).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return -57414409;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=savingsType)";
    }
}
