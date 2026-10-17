package com.onfido.api.client.token.sdk;

import kotlin.jvm.internal.Intrinsics;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
public final class ApplicantId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50154a;

    public ApplicantId(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f50154a = uuid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ApplicantId) && Intrinsics.f(this.f50154a, ((ApplicantId) obj2).f50154a);
    }

    public final int hashCode() {
        return this.f50154a.hashCode();
    }

    public final String toString() {
        return a.p("ApplicantId(uuid=", this.f50154a, ")");
    }
}
