package uj8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f280536a = new h();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Map profiles = (Map) obj2;
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : profiles.entrySet()) {
            if (((JuniorBankingProfile) entry.getValue()).f77104l != ij8.h.CREATED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return q0.f(linkedHashMap, new dcj.c(profiles, 3));
    }
}
