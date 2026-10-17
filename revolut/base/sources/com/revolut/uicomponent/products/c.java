package com.revolut.uicomponent.products;

import android.text.Editable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends fzl.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f107222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Function0 function0) {
        super(str);
        this.f107222b = function0;
    }

    @Override // fzl.c
    public final boolean a(Editable text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return ((Boolean) this.f107222b.invoke()).booleanValue();
    }
}
