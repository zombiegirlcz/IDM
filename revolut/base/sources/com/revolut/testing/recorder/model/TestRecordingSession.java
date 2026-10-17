package com.revolut.testing.recorder.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/testing/recorder/model/TestRecordingSession;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "test_recorder_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TestRecordingSession implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106778c;

    @NotNull
    public static final Parcelable.Creator<TestRecordingSession> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TestRecordingSession(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TestRecordingSession[i];
        }
    }

    public TestRecordingSession(String testId, String authToken, String testExplorerEnvironment) {
        Intrinsics.checkNotNullParameter(testId, "testId");
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        Intrinsics.checkNotNullParameter(testExplorerEnvironment, "testExplorerEnvironment");
        this.f106776a = testId;
        this.f106777b = authToken;
        this.f106778c = testExplorerEnvironment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TestRecordingSession)) {
            return false;
        }
        TestRecordingSession testRecordingSession = (TestRecordingSession) obj2;
        return Intrinsics.f(this.f106776a, testRecordingSession.f106776a) && Intrinsics.f(this.f106777b, testRecordingSession.f106777b) && Intrinsics.f(this.f106778c, testRecordingSession.f106778c);
    }

    public final int hashCode() {
        return this.f106778c.hashCode() + a.c(this.f106776a.hashCode() * 31, 31, this.f106777b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106776a);
        dest.writeString(this.f106777b);
        dest.writeString(this.f106778c);
    }
}
