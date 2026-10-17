package com.revolut.feature.apm.core.api.product;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import dx1.h;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yhm.j;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/apm/core/api/product/ApmProduct;", "Ldx1/h;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "a", "Lcom/revolut/feature/apm/core/api/product/ApmProductComplete;", "Lcom/revolut/feature/apm/core/api/product/ApmProductIncomplete;", "feature_apm_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ApmProduct implements h, Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f61821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f61822b;

    /* JADX INFO: renamed from: com.revolut.feature.apm.core.api.product.ApmProduct$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public /* synthetic */ ApmProduct(int i) {
        this();
    }

    public Image F() {
        return (Image) this.f61821a.getValue();
    }

    public abstract String getId();

    public Image j() {
        return (Image) this.f61822b.getValue();
    }

    public int z() {
        return d();
    }

    private ApmProduct() {
        final int i = 0;
        this.f61821a = j.b(new Function0(this) { // from class: dx1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmProduct f120516b;

            {
                this.f120516b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new ResourceImage(this.f120516b.d(), (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(12.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), false, 8), null, null, null, null, null, ISO781611.SMT_TAG), (Clause) null, 190);
                    default:
                        return this.f120516b.F();
                }
            }
        });
        final int i2 = 1;
        this.f61822b = j.b(new Function0(this) { // from class: dx1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmProduct f120516b;

            {
                this.f120516b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new ResourceImage(this.f120516b.d(), (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(12.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), false, 8), null, null, null, null, null, ISO781611.SMT_TAG), (Clause) null, 190);
                    default:
                        return this.f120516b.F();
                }
            }
        });
    }
}
