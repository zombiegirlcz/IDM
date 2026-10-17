package com.fourthline.core.internal.security;

import aem.v;
import kotlin.Lazy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u000e\u001a\u00020\u0007H\u0083 J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/fourthline/core/internal/security/NativeSecurityChecker;", "", "<init>", "()V", "TAG", "", "THREAT_BITS_UNAVAILABLE", "", "libraryLoaded", "", "getLibraryLoaded", "()Z", "libraryLoaded$delegate", "Lkotlin/Lazy;", "rQ", "isNativeLibraryLoaded", "nativeThreatBitsOrUnavailable", "isCompromised", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NativeSecurityChecker {

    @NotNull
    private static final String TAG = "FLSecurityNative";
    public static final int THREAT_BITS_UNAVAILABLE = -1;

    @NotNull
    public static final NativeSecurityChecker INSTANCE = new NativeSecurityChecker();

    /* JADX INFO: renamed from: libraryLoaded$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy libraryLoaded = j.b(new v(24));

    private NativeSecurityChecker() {
    }

    private final boolean getLibraryLoaded() {
        return ((Boolean) libraryLoaded.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean libraryLoaded_delegate$lambda$0() {
        try {
            System.loadLibrary("fourthline-security");
            return true;
        } catch (UnsatisfiedLinkError e) {
            e.getMessage();
            return false;
        }
    }

    private static final native int rQ();

    public final boolean isCompromised() {
        if (!getLibraryLoaded()) {
            return false;
        }
        try {
            return rQ() != 0;
        } catch (Throwable th10) {
            th10.getMessage();
            return false;
        }
    }

    public final boolean isNativeLibraryLoaded() {
        return getLibraryLoaded();
    }

    public final int nativeThreatBitsOrUnavailable() {
        if (!getLibraryLoaded()) {
            return -1;
        }
        try {
            return rQ();
        } catch (Throwable th10) {
            th10.getMessage();
            return -1;
        }
    }
}
