package com.fourthline.orca.internal;

import android.content.ContentResolver;

/* JADX INFO: loaded from: classes23.dex */
public final class ka implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ja f30193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30194b;

    private ka(ja jaVar, e4m.e eVar) {
        this.f30193a = jaVar;
        this.f30194b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g8 get() {
        return a(this.f30193a, (ContentResolver) this.f30194b.get());
    }

    public static ka a(ja jaVar, e4m.e eVar) {
        return new ka(jaVar, eVar);
    }

    public static g8 a(ja jaVar, ContentResolver contentResolver) {
        g8 g8VarA = jaVar.a(contentResolver);
        vc.s.k(g8VarA);
        return g8VarA;
    }
}
