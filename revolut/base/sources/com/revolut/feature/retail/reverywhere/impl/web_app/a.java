package com.revolut.feature.retail.reverywhere.impl.web_app;

import jfb.s;
import jfb.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f82926b = new Regex("^[a-zA-Z0-9-]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij0.a f82927a;

    public a(ij0.a networkConfiguration, y pathValidator) {
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(pathValidator, "pathValidator");
        this.f82927a = networkConfiguration;
    }
}
