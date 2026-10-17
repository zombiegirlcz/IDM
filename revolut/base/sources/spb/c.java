package spb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayeredImage f264925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f264926c;
    public final dj0.d d;
    public final boolean e;
    public final p f;

    public c(String id10, LayeredImage image, Clause title, dj0.d balance, boolean z, p parcel) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f264924a = id10;
        this.f264925b = image;
        this.f264926c = title;
        this.d = balance;
        this.e = z;
        this.f = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f264924a, cVar.f264924a) && this.f264925b.equals(cVar.f264925b) && this.f264926c.equals(cVar.f264926c) && this.d.equals(cVar.d) && this.e == cVar.e && this.f.equals(cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(v7.c(p.a.b(h30.l.e(this.f264925b, this.f264924a.hashCode() * 31, 31), 31, this.f264926c), 31, this.d), 31, this.e);
    }
}
