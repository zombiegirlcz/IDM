package jv0;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f178763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oz0.c f178764b;

    public v(Uri uri2, oz0.c transparencyMode) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        this.f178763a = uri2;
        this.f178764b = transparencyMode;
    }

    @Override // jv0.x
    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = this.f178763a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // jv0.x
    public final oz0.c b() {
        return this.f178764b;
    }

    public final Uri c() {
        return this.f178763a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f178763a, vVar.f178763a) && this.f178764b == vVar.f178764b;
    }

    public final int hashCode() {
        return this.f178764b.hashCode() + (this.f178763a.hashCode() * 31);
    }
}
