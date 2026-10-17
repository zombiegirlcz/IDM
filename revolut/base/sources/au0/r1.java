package au0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class r1 extends gim.i implements Function2 {
    public Drawable A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ AvatarModel.AvatarImage.GridImage D;
    public final /* synthetic */ HeaderWithBigTileLayout E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public skm.h0 u;
    public skm.g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public skm.g0 f9331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f9332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f9333y;
    public Drawable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(AvatarModel.AvatarImage.GridImage gridImage, HeaderWithBigTileLayout headerWithBigTileLayout, boolean z, int i, Continuation continuation) {
        super(2, continuation);
        this.D = gridImage;
        this.E = headerWithBigTileLayout;
        this.F = z;
        this.G = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r1 r1Var = new r1(this.D, this.E, this.F, this.G, continuation);
        r1Var.C = obj2;
        return r1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au0.r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
