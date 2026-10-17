package ble;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final itb.a f16597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f16598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f16599c;
    public final t d;
    public final boolean e;
    public final NavBarMessage f;

    public u(itb.a profileAvatar, TextLocalisedClause searchHintClause, List menuItems, t content, boolean z, NavBarMessage navBarMessage) {
        Intrinsics.checkNotNullParameter(profileAvatar, "profileAvatar");
        Intrinsics.checkNotNullParameter(searchHintClause, "searchHintClause");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f16597a = profileAvatar;
        this.f16598b = searchHintClause;
        this.f16599c = menuItems;
        this.d = content;
        this.e = z;
        this.f = navBarMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f16597a, uVar.f16597a) && this.f16598b.equals(uVar.f16598b) && this.f16599c.equals(uVar.f16599c) && this.d.equals(uVar.d) && this.e == uVar.e && Intrinsics.f(this.f, uVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + p.a.d(t61.a.a(this.f16597a.f168357a.hashCode() * 31, 31, this.f16598b), 31, this.f16599c)) * 31, 31, this.e);
        NavBarMessage navBarMessage = this.f;
        return iC + (navBarMessage == null ? 0 : navBarMessage.hashCode());
    }
}
