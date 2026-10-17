package com.onfido.android.sdk.capture.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class StringRepresentation$MultiStringResIdsRepresentation$getString$1 extends q implements Function1<Integer, String> {
    public StringRepresentation$MultiStringResIdsRepresentation$getString$1(Object obj2) {
        super(1, 0, Context.class, obj2, "getString", "getString(I)Ljava/lang/String;");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return invoke(((Number) obj2).intValue());
    }

    @NotNull
    public final String invoke(int i) {
        return ((Context) this.receiver).getString(i);
    }
}
