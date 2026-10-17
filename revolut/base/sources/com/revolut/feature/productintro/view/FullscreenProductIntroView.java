package com.revolut.feature.productintro.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.k2;
import mx0.m2;
import mx0.o1;
import oid.y;
import ola.a;
import org.jetbrains.annotations.NotNull;
import ue0.e;
import z92.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/revolut/feature/productintro/view/FullscreenProductIntroView;", "Lmx0/m2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/k2;", "model", "", "setModel", "(Lmx0/k2;)V", "Companion", "ola/b", "ola/a", "a", "feature_product_intro_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FullscreenProductIntroView extends m2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f81295y;
    public final eq0.a z;

    /* JADX INFO: renamed from: com.revolut.feature.productintro.view.FullscreenProductIntroView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullscreenProductIntroView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setModel(@NotNull k2 model) throws Throwable {
        Intrinsics.checkNotNullParameter(model, "model");
        j0(model, this.z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullscreenProductIntroView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenProductIntroView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81295y = new a(d.f(context));
        Activity activityI = f.i(context);
        if (activityI != null) {
            phm.a aVar = (phm.a) e.j(activityI).a().get(mla.a.class);
            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
            if (aVar2 != null) {
                this.z = ((mla.a) aVar2.b()).a();
                h0().subscribe(new y(new o1(this, 1), 3));
                return;
            }
            throw new IllegalStateException(a0.d.q("Api ", mla.a.class, " is not found"));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public /* synthetic */ FullscreenProductIntroView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
