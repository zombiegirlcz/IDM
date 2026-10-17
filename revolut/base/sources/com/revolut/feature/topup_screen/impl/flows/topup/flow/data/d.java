package com.revolut.feature.topup_screen.impl.flows.topup.flow.data;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends SelectedMethod.StoredMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f90920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f90921c;
    public final Image d;
    public final boolean e;
    public final Clause f;

    public d(String id10, TextClause title, TextClause textClause, Image logo, boolean z, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f90919a = id10;
        this.f90920b = title;
        this.f90921c = textClause;
        this.d = logo;
        this.e = z;
        this.f = compositeClause;
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
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f90919a, dVar.f90919a) && this.f90920b.equals(dVar.f90920b) && Intrinsics.f(this.f90921c, dVar.f90921c) && this.d.equals(dVar.d) && this.e == dVar.e && Intrinsics.f(this.f, dVar.f);
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f90921c;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod
    /* JADX INFO: renamed from: getId */
    public final String getF90903a() {
        return this.f90919a;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f90920b;
    }

    public final int hashCode() {
        int iB = v7.b(this.f90919a.hashCode() * 31, 31, this.f90920b);
        Clause clause = this.f90921c;
        int iC = j6.a.c(a10.b.c(this.d, (iB + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31, this.e);
        Clause clause2 = this.f;
        return iC + (clause2 != null ? clause2.hashCode() : 0);
    }
}
