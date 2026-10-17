package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/statements/api/models/CustomStatementData;", "", "periods", "Lcom/revolut/feature/statements/api/models/CustomStatementPeriods;", "parameters", "Lcom/revolut/feature/statements/api/models/CustomisationParameters;", "<init>", "(Lcom/revolut/feature/statements/api/models/CustomStatementPeriods;Lcom/revolut/feature/statements/api/models/CustomisationParameters;)V", "getPeriods", "()Lcom/revolut/feature/statements/api/models/CustomStatementPeriods;", "getParameters", "()Lcom/revolut/feature/statements/api/models/CustomisationParameters;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomStatementData {

    @NotNull
    private final CustomisationParameters parameters;

    @NotNull
    private final CustomStatementPeriods periods;

    public CustomStatementData(@NotNull CustomStatementPeriods periods, @NotNull CustomisationParameters parameters) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.periods = periods;
        this.parameters = parameters;
    }

    public static /* synthetic */ CustomStatementData copy$default(CustomStatementData customStatementData, CustomStatementPeriods customStatementPeriods, CustomisationParameters customisationParameters, int i, Object obj2) {
        if ((i & 1) != 0) {
            customStatementPeriods = customStatementData.periods;
        }
        if ((i & 2) != 0) {
            customisationParameters = customStatementData.parameters;
        }
        return customStatementData.copy(customStatementPeriods, customisationParameters);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CustomStatementPeriods getPeriods() {
        return this.periods;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CustomisationParameters getParameters() {
        return this.parameters;
    }

    @NotNull
    public final CustomStatementData copy(@NotNull CustomStatementPeriods periods, @NotNull CustomisationParameters parameters) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new CustomStatementData(periods, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomStatementData)) {
            return false;
        }
        CustomStatementData customStatementData = (CustomStatementData) other;
        return Intrinsics.f(this.periods, customStatementData.periods) && Intrinsics.f(this.parameters, customStatementData.parameters);
    }

    @NotNull
    public final CustomisationParameters getParameters() {
        return this.parameters;
    }

    @NotNull
    public final CustomStatementPeriods getPeriods() {
        return this.periods;
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.periods.hashCode() * 31);
    }
}
