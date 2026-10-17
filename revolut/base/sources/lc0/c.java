package lc0;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import com.revolut.core.backend_flow.photo.R$id;
import com.revolut.core.backend_flow.photo.R$string;
import com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera.NumberCoverDrawView;
import com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera.NumberCoverDrawable;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import io.fotoapparat.exception.camera.CameraException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardPhotoScreen f193747w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CardPhotoScreen cardPhotoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f193747w = cardPhotoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f193747w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f193747w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f193747w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((CameraException) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Boolean boolValueOf;
        Bitmap bitmapCopy;
        int i = this.u;
        CardPhotoScreen cardPhotoScreen = this.f193747w;
        switch (i) {
            case 0:
                List strokes = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarD = cardPhotoScreen.d();
                Intrinsics.h(strokes);
                b0 b0Var = (b0) oVarD;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(strokes, "strokes");
                cli.y yVar = b0Var.u;
                if (((j) ((j2) yVar.f22677a).getValue()).e == l.EDIT) {
                    b0Var.H2(yVar, new k37.t(strokes, 23));
                }
                return Unit.f186387a;
            case 1:
                i iVar = (i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Function1 function1 = iVar.f193756c;
                Bitmap bitmap = iVar.f193754a;
                boolean z = iVar.f193755b;
                CardPhotoScreen.Companion companion = CardPhotoScreen.INSTANCE;
                NumberCoverDrawView numberCoverDrawViewI3 = cardPhotoScreen.i3();
                if (numberCoverDrawViewI3 != null) {
                    boolValueOf = Boolean.valueOf(numberCoverDrawViewI3.getVisibility() == 0);
                } else {
                    boolValueOf = null;
                }
                if (Intrinsics.f(boolValueOf, Boolean.TRUE)) {
                    NumberCoverDrawView numberCoverDrawViewI32 = cardPhotoScreen.i3();
                    if (numberCoverDrawViewI32 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Rect rect = new Rect(numberCoverDrawViewI32.getLeft(), numberCoverDrawViewI32.getTop(), numberCoverDrawViewI32.getRight(), numberCoverDrawViewI32.getBottom());
                    rect.offset(cardPhotoScreen.g3().getLeft(), cardPhotoScreen.g3().getTop());
                    Rect rectB = kc0.a.b(vc.o.g(bitmap), cardPhotoScreen.j3(), rect, z);
                    float fA = 1.0f / kc0.a.a(vc.o.g(bitmap), cardPhotoScreen.j3());
                    int iHeight = rectB.height();
                    int iWidth = rectB.width();
                    Paint paint = numberCoverDrawViewI32.f;
                    paint.setMaskFilter(new BlurMaskFilter(numberCoverDrawViewI32.f51295c * fA, BlurMaskFilter.Blur.NORMAL));
                    Matrix matrix = new Matrix();
                    matrix.setScale(fA, fA);
                    Iterable iterable = (List) numberCoverDrawViewI32.f51293a.f();
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    Iterable iterable2 = iterable;
                    ArrayList arrayList = new ArrayList(zhm.w.t(iterable2, 10));
                    Iterator it8 = iterable2.iterator();
                    while (it8.hasNext()) {
                        Path path = new Path(((kc0.f) it8.next()).f182646a);
                        path.transform(matrix);
                        arrayList.add(new kc0.f(path, rim.d.c(r14.f182647b * fA)));
                    }
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, config);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                    numberCoverDrawViewI32.a(new Canvas(bitmapCreateBitmap), arrayList);
                    paint.setMaskFilter(numberCoverDrawViewI32.e);
                    bitmapCopy = bitmap.copy(config, true);
                    new Canvas(bitmapCopy).drawBitmap(bitmapCreateBitmap, rectB.left, rectB.top, (Paint) null);
                    Intrinsics.h(bitmapCopy);
                } else {
                    bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    View viewFindViewById = cardPhotoScreen.g3().findViewById(R$id.leftTopNumberCover);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                    int left = viewFindViewById.getLeft();
                    View viewFindViewById2 = cardPhotoScreen.g3().findViewById(R$id.leftTopNumberCover);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                    int top = viewFindViewById2.getTop();
                    View viewFindViewById3 = cardPhotoScreen.g3().findViewById(R$id.rightBottomNumberCover);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                    int right = viewFindViewById3.getRight();
                    View viewFindViewById4 = cardPhotoScreen.g3().findViewById(R$id.rightBottomNumberCover);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                    Rect rect2 = new Rect(left, top, right, viewFindViewById4.getBottom());
                    rect2.offset(cardPhotoScreen.g3().getLeft(), cardPhotoScreen.g3().getTop());
                    Rect rectB2 = kc0.a.b(vc.o.g(bitmap), cardPhotoScreen.j3(), rect2, z);
                    float fA2 = 1.0f / kc0.a.a(vc.o.g(bitmap), cardPhotoScreen.j3());
                    Canvas canvas = new Canvas(bitmapCopy);
                    NumberCoverDrawable numberCoverDrawable = new NumberCoverDrawable(kli.a.k(cardPhotoScreen.m2(), 3.0f) * fA2);
                    numberCoverDrawable.setBounds(rectB2);
                    numberCoverDrawable.draw(canvas);
                    Intrinsics.h(bitmapCopy);
                }
                function1.invoke(bitmapCopy);
                return Unit.f186387a;
            default:
                CameraException exc2 = (CameraException) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var2 = (b0) cardPhotoScreen.d();
                b0Var2.getClass();
                Intrinsics.checkNotNullParameter(exc2, "exc");
                yji.l.a1(b0Var2, b0Var2.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new a0(b0Var2, null, 0), 3);
                return Unit.f186387a;
        }
    }
}
