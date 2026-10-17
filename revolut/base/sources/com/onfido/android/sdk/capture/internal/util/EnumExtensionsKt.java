package com.onfido.android.sdk.capture.internal.util;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"lowercase", "", "E", "", "(Ljava/lang/Enum;)Ljava/lang/String;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EnumExtensionsKt {
    public static final /* synthetic */ <E extends Enum<E>> String lowercase(E e) {
        Intrinsics.checkNotNullParameter(e, "<this>");
        String strName = e.name();
        Locale locale = Locale.US;
        return p.a.r(locale, "US", strName, locale, "toLowerCase(...)");
    }
}
