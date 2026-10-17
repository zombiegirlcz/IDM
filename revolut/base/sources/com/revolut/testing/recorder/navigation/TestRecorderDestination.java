package com.revolut.testing.recorder.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.testing.recorder.model.TestRecordingSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/revolut/testing/recorder/navigation/TestRecorderDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/e;", "Laii/q;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "Intro", "Lcom/revolut/testing/recorder/navigation/TestRecorderDestination$Intro;", "test_recorder_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TestRecorderDestination extends InternalDestination<IOData$EmptyInput> implements e, KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/testing/recorder/navigation/TestRecorderDestination$Intro;", "Lcom/revolut/testing/recorder/navigation/TestRecorderDestination;", "", "toString", "()Ljava/lang/String;", "test_recorder_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro extends TestRecorderDestination {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TestRecordingSession f106779b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro(TestRecordingSession.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Intro(TestRecordingSession testSession) {
            super(0);
            Intrinsics.checkNotNullParameter(testSession, "testSession");
            this.f106779b = testSession;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f106779b, ((Intro) obj2).f106779b);
        }

        public final int hashCode() {
            return this.f106779b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106779b.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ TestRecorderDestination(int i) {
        this();
    }

    private TestRecorderDestination() {
        super(IOData$EmptyInput.f98299a);
    }
}
