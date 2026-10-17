package ptb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainScreenTab f239643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239644c;
    public final TextLocalisedClause d;
    public final ResourceImage e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f239645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f239646h;

    public f(String listId, MainScreenTab mainScreenTab, String id10, TextLocalisedClause title, ResourceImage icon, Clause subtitle, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(mainScreenTab, "mainScreenTab");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f239642a = listId;
        this.f239643b = mainScreenTab;
        this.f239644c = id10;
        this.d = title;
        this.e = icon;
        this.f = subtitle;
        this.f239645g = z;
        this.f239646h = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f239642a, fVar.f239642a) && Intrinsics.f(this.f239643b, fVar.f239643b) && Intrinsics.f(this.f239644c, fVar.f239644c) && this.d.equals(fVar.d) && this.e.equals(fVar.e) && Intrinsics.f(this.f, fVar.f) && this.f239645g == fVar.f239645g && this.f239646h == fVar.f239646h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239646h) + j6.a.c(p.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.e, t61.a.a(p.a.c(p.a.c(this.f239642a.hashCode() * 31, 31, this.f239643b.f83420a), 31, this.f239644c), 31, this.d), 31), 31, this.f), 31, this.f239645g);
    }
}
