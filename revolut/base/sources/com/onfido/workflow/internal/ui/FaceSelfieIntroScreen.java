package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.ui.faceintro.FaceIntroFragment;
import java.util.List;
import kl.b;
import kl.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/FaceSelfieIntroScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Companion", "kl/c", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FaceSelfieIntroScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50182c;
    public final List d;

    @NotNull
    public static final c Companion = new c();

    @NotNull
    public static final Parcelable.Creator<FaceSelfieIntroScreen> CREATOR = new b(1);

    public FaceSelfieIntroScreen(String title, String subtitle, String infoText, List bullets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(infoText, "infoText");
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        this.f50180a = title;
        this.f50181b = subtitle;
        this.f50182c = infoText;
        this.d = bullets;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        return FaceIntroFragment.INSTANCE.createInstance("request_key_face_selfie_intro", this.f50180a, this.f50181b, this.f50182c, this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FaceSelfieIntroScreen)) {
            return false;
        }
        FaceSelfieIntroScreen faceSelfieIntroScreen = (FaceSelfieIntroScreen) obj2;
        return Intrinsics.f(this.f50180a, faceSelfieIntroScreen.f50180a) && Intrinsics.f(this.f50181b, faceSelfieIntroScreen.f50181b) && Intrinsics.f(this.f50182c, faceSelfieIntroScreen.f50182c) && Intrinsics.f(this.d, faceSelfieIntroScreen.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.c(a.c(this.f50180a.hashCode() * 31, 31, this.f50181b), 31, this.f50182c);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("FaceSelfieIntroScreen(title=", this.f50180a, ", subtitle=", this.f50181b, ", infoText=");
        sbM.append(this.f50182c);
        sbM.append(", bullets=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f50180a);
        out.writeString(this.f50181b);
        out.writeString(this.f50182c);
        out.writeStringList(this.d);
    }
}
