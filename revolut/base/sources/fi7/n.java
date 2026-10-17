package fi7;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f135334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f135335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f135336c;
    public final ArrayList d;

    public n(Clause navbarTitle, Clause clause, ArrayList navbarActions, ArrayList items) {
        Intrinsics.checkNotNullParameter(navbarTitle, "navbarTitle");
        Intrinsics.checkNotNullParameter(navbarActions, "navbarActions");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f135334a = navbarTitle;
        this.f135335b = clause;
        this.f135336c = navbarActions;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f135334a.equals(nVar.f135334a) && this.f135335b.equals(nVar.f135335b) && this.f135336c.equals(nVar.f135336c) && this.d.equals(nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f135336c, p.a.b(this.f135334a.hashCode() * 31, 31, this.f135335b), 31);
    }
}
