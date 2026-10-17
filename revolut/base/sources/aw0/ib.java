package aw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ib implements kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f10363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f10364b;

    public ib(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f10363a = title;
        this.f10364b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj2;
        return this.f10363a.equals(ibVar.f10363a) && this.f10364b.equals(ibVar.f10364b);
    }

    public final int hashCode() {
        return this.f10364b.hashCode() + (this.f10363a.hashCode() * 31);
    }
}
