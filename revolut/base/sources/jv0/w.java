package jv0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oz0.c f178766b;

    public w(String url2, oz0.c transparencyMode) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        this.f178765a = url2;
        this.f178766b = transparencyMode;
    }

    @Override // jv0.x
    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f178765a;
    }

    @Override // jv0.x
    public final oz0.c b() {
        return this.f178766b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f178765a, wVar.f178765a) && this.f178766b == wVar.f178766b;
    }

    public final int hashCode() {
        return this.f178766b.hashCode() + (this.f178765a.hashCode() * 31);
    }
}
