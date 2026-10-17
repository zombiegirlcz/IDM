package tx0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;

/* JADX INFO: loaded from: classes20.dex */
public final class a2 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavBarLargeCentred f275080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f275081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f275082c;

    public a2(NavBarLargeCentred navBarLargeCentred, int i, int i2) {
        this.f275080a = navBarLargeCentred;
        this.f275081b = i;
        this.f275082c = i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        view.removeOnLayoutChangeListener(this);
        this.f275080a.Q.getPaint().setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r9.Q.getHeight(), new int[]{this.f275081b, this.f275082c}, (float[]) null, Shader.TileMode.CLAMP));
    }
}
