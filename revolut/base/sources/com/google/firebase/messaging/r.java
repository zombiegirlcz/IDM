package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.internal.Intrinsics;
import tjf.m0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements OnSuccessListener, efm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f49523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49524b;

    public /* synthetic */ r(Object obj2, boolean z) {
        this.f49524b = obj2;
        this.f49523a = z;
    }

    @Override // efm.g
    public efm.f d(efm.b completable) {
        tpi.i iVar = (tpi.i) this.f49524b;
        Intrinsics.checkNotNullParameter(completable, "completable");
        m0 m0Var = new m0(new t9f.n(iVar, this.f49523a, 3), 17);
        dfm.c cVar = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        return new pfm.t(new pfm.t(completable, m0Var, cVar, aVar, aVar, aVar, aVar).m(new m0(new tpi.e(iVar, 6), 23)).l(new tpi.f(iVar, 6)), cVar, cVar, aVar, aVar, aVar, new tpi.f(iVar, 7));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public void onSuccess(Object obj2) {
        SharedPreferences.Editor editorEdit = com.bumptech.glide.d.j((Context) this.f49524b).edit();
        editorEdit.putBoolean("proxy_retention", this.f49523a);
        editorEdit.apply();
    }
}
