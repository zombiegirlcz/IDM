package com.revolut.core.ui_kit.models.lightprompt;

import aw0.d4;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f58110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f58111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlMedia f58112c;

    public c(d4 d4Var, TextClause title, UrlMedia media) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(media, "media");
        this.f58110a = d4Var;
        this.f58111b = title;
        this.f58112c = media;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f58110a, cVar.f58110a) && this.f58111b.equals(cVar.f58111b) && this.f58112c.equals(cVar.f58112c);
    }

    public final int hashCode() {
        d4 d4Var = this.f58110a;
        return this.f58112c.f60075a.hashCode() + v7.b((d4Var == null ? 0 : d4Var.hashCode()) * 31, 31, this.f58111b);
    }
}
