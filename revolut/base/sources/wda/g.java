package wda;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f296483c;

    public g(String value, String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f296481a = value;
        this.f296482b = title;
        this.f296483c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f296481a, gVar.f296481a) && Intrinsics.f(this.f296482b, gVar.f296482b) && this.f296483c.equals(gVar.f296483c);
    }

    @Override // wda.h
    public final String getValue() {
        return this.f296481a;
    }

    public final int hashCode() {
        return this.f296483c.hashCode() + p.a.c(this.f296481a.hashCode() * 31, 31, this.f296482b);
    }
}
