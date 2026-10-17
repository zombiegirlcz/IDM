package com.google.android.gms.signin;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {

    @NonNull
    public static final SignInOptions zaa = new SignInOptions(false, false, null, false, null, null, false, null, null, null);

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final boolean f48432zab = false;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final boolean f48433zac = false;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final String f48434zad = null;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final boolean f48435zae = false;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private final boolean f48438zah = false;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private final String f48436zaf = null;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private final String f48437zag = null;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private final Long f48439zai = null;

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    private final Long f48440zaj = null;

    public /* synthetic */ SignInOptions(boolean z, boolean z3, String str, boolean z4, String str2, String str3, boolean z6, Long l2, Long l3, zaf zafVar) {
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return (obj2 instanceof SignInOptions) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hashCode(bool, bool, null, bool, bool, null, null, null, null);
    }
}
