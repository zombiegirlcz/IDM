package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.OrcaKt;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.core.internal.activity.OrcaActivity;
import com.fourthline.orca.workflow.DocumentComponentConfig;
import com.fourthline.orca.workflow.WorkflowConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class df implements yq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wq0 f27719a;

    public static final class a implements OnProductCompleted {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OnProductCompleted f27720a;

        public a(OnProductCompleted onProductCompleted) {
            this.f27720a = onProductCompleted;
        }

        @Override // com.fourthline.orca.core.OnProductCompleted
        public final void onResult(Object obj2) {
            this.f27720a.onResult(obj2);
        }
    }

    public df(wq0 componentBuilder) {
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        this.f27719a = componentBuilder;
    }

    @Override // com.fourthline.orca.internal.yq0
    public void a(Context context, lg1 networkConfig, ProductConfig productConfig, ProductCustomization productCustomization, Map customFields, OnProductCompleted onProductCompleted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(productConfig, "productConfig");
        Intrinsics.checkNotNullParameter(productCustomization, "productCustomization");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        Intrinsics.checkNotNullParameter(onProductCompleted, "onProductCompleted");
        dh0 dh0VarA = this.f27719a.a(networkConfig, productConfig, productCustomization, customFields, new a(onProductCompleted));
        if (dh0VarA != null) {
            OrcaActivity.Companion companion = OrcaActivity.INSTANCE;
            companion.a(dh0VarA);
            companion.a(a(productConfig));
            OrcaKt.launchOrca(context, a(productConfig));
        }
    }

    private final String a(ProductConfig productConfig) {
        if (productConfig instanceof WorkflowConfig) {
            return "workflowSession";
        }
        if (productConfig instanceof DocumentComponentConfig) {
            return "documentComponent";
        }
        if (productConfig instanceof e01) {
            return "selfieComponent";
        }
        String simpleName = productConfig.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
