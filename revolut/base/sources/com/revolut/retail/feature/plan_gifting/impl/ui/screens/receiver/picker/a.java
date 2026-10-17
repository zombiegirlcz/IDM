package com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker;

import ahe.y0;
import cbh.f;
import cji.d;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jck.a0;
import jck.i0;
import jck.m;
import jck.o;
import jck.v;
import jck.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.time.b;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pkm.e;
import r10.t;
import v0f.p;
import vh2.j;
import vkm.q;
import y21.c;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements v {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f102506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f102507y;
    public final PlanGiftingReceiverPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f102508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f102509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pn3.a f102510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jck.a f102511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f102512t;
    public final d u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f102513w;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        e eVar = e.MILLISECONDS;
        f102506x = kotlin.time.c.g(200, eVar);
        f102507y = kotlin.time.c.g(0, eVar);
    }

    public a(n stateMapper, PlanGiftingReceiverPickerScreenContract$InputData inputData, t receiversInteractor, c optOutRepository, pn3.a contactsPermissionsController, jck.a filter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(receiversInteractor, "receiversInteractor");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.o = inputData;
        this.f102508p = receiversInteractor;
        this.f102509q = optOutRepository;
        this.f102510r = contactsPermissionsController;
        this.f102511s = filter;
        this.f102512t = new vii.b();
        this.u = ksj.b.b();
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this.v = mra.d.b(this, new o(new m("", data, data2, data3, data4, data5), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f102513w = hx7.e.a(this, new j7b.m(this, 14));
    }

    public static final Data I2(a aVar, Data data, String searchQuery) {
        ArrayList arrayList;
        try {
            Object content = data.getContent();
            if (content != null) {
                List contacts = (List) content;
                aVar.f102511s.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                arrayList = new ArrayList();
                for (Object obj2 : contacts) {
                    if (jck.a.c(searchQuery, (l) obj2)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            return new Data(arrayList, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }

    public static final Data J2(a aVar, Data data, Data data2) {
        List list;
        try {
            Object content = data.getContent();
            if (content != null) {
                list = (List) content;
                List list2 = (List) data2.getContent();
                if (list2 != null) {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(w.t(list3, 10));
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((i0) it8.next()).f172850a);
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (!arrayList.contains((l) obj2)) {
                                arrayList2.add(obj2);
                            }
                        }
                        list = arrayList2;
                    }
                }
            } else {
                list = null;
            }
            return new Data(list, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f102512t, new iw6.l(continuation, this, 12)), null, null, new a0(this, continuation, 1), 3);
        yji.l.a1(this, rd0.e.b(((pn3.b) this.f102510r).b()), null, null, new a0(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f102513w;
    }

    public final vkm.y K2() {
        p pVar = new p(new y0(q.q(rd0.e.b(this.u.c())), (Continuation) null, new j(new jcj.n(6), 14)));
        int i = 2;
        return new vkm.y(new g2d.c(i, 16, null), new f(pVar, i));
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
