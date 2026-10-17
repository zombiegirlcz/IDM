package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class qd implements pd, p71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p71 f32392b;

    public qd(List supportedCountries, p71 inputValidator) {
        Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
        Intrinsics.checkNotNullParameter(inputValidator, "inputValidator");
        this.f32391a = supportedCountries;
        this.f32392b = inputValidator;
    }

    @Override // com.fourthline.orca.internal.p71
    public k20 a(String input, List suggestedCountries) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        return this.f32392b.a(input, suggestedCountries);
    }

    @Override // com.fourthline.orca.internal.pd
    public boolean a(fd country) {
        Intrinsics.checkNotNullParameter(country, "country");
        List list = this.f32391a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((CountryNetworkModel) it8.next()).getIssuingCountry());
        }
        return arrayList.contains(country.c());
    }
}
