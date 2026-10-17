package com.revolut.feature.retail.savings.api.navigation.models;

import cfl.b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f83183a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.SUSPENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b.OFFBOARDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[b.TERMINATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f83183a = iArr;
    }
}
