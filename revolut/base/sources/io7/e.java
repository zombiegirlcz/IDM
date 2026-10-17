package io7;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f163197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f163198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContactImage f163199c;

    public e(aim.e items, TextClause title, ContactImage navBarImage) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navBarImage, "navBarImage");
        this.f163197a = items;
        this.f163198b = title;
        this.f163199c = navBarImage;
    }

    @Override // cli.p
    public final List c() {
        return this.f163197a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f163197a, eVar.f163197a) && this.f163198b.equals(eVar.f163198b) && this.f163199c.equals(eVar.f163199c);
    }

    public final int hashCode() {
        return this.f163199c.hashCode() + v7.b(this.f163197a.hashCode() * 31, 31, this.f163198b);
    }
}
