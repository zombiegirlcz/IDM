package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ll0 implements n40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f30673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce1 f30674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ux f30675c;
    private final List d;

    public ll0(List countries, ce1 stringExtractor, ux filterCountriesUseCase) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(stringExtractor, "stringExtractor");
        Intrinsics.checkNotNullParameter(filterCountriesUseCase, "filterCountriesUseCase");
        this.f30673a = countries;
        this.f30674b = stringExtractor;
        this.f30675c = filterCountriesUseCase;
        ArrayList arrayList = new ArrayList(zhm.w.t(countries, 10));
        Iterator it8 = countries.iterator();
        while (it8.hasNext()) {
            fd fdVar = (fd) it8.next();
            arrayList.add(new kl0(fdVar, fdVar.f(), new rj1(fdVar, this, 28)));
        }
        this.d = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(fd fdVar, ll0 ll0Var) {
        return fdVar.e() + " " + ll0Var.f30674b.a(fdVar.f());
    }

    @Override // com.fourthline.orca.internal.n40
    public List a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f30675c.a(kotlin.text.d0.F0(value).toString(), this.d);
    }
}
