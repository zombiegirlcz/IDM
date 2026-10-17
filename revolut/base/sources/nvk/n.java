package nvk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f219722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f219723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f219724c;
    public final ActionsView.Item d;
    public final List e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f219725g;

    public n(ArrayList items, TextLocalisedClause title, TextLocalisedClause description, ActionsView.Item periodAction, List subPeriods, m mVar, ArrayList subPeriodTabs) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(periodAction, "periodAction");
        Intrinsics.checkNotNullParameter(subPeriods, "subPeriods");
        Intrinsics.checkNotNullParameter(subPeriodTabs, "subPeriodTabs");
        this.f219722a = items;
        this.f219723b = title;
        this.f219724c = description;
        this.d = periodAction;
        this.e = subPeriods;
        this.f = mVar;
        this.f219725g = subPeriodTabs;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof n) {
            return new l(!Intrinsics.f(((n) oldState).f, this.f));
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f219722a.equals(nVar.f219722a) && this.f219723b.equals(nVar.f219723b) && this.f219724c.equals(nVar.f219724c) && this.d.equals(nVar.d) && this.e.equals(nVar.e) && Intrinsics.f(this.f, nVar.f) && this.f219725g.equals(nVar.f219725g);
    }

    public final int hashCode() {
        int iD = p.a.d((this.d.hashCode() + t61.a.a(t61.a.a(this.f219722a.hashCode() * 31, 31, this.f219723b), 31, this.f219724c)) * 31, 31, this.e);
        m mVar = this.f;
        return this.f219725g.hashCode() + ((iD + (mVar == null ? 0 : mVar.hashCode())) * 31);
    }
}
