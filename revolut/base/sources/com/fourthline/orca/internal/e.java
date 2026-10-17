package com.fourthline.orca.internal;

import android.content.ContentResolver;

/* JADX INFO: loaded from: classes23.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f27957a;

    private e(d dVar) {
        this.f27957a = dVar;
    }

    public static ContentResolver b(d dVar) {
        ContentResolver contentResolverC = dVar.c();
        vc.s.k(contentResolverC);
        return contentResolverC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentResolver get() {
        return b(this.f27957a);
    }

    public static e a(d dVar) {
        return new e(dVar);
    }
}
