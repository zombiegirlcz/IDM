package com.revolut.data.database.models.externalcard.mapping;

import com.revolut.domain.models.externalcards.AutoTopUpType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"autoTopUpMapping", "", "", "Lcom/revolut/domain/models/externalcards/AutoTopUpType;", "getAutoTopUpMapping", "()Ljava/util/Map;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ExternalCardEntityTypeMappingKt {

    @NotNull
    private static final Map<String, AutoTopUpType> autoTopUpMapping = r0.k(new Pair("ENABLED", AutoTopUpType.ENABLED), new Pair("AVAILABLE", AutoTopUpType.AVAILABLE), new Pair("UNAVAILABLE", AutoTopUpType.UNAVAILABLE), new Pair("UNKNOWN", AutoTopUpType.UNKNOWN));

    @NotNull
    public static final Map<String, AutoTopUpType> getAutoTopUpMapping() {
        return autoTopUpMapping;
    }
}
