package com.onfido.api.client.token;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public abstract class Token implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50153b;

    public Token(String tokenValue, String str) {
        Intrinsics.checkNotNullParameter(tokenValue, "tokenValue");
        this.f50152a = tokenValue;
        this.f50153b = str;
    }
}
