package com.onfido.android.sdk.capture.utils;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class ToolbarExtensionsKt$performActionOnTitleTextView$$inlined$filterIsInstance$1 extends u implements Function1<Object, Boolean> {
    public static final ToolbarExtensionsKt$performActionOnTitleTextView$$inlined$filterIsInstance$1 INSTANCE = new ToolbarExtensionsKt$performActionOnTitleTextView$$inlined$filterIsInstance$1();

    public ToolbarExtensionsKt$performActionOnTitleTextView$$inlined$filterIsInstance$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(Object obj2) {
        return Boolean.valueOf(obj2 instanceof TextView);
    }
}
