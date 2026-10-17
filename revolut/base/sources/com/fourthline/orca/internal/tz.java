package com.fourthline.orca.internal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class tz implements pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f33897a;

    public tz(Function0 getLocale) {
        Intrinsics.checkNotNullParameter(getLocale, "getLocale");
        this.f33897a = getLocale;
    }

    @Override // com.fourthline.orca.internal.pe
    public String a(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        String str = qe.b(new SimpleDateFormat("MMMM dd, yyyy", (Locale) this.f33897a.invoke())).format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
