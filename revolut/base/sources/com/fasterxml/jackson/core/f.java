package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26173a;

    static {
        int[] iArr = new int[i9.a.values().length];
        f26173a = iArr;
        try {
            iArr[i9.a.PARENT_PROPERTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26173a[i9.a.PAYLOAD_PROPERTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26173a[i9.a.METADATA_PROPERTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26173a[i9.a.WRAPPER_OBJECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f26173a[i9.a.WRAPPER_ARRAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
