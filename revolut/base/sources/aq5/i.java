package aq5;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import sh1.m;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7a.d f8267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f8268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.a f8269c;

    public i(x7a.d defaultInteractor, fk3.a configurationInteractor, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(defaultInteractor, "defaultInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f8267a = defaultInteractor;
        this.f8268b = configurationInteractor;
        this.f8269c = countryInteractor;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return this.f8267a.c(ids, obj2);
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return this.f8267a.d(data, selectedModelIds, list, query, obj2);
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        List<String> listB = ((ik3.c) this.f8268b).b();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        for (String str : listB) {
            arrayList.add(new m(((o8b.c) this.f8269c).b(str), str));
        }
        return zi0.c.i(arrayList);
    }
}
