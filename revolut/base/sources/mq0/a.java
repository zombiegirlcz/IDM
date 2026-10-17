package mq0;

import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import dcl.q;
import kotlin.jvm.internal.Intrinsics;
import lq0.b;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f207845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f207846c;
    public final float d;

    public a(View view, float f, float f4, int i) {
        this.f207844a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                this.f207845b = view;
                this.f207846c = f;
                this.d = f4;
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                this.f207845b = view;
                this.f207846c = f;
                this.d = f4;
                break;
        }
    }

    @Override // lq0.b
    public final void a(float f) {
        switch (this.f207844a) {
            case 0:
                this.f207845b.setTranslationX(AnimationUtils.lerp(this.f207846c, this.d, f));
                break;
            default:
                this.f207845b.setTranslationY(AnimationUtils.lerp(this.f207846c, this.d, f));
                break;
        }
    }

    @Override // lq0.b
    public final void b(q sideEffectHelper) {
        switch (this.f207844a) {
            case 0:
                Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
                this.f207845b.setTranslationX(this.d);
                break;
            default:
                Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
                this.f207845b.setTranslationY(this.d);
                break;
        }
    }

    @Override // lq0.b
    public final void c(q sideEffectHelper) {
        switch (this.f207844a) {
            case 0:
                Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
                this.f207845b.setTranslationX(this.f207846c);
                break;
            default:
                Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
                this.f207845b.setTranslationY(this.f207846c);
                break;
        }
    }
}
