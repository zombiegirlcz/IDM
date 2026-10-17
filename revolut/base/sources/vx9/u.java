package vx9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f292887b;

    public /* synthetic */ u(z zVar, int i) {
        this.f292886a = i;
        this.f292887b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f292886a) {
            case 0:
                List recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                z zVar = this.f292887b;
                kx9.a aVar = zVar.d;
                List list = recents;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(nx9.c.b((jq9.p) it8.next(), false));
                }
                efm.b bVarB = aVar.b(arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    zm3.a aVar2 = ((jq9.p) it9.next()).f177514b;
                    zm3.j jVar = aVar2 instanceof zm3.j ? (zm3.j) aVar2 : null;
                    if (jVar != null) {
                        arrayList2.add(jVar);
                    }
                }
                return efm.r.fromIterable(arrayList2).flatMapCompletable(new w(new u(zVar, 2), 1)).e(bVarB);
            case 1:
                zm3.j contact = (zm3.j) obj2;
                Intrinsics.checkNotNullParameter(contact, "remoteContact");
                sl3.u uVar = this.f292887b.f292894b;
                Intrinsics.checkNotNullParameter(contact, "contact");
                pfm.f fVarI = efm.b.i(zhm.v.k(uVar.f264132a.a(contact.f323362g), uVar.f264133b.a(contact.f323362g)));
                Intrinsics.checkNotNullExpressionValue(fVarI, "concat(...)");
                return te0.w.g0(fVarI);
            default:
                zm3.j contact2 = (zm3.j) obj2;
                Intrinsics.checkNotNullParameter(contact2, "contact");
                sl3.u uVar2 = this.f292887b.f292894b;
                Intrinsics.checkNotNullParameter(contact2, "contact");
                ml3.q qVar = uVar2.f264132a;
                Intrinsics.checkNotNullParameter(contact2, "<this>");
                return te0.w.g0(qVar.d(new ml3.o(contact2.f, contact2.f323362g, contact2.f323359a, contact2.f323360b, contact2.f323361c, contact2.f323363h, contact2.i.getId(), contact2.e.name(), contact2.d, contact2.f323366m, contact2.f323365l)));
        }
    }
}
