package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.Context;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;

/* JADX INFO: loaded from: classes23.dex */
public final class ce implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f27443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27445c;
    private final e4m.e d;
    private final e4m.e e;

    private ce(xd xdVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f27443a = xdVar;
        this.f27444b = eVar;
        this.f27445c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kf get() {
        return a(this.f27443a, (Context) this.f27444b.get(), (Activity) this.f27445c.get(), (ef) this.d.get(), (AndroidDataCollectorHelper) this.e.get());
    }

    public static ce a(xd xdVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new ce(xdVar, eVar, eVar2, eVar3, eVar4);
    }

    public static kf a(xd xdVar, Context context, Activity activity, ef efVar, AndroidDataCollectorHelper androidDataCollectorHelper) {
        kf kfVarA = xdVar.a(context, activity, efVar, androidDataCollectorHelper);
        vc.s.k(kfVarA);
        return kfVarA;
    }
}
