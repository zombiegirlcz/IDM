package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ns implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xc0 f31471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f31472b;

    public ns(xc0 nfcCanStateHandler, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(nfcCanStateHandler, "nfcCanStateHandler");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f31471a = nfcCanStateHandler;
        this.f31472b = imageServiceLocator;
    }

    public final Function1 a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f31471a.a(input);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public vc0 getInitialState() {
        return vc0.a(this.f31471a.getInitialState(), null, null, null, this.f31472b.a(r10.f32598w0), null, null, c81.a.a(c81.f27404a, R.string.shared_button_choose_another_verification_type, 0, 2, null), 39, null);
    }

    public final Function1 a(tc0 fieldType, boolean z) {
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        return this.f31471a.a(fieldType, z);
    }
}
