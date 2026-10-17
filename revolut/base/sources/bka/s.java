package bka;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16336c;

    public s(String str, String text, String asset) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f16334a = str;
        this.f16335b = text;
        this.f16336c = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f16334a, sVar.f16334a) && Intrinsics.f(this.f16335b, sVar.f16335b) && Intrinsics.f(this.f16336c, sVar.f16336c);
    }

    public final int hashCode() {
        String str = this.f16334a;
        return this.f16336c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f16335b);
    }
}
