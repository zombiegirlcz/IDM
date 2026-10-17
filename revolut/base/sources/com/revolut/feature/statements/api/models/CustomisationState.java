package com.revolut.feature.statements.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/revolut/feature/statements/api/models/CustomisationState;", "Landroid/os/Parcelable;", "parameters", "Lcom/revolut/feature/statements/api/models/CustomisationParameters;", "selection", "Lcom/revolut/feature/statements/api/models/CustomisationSelection;", "<init>", "(Lcom/revolut/feature/statements/api/models/CustomisationParameters;Lcom/revolut/feature/statements/api/models/CustomisationSelection;)V", "getParameters", "()Lcom/revolut/feature/statements/api/models/CustomisationParameters;", "getSelection", "()Lcom/revolut/feature/statements/api/models/CustomisationSelection;", "updateSelection", "newSelection", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class CustomisationState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomisationState> CREATOR = new Creator();

    @NotNull
    private final CustomisationParameters parameters;

    @NotNull
    private final CustomisationSelection selection;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomisationState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomisationState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomisationState(CustomisationParameters.CREATOR.createFromParcel(parcel), CustomisationSelection.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomisationState[] newArray(int i) {
            return new CustomisationState[i];
        }
    }

    public CustomisationState(@NotNull CustomisationParameters parameters, @NotNull CustomisationSelection selection) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.parameters = parameters;
        this.selection = selection;
    }

    public static /* synthetic */ CustomisationState copy$default(CustomisationState customisationState, CustomisationParameters customisationParameters, CustomisationSelection customisationSelection, int i, Object obj2) {
        if ((i & 1) != 0) {
            customisationParameters = customisationState.parameters;
        }
        if ((i & 2) != 0) {
            customisationSelection = customisationState.selection;
        }
        return customisationState.copy(customisationParameters, customisationSelection);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CustomisationParameters getParameters() {
        return this.parameters;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CustomisationSelection getSelection() {
        return this.selection;
    }

    @NotNull
    public final CustomisationState copy(@NotNull CustomisationParameters parameters, @NotNull CustomisationSelection selection) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(selection, "selection");
        return new CustomisationState(parameters, selection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomisationState)) {
            return false;
        }
        CustomisationState customisationState = (CustomisationState) other;
        return Intrinsics.f(this.parameters, customisationState.parameters) && Intrinsics.f(this.selection, customisationState.selection);
    }

    @NotNull
    public final CustomisationParameters getParameters() {
        return this.parameters;
    }

    @NotNull
    public final CustomisationSelection getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return this.selection.hashCode() + (this.parameters.hashCode() * 31);
    }

    @NotNull
    public final CustomisationState updateSelection(@NotNull CustomisationSelection newSelection) {
        Intrinsics.checkNotNullParameter(newSelection, "newSelection");
        return copy$default(this, null, newSelection, 1, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.parameters.writeToParcel(dest, flags);
        this.selection.writeToParcel(dest, flags);
    }
}
