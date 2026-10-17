package jnc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f176697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f176698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f176699c;

    public m(l header, ArrayList items, i button) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f176697a = header;
        this.f176698b = items;
        this.f176699c = button;
    }

    @Override // cli.p
    public final List c() {
        return this.f176698b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f176697a.equals(mVar.f176697a) && this.f176698b.equals(mVar.f176698b) && this.f176699c.equals(mVar.f176699c);
    }

    public final int hashCode() {
        return this.f176699c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f176698b, this.f176697a.hashCode() * 31, 31);
    }
}
