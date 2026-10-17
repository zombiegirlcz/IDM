package az0;

import android.content.Context;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;

/* JADX INFO: loaded from: classes20.dex */
public final class z0 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ w0 B;
    public int C;
    public Context u;
    public QrCodeImage v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public QrCodeAppearance.Type.Classic f11379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f11380x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f11381y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(w0 w0Var, gim.c cVar) {
        super(cVar);
        this.B = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return w0.g(this.B, null, null, null, this);
    }
}
