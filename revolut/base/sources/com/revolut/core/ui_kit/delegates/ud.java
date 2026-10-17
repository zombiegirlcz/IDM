package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ud extends QRCodeDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f54831b;

    public ud(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f54830a = title;
        this.f54831b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj2;
        return this.f54830a.equals(udVar.f54830a) && this.f54831b.equals(udVar.f54831b);
    }

    public final int hashCode() {
        return this.f54831b.hashCode() + (this.f54830a.hashCode() * 31);
    }
}
