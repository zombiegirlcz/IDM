package bq0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends ShapeDrawable.ShaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UiKitGradient f17664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f17665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float[] f17666c;

    public c(UiKitGradient uiKitGradient, int[] iArr, float[] fArr) {
        this.f17664a = uiKitGradient;
        this.f17665b = iArr;
        this.f17666c = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        GradientDrawable.Orientation orientation = this.f17664a.f55829c;
        Intrinsics.checkNotNullParameter(orientation, "<this>");
        a aVarV = ta6.a.V(orientation, i, i2);
        return new LinearGradient(aVarV.f17660a, aVarV.f17661b, aVarV.f17662c, aVarV.d, this.f17665b, this.f17666c, Shader.TileMode.CLAMP);
    }
}
