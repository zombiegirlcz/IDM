package com.revolut.sso.impl.ui.signin_sessions_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/sso/impl/ui/signin_sessions_flow/SignInSessionsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ShowSessions", "Lcom/revolut/sso/impl/ui/signin_sessions_flow/SignInSessionsFlowContract$Step$ShowSessions;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SignInSessionsFlowContract$Step implements FlowStep {

    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/signin_sessions_flow/SignInSessionsFlowContract$Step$ShowSessions;", "Lcom/revolut/sso/impl/ui/signin_sessions_flow/SignInSessionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowSessions extends SignInSessionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShowSessions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f106742a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ShowSessions.class, parcel, arrayList, iE, 1);
                }
                return new ShowSessions(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowSessions[i];
            }
        }

        public ShowSessions(List sessions) {
            Intrinsics.checkNotNullParameter(sessions, "sessions");
            this.f106742a = sessions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowSessions) && Intrinsics.f(this.f106742a, ((ShowSessions) obj2).f106742a);
        }

        public final int hashCode() {
            return this.f106742a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f106742a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    private SignInSessionsFlowContract$Step() {
    }
}
