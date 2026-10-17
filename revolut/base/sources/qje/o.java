package qje;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$TabPagerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final itb.b f246841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f246842c;
    public final NavBarMessage d;
    public final List e;
    public final String f;

    public o(String pagerItemId, itb.b userProfileAvatarParams, boolean z, NavBarMessage navBarMessage) {
        Intrinsics.checkNotNullParameter(pagerItemId, "pagerItemId");
        Intrinsics.checkNotNullParameter(userProfileAvatarParams, "userProfileAvatarParams");
        this.f246840a = pagerItemId;
        this.f246841b = userProfileAvatarParams;
        this.f246842c = z;
        this.d = navBarMessage;
        this.e = zhm.u.c(new TabCryptoFlowContract$TabPagerItem(pagerItemId));
        this.f = pagerItemId;
    }

    public static o a(o oVar, String pagerItemId, itb.b userProfileAvatarParams, boolean z, NavBarMessage navBarMessage, int i) {
        if ((i & 1) != 0) {
            pagerItemId = oVar.f246840a;
        }
        if ((i & 2) != 0) {
            userProfileAvatarParams = oVar.f246841b;
        }
        if ((i & 4) != 0) {
            z = oVar.f246842c;
        }
        if ((i & 8) != 0) {
            navBarMessage = oVar.d;
        }
        oVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItemId, "pagerItemId");
        Intrinsics.checkNotNullParameter(userProfileAvatarParams, "userProfileAvatarParams");
        return new o(pagerItemId, userProfileAvatarParams, z, navBarMessage);
    }

    @Override // oki.a
    public final List W() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f246840a, oVar.f246840a) && Intrinsics.f(this.f246841b, oVar.f246841b) && this.f246842c == oVar.f246842c && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f246841b.hashCode() + (this.f246840a.hashCode() * 31)) * 31, 31, this.f246842c);
        NavBarMessage navBarMessage = this.d;
        return iC + (navBarMessage == null ? 0 : navBarMessage.hashCode());
    }

    @Override // oki.a
    public final String z() {
        return this.f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o() {
        this("ACCOUNT_SELECTION_RETAIL_CRYPTO_LIST_ID", itb.b.d, false, null);
        itb.b.Companion.getClass();
    }
}
