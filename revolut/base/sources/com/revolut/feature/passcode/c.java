package com.revolut.feature.passcode;

import android.app.Activity;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public Activity u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f78633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PasscodeScreen f78634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f78635y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PasscodeScreen passcodeScreen, gim.c cVar) {
        super(cVar);
        this.f78634x = passcodeScreen;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f78633w = obj2;
        this.f78635y |= Integer.MIN_VALUE;
        return PasscodeScreen.Z2(this.f78634x, null, this);
    }
}
