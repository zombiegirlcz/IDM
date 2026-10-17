package com.revolut.sso.api.accounts;

import android.os.Parcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/api/accounts/RevolutAccount;", "Landroid/os/Parcelable;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutAccount extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f105820a;

    /* JADX INFO: renamed from: com.revolut.sso.api.accounts.RevolutAccount$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f105820a = new Companion();

        private Companion() {
        }
    }
}
