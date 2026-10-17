package me4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f204610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f204611c;
    public final TextLocalisedClause d;
    public final boolean e;
    public final TextLocalisedClause f;

    public o(List items, ResourceImage navigationIcon, TextLocalisedClause title, TextLocalisedClause secondDescription, boolean z, TextLocalisedClause buttonText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f204609a = items;
        this.f204610b = navigationIcon;
        this.f204611c = title;
        this.d = secondDescription;
        this.e = z;
        this.f = buttonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f204609a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f204609a, oVar.f204609a) && this.f204610b.equals(oVar.f204610b) && this.f204611c.equals(oVar.f204611c) && this.d.equals(oVar.d) && this.e == oVar.e && this.f.equals(oVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(t61.a.a(t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f204610b, this.f204609a.hashCode() * 31, 31), 31, this.f204611c), 31, this.d), 31, this.e);
    }
}
