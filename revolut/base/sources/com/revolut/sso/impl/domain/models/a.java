package com.revolut.sso.impl.domain.models;

import cjl.b;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f106217a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.YOUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.RETAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f106217a = iArr;
    }
}
