package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.common.permissions.PermissionsManagementFragment;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import kl.b;
import kl.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/PermissionsScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Companion", "kl/i", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermissionsScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureStepDataBundle f50196a;

    @NotNull
    public static final i Companion = new i();

    @NotNull
    public static final Parcelable.Creator<PermissionsScreen> CREATOR = new b(7);

    public PermissionsScreen(CaptureStepDataBundle captureStepDataBundle) {
        Intrinsics.checkNotNullParameter(captureStepDataBundle, "captureStepDataBundle");
        this.f50196a = captureStepDataBundle;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        return PermissionsManagementFragment.INSTANCE.createInstance("request_key_permissions_screen", this.f50196a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PermissionsScreen) && Intrinsics.f(this.f50196a, ((PermissionsScreen) obj2).f50196a);
    }

    public final int hashCode() {
        return this.f50196a.hashCode();
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    public final String toString() {
        return "PermissionsScreen(captureStepDataBundle=" + this.f50196a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeSerializable(this.f50196a);
    }
}
