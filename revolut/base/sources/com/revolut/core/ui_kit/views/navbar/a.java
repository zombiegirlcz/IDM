package com.revolut.core.ui_kit.views.navbar;

import android.os.Parcelable;
import bt0.h;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountSelectionNavBarContentView.PageViewHolder f59509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountSelectionNavBarContentView f59510c;

    public /* synthetic */ a(AccountSelectionNavBarContentView.PageViewHolder pageViewHolder, AccountSelectionNavBarContentView accountSelectionNavBarContentView, int i) {
        this.f59508a = i;
        this.f59509b = pageViewHolder;
        this.f59510c = accountSelectionNavBarContentView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String f52468a;
        AccountSelectionNavBarContentView.b bVar;
        tx0.r rVar;
        tx0.r rVar2;
        tx0.r rVar3;
        switch (this.f59508a) {
            case 0:
                bt0.h hVar = (bt0.h) obj2;
                ihm.f fVar = this.f59510c.f59176r;
                koi.j jVar = this.f59509b.e;
                if (jVar == null || (f52468a = jVar.getF53228a()) == null) {
                    f52468a = "ID_NULL_PAGE";
                }
                if (hVar instanceof bt0.i) {
                    bVar = new AccountSelectionNavBarContentView.b(((bt0.i) hVar).f18235a);
                } else {
                    if (!Intrinsics.f(hVar, h.a.f18234a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new AccountSelectionNavBarContentView.b(-1);
                }
                fVar.onNext(new c(f52468a, bVar));
                return Unit.f186387a;
            case 1:
                koi.j jVar2 = this.f59509b.e;
                tx0.w wVar = jVar2 instanceof tx0.w ? (tx0.w) jVar2 : null;
                if (wVar != null && (rVar = wVar.f275255b) != null) {
                    this.f59510c.f59168g.onNext(rVar);
                }
                return Unit.f186387a;
            case 2:
                koi.j jVar3 = this.f59509b.e;
                tx0.w wVar2 = jVar3 instanceof tx0.w ? (tx0.w) jVar3 : null;
                if (wVar2 != null && (rVar2 = wVar2.f275255b) != null) {
                    this.f59510c.f59170j.onNext(rVar2);
                }
                return Unit.f186387a;
            case 3:
                Parcelable parcelable = (Parcelable) obj2;
                koi.j jVar4 = this.f59509b.e;
                tx0.w wVar3 = jVar4 instanceof tx0.w ? (tx0.w) jVar4 : null;
                if (wVar3 != null) {
                    tx0.r rVar4 = wVar3.f275255b;
                    ihm.f fVar2 = this.f59510c.k;
                    Intrinsics.h(parcelable);
                    fVar2.onNext(new tx0.a0(rVar4, parcelable));
                }
                return Unit.f186387a;
            case 4:
                koi.j jVar5 = this.f59509b.e;
                tx0.w wVar4 = jVar5 instanceof tx0.w ? (tx0.w) jVar5 : null;
                if (wVar4 != null && (rVar3 = wVar4.f275255b) != null) {
                    this.f59510c.f59169h.onNext(rVar3);
                }
                return Unit.f186387a;
            default:
                this.f59510c.f59175q.onNext((Unit) obj2);
                AccountSelectionNavBarContentView.PageViewHolder pageViewHolder = this.f59509b;
                LineChartView lineChartView = pageViewHolder.f59183g;
                or0.u.k(lineChartView).n0().a(lineChartView, pageViewHolder, null);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(AccountSelectionNavBarContentView accountSelectionNavBarContentView, AccountSelectionNavBarContentView.PageViewHolder pageViewHolder, int i) {
        this.f59508a = i;
        this.f59510c = accountSelectionNavBarContentView;
        this.f59509b = pageViewHolder;
    }
}
