package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vd extends QRCodeDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f54866b;

    public vd(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f54865a = title;
        this.f54866b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj2;
        return this.f54865a.equals(vdVar.f54865a) && this.f54866b.equals(vdVar.f54866b);
    }

    public final int hashCode() {
        return this.f54866b.hashCode() + (this.f54865a.hashCode() * 31);
    }
}
