package com.onfido.android.sdk.capture.core.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.util.a;
import com.onfido.android.sdk.capture.EnterpriseFeatures;
import com.onfido.android.sdk.capture.OnfidoTheme;
import com.onfido.android.sdk.capture.core.OnfidoFragment;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\b\u0010*\u001a\u00020+H\u0016J\t\u0010,\u001a\u00020-HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020-HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%¨\u00063"}, d2 = {"Lcom/onfido/android/sdk/capture/core/config/OnfidoNewConfigImpl;", "Lcom/onfido/android/sdk/capture/core/config/OnfidoNewConfig;", "sdkToken", "", "locale", "Ljava/util/Locale;", "workflowRunId", "enterpriseFeatures", "Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "mediaCallback", "Landroid/os/ResultReceiver;", "biometricTokenCallback", "onfidoAnalyticsEventListener", "flows", "", "Lcom/onfido/android/sdk/capture/core/config/Flow;", "tokenExpirationHandlerEnabled", "", "backgroundRunDisabled", "theme", "Lcom/onfido/android/sdk/capture/OnfidoTheme;", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/onfido/android/sdk/capture/EnterpriseFeatures;Landroid/os/ResultReceiver;Landroid/os/ResultReceiver;Landroid/os/ResultReceiver;Ljava/util/List;ZZLcom/onfido/android/sdk/capture/OnfidoTheme;)V", "getBackgroundRunDisabled", "()Z", "getBiometricTokenCallback", "()Landroid/os/ResultReceiver;", "getEnterpriseFeatures", "()Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "getFlows", "()Ljava/util/List;", "getLocale", "()Ljava/util/Locale;", "getMediaCallback", "getOnfidoAnalyticsEventListener", "setOnfidoAnalyticsEventListener", "(Landroid/os/ResultReceiver;)V", "getSdkToken", "()Ljava/lang/String;", "getTheme", "()Lcom/onfido/android/sdk/capture/OnfidoTheme;", "getTokenExpirationHandlerEnabled", "getWorkflowRunId", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoNewConfigImpl implements OnfidoNewConfig {

    @NotNull
    public static final Parcelable.Creator<OnfidoNewConfigImpl> CREATOR = new Creator();
    private final boolean backgroundRunDisabled;
    private final ResultReceiver biometricTokenCallback;
    private final EnterpriseFeatures enterpriseFeatures;

    @NotNull
    private final List<Flow> flows;
    private final Locale locale;
    private final ResultReceiver mediaCallback;
    private ResultReceiver onfidoAnalyticsEventListener;

    @NotNull
    private final String sdkToken;

    @NotNull
    private final OnfidoTheme theme;
    private final boolean tokenExpirationHandlerEnabled;
    private final String workflowRunId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnfidoNewConfigImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnfidoNewConfigImpl createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Locale locale = (Locale) parcel.readSerializable();
            String string2 = parcel.readString();
            EnterpriseFeatures enterpriseFeatures = (EnterpriseFeatures) parcel.readParcelable(OnfidoNewConfigImpl.class.getClassLoader());
            ResultReceiver resultReceiver = (ResultReceiver) parcel.readParcelable(OnfidoNewConfigImpl.class.getClassLoader());
            ResultReceiver resultReceiver2 = (ResultReceiver) parcel.readParcelable(OnfidoNewConfigImpl.class.getClassLoader());
            ResultReceiver resultReceiver3 = (ResultReceiver) parcel.readParcelable(OnfidoNewConfigImpl.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (true) {
                if (iC == i) {
                    break;
                }
                iC = a.c(parcel, arrayList, iC, 1);
            }
            return new OnfidoNewConfigImpl(string, locale, string2, enterpriseFeatures, resultReceiver, resultReceiver2, resultReceiver3, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, OnfidoTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnfidoNewConfigImpl[] newArray(int i) {
            return new OnfidoNewConfigImpl[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnfidoNewConfigImpl(@NotNull String sdkToken, Locale locale, String str, EnterpriseFeatures enterpriseFeatures, ResultReceiver resultReceiver, ResultReceiver resultReceiver2, ResultReceiver resultReceiver3, @NotNull List<? extends Flow> flows, boolean z, boolean z3, @NotNull OnfidoTheme theme) {
        Intrinsics.checkNotNullParameter(sdkToken, "sdkToken");
        Intrinsics.checkNotNullParameter(flows, "flows");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.sdkToken = sdkToken;
        this.locale = locale;
        this.workflowRunId = str;
        this.enterpriseFeatures = enterpriseFeatures;
        this.mediaCallback = resultReceiver;
        this.biometricTokenCallback = resultReceiver2;
        this.onfidoAnalyticsEventListener = resultReceiver3;
        this.flows = flows;
        this.tokenExpirationHandlerEnabled = z;
        this.backgroundRunDisabled = z3;
        this.theme = theme;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    @NotNull
    public Fragment createFragment() {
        return OnfidoFragment.INSTANCE.newInstance();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    public boolean getBackgroundRunDisabled() {
        return this.backgroundRunDisabled;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    public ResultReceiver getBiometricTokenCallback() {
        return this.biometricTokenCallback;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    public EnterpriseFeatures getEnterpriseFeatures() {
        return this.enterpriseFeatures;
    }

    @Override // com.onfido.android.sdk.capture.core.config.OnfidoNewConfig
    @NotNull
    public List<Flow> getFlows() {
        return this.flows;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    public Locale getLocale() {
        return this.locale;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    public ResultReceiver getMediaCallback() {
        return this.mediaCallback;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    public ResultReceiver getOnfidoAnalyticsEventListener() {
        return this.onfidoAnalyticsEventListener;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    @NotNull
    public String getSdkToken() {
        return this.sdkToken;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    @NotNull
    public OnfidoTheme getTheme() {
        return this.theme;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    public boolean getTokenExpirationHandlerEnabled() {
        return this.tokenExpirationHandlerEnabled;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    public String getWorkflowRunId() {
        return this.workflowRunId;
    }

    public void setOnfidoAnalyticsEventListener(ResultReceiver resultReceiver) {
        this.onfidoAnalyticsEventListener = resultReceiver;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.sdkToken);
        parcel.writeSerializable(this.locale);
        parcel.writeString(this.workflowRunId);
        parcel.writeParcelable(this.enterpriseFeatures, flags);
        parcel.writeParcelable(this.mediaCallback, flags);
        parcel.writeParcelable(this.biometricTokenCallback, flags);
        parcel.writeParcelable(this.onfidoAnalyticsEventListener, flags);
        Iterator itV = p.a.v(this.flows, parcel);
        while (itV.hasNext()) {
            parcel.writeSerializable((Serializable) itV.next());
        }
        parcel.writeInt(this.tokenExpirationHandlerEnabled ? 1 : 0);
        parcel.writeInt(this.backgroundRunDisabled ? 1 : 0);
        parcel.writeString(this.theme.name());
    }

    public /* synthetic */ OnfidoNewConfigImpl(String str, Locale locale, String str2, EnterpriseFeatures enterpriseFeatures, ResultReceiver resultReceiver, ResultReceiver resultReceiver2, ResultReceiver resultReceiver3, List list, boolean z, boolean z3, OnfidoTheme onfidoTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, locale, (i & 4) != 0 ? null : str2, enterpriseFeatures, resultReceiver, resultReceiver2, resultReceiver3, list, (i & 256) != 0 ? false : z, z3, onfidoTheme);
    }
}
