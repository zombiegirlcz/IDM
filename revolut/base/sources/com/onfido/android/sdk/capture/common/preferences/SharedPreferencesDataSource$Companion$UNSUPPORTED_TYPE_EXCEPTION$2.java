package com.onfido.android.sdk.capture.common.preferences;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SharedPreferencesDataSource$Companion$UNSUPPORTED_TYPE_EXCEPTION$2 extends u implements Function0<UnsupportedOperationException> {
    public static final SharedPreferencesDataSource$Companion$UNSUPPORTED_TYPE_EXCEPTION$2 INSTANCE = new SharedPreferencesDataSource$Companion$UNSUPPORTED_TYPE_EXCEPTION$2();

    public SharedPreferencesDataSource$Companion$UNSUPPORTED_TYPE_EXCEPTION$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final UnsupportedOperationException invoke() {
        return new UnsupportedOperationException("Preference type not supported yet");
    }
}
