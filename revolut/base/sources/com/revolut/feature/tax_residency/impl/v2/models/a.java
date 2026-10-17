package com.revolut.feature.tax_residency.impl.v2.models;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final UserSpecificRule a(Map map, b countryCode) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        UserSpecificRule userSpecificRule = (UserSpecificRule) map.get(countryCode);
        if (userSpecificRule != null) {
            return userSpecificRule;
        }
        UserSpecificRule.INSTANCE.getClass();
        return UserSpecificRule.f90185g;
    }
}
