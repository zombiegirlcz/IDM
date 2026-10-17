package com.revolut.feature.junior_remote_login.api.model;

import kotlin.jvm.internal.Intrinsics;
import rlm.g;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements g {
    public a() {
        Intrinsics.checkNotNullParameter("loginState", "discriminator");
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        return "loginState";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        return (obj2 instanceof g) && "loginState".equals(((g) obj2).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return -1122231860;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=loginState)";
    }
}
