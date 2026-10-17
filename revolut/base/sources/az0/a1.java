package az0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;

/* JADX INFO: loaded from: classes20.dex */
public final class a1 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ w0 B;
    public int C;
    public Context u;
    public QrCodeImage v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public QrCodeAppearance.Type.Rounded f11291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f11292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable[] f11293y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(w0 w0Var, gim.c cVar) {
        super(cVar);
        this.B = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return w0.h(this.B, null, null, null, this);
    }
}
