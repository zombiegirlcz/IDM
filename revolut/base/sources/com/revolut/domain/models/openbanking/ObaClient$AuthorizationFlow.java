package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/revolut/domain/models/openbanking/ObaClient$AuthorizationFlow", "", "Lcom/revolut/domain/models/openbanking/ObaClient$AuthorizationFlow;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "PUSHED_AUTHORISATION_REQUEST", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ObaClient$AuthorizationFlow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ObaClient$AuthorizationFlow[] $VALUES;
    public static final ObaClient$AuthorizationFlow DEFAULT = new ObaClient$AuthorizationFlow("DEFAULT", 0);
    public static final ObaClient$AuthorizationFlow PUSHED_AUTHORISATION_REQUEST = new ObaClient$AuthorizationFlow("PUSHED_AUTHORISATION_REQUEST", 1);

    private static final /* synthetic */ ObaClient$AuthorizationFlow[] $values() {
        return new ObaClient$AuthorizationFlow[]{DEFAULT, PUSHED_AUTHORISATION_REQUEST};
    }

    static {
        ObaClient$AuthorizationFlow[] obaClient$AuthorizationFlowArr$values = $values();
        $VALUES = obaClient$AuthorizationFlowArr$values;
        $ENTRIES = s.n(obaClient$AuthorizationFlowArr$values);
    }

    private ObaClient$AuthorizationFlow(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ObaClient$AuthorizationFlow valueOf(String str) {
        return (ObaClient$AuthorizationFlow) Enum.valueOf(ObaClient$AuthorizationFlow.class, str);
    }

    public static ObaClient$AuthorizationFlow[] values() {
        return (ObaClient$AuthorizationFlow[]) $VALUES.clone();
    }
}
