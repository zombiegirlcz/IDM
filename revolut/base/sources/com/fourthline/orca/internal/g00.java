package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.core.ProductCustomizationStep;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.document.DocumentCustomizationConfig;
import com.fourthline.orca.internal.k8;
import com.fourthline.orca.selfie.SelfieCustomizationConfig;
import com.fourthline.orca.workflow.DocumentComponentConfig;
import com.fourthline.orca.workflow.WorkflowSession;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class g00 implements WorkflowSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg1 f28704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dj f28705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n01 f28706c;
    private ra d;
    private CoroutineScope e;

    public static final class a implements k8 {
        @Override // com.fourthline.orca.internal.k8
        public /* bridge */ void onProductFailed(Throwable th10) {
            super.onProductFailed(th10);
        }

        @Override // com.fourthline.orca.internal.k8
        public /* bridge */ void onProductStart(ProductConfig productConfig, ProductCustomization productCustomization) {
            super.onProductStart(productConfig, productCustomization);
        }

        @Override // com.fourthline.orca.internal.k8
        public /* bridge */ void onProductSuccess(Object obj2) {
            super.onProductSuccess(obj2);
        }

        @Override // com.fourthline.orca.internal.qg0
        public /* bridge */ void track(k8.a aVar) {
            super.track(aVar);
        }
    }

    public g00(eg1 sessionConfig, dj documentFlowConfig, n01 selfieFlowConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Intrinsics.checkNotNullParameter(documentFlowConfig, "documentFlowConfig");
        Intrinsics.checkNotNullParameter(selfieFlowConfig, "selfieFlowConfig");
        this.f28704a = sessionConfig;
        this.f28705b = documentFlowConfig;
        this.f28706c = selfieFlowConfig;
    }

    public final eg1 a() {
        return this.f28704a;
    }

    @Override // com.fourthline.orca.workflow.WorkflowSession
    public ProductCustomizationStep biometricsComponent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        vq0 vq0Var = new vq0(context, new e01(this.f28706c), new df(new s7()), new SelfieCustomizationConfig(new OrcaFlavor(null, null, null, null, null, 31, null)), this.f28704a.b(), new a());
        vq0Var.a("tenantConfig", this.f28704a.c());
        ra raVar = this.d;
        if (raVar != null) {
            vq0Var.a("componentMotionDataUploader", raVar);
        }
        CoroutineScope coroutineScope = this.e;
        if (coroutineScope != null) {
            vq0Var.a("componentMotionDataUploaderScope", coroutineScope);
        }
        return vq0Var;
    }

    @Override // com.fourthline.orca.workflow.WorkflowSession
    public ProductCustomizationStep documentComponent(Context context, DocumentComponentConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        vq0 vq0Var = new vq0(context, new um(config.getType(), config.getIssuingCountry(), this.f28705b, this.f28704a.c()), new df(new ih()), new DocumentCustomizationConfig(new OrcaFlavor(null, null, null, null, null, 31, null)), this.f28704a.b(), null, 32, null);
        ra raVar = this.d;
        if (raVar != null) {
            vq0Var.a("componentMotionDataUploader", raVar);
        }
        CoroutineScope coroutineScope = this.e;
        if (coroutineScope != null) {
            vq0Var.a("componentMotionDataUploaderScope", coroutineScope);
        }
        return vq0Var;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g00)) {
            return false;
        }
        g00 g00Var = (g00) obj2;
        return Intrinsics.f(this.f28704a, g00Var.f28704a) && Intrinsics.f(this.f28705b, g00Var.f28705b) && Intrinsics.f(this.f28706c, g00Var.f28706c);
    }

    public int hashCode() {
        return (((this.f28704a.hashCode() * 31) + this.f28705b.hashCode()) * 31) + this.f28706c.hashCode();
    }

    public String toString() {
        return "GranularProductWorkflowSession(sessionConfig=" + this.f28704a + ", documentFlowConfig=" + this.f28705b + ", selfieFlowConfig=" + this.f28706c + ")";
    }

    public final void a(ra raVar) {
        this.d = raVar;
    }

    public final void a(CoroutineScope coroutineScope) {
        this.e = coroutineScope;
    }
}
