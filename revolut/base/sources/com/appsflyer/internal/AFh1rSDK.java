package com.appsflyer.internal;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AFh1rSDK extends AFa1pSDK {
    private final boolean i;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f26035w;

    public AFh1rSDK() {
        this(null, null, null);
    }

    public AFh1rSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.i = bool != null ? bool.booleanValue() : true;
        this.f26035w = true;
    }
}
