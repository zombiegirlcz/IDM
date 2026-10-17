package com.google.mlkit.common;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class MlKitException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49665a;

    public MlKitException(String str, int i) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.f49665a = i;
    }

    public MlKitException(int i, Exception exc2, String str) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), exc2);
        this.f49665a = i;
    }
}
