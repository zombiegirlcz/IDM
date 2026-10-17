package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;

/* JADX INFO: loaded from: classes23.dex */
public interface to {
    fd a();

    default DocumentType b() {
        return k().getType();
    }

    default en f() {
        return en.f28203b.a();
    }

    Integer g();

    double i();

    boolean isDynamicStepsEnabled();

    boolean j();

    DocumentScannerConfig k();

    boolean l();

    f1 n();

    boolean p();

    boolean r();
}
