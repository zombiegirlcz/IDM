package com.revolut.uicomponent.products;

import android.text.Editable;
import android.widget.TextView;
import com.revolut.uicomponent.products.EditTextDelegate;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends bzl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f107219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditTextDelegate f107220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditTextDelegate.b f107221c;

    public b(TextView textView, EditTextDelegate editTextDelegate, EditTextDelegate.b bVar) {
        this.f107219a = textView;
        this.f107220b = editTextDelegate;
        this.f107221c = bVar;
    }

    @Override // bzl.a, android.text.TextWatcher
    public final void afterTextChanged(Editable changedText) {
        Intrinsics.checkNotNullParameter(changedText, "changedText");
        String string = changedText.toString();
        EditTextDelegate.b bVar = this.f107221c;
        bVar.getClass();
        this.f107219a.setText(String.valueOf(string.length()));
        this.f107220b.f107164c.onNext(new Pair(bVar.f107169a, new EditTextDelegate.Content(string, string, true)));
    }
}
