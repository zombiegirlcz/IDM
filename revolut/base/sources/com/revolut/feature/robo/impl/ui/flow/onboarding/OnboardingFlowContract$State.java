package com.revolut.feature.robo.impl.ui.flow.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.navigable.flow.FlowState;
import dj0.d;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/robo/impl/ui/flow/onboarding/OnboardingFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<OnboardingFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f85121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ilc.a f85122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Template f85123c;
    public final d d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingFlowContract$State((UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : ilc.a.valueOf(parcel.readString()), (Template) parcel.readParcelable(OnboardingFlowContract$State.class.getClassLoader()), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingFlowContract$State[i];
        }
    }

    public OnboardingFlowContract$State(UUID idempotencyKey, ilc.a aVar, Template template, d dVar, d dVar2) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f85121a = idempotencyKey;
        this.f85122b = aVar;
        this.f85123c = template;
        this.d = dVar;
        this.e = dVar2;
    }

    public static OnboardingFlowContract$State a(OnboardingFlowContract$State onboardingFlowContract$State, ilc.a aVar, Template template, d dVar, d dVar2, int i) {
        ilc.a aVar2 = aVar;
        UUID idempotencyKey = onboardingFlowContract$State.f85121a;
        if ((i & 2) != 0) {
            aVar2 = onboardingFlowContract$State.f85122b;
        }
        if ((i & 8) != 0) {
            dVar = onboardingFlowContract$State.d;
        }
        if ((i & 16) != 0) {
            dVar2 = onboardingFlowContract$State.e;
        }
        d dVar3 = dVar2;
        onboardingFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        return new OnboardingFlowContract$State(idempotencyKey, aVar2, template, dVar, dVar3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingFlowContract$State)) {
            return false;
        }
        OnboardingFlowContract$State onboardingFlowContract$State = (OnboardingFlowContract$State) obj2;
        return Intrinsics.f(this.f85121a, onboardingFlowContract$State.f85121a) && this.f85122b == onboardingFlowContract$State.f85122b && Intrinsics.f(this.f85123c, onboardingFlowContract$State.f85123c) && Intrinsics.f(this.d, onboardingFlowContract$State.d) && Intrinsics.f(this.e, onboardingFlowContract$State.e);
    }

    public final int hashCode() {
        int iHashCode = this.f85121a.hashCode() * 31;
        ilc.a aVar = this.f85122b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Template template = this.f85123c;
        int iHashCode3 = (iHashCode2 + (template == null ? 0 : template.hashCode())) * 31;
        d dVar = this.d;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.e;
        return iHashCode4 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85121a);
        ilc.a aVar = this.f85122b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.f85123c, i);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
