package com.revolut.chat.domain.model.draft;

import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f51103a;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.ASSISTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.SUPPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.PRIVATE_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f51103a = iArr;
    }
}
