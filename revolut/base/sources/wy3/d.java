package wy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv3.a f301070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f301071b;

    public d(cv3.a content, c presentationStyle) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(presentationStyle, "presentationStyle");
        this.f301070a = content;
        this.f301071b = presentationStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f301070a, dVar.f301070a) && this.f301071b == dVar.f301071b;
    }

    public final int hashCode() {
        return this.f301071b.hashCode() + (this.f301070a.hashCode() * 31);
    }
}
