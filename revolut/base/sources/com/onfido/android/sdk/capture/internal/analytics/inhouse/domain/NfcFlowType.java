package com.onfido.android.sdk.capture.internal.analytics.inhouse.domain;

import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "", "(Ljava/lang/String;I)V", "BAC", "PACE", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcFlowType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NfcFlowType[] $VALUES;
    public static final NfcFlowType BAC = new NfcFlowType("BAC", 0);
    public static final NfcFlowType PACE = new NfcFlowType("PACE", 1);

    private static final /* synthetic */ NfcFlowType[] $values() {
        return new NfcFlowType[]{BAC, PACE};
    }

    static {
        NfcFlowType[] nfcFlowTypeArr$values = $values();
        $VALUES = nfcFlowTypeArr$values;
        $ENTRIES = s.n(nfcFlowTypeArr$values);
    }

    private NfcFlowType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static NfcFlowType valueOf(String str) {
        return (NfcFlowType) Enum.valueOf(NfcFlowType.class, str);
    }

    public static NfcFlowType[] values() {
        return (NfcFlowType[]) $VALUES.clone();
    }
}
