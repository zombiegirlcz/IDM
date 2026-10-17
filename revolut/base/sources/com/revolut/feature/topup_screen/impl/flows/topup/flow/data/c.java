package com.revolut.feature.topup_screen.impl.flows.topup.flow.data;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends SelectedMethod.StoredMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f90916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f90917c;
    public final Image d;
    public final boolean e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90918g;

    public c(String id10, TextClause title, TextClause textClause, Image logo, boolean z, CompositeClause compositeClause, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f90915a = id10;
        this.f90916b = title;
        this.f90917c = textClause;
        this.d = logo;
        this.e = z;
        this.f = compositeClause;
        this.f90918g = z3;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: F */
    public final Image getD() {
        return this.d;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: a */
    public final Clause getF() {
        return this.f;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod
    /* JADX INFO: renamed from: b */
    public final boolean getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f90915a, cVar.f90915a) && this.f90916b.equals(cVar.f90916b) && Intrinsics.f(this.f90917c, cVar.f90917c) && this.d.equals(cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && this.f90918g == cVar.f90918g;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f90917c;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod
    /* JADX INFO: renamed from: getId */
    public final String getF90903a() {
        return this.f90915a;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f90916b;
    }

    public final int hashCode() {
        int iB = v7.b(this.f90915a.hashCode() * 31, 31, this.f90916b);
        Clause clause = this.f90917c;
        int iC = j6.a.c(a10.b.c(this.d, (iB + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31, this.e);
        Clause clause2 = this.f;
        return Boolean.hashCode(this.f90918g) + ((iC + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
