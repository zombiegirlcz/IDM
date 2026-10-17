package n4j;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f212452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.b f212453b;

    public f(d3j.b beneficiaryInteractor, n8b.b countryUtils) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        this.f212452a = beneficiaryInteractor;
        this.f212453b = countryUtils;
    }

    public static final ArrayList a(f fVar, List list) {
        List<wi0.b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (wi0.b bVar : list2) {
            arrayList.add(new d2k.h(bVar, ((o8b.g) fVar.f212453b).a(bVar.f297794a)));
        }
        return arrayList;
    }
}
