package com.revolut.feature.junior_profile.api.models;

import ip0.v7;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.JsonElement;
import qlm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p0 {
    public static final b d = new b();

    private b() {
        super(o0.f186429a.b(a.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement jsonElement) {
        return v7.s(jsonElement, "element", jsonElement, "offeredServices") == null ? JuniorBankingProfile.INSTANCE.serializer() : c.Companion.serializer();
    }
}
