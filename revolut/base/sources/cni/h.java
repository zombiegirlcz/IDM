package cni;

import au0.q0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends com.revolut.oauth.impl.ui.consent.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f25438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f25439b;

    public h(TextLocalisedClause title, q0 duoAvatar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(duoAvatar, "duoAvatar");
        this.f25438a = title;
        this.f25439b = duoAvatar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f25438a.equals(hVar.f25438a) && this.f25439b.equals(hVar.f25439b);
    }

    public final int hashCode() {
        return this.f25439b.hashCode() + (this.f25438a.hashCode() * 31);
    }
}
