package com.revolut.core.ui_kit.internal.views;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import ms0.z0;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f56873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color.Solid f56874c;
    public final Object d;
    public final z0 e;
    public final int f;

    public d(String listId, Clause title, Color.Solid titleColor, Clause subtitle, z0 state, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f56872a = listId;
        this.f56873b = title;
        this.f56874c = titleColor;
        this.d = subtitle;
        this.e = state;
        this.f = i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return this.f56872a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f56872a, dVar.f56872a) && this.f56873b.equals(dVar.f56873b) && this.f56874c.equals(dVar.f56874c) && this.d.equals(dVar.d) && this.e.equals(dVar.e) && this.f == dVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j6.a.b(this.f, (this.e.hashCode() + p.a.b(j6.a.b(this.f56874c.f51464b, p.a.b(this.f56872a.hashCode() * 31, 31, this.f56873b), 31), 31, this.d)) * 31, 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof d)) {
            return null;
        }
        return new b(!this.f56873b.equals(r9.f56873b), !this.f56874c.equals(r9.f56874c), !this.d.equals(r9.d), !this.e.equals(r9.e), this.f != ((d) oldItem).f, false);
    }
}
