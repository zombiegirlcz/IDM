package qje;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final itb.a f246843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f246844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f246845c;
    public final Clause d;
    public final boolean e;
    public final NavBarMessage f;

    public p(itb.a profileAvatar, List headerModels, List headerMenuItems, Clause clause, boolean z, NavBarMessage navBarMessage) {
        Intrinsics.checkNotNullParameter(profileAvatar, "profileAvatar");
        Intrinsics.checkNotNullParameter(headerModels, "headerModels");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        this.f246843a = profileAvatar;
        this.f246844b = headerModels;
        this.f246845c = headerMenuItems;
        this.d = clause;
        this.e = z;
        this.f = navBarMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f246843a, pVar.f246843a) && Intrinsics.f(this.f246844b, pVar.f246844b) && Intrinsics.f(this.f246845c, pVar.f246845c) && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f246843a.f168357a.hashCode() * 31, 31, this.f246844b), 31, this.f246845c);
        Clause clause = this.d;
        int iC = j6.a.c((iD + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
        NavBarMessage navBarMessage = this.f;
        return iC + (navBarMessage != null ? navBarMessage.hashCode() : 0);
    }
}
