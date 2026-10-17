package com.revolut.feature.rfi_tool.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/rfi_tool/impl/navigation/RfiToolFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Form", "Lcom/revolut/feature/rfi_tool/impl/navigation/RfiToolFlowContract$Step$Form;", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RfiToolFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rfi_tool/impl/navigation/RfiToolFlowContract$Step$Form;", "Lcom/revolut/feature/rfi_tool/impl/navigation/RfiToolFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form implements RfiToolFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f85014c;
        public final boolean d;
        public final boolean e;
        public final UUID f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new Form(string, string2, string3, z3, parcel.readInt() == 0 ? z : true, (UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Form[i];
            }
        }

        public Form(String informationRequestId, String contentId, String formId, boolean z, boolean z3, UUID sessionId) {
            Intrinsics.checkNotNullParameter(informationRequestId, "informationRequestId");
            Intrinsics.checkNotNullParameter(contentId, "contentId");
            Intrinsics.checkNotNullParameter(formId, "formId");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.f85012a = informationRequestId;
            this.f85013b = contentId;
            this.f85014c = formId;
            this.d = z;
            this.e = z3;
            this.f = sessionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Form)) {
                return false;
            }
            Form form = (Form) obj2;
            return Intrinsics.f(this.f85012a, form.f85012a) && Intrinsics.f(this.f85013b, form.f85013b) && Intrinsics.f(this.f85014c, form.f85014c) && this.d == form.d && this.e == form.e && Intrinsics.f(this.f, form.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + j6.a.c(j6.a.c(p.a.c(p.a.c(this.f85012a.hashCode() * 31, 31, this.f85013b), 31, this.f85014c), 31, this.d), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85012a);
            dest.writeString(this.f85013b);
            dest.writeString(this.f85014c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeSerializable(this.f);
        }
    }
}
