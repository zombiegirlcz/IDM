package zn6;

import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.model.account_linking.AccountLinkingExpirationOption;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f323673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f323674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f323675c;
    public final AccountLinkingExpirationOption d;

    public h(Data preview, Set selectedPermissions, boolean z, AccountLinkingExpirationOption accountLinkingExpirationOption) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(selectedPermissions, "selectedPermissions");
        this.f323673a = preview;
        this.f323674b = selectedPermissions;
        this.f323675c = z;
        this.d = accountLinkingExpirationOption;
    }

    public static h a(h hVar, Data preview, Set selectedPermissions, AccountLinkingExpirationOption accountLinkingExpirationOption, int i) {
        if ((i & 1) != 0) {
            preview = hVar.f323673a;
        }
        if ((i & 2) != 0) {
            selectedPermissions = hVar.f323674b;
        }
        boolean z = hVar.f323675c;
        if ((i & 8) != 0) {
            accountLinkingExpirationOption = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(selectedPermissions, "selectedPermissions");
        return new h(preview, selectedPermissions, z, accountLinkingExpirationOption);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f323673a, hVar.f323673a) && Intrinsics.f(this.f323674b, hVar.f323674b) && this.f323675c == hVar.f323675c && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.f(this.f323673a.hashCode() * 31, 31, this.f323674b), 31, this.f323675c);
        AccountLinkingExpirationOption accountLinkingExpirationOption = this.d;
        return iC + (accountLinkingExpirationOption == null ? 0 : accountLinkingExpirationOption.hashCode());
    }
}
