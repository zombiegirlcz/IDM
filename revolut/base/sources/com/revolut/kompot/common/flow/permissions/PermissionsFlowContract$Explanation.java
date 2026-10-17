package com.revolut.kompot.common.flow.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/kompot/common/flow/permissions/PermissionsFlowContract$Explanation", "Landroid/os/Parcelable;", "<init>", "()V", "None", "PromptScreen", "Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$Explanation$None;", "Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$Explanation$PromptScreen;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PermissionsFlowContract$Explanation implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$Explanation$None;", "Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$Explanation;", "<init>", "()V", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None extends PermissionsFlowContract$Explanation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f98339a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f98339a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private PermissionsFlowContract$Explanation() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$Explanation$PromptScreen;", "Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$Explanation;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PromptScreen extends PermissionsFlowContract$Explanation {

        @NotNull
        public static final Parcelable.Creator<PromptScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f98340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f98341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f98342c;
        public final Image d;
        public final ResourceImage e;
        public final Clause f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PromptScreen((Clause) parcel.readParcelable(PromptScreen.class.getClassLoader()), (Clause) parcel.readParcelable(PromptScreen.class.getClassLoader()), (Clause) parcel.readParcelable(PromptScreen.class.getClassLoader()), (Image) parcel.readParcelable(PromptScreen.class.getClassLoader()), (ResourceImage) parcel.readParcelable(PromptScreen.class.getClassLoader()), (Clause) parcel.readParcelable(PromptScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromptScreen[i];
            }
        }

        public PromptScreen(Clause title, Clause message, Clause action, Image image, ResourceImage resourceImage, Clause clause) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(image, "image");
            this.f98340a = title;
            this.f98341b = message;
            this.f98342c = action;
            this.d = image;
            this.e = resourceImage;
            this.f = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PromptScreen)) {
                return false;
            }
            PromptScreen promptScreen = (PromptScreen) obj2;
            return Intrinsics.f(this.f98340a, promptScreen.f98340a) && Intrinsics.f(this.f98341b, promptScreen.f98341b) && Intrinsics.f(this.f98342c, promptScreen.f98342c) && Intrinsics.f(this.d, promptScreen.d) && Intrinsics.f(this.e, promptScreen.e) && Intrinsics.f(this.f, promptScreen.f);
        }

        public final int hashCode() {
            int iC = a10.b.c(this.d, p.a.a(p.a.a(this.f98340a.hashCode() * 31, 31, this.f98341b), 31, this.f98342c), 31);
            ResourceImage resourceImage = this.e;
            int iHashCode = (iC + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31;
            Clause clause = this.f;
            return iHashCode + (clause != null ? clause.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98340a, i);
            dest.writeParcelable(this.f98341b, i);
            dest.writeParcelable(this.f98342c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
        }

        public /* synthetic */ PromptScreen(Clause clause, Clause clause2, Clause clause3, Image image, TextClause textClause, int i) {
            this(clause, clause2, clause3, image, (ResourceImage) null, (i & 32) != 0 ? null : textClause);
        }
    }
}
