package com.revolut.feature.picker;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.picker.PickerControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s42.f;
import s6e.g;
import s7a.a0;
import s7a.j0;
import s7a.l0;
import s7a.m0;
import s7a.n0;
import s7a.o0;
import s7a.p;
import s7a.q;
import s7a.q0;
import s7a.r;
import s7a.x;
import skm.a2;
import vkm.j2;
import x7a.d;
import yji.l;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements j0 {

    @NotNull
    public static final n0 Companion = new n0();
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f80348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f80349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f80350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f80351s;

    public a(d interactor, x inputData, n stateMapper) {
        boolean z;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f80348p = inputData;
        Data data = new Data(null, null, true, 3, null);
        Set set = inputData.f260652j;
        h0 h0Var = h0.f322473a;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        int i = o0.f260621a[inputData.d.ordinal()];
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        } else {
            z = true;
        }
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f80350r = mra.d.b(this, new r(data, h0Var, set, "", false, false, z, ""), stateMapper, null, false, 12);
        this.f80351s = e.a(this, new f(this, 14));
    }

    @Override // yji.l
    public final void I1() {
        I2(false);
    }

    public final void I2(boolean z) {
        a2 a2Var = this.f80349q;
        if (a2Var != null) {
            a2Var.f(null);
        }
        Object obj2 = this.f80348p.f260648b;
        this.f80349q = l.a1(this, this.o.e(((r) ((j2) this.f80350r.f22677a).getValue()).d, z, obj2), null, null, new q0(this, null), 3);
    }

    public final void J2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        C2(new a0(new q(id10, obj2)));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f80351s;
    }

    public final void K2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        x xVar = this.f80348p;
        if (!xVar.f) {
            if (this.o.b(listId) == null) {
                N2(listId);
                return;
            }
            h.v2(this.f80351s, new PickerControllerContract$ModalStep.ShowPostSelectionModal(listId), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        g gVar = new g(15);
        y yVar = this.f80350r;
        H2(yVar, gVar);
        j2 j2Var = (j2) yVar.f22677a;
        if (Intrinsics.f(listId, "PICKER_RESET_ITEM_ID")) {
            H2(yVar, new g(14));
            return;
        }
        if (!xVar.f260650g) {
            H2(yVar, new g36.a(this, d0.h1(((r) j2Var.getValue()).f260628c), listId, 5));
            return;
        }
        Set set = ((r) j2Var.getValue()).f260627b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (!Intrinsics.f((String) obj2, "PICKER_SELECT_ALL_ITEM_ID")) {
                arrayList.add(obj2);
            }
        }
        Set setI1 = d0.i1(arrayList);
        Set setH1 = d0.h1(((r) j2Var.getValue()).f260628c);
        if (setH1.contains(listId) && !Intrinsics.f(listId, "PICKER_SELECT_ALL_ITEM_ID") && setH1.containsAll(setI1)) {
            H2(yVar, new g36.a(setH1, listId, 6));
            return;
        }
        if (setH1.contains(listId)) {
            H2(yVar, new g36.a(setH1, listId, 7));
            return;
        }
        if (!setH1.contains(listId) && Intrinsics.f(listId, "PICKER_SELECT_ALL_ITEM_ID")) {
            H2(yVar, new m0(2, setI1));
            return;
        }
        if (!setH1.contains(listId) && a1.m(setH1, listId).size() == setI1.size()) {
            H2(yVar, new g36.a(setH1, listId, 3));
        } else {
            if (setH1.contains(listId)) {
                return;
            }
            H2(yVar, new g36.a(setH1, listId, 4));
        }
    }

    public final void L2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        boolean zF = Intrinsics.f(id10, "PICKER_RESET_ITEM_ID");
        y yVar = this.f80350r;
        if (zF) {
            H2(yVar, new g(14));
            return;
        }
        if (!Intrinsics.f(id10, "PICKER_SELECT_ALL_ITEM_ID")) {
            C2(new a0(new s7a.y(id10)));
            return;
        }
        Set set = ((r) ((j2) yVar.f22677a).getValue()).f260627b;
        if (set.isEmpty()) {
            return;
        }
        H2(yVar, new m0(1, set));
    }

    public final void M2(boolean z) {
        x xVar = this.f80348p;
        if (!xVar.f260657q || z) {
            return;
        }
        if (xVar.f260653l) {
            C2(new a0(p.f260622a));
        } else {
            B2();
        }
    }

    public final void N2(String str) {
        if (((r) ((j2) this.f80350r.f22677a).getValue()).f260626a.getContent() != null) {
            C2(new a0(this.o.c(y0.b(str), this.f80348p.f260648b)));
        }
    }

    public final void W0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        y yVar = this.f80350r;
        String str = ((r) ((j2) yVar.f22677a).getValue()).d;
        if (Intrinsics.f(str, query)) {
            return;
        }
        H2(yVar, new l0(query, str, 0));
        if (this.f80348p.f260651h) {
            I2(false);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f80350r;
    }
}
