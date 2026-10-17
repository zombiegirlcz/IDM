package ru;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f257384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f257385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f257386c;

    public w(TextClause title, TextLocalisedClause subtitle, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f257384a = title;
        this.f257385b = subtitle;
        this.f257386c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f257384a.equals(wVar.f257384a) && this.f257385b.equals(wVar.f257385b) && Intrinsics.f(this.f257386c, wVar.f257386c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f257384a.hashCode() * 31, 31, this.f257385b);
        dj0.d dVar = this.f257386c;
        return iA + (dVar == null ? 0 : dVar.hashCode());
    }
}
