package com.revolut.domain.interactors.experiments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/revolut/domain/interactors/experiments/ExperimentsFetchingInteractor$ExperimentType", "", "Lcom/revolut/domain/interactors/experiments/ExperimentsFetchingInteractor$ExperimentType;", "<init>", "(Ljava/lang/String;I)V", "FIREBASE", "SKYWALKER", "ALL", "feature_toggle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExperimentsFetchingInteractor$ExperimentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExperimentsFetchingInteractor$ExperimentType[] $VALUES;
    public static final ExperimentsFetchingInteractor$ExperimentType FIREBASE = new ExperimentsFetchingInteractor$ExperimentType("FIREBASE", 0);
    public static final ExperimentsFetchingInteractor$ExperimentType SKYWALKER = new ExperimentsFetchingInteractor$ExperimentType("SKYWALKER", 1);
    public static final ExperimentsFetchingInteractor$ExperimentType ALL = new ExperimentsFetchingInteractor$ExperimentType("ALL", 2);

    private static final /* synthetic */ ExperimentsFetchingInteractor$ExperimentType[] $values() {
        return new ExperimentsFetchingInteractor$ExperimentType[]{FIREBASE, SKYWALKER, ALL};
    }

    static {
        ExperimentsFetchingInteractor$ExperimentType[] experimentsFetchingInteractor$ExperimentTypeArr$values = $values();
        $VALUES = experimentsFetchingInteractor$ExperimentTypeArr$values;
        $ENTRIES = s.n(experimentsFetchingInteractor$ExperimentTypeArr$values);
    }

    private ExperimentsFetchingInteractor$ExperimentType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ExperimentsFetchingInteractor$ExperimentType valueOf(String str) {
        return (ExperimentsFetchingInteractor$ExperimentType) Enum.valueOf(ExperimentsFetchingInteractor$ExperimentType.class, str);
    }

    public static ExperimentsFetchingInteractor$ExperimentType[] values() {
        return (ExperimentsFetchingInteractor$ExperimentType[]) $VALUES.clone();
    }
}
