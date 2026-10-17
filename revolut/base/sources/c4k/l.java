package c4k;

import cli.n;
import cli.o;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4k.n f21316a;

    public l(i4k.n structuredReferenceItemsMapper) {
        Intrinsics.checkNotNullParameter(structuredReferenceItemsMapper, "structuredReferenceItemsMapper");
        this.f21316a = structuredReferenceItemsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f21306b;
        List list2 = domainState.f21307c;
        TransferNote.StructuredNote structuredNote = domainState.f21305a;
        s0 s0Var = new s0(2);
        s0Var.a(list.size() > 1 ? i4k.n.b(structuredNote, list) : null);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof d5k.h) {
                arrayList.add(obj2);
            }
        }
        s0Var.b(this.f21316a.a(list, structuredNote, arrayList, null).toArray(new koi.j[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        return new i(v.m(arrayList2.toArray(new koi.j[arrayList2.size()])), list2.isEmpty());
    }
}
