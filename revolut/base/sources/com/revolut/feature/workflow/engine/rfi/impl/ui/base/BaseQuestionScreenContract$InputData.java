package com.revolut.feature.workflow.engine.rfi.impl.ui.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/workflow/engine/rfi/impl/ui/base/BaseQuestionScreenContract$InputData", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "Q", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaseQuestionScreenContract$InputData<Q extends Question> implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BaseQuestionScreenContract$InputData<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Question f96544b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BaseQuestionScreenContract$InputData(parcel.readInt() != 0, (Question) parcel.readParcelable(BaseQuestionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BaseQuestionScreenContract$InputData[i];
        }
    }

    public BaseQuestionScreenContract$InputData(boolean z, Question question) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.f96543a = z;
        this.f96544b = question;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BaseQuestionScreenContract$InputData)) {
            return false;
        }
        BaseQuestionScreenContract$InputData baseQuestionScreenContract$InputData = (BaseQuestionScreenContract$InputData) obj2;
        return this.f96543a == baseQuestionScreenContract$InputData.f96543a && Intrinsics.f(this.f96544b, baseQuestionScreenContract$InputData.f96544b);
    }

    public final int hashCode() {
        return this.f96544b.hashCode() + (Boolean.hashCode(this.f96543a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f96543a ? 1 : 0);
        dest.writeParcelable(this.f96544b, i);
    }
}
