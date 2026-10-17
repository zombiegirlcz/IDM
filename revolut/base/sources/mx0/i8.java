package mx0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes20.dex */
public final class i8 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i8 f209755a = new i8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f209756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f209757c;
    public static final int d;

    static {
        int i = R$dimen.internal_keyboard_suggestions_height;
        f209756b = i;
        f209757c = R$attr.uikit_colorGreyTone8;
        d = i;
    }

    private i8() {
    }

    @Override // mx0.k8
    public final int a() {
        return f209757c;
    }

    @Override // mx0.k8
    public final int b() {
        return d;
    }

    @Override // mx0.k8
    public final int c() {
        return f209756b;
    }

    @Override // mx0.k8
    public final float d() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // mx0.k8
    public final float e() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // mx0.k8
    public final float f() {
        return BitmapDescriptorFactory.HUE_RED;
    }
}
