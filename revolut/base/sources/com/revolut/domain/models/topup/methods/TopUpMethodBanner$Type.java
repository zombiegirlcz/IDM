package com.revolut.domain.models.topup.methods;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/revolut/domain/models/topup/methods/TopUpMethodBanner$Type", "", "Lcom/revolut/domain/models/topup/methods/TopUpMethodBanner$Type;", "<init>", "(Ljava/lang/String;I)V", "SALARY_BANNER", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopUpMethodBanner$Type {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TopUpMethodBanner$Type[] $VALUES;
    public static final TopUpMethodBanner$Type SALARY_BANNER = new TopUpMethodBanner$Type("SALARY_BANNER", 0);

    private static final /* synthetic */ TopUpMethodBanner$Type[] $values() {
        return new TopUpMethodBanner$Type[]{SALARY_BANNER};
    }

    static {
        TopUpMethodBanner$Type[] topUpMethodBanner$TypeArr$values = $values();
        $VALUES = topUpMethodBanner$TypeArr$values;
        $ENTRIES = s.n(topUpMethodBanner$TypeArr$values);
    }

    private TopUpMethodBanner$Type(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TopUpMethodBanner$Type valueOf(String str) {
        return (TopUpMethodBanner$Type) Enum.valueOf(TopUpMethodBanner$Type.class, str);
    }

    public static TopUpMethodBanner$Type[] values() {
        return (TopUpMethodBanner$Type[]) $VALUES.clone();
    }
}
