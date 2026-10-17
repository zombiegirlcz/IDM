package com.onfido.workflow.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.fragment.app.Fragment;
import cm.c;
import com.onfido.android.sdk.capture.EnterpriseFeatures;
import com.onfido.android.sdk.capture.OnfidoTheme;
import com.onfido.workflow.WorkflowConfig;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/onfido/workflow/internal/WorkflowConfigImpl;", "Lcom/onfido/workflow/WorkflowConfig;", "onfido-workflow-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class WorkflowConfigImpl implements WorkflowConfig {

    @NotNull
    public static final Parcelable.Creator<WorkflowConfigImpl> CREATOR = new c(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Locale f50175c;
    public final EnterpriseFeatures d;
    public final ResultReceiver e;
    public final ResultReceiver f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f50176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f50177h;
    public final ResultReceiver i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OnfidoTheme f50178j;

    public WorkflowConfigImpl(String sdkToken, String workflowRunId, Locale locale, EnterpriseFeatures enterpriseFeatures, ResultReceiver resultReceiver, ResultReceiver resultReceiver2, boolean z, boolean z3, ResultReceiver resultReceiver3, OnfidoTheme theme) {
        Intrinsics.checkNotNullParameter(sdkToken, "sdkToken");
        Intrinsics.checkNotNullParameter(workflowRunId, "workflowRunId");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f50173a = sdkToken;
        this.f50174b = workflowRunId;
        this.f50175c = locale;
        this.d = enterpriseFeatures;
        this.e = resultReceiver;
        this.f = resultReceiver2;
        this.f50176g = z;
        this.f50177h = z3;
        this.i = resultReceiver3;
        this.f50178j = theme;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    public final Fragment createFragment() throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = WorkflowFragment.class.getMethod("newInstance", null).invoke(null, null);
        Intrinsics.i(objInvoke, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return (Fragment) objInvoke;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowConfigImpl)) {
            return false;
        }
        WorkflowConfigImpl workflowConfigImpl = (WorkflowConfigImpl) obj2;
        return Intrinsics.f(this.f50173a, workflowConfigImpl.f50173a) && Intrinsics.f(this.f50174b, workflowConfigImpl.f50174b) && Intrinsics.f(this.f50175c, workflowConfigImpl.f50175c) && Intrinsics.f(this.d, workflowConfigImpl.d) && Intrinsics.f(this.e, workflowConfigImpl.e) && Intrinsics.f(this.f, workflowConfigImpl.f) && this.f50176g == workflowConfigImpl.f50176g && this.f50177h == workflowConfigImpl.f50177h && Intrinsics.f(this.i, workflowConfigImpl.i) && this.f50178j == workflowConfigImpl.f50178j;
    }

    @Override // com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getBackgroundRunDisabled, reason: from getter */
    public final boolean getF50177h() {
        return this.f50177h;
    }

    @Override // com.onfido.workflow.WorkflowConfig, com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getBiometricTokenCallback, reason: from getter */
    public final ResultReceiver getF() {
        return this.f;
    }

    @Override // com.onfido.workflow.WorkflowConfig, com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getEnterpriseFeatures, reason: from getter */
    public final EnterpriseFeatures getD() {
        return this.d;
    }

    @Override // com.onfido.workflow.WorkflowConfig, com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getLocale, reason: from getter */
    public final Locale getF50175c() {
        return this.f50175c;
    }

    @Override // com.onfido.workflow.WorkflowConfig, com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getMediaCallback, reason: from getter */
    public final ResultReceiver getE() {
        return this.e;
    }

    @Override // com.onfido.workflow.WorkflowConfig, com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getOnfidoAnalyticsEventListener, reason: from getter */
    public final ResultReceiver getI() {
        return this.i;
    }

    @Override // com.onfido.workflow.WorkflowConfig, com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getSdkToken, reason: from getter */
    public final String getF50173a() {
        return this.f50173a;
    }

    @Override // com.onfido.workflow.WorkflowConfig, com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getTheme, reason: from getter */
    public final OnfidoTheme getF50178j() {
        return this.f50178j;
    }

    @Override // com.onfido.workflow.WorkflowConfig, com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getTokenExpirationHandlerEnabled, reason: from getter */
    public final boolean getF50176g() {
        return this.f50176g;
    }

    @Override // com.onfido.workflow.WorkflowConfig, com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getWorkflowRunId, reason: from getter */
    public final String getF50174b() {
        return this.f50174b;
    }

    public final int hashCode() {
        int iC = a.c(this.f50173a.hashCode() * 31, 31, this.f50174b);
        Locale locale = this.f50175c;
        int iHashCode = (iC + (locale == null ? 0 : locale.hashCode())) * 31;
        EnterpriseFeatures enterpriseFeatures = this.d;
        int iHashCode2 = (iHashCode + (enterpriseFeatures == null ? 0 : enterpriseFeatures.hashCode())) * 31;
        ResultReceiver resultReceiver = this.e;
        int iHashCode3 = (iHashCode2 + (resultReceiver == null ? 0 : resultReceiver.hashCode())) * 31;
        ResultReceiver resultReceiver2 = this.f;
        int iC2 = j6.a.c(j6.a.c((iHashCode3 + (resultReceiver2 == null ? 0 : resultReceiver2.hashCode())) * 31, 31, this.f50176g), 31, this.f50177h);
        ResultReceiver resultReceiver3 = this.i;
        return this.f50178j.hashCode() + ((iC2 + (resultReceiver3 != null ? resultReceiver3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("WorkflowConfigImpl(sdkToken=", this.f50173a, ", workflowRunId=", this.f50174b, ", locale=");
        sbM.append(this.f50175c);
        sbM.append(", enterpriseFeatures=");
        sbM.append(this.d);
        sbM.append(", mediaCallback=");
        sbM.append(this.e);
        sbM.append(", biometricTokenCallback=");
        sbM.append(this.f);
        sbM.append(", tokenExpirationHandlerEnabled=");
        t61.a.y(sbM, this.f50176g, ", backgroundRunDisabled=", this.f50177h, ", onfidoAnalyticsEventListener=");
        sbM.append(this.i);
        sbM.append(", theme=");
        sbM.append(this.f50178j);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f50173a);
        out.writeString(this.f50174b);
        out.writeSerializable(this.f50175c);
        out.writeParcelable(this.d, i);
        out.writeParcelable(this.e, i);
        out.writeParcelable(this.f, i);
        out.writeInt(this.f50176g ? 1 : 0);
        out.writeInt(this.f50177h ? 1 : 0);
        out.writeParcelable(this.i, i);
        out.writeString(this.f50178j.name());
    }
}
