package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class zh implements yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj f35584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f35585b;

    public zh(gj bundle, List countries) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f35584a = bundle;
        this.f35585b = countries;
    }

    @Override // com.fourthline.orca.internal.yh
    public fd a() {
        return this.f35584a.g();
    }

    @Override // com.fourthline.orca.internal.u2
    public a01 d() {
        return this.f35584a.g();
    }

    @Override // com.fourthline.orca.internal.u2
    public List e() {
        return this.f35585b;
    }

    @Override // com.fourthline.orca.internal.yh
    public void a(fd fdVar) {
        this.f35584a.a(fdVar);
    }
}
