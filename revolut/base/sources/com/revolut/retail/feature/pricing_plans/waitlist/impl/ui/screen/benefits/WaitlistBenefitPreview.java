package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits;

import android.content.Context;
import android.util.AttributeSet;
import aw0.l6;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import gim.i;
import jh.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.k2;
import mx0.m2;
import org.jetbrains.annotations.NotNull;
import rlh.d0;
import rof.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/benefits/WaitlistBenefitPreview;", "Lmx0/m2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/k2;", "model", "", "setModel", "(Lmx0/k2;)V", "Companion", "rok/a", "b", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitlistBenefitPreview extends m2 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final rok.a f103692y;
    public final c z;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final a A = new a();

    public static final class a implements l6 {
        @Override // aw0.l6
        public final boolean a() {
            return false;
        }

        @Override // aw0.l6
        public final String b() {
            return "WAITLIST_BENEFITS";
        }

        @Override // aw0.l6
        public final AnimatedBackgroundType getBackground() {
            return AnimatedBackgroundType.DEFAULT.f51471a;
        }
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitPreview$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class c implements eq0.a {
        @Override // eq0.a
        public final Object e(l6 l6Var, i iVar) {
            return Unit.f186387a;
        }

        @Override // eq0.a
        public final void f(l6 product) {
            Intrinsics.checkNotNullParameter(product, "product");
        }

        @Override // eq0.b
        public final boolean h(l6 product) {
            Intrinsics.checkNotNullParameter(product, "product");
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WaitlistBenefitPreview(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setModel(@NotNull k2 model) throws Throwable {
        Intrinsics.checkNotNullParameter(model, "model");
        j0(model, this.z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WaitlistBenefitPreview(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitlistBenefitPreview(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f103692y = new rok.a(d.f(context));
        this.z = new c();
        h0().subscribe(new e(3, new d0(this, 13)));
        setAllowReuseAfterClose(false);
    }

    public /* synthetic */ WaitlistBenefitPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
