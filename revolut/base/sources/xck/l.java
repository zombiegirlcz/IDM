package xck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304167c;
    public final boolean d;
    public final String e;

    public l(String title, String str, String imageUrl, String promotionalPromptType, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(promotionalPromptType, "promotionalPromptType");
        this.f304165a = title;
        this.f304166b = str;
        this.f304167c = imageUrl;
        this.d = z;
        this.e = promotionalPromptType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f304165a, lVar.f304165a) && Intrinsics.f(this.f304166b, lVar.f304166b) && Intrinsics.f(this.f304167c, lVar.f304167c) && this.d == lVar.d && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f304165a.hashCode() * 31;
        String str = this.f304166b;
        return this.e.hashCode() + j6.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f304167c), 31, this.d);
    }
}
