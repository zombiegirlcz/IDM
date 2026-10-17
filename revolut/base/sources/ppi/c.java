package ppi;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import aw0.gb;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import mx0.hd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends fsi.c {

    @NotNull
    public static final b Companion = new b();
    public static final fsi.b o = new fsi.b("EXPAND_ANIMATION_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BaseDelegatesActivity f238607h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f238608j;
    public hd k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f238609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f238610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f238611n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BaseDelegatesActivity activity, d sharedElementStorage) {
        super(o);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sharedElementStorage, "sharedElementStorage");
        this.f238607h = activity;
        this.i = sharedElementStorage;
        this.f238610m = new ArrayList();
        this.f238611n = new a(this, 0);
    }

    @Override // fsi.a
    public final void E(Bundle bundle) {
        this.f238608j = bundle != null;
    }

    @Override // fsi.a
    public final void I() {
        View childAt;
        ViewGroup.LayoutParams layoutParams;
        BaseDelegatesActivity baseDelegatesActivity = this.f238607h;
        Parcelable parcelableExtra = baseDelegatesActivity.getIntent().getParcelableExtra("navigator.EXTRA_ANIMATION_INFO");
        if (!(parcelableExtra instanceof ActivityAnimation.Expand) || this.f238608j || Build.VERSION.SDK_INT < 30) {
            return;
        }
        View viewFindViewById = baseDelegatesActivity.findViewById(R.id.content);
        ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
        if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) {
            return;
        }
        String key = ((ActivityAnimation.Expand) parcelableExtra).f98615a;
        d dVar = this.i;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        WeakReference weakReference = (WeakReference) dVar.f238612a.get(key);
        gb gbVar = weakReference != null ? (gb) weakReference.get() : null;
        if (gbVar == null) {
            return;
        }
        hd hdVar = new hd(baseDelegatesActivity, null, 6, 0);
        this.k = hdVar;
        viewGroup.addView(hdVar);
        hd hdVar2 = this.k;
        if (hdVar2 != null && (layoutParams = hdVar2.getLayoutParams()) != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        Drawable background = baseDelegatesActivity.getWindow().getDecorView().getBackground();
        baseDelegatesActivity.overridePendingTransition(0, 0);
        baseDelegatesActivity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        baseDelegatesActivity.setTranslucent(true);
        childAt.setBackground(background);
        childAt.setAlpha(BitmapDescriptorFactory.HUE_RED);
        viewGroup.post(new ec.a(this, gbVar, childAt, background, 1));
    }

    @Override // fsi.a
    public final boolean onFinish() {
        if (this.f238609l) {
            return false;
        }
        hd hdVar = this.k;
        boolean zA = hdVar != null ? hdVar.a(new a(this, 1), new a(this, 2)) : false;
        this.f238609l = zA;
        if (zA) {
            BaseDelegatesActivity baseDelegatesActivity = this.f238607h;
            baseDelegatesActivity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            baseDelegatesActivity.setTranslucent(true);
        }
        return this.f238609l;
    }

    @Override // fsi.c, fsi.a
    public final void onPause() {
        hd hdVar;
        super.onPause();
        if (!this.f238609l || (hdVar = this.k) == null) {
            return;
        }
        hdVar.c();
    }
}
