package com.revolut.feature.address.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.a;
import wi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi0/b;", "Lcom/revolut/feature/address/models/AddressFormat;", "toAddressFormat", "(Lwi0/b;)Lcom/revolut/feature/address/models/AddressFormat;", "feature_address_models_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CountryExtKt {
    @NotNull
    public static final AddressFormat toAddressFormat(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        a aVar = b.Companion;
        aVar.getClass();
        if (!Intrinsics.f(bVar, b.A)) {
            aVar.getClass();
            if (!Intrinsics.f(bVar, b.l2)) {
                aVar.getClass();
                if (!Intrinsics.f(bVar, b.Y1)) {
                    aVar.getClass();
                    if (!Intrinsics.f(bVar, b.X0)) {
                        aVar.getClass();
                        if (!Intrinsics.f(bVar, b.M0)) {
                            return AddressFormat.INTERNATIONAL;
                        }
                    }
                }
            }
        }
        return AddressFormat.DETAILED;
    }
}
