package unc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f281404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f281405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f281406c;

    public o(n header, ArrayList items, m buttons) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f281404a = header;
        this.f281405b = items;
        this.f281406c = buttons;
    }

    @Override // cli.p
    public final List c() {
        return this.f281405b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f281404a.equals(oVar.f281404a) && this.f281405b.equals(oVar.f281405b) && this.f281406c.equals(oVar.f281406c);
    }

    public final int hashCode() {
        return this.f281406c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f281405b, this.f281404a.hashCode() * 31, 31);
    }
}
