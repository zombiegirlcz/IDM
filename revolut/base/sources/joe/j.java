package joe;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.q implements Function1 {
    public static final j f = new j();

    public j() {
        super(1, a.class, "toDomain", "toDomain(Lcom/revolut/feature/tax_residency/impl/models/TaxCertificationsResponseDto;)Ljava/util/List;", 1);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ioe.k p0 = (ioe.k) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = a.f176928a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List<ioe.j> statuses = p0.getStatuses();
        ArrayList arrayList = new ArrayList(w.t(statuses, 10));
        for (ioe.j jVar : statuses) {
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            arrayList.add(new zme.d(com.bumptech.glide.d.c(jVar.getCountry()), (zme.e) u1.u(jVar.getState(), a.e), jVar.getPassedReason(), jVar.getFailedReason()));
        }
        return arrayList;
    }
}
