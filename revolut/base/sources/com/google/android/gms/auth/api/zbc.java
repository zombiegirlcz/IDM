package com.google.android.gms.auth.api;

import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public final class zbc {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    protected Boolean f37535zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    protected String f37536zbb;

    public zbc() {
        this.f37535zba = Boolean.FALSE;
    }

    @ShowFirstParty
    public final zbc zba(String str) {
        this.f37536zbb = str;
        return this;
    }

    @ShowFirstParty
    public zbc(zbd zbdVar) {
        this.f37535zba = Boolean.FALSE;
        zbd.zbb(zbdVar);
        this.f37535zba = Boolean.valueOf(zbdVar.zbc);
        this.f37536zbb = zbdVar.f37539zbd;
    }
}
