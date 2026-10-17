package com.onfido.android.sdk.capture.ui.userconsent;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class UserConsentFragment$setDoNotAcceptButtonListener$1$2 extends u implements Function1<DialogInterface, Unit> {
    public static final UserConsentFragment$setDoNotAcceptButtonListener$1$2 INSTANCE = new UserConsentFragment$setDoNotAcceptButtonListener$1$2();

    public UserConsentFragment$setDoNotAcceptButtonListener$1$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((DialogInterface) obj2);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }
}
