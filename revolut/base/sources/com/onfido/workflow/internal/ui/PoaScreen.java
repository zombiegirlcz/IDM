package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment;
import kl.b;
import kl.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/PoaScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Companion", "kl/j", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PoaScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50197a;

    @NotNull
    public static final j Companion = new j();

    @NotNull
    public static final Parcelable.Creator<PoaScreen> CREATOR = new b(8);

    public PoaScreen(boolean z) {
        this.f50197a = z;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        return PoaHostFragment.INSTANCE.createInstance("request_key_poa", this.f50197a);
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
        out.writeInt(this.f50197a ? 1 : 0);
    }
}
