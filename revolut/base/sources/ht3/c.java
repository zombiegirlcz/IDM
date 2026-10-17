package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f155257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f155258c;

    public c(String text, a action, b style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f155256a = text;
        this.f155257b = action;
        this.f155258c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f155256a, cVar.f155256a) && Intrinsics.f(this.f155257b, cVar.f155257b) && this.f155258c == cVar.f155258c;
    }

    public final int hashCode() {
        return this.f155258c.hashCode() + ((this.f155257b.hashCode() + (this.f155256a.hashCode() * 31)) * 31);
    }
}
