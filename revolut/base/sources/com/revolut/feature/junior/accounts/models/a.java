package com.revolut.feature.junior.accounts.models;

import kotlin.jvm.internal.Intrinsics;
import rlm.g;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements g {
    public a() {
        Intrinsics.checkNotNullParameter("juniorPayloadType", "discriminator");
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        return "juniorPayloadType";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        return (obj2 instanceof g) && "juniorPayloadType".equals(((g) obj2).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 98647579;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=juniorPayloadType)";
    }
}
