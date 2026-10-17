package com.fourthline.orca.internal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jy implements pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f30074a;

    public jy(Function0 getLocale) {
        Intrinsics.checkNotNullParameter(getLocale, "getLocale");
        this.f30074a = getLocale;
    }

    @Override // com.fourthline.orca.internal.pe
    public String a(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        String str = qe.b(new SimpleDateFormat("ddMMyyyy", (Locale) this.f30074a.invoke())).format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
