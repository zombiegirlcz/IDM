package com.fourthline.orca.internal;

import io.ktor.client.engine.HttpClientEngine;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class fz0 {
    public static final ez0 a(String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        try {
            Pair pairA = qz.f32561a.a(baseUrl);
            return new ez0((HttpClientEngine) pairA.f186385a, (db0) pairA.f186386b);
        } catch (Throwable unused) {
            return new ez0(pz.f32080a.a(baseUrl), null);
        }
    }
}
