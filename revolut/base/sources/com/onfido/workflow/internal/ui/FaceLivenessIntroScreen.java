package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessIntroFragment;
import kl.a;
import kl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/FaceLivenessIntroScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Companion", "kl/a", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FaceLivenessIntroScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50179a;

    @NotNull
    public static final a Companion = new a();

    @NotNull
    public static final Parcelable.Creator<FaceLivenessIntroScreen> CREATOR = new b(0);

    public FaceLivenessIntroScreen(boolean z) {
        this.f50179a = z;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        return LivenessIntroFragment.INSTANCE.createInstance("request_key_face_liveness_intro", this.f50179a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof FaceLivenessIntroScreen) && this.f50179a == ((FaceLivenessIntroScreen) obj2).f50179a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50179a);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    public final String toString() {
        return "FaceLivenessIntroScreen(showIntro=" + this.f50179a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f50179a ? 1 : 0);
    }
}
