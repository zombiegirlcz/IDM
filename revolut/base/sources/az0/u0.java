package az0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.drawables.MaskedLayerDrawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class u0 extends gim.i implements Function2 {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Image I;
    public final /* synthetic */ s0 J;
    public final /* synthetic */ Context K;
    public skm.h0 u;
    public MaskedLayerDrawable.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f11360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable[] f11361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable[] f11362y;
    public MaskedLayerDrawable.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Image image, s0 s0Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.I = image;
        this.J = s0Var;
        this.K = context;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u0 u0Var = new u0(this.I, this.J, this.K, continuation);
        u0Var.H = obj2;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
