package xy3;

import ht3.l0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import xy3.a;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f309585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f309586c;

    public n(String id10, l0 content, HashMap actions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f309584a = id10;
        this.f309585b = content;
        this.f309586c = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f309584a, nVar.f309584a) && Intrinsics.f(this.f309585b, nVar.f309585b) && Intrinsics.f(this.f309586c, nVar.f309586c);
    }

    public final int hashCode() {
        return this.f309586c.hashCode() + ((this.f309585b.hashCode() + (this.f309584a.hashCode() * 31)) * 31);
    }
}
