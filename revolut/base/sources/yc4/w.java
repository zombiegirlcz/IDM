package yc4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f312531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f312532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f312533c;
    public final String d;
    public final boolean e;

    public w(TextLocalisedClause title, TextLocalisedClause secondDescription, ResourceImage navigationImage, String str, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(navigationImage, "navigationImage");
        this.f312531a = title;
        this.f312532b = secondDescription;
        this.f312533c = navigationImage;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f312531a.equals(wVar.f312531a) && this.f312532b.equals(wVar.f312532b) && this.f312533c.equals(wVar.f312533c) && Intrinsics.f(this.d, wVar.d) && this.e == wVar.e;
    }

    public final int hashCode() {
        int iB = org.bouncycastle.jcajce.provider.digest.a.b(this.f312533c, t61.a.a(this.f312531a.hashCode() * 31, 31, this.f312532b), 31);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
