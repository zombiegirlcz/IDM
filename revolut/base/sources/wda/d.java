package wda;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f296476c;

    public d(String title, String value, ArrayList highlights) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f296474a = title;
        this.f296475b = value;
        this.f296476c = highlights;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f296474a, dVar.f296474a) && Intrinsics.f(this.f296475b, dVar.f296475b) && this.f296476c.equals(dVar.f296476c);
    }

    public final int hashCode() {
        return this.f296476c.hashCode() + p.a.c(this.f296474a.hashCode() * 31, 31, this.f296475b);
    }
}
