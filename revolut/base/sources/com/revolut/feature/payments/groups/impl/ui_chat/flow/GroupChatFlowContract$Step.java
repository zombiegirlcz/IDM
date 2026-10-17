package com.revolut.feature.payments.groups.impl.ui_chat.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_chat/flow/GroupChatFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Chat", "Lcom/revolut/feature/payments/groups/impl/ui_chat/flow/GroupChatFlowContract$Step$Chat;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GroupChatFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/flow/GroupChatFlowContract$Step$Chat;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/flow/GroupChatFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chat extends GroupChatFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavBarWithContainerBackground f79356a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat((NavBarWithContainerBackground) parcel.readParcelable(Chat.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(NavBarWithContainerBackground navBarWithContainerBackground) {
            this.f79356a = navBarWithContainerBackground;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chat) && Intrinsics.f(this.f79356a, ((Chat) obj2).f79356a);
        }

        public final int hashCode() {
            NavBarWithContainerBackground navBarWithContainerBackground = this.f79356a;
            if (navBarWithContainerBackground == null) {
                return 0;
            }
            return navBarWithContainerBackground.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79356a, i);
        }
    }

    private GroupChatFlowContract$Step() {
    }
}
