package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wq implements vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj f34767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f34768b;

    public wq(gj bundle, List supportedCountries) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
        this.f34767a = bundle;
        this.f34768b = supportedCountries;
    }

    @Override // com.fourthline.orca.internal.vq
    public fd a() {
        return ij.a(this.f34767a);
    }

    @Override // com.fourthline.orca.internal.vq
    public List b() {
        return di.e.a(ij.a(this.f34767a), this.f34768b);
    }

    @Override // com.fourthline.orca.internal.vq
    public di c() {
        return this.f34767a.o();
    }

    @Override // com.fourthline.orca.internal.vq
    public void a(di document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f34767a.a(document);
        this.f34767a.f().a();
        this.f34767a.a((DocumentScannerResult) null);
        this.f34767a.a((tg) null);
        this.f34767a.a((ad0) null);
    }
}
