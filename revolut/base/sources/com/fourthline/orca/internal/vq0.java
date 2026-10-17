package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.core.ProductCustomizationStep;
import com.fourthline.orca.core.ProductPresentationStep;
import com.fourthline.orca.internal.k8;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public class vq0 implements ProductCustomizationStep, ProductPresentationStep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProductConfig f34429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yq0 f34430c;
    private final lg1 d;
    private final k8 e;
    private final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ProductCustomization f34431g;

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

    public static final class b implements OnProductCompleted {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OnProductCompleted f34432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vq0 f34433b;

        public b(OnProductCompleted onProductCompleted, vq0 vq0Var) {
            this.f34432a = onProductCompleted;
            this.f34433b = vq0Var;
        }

        @Override // com.fourthline.orca.core.OnProductCompleted
        public final void onResult(Object obj2) {
            vq0 vq0Var = this.f34433b;
            Throwable thA = yhm.m.a(obj2);
            if (thA == null) {
                vq0Var.e.track((k8.a) new k8.a.d(obj2, vq0Var.f34429b, vq0Var.d));
            } else {
                vq0Var.e.track((k8.a) new k8.a.b(thA, vq0Var.f34429b, vq0Var.d));
            }
            this.f34432a.onResult(obj2);
        }
    }

    public vq0(Context context, ProductConfig productConfig, yq0 productLauncher, ProductCustomization defaultCustomization, lg1 networkConfig, k8 analytics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productConfig, "productConfig");
        Intrinsics.checkNotNullParameter(productLauncher, "productLauncher");
        Intrinsics.checkNotNullParameter(defaultCustomization, "defaultCustomization");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f34428a = context;
        this.f34429b = productConfig;
        this.f34430c = productLauncher;
        this.d = networkConfig;
        this.e = analytics;
        this.f = new LinkedHashMap();
        this.f34431g = defaultCustomization;
        a(networkConfig.b());
    }

    @Override // com.fourthline.orca.core.ProductPresentationStep
    public void present(OnProductCompleted onProductCompleted) {
        Intrinsics.checkNotNullParameter(onProductCompleted, "onProductCompleted");
        this.e.track((k8.a) new k8.a.c(this.f34429b, this.d, this.f34431g));
        try {
            s1.a();
            this.f34430c.a(this.f34428a, this.d, this.f34429b, this.f34431g, this.f, new b(onProductCompleted, this));
        } catch (Exception e) {
            m.Companion companion = yhm.m.INSTANCE;
            onProductCompleted.onResult(yhm.o.a(e));
        }
    }

    public final void a(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f.put(key, value);
    }

    @Override // com.fourthline.orca.core.ProductCustomizationStep
    public ProductPresentationStep customize(ProductCustomization config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f34431g = config;
        return this;
    }

    private final void a(mb.d dVar) {
    }

    public /* synthetic */ vq0(Context context, ProductConfig productConfig, yq0 yq0Var, ProductCustomization productCustomization, lg1 lg1Var, k8 k8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, productConfig, yq0Var, productCustomization, lg1Var, (i & 32) != 0 ? new a() : k8Var);
    }
}
