package com.revolut.feature.wealth.impl.ui.screens.instruments_collection;

import bof.r;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import e8h.k0;
import e8h.n0;
import hq1.f;
import ich.k;
import ich.l;
import ich.s;
import ich.t;
import ich.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import mch.e;
import mra.d;
import nel.a0;
import oki.h;
import skm.a2;
import vii.c;
import vkm.j2;
import vkm.q;
import x0i.i;
import x8h.g;
import x8h.o;
import x8h.p;
import ybl.b;
import yhm.j;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements k {
    public final y A;
    public final com.revolut.kompot.navigable.vc.modal.a B;
    public final InstrumentsCollectionControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f95606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aah.h f95607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f95608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f95609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f95610t;
    public final o u;
    public final g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f95611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f95612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f95613y;
    public final Lazy z;

    public a(r stateMapper, u saveStateDelegate, InstrumentsCollectionControllerContract$InputData inputData, j60.a bottomExpandableDialogExtension, aah.h disclaimersExtension, e sortDialogMapper, p sortOptionsInteractor, t filtersMutator, o filtersInteractor, g collectionsInteractor, b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        Intrinsics.checkNotNullParameter(sortDialogMapper, "sortDialogMapper");
        Intrinsics.checkNotNullParameter(sortOptionsInteractor, "sortOptionsInteractor");
        Intrinsics.checkNotNullParameter(filtersMutator, "filtersMutator");
        Intrinsics.checkNotNullParameter(filtersInteractor, "filtersInteractor");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.o = inputData;
        this.f95606p = bottomExpandableDialogExtension;
        this.f95607q = disclaimersExtension;
        this.f95608r = sortDialogMapper;
        this.f95609s = sortOptionsInteractor;
        this.f95610t = filtersMutator;
        this.u = filtersInteractor;
        this.v = collectionsInteractor;
        this.f95611w = instrumentTickerInteractor;
        this.f95612x = new c();
        Lazy lazyB = j.b(new f(this, 28));
        this.z = lazyB;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        boolean z = !(inputData.f95602a instanceof InstrumentsCollectionType.Related);
        m70.a.c(t0.f186434a);
        f0 f0Var = f0.f322471a;
        this.A = d.b(this, new l(data, data2, null, z, "", f0Var, (InstrumentsCollectionSortOption) lazyB.getValue(), new Data(null, null, false, 7, null), f0Var), stateMapper, saveStateDelegate, false, 8);
        this.B = hx7.e.a(this, new i69.p(this, 12));
    }

    public static ArrayList I2(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            a0 a0Var = (a0) obj2;
            if (d0.W(str) || jli.g.h(a0Var.f214560a.d, str) || jli.g.h(a0Var.f214560a.e, str)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yji.l
    public final void I1() {
        boolean z;
        go.g gVar;
        Flow flowI;
        Unit unit = Unit.f186387a;
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f95612x.a(unit, w4l.h.f294642c), new hcj.o(continuation, this, 20)), null, null, new s(this, continuation, 0), 3);
        InstrumentsCollectionControllerContract$InputData instrumentsCollectionControllerContract$InputData = this.o;
        InstrumentsCollectionType collectionType = instrumentsCollectionControllerContract$InputData.f95602a;
        this.f95609s.getClass();
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        InstrumentsCollectionType.Bonds bonds = InstrumentsCollectionType.Bonds.f95283a;
        boolean zF = Intrinsics.f(collectionType, bonds);
        int i = 3;
        int i2 = 1;
        int i3 = 2;
        InstrumentsCollectionType.RecommendedBuy recommendedBuy = InstrumentsCollectionType.RecommendedBuy.f95285a;
        InstrumentsCollectionType.Etfs etfs = InstrumentsCollectionType.Etfs.f95284a;
        if (zF) {
            z = false;
            gVar = new go.g(v.k(new InstrumentsCollectionSortOption.MostOwned(0), new InstrumentsCollectionSortOption.YieldToMaturity(0), new InstrumentsCollectionSortOption.AlphabeticalOrder(0), new InstrumentsCollectionSortOption.RemainingYears(0)), 2);
        } else {
            z = false;
            if (Intrinsics.f(collectionType, etfs)) {
                gVar = new go.g(v.k(new InstrumentsCollectionSortOption.MostTraded(null), new InstrumentsCollectionSortOption.PriceChange1Day(null), new InstrumentsCollectionSortOption.AlphabeticalOrder((zzg.s) null)), 2);
            } else {
                if (!(collectionType instanceof InstrumentsCollectionType.Related) && !Intrinsics.f(collectionType, recommendedBuy)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = new go.g(f0.f322471a, 2);
            }
        }
        yji.l.a1(this, gVar, null, null, new s(this, continuation, i2), 3);
        InstrumentsCollectionType collectionType2 = instrumentsCollectionControllerContract$InputData.f95602a;
        o oVar = this.u;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(collectionType2, "collectionType");
        if (Intrinsics.f(collectionType2, bonds)) {
            n0 n0Var = (n0) oVar.f303369a.f288633b;
            boolean z3 = z;
            efm.r map = nim.a.w(n0Var.e.f(unit, z3), new k0(n0Var, z3 ? 1 : 0)).map(new i(new x8h.d(oVar, 6), 27));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            flowI = rd0.e.b(map);
        } else {
            if (!Intrinsics.f(collectionType2, etfs) && !(collectionType2 instanceof InstrumentsCollectionType.Related) && !Intrinsics.f(collectionType2, recommendedBuy)) {
                throw new NoWhenBranchMatchedException();
            }
            flowI = zi0.c.i(f0.f322471a);
        }
        yji.l.a1(this, flowI, null, null, new s(this, continuation, i3), 3);
        yji.l.a1(this, this.f95607q.f2828l.w0(), null, null, new s(this, continuation, i), 3);
    }

    public final Data J2(Data data, String str) {
        List listI2;
        try {
            Object content = data.getContent();
            if (content != null) {
                listI2 = (List) content;
                if (str == null) {
                    str = ((l) ((j2) this.A.f22677a).getValue()).e;
                }
                if (str.length() > 0) {
                    listI2 = I2(str, listI2);
                }
            } else {
                listI2 = null;
            }
            return new Data(listI2, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.B;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
