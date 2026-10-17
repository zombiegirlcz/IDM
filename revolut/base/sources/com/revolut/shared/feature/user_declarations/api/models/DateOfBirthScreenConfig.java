package com.revolut.shared.feature.user_declarations.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.shared.feature.user_declarations.api.R$string;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/models/DateOfBirthScreenConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DateOfBirthScreenConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DateOfBirthScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f105033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f105034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkflowScreenConfiguration f105035c;
    public final ValidationConfig d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DateOfBirthScreenConfig((Clause) parcel.readParcelable(DateOfBirthScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(DateOfBirthScreenConfig.class.getClassLoader()), (WorkflowScreenConfiguration) parcel.readParcelable(DateOfBirthScreenConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : ValidationConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DateOfBirthScreenConfig[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DateOfBirthScreenConfig() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DateOfBirthScreenConfig)) {
            return false;
        }
        DateOfBirthScreenConfig dateOfBirthScreenConfig = (DateOfBirthScreenConfig) obj2;
        return Intrinsics.f(this.f105033a, dateOfBirthScreenConfig.f105033a) && Intrinsics.f(this.f105034b, dateOfBirthScreenConfig.f105034b) && Intrinsics.f(this.f105035c, dateOfBirthScreenConfig.f105035c) && Intrinsics.f(this.d, dateOfBirthScreenConfig.d);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f105033a.hashCode() * 31, 31, this.f105034b);
        WorkflowScreenConfiguration workflowScreenConfiguration = this.f105035c;
        int iHashCode = (iA + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode())) * 31;
        ValidationConfig validationConfig = this.d;
        return iHashCode + (validationConfig != null ? Boolean.hashCode(validationConfig.f105043a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105033a, i);
        dest.writeParcelable(this.f105034b, i);
        dest.writeParcelable(this.f105035c, i);
        ValidationConfig validationConfig = this.d;
        if (validationConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            validationConfig.writeToParcel(dest, i);
        }
    }

    public DateOfBirthScreenConfig(Clause toolbarDescription, Clause largeButtonText, WorkflowScreenConfiguration workflowScreenConfiguration, ValidationConfig validationConfig) {
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        Intrinsics.checkNotNullParameter(largeButtonText, "largeButtonText");
        this.f105033a = toolbarDescription;
        this.f105034b = largeButtonText;
        this.f105035c = workflowScreenConfiguration;
        this.d = validationConfig;
    }

    public /* synthetic */ DateOfBirthScreenConfig(Clause clause, WorkflowScreenConfiguration workflowScreenConfiguration, int i) {
        if ((i & 1) != 0) {
            m70.a.c(t0.f186434a);
            clause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        this(clause, new TextLocalisedClause(R$string.common_action_continue, null, null, 14), (i & 4) != 0 ? null : workflowScreenConfiguration, null);
    }
}
