package xt4;

import al4.m;
import dj0.d;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import om4.r1;
import ql4.h;
import ql4.i;
import ql4.k;
import ql4.l;
import ql4.q0;
import ql4.t;
import rch.o;
import tof.a3;
import whf.p;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements fm4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f308754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f308755b;

    public c(m creditCardInstalmentInteractor, z creditCardInstalmentTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentTransactionsInteractor, "creditCardInstalmentTransactionsInteractor");
        this.f308754a = creditCardInstalmentInteractor;
        this.f308755b = creditCardInstalmentTransactionsInteractor;
    }

    public static i c(k kVar, p pVar) {
        String str = kVar.f247138b;
        String str2 = kVar.f247137a;
        Instant instant = kVar.f247139c;
        int i = kVar.e;
        int i2 = kVar.f;
        d dVar = kVar.f247140g;
        d dVar2 = kVar.f247141h;
        t tVar = kVar.d;
        l lVar = kVar.f247143l;
        q0 q0Var = kVar.f247144m;
        LocalDate localDate = kVar.f247142j;
        d dVar3 = kVar.i;
        List list = pVar.f297646a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str3 = str2;
            Instant instant2 = instant;
            int i3 = i;
            if (kVar.k.contains(((a3) obj2).f272581b)) {
                arrayList.add(obj2);
            }
            str2 = str3;
            instant = instant2;
            i = i3;
        }
        return new i(str, str2, instant, i, i2, dVar, dVar2, tVar, lVar, q0Var, dVar3, localDate, new h(arrayList, pVar.f297647b));
    }

    public final jhi.k a(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.u(new o(2, this, c.class, "mapToInstalmentModel", "mapToInstalmentModel(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 26), ((r1) this.f308754a).l(facilityId, loadingStrategy));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt4.c.b(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
