package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class kh0 extends Throwable {
    public static final int $stable = 8;

    @NotNull
    private final String alias;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh0(String str, Throwable th10, String alias) {
        super(str, th10);
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.alias = alias;
    }

    @NotNull
    public final String getAlias() {
        return this.alias;
    }

    public /* synthetic */ kh0(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, str2);
    }
}
