package ggc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f143619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f143620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f143621c;
    public final ArrayList d;

    public e0(boolean z, f0 categories, s collections, ArrayList rewards) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f143619a = z;
        this.f143620b = categories;
        this.f143621c = collections;
        this.d = rewards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f143619a == e0Var.f143619a && this.f143620b.equals(e0Var.f143620b) && this.f143621c.equals(e0Var.f143621c) && this.d.equals(e0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f143621c.hashCode() + ((this.f143620b.hashCode() + (Boolean.hashCode(this.f143619a) * 31)) * 31)) * 31);
    }
}
