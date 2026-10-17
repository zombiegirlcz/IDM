package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import kl.b;
import kl.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/MotionScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Companion", "kl/f", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionCaptureVariantOptions f50190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50191b;

    @NotNull
    public static final f Companion = new f();

    @NotNull
    public static final Parcelable.Creator<MotionScreen> CREATOR = new b(5);

    public MotionScreen(MotionCaptureVariantOptions options, boolean z) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f50190a = options;
        this.f50191b = z;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        return MotionHostFragment.INSTANCE.createInstance("request_key_motion", this.f50190a, this.f50191b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeSerializable(this.f50190a);
        out.writeInt(this.f50191b ? 1 : 0);
    }
}
