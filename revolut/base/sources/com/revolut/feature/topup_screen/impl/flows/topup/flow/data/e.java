package com.revolut.feature.topup_screen.impl.flows.topup.flow.data;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends SelectedMethod.StoredMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f90923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f90924c;
    public final Image d;
    public final boolean e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f90925g;

    public e(String id10, TextClause title, TextClause textClause, Image logo, boolean z, CompositeClause compositeClause, Map map) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f90922a = id10;
        this.f90923b = title;
        this.f90924c = textClause;
        this.d = logo;
        this.e = z;
        this.f = compositeClause;
        this.f90925g = map;
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
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f90922a, eVar.f90922a) && this.f90923b.equals(eVar.f90923b) && Intrinsics.f(this.f90924c, eVar.f90924c) && this.d.equals(eVar.d) && this.e == eVar.e && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f90925g, eVar.f90925g);
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f90924c;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod
    /* JADX INFO: renamed from: getId */
    public final String getF90903a() {
        return this.f90922a;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f90923b;
    }

    public final int hashCode() {
        int iB = v7.b(this.f90922a.hashCode() * 31, 31, this.f90923b);
        Clause clause = this.f90924c;
        int iC = j6.a.c(a10.b.c(this.d, (iB + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31, this.e);
        Clause clause2 = this.f;
        int iHashCode = (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Map map = this.f90925g;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }
}
