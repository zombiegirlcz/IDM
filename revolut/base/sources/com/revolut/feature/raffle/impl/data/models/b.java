package com.revolut.feature.raffle.impl.data.models;

import br4.e;
import bta.d;
import bta.j;
import bta.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@g
public final class b {

    @NotNull
    public static final bta.a Companion = new bta.a();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f81632c;
    public final d d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f81633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RaffleCampaign$ShareInfo f81634h;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{null, null, yhm.j.c(kVar, new e(18)), null, yhm.j.c(kVar, new e(19)), null, null, null};
    }

    public /* synthetic */ b(int i2, String str, String str2, k kVar, d dVar, List list, String str3, j jVar, RaffleCampaign$ShareInfo raffleCampaign$ShareInfo) {
        if (255 != (i2 & 255)) {
            j1.f(a.f81629a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f81630a = str;
        this.f81631b = str2;
        this.f81632c = kVar;
        this.d = dVar;
        this.e = list;
        this.f = str3;
        this.f81633g = jVar;
        this.f81634h = raffleCampaign$ShareInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f81630a, bVar.f81630a) && Intrinsics.f(this.f81631b, bVar.f81631b) && this.f81632c == bVar.f81632c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f81633g, bVar.f81633g) && Intrinsics.f(this.f81634h, bVar.f81634h);
    }

    public final int hashCode() {
        int iD = p.a.d((this.d.hashCode() + ((this.f81632c.hashCode() + p.a.c(this.f81630a.hashCode() * 31, 31, this.f81631b)) * 31)) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f81633g;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        RaffleCampaign$ShareInfo raffleCampaign$ShareInfo = this.f81634h;
        return iHashCode2 + (raffleCampaign$ShareInfo != null ? raffleCampaign$ShareInfo.hashCode() : 0);
    }

    public b(String competitionId, String checklistId, k state, d header, ArrayList items, String str, j jVar, RaffleCampaign$ShareInfo raffleCampaign$ShareInfo) {
        Intrinsics.checkNotNullParameter(competitionId, "competitionId");
        Intrinsics.checkNotNullParameter(checklistId, "checklistId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f81630a = competitionId;
        this.f81631b = checklistId;
        this.f81632c = state;
        this.d = header;
        this.e = items;
        this.f = str;
        this.f81633g = jVar;
        this.f81634h = raffleCampaign$ShareInfo;
    }
}
