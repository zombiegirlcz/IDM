package com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/prompt/promotion_ineligibility/flow/FreelancerPromotionIneligibilityFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Prompt", "Lcom/revolut/feature/freelancer/impl/ui/prompt/promotion_ineligibility/flow/FreelancerPromotionIneligibilityFlowContract$Step$Prompt;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerPromotionIneligibilityFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/prompt/promotion_ineligibility/flow/FreelancerPromotionIneligibilityFlowContract$Step$Prompt;", "Lcom/revolut/feature/freelancer/impl/ui/prompt/promotion_ineligibility/flow/FreelancerPromotionIneligibilityFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt implements FreelancerPromotionIneligibilityFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f74096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f74097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f74098c;
        public final Clause d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((Image) parcel.readParcelable(Prompt.class.getClassLoader()), (Clause) parcel.readParcelable(Prompt.class.getClassLoader()), (Clause) parcel.readParcelable(Prompt.class.getClassLoader()), (Clause) parcel.readParcelable(Prompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(Image image, Clause title, Clause clause, Clause clause2) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f74096a = image;
            this.f74097b = title;
            this.f74098c = clause;
            this.d = clause2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Prompt)) {
                return false;
            }
            Prompt prompt = (Prompt) obj2;
            return Intrinsics.f(this.f74096a, prompt.f74096a) && Intrinsics.f(this.f74097b, prompt.f74097b) && Intrinsics.f(this.f74098c, prompt.f74098c) && Intrinsics.f(this.d, prompt.d);
        }

        public final int hashCode() {
            int iA = p.a.a(this.f74096a.hashCode() * 31, 31, this.f74097b);
            Clause clause = this.f74098c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74096a, i);
            dest.writeParcelable(this.f74097b, i);
            dest.writeParcelable(this.f74098c, i);
            dest.writeParcelable(this.d, i);
        }
    }
}
