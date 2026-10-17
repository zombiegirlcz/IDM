package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.hosted.web.module.HostedWebModuleFragment;
import com.onfido.hosted.web.module.model.HostedWebModuleModuleInfo;
import j6.a;
import kl.b;
import kl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/HostedWebModuleScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Companion", "kl/d", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HostedWebModuleScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HostedWebModuleModuleInfo f50183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50185c;

    @NotNull
    public static final d Companion = new d();

    @NotNull
    public static final Parcelable.Creator<HostedWebModuleScreen> CREATOR = new b(2);

    public HostedWebModuleScreen(HostedWebModuleModuleInfo moduleInfo, boolean z, String str) {
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        this.f50183a = moduleInfo;
        this.f50184b = z;
        this.f50185c = str;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        return HostedWebModuleFragment.INSTANCE.newInstance("request_key_qes_consent", this.f50183a, this.f50185c, this.f50184b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HostedWebModuleScreen)) {
            return false;
        }
        HostedWebModuleScreen hostedWebModuleScreen = (HostedWebModuleScreen) obj2;
        return Intrinsics.f(this.f50183a, hostedWebModuleScreen.f50183a) && this.f50184b == hostedWebModuleScreen.f50184b && Intrinsics.f(this.f50185c, hostedWebModuleScreen.f50185c);
    }

    public final int hashCode() {
        int iC = a.c(this.f50183a.hashCode() * 31, 31, this.f50184b);
        String str = this.f50185c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("HostedWebModuleScreen(moduleInfo=");
        sb6.append(this.f50183a);
        sb6.append(", isDarkModeEnabled=");
        sb6.append(this.f50184b);
        sb6.append(", bridgeUrl=");
        return v0.a.i(sb6, this.f50185c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.f50183a, i);
        out.writeInt(this.f50184b ? 1 : 0);
        out.writeString(this.f50185c);
    }
}
