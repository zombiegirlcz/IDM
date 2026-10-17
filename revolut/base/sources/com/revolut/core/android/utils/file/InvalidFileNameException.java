package com.revolut.core.android.utils.file;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/android/utils/file/InvalidFileNameException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "core_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvalidFileNameException extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51214a;

    public InvalidFileNameException() {
        super("Filename contains not permitted characters");
        this.f51214a = "Filename contains not permitted characters";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f51214a;
    }
}
