package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class ma implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ja f31121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31123c;

    private ma(ja jaVar, e4m.e eVar, e4m.e eVar2) {
        this.f31121a = jaVar;
        this.f31122b = eVar;
        this.f31123c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qx get() {
        return a(this.f31121a, (Context) this.f31122b.get(), (ContentResolver) this.f31123c.get());
    }

    public static ma a(ja jaVar, e4m.e eVar, e4m.e eVar2) {
        return new ma(jaVar, eVar, eVar2);
    }

    public static qx a(ja jaVar, Context context, ContentResolver contentResolver) {
        qx qxVarA = jaVar.a(context, contentResolver);
        vc.s.k(qxVarA);
        return qxVarA;
    }
}
