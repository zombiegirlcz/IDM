package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import kl.b;
import kl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/LivenessConfirmationScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Companion", "kl/e", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LivenessConfirmationScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LivenessPerformedChallenges f50187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50188c;

    @NotNull
    public static final e Companion = new e();

    @NotNull
    public static final Parcelable.Creator<LivenessConfirmationScreen> CREATOR = new b(3);

    public LivenessConfirmationScreen(String videoPath, LivenessPerformedChallenges challenges, boolean z) {
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        this.f50186a = videoPath;
        this.f50187b = challenges;
        this.f50188c = z;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        return LivenessConfirmationFragment.INSTANCE.createInstance("request_key_liveness_confirmation", this.f50186a, this.f50188c, this.f50187b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LivenessConfirmationScreen)) {
            return false;
        }
        LivenessConfirmationScreen livenessConfirmationScreen = (LivenessConfirmationScreen) obj2;
        return Intrinsics.f(this.f50186a, livenessConfirmationScreen.f50186a) && Intrinsics.f(this.f50187b, livenessConfirmationScreen.f50187b) && this.f50188c == livenessConfirmationScreen.f50188c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50188c) + ((this.f50187b.hashCode() + (this.f50186a.hashCode() * 31)) * 31);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("LivenessConfirmationScreen(videoPath=");
        sb6.append(this.f50186a);
        sb6.append(", challenges=");
        sb6.append(this.f50187b);
        sb6.append(", showRecordedVideo=");
        return a.t(sb6, this.f50188c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f50186a);
        out.writeSerializable(this.f50187b);
        out.writeInt(this.f50188c ? 1 : 0);
    }
}
