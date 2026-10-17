package o3l;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.CharSequenceClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.CircleClipView;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.retail.operation_status.step.OperationStatusFragment;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f221857b;

    public /* synthetic */ k(q qVar, int i) {
        this.f221856a = i;
        this.f221857b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair;
        r70.b bVar;
        switch (this.f221856a) {
            case 0:
                Clause text = (Clause) obj2;
                g gVar = (g) this.f221857b.L();
                if (gVar != null) {
                    Intrinsics.h(text);
                    OperationStatusFragment operationStatusFragment = (OperationStatusFragment) gVar;
                    Intrinsics.checkNotNullParameter(text, "text");
                    ty0.c cVarB0 = operationStatusFragment.D().b0();
                    f3l.a aVar = operationStatusFragment.f104423e0;
                    Intrinsics.h(aVar);
                    AppCompatTextView operationStateTitle = aVar.f131985l;
                    Intrinsics.checkNotNullExpressionValue(operationStateTitle, "operationStateTitle");
                    ty0.c.b(cVarB0, text, operationStateTitle, null, null, 12);
                }
                return Unit.f186387a;
            case 1:
                CharSequence charSequence = (CharSequence) obj2;
                q qVar = this.f221857b;
                g gVar2 = (g) qVar.L();
                if (gVar2 != null) {
                    Intrinsics.h(charSequence);
                    ((OperationStatusFragment) gVar2).E(charSequence);
                }
                g gVar3 = (g) qVar.L();
                if (gVar3 != null) {
                    Intrinsics.h(charSequence);
                    boolean z = !d0.W(charSequence);
                    f3l.a aVar2 = ((OperationStatusFragment) gVar3).f104423e0;
                    Intrinsics.h(aVar2);
                    AppCompatTextView operationStateLink = aVar2.i;
                    Intrinsics.checkNotNullExpressionValue(operationStateLink, "operationStateLink");
                    w01.k.e(operationStateLink, z);
                }
                return Unit.f186387a;
            case 2:
                Clause text2 = (Clause) obj2;
                q qVar2 = this.f221857b;
                g gVar4 = (g) qVar2.L();
                if (gVar4 != null) {
                    boolean z3 = text2 != null;
                    f3l.a aVar3 = ((OperationStatusFragment) gVar4).f104423e0;
                    Intrinsics.h(aVar3);
                    LargeActionButton bottomAboveNextButton = aVar3.f131980b;
                    Intrinsics.checkNotNullExpressionValue(bottomAboveNextButton, "bottomAboveNextButton");
                    w01.k.e(bottomAboveNextButton, z3);
                }
                g gVar5 = (g) qVar2.L();
                if (gVar5 != null) {
                    Intrinsics.h(text2);
                    Intrinsics.checkNotNullParameter(text2, "text");
                    f3l.a aVar4 = ((OperationStatusFragment) gVar5).f104423e0;
                    Intrinsics.h(aVar4);
                    aVar4.f131980b.setText(text2);
                }
                return Unit.f186387a;
            case 3:
                v01.b textStyle = (v01.b) obj2;
                g gVar6 = (g) this.f221857b.L();
                if (gVar6 != null) {
                    Intrinsics.h(textStyle);
                    Intrinsics.checkNotNullParameter(textStyle, "textStyle");
                    f3l.a aVar5 = ((OperationStatusFragment) gVar6).f104423e0;
                    Intrinsics.h(aVar5);
                    AppCompatTextView operationStateLink2 = aVar5.i;
                    Intrinsics.checkNotNullExpressionValue(operationStateLink2, "operationStateLink");
                    hx7.b.e(operationStateLink2, textStyle);
                }
                return Unit.f186387a;
            case 4:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f221857b.k.a();
            case 5:
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "it");
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                return this.f221857b.k.c(clickData);
            case 6:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f221857b.k.d();
            case 7:
                this.f221857b.i.n(((CharSequence) obj2).toString());
                return Unit.f186387a;
            case 8:
                Pair pair2 = (Pair) obj2;
                Image image = (Image) pair2.f186385a;
                boolean zBooleanValue = ((Boolean) pair2.f186386b).booleanValue();
                g gVar7 = (g) this.f221857b.L();
                if (gVar7 != null) {
                    OperationStatusFragment operationStatusFragment2 = (OperationStatusFragment) gVar7;
                    Lazy lazy = operationStatusFragment2.c0;
                    Intrinsics.checkNotNullParameter(image, "image");
                    f3l.a aVar6 = operationStatusFragment2.f104423e0;
                    Intrinsics.h(aVar6);
                    FullScreenStateView playerView = aVar6.f131986m;
                    Intrinsics.checkNotNullExpressionValue(playerView, "playerView");
                    FullScreenStateView.setImage$default(playerView, null, null, 2, null);
                    f3l.a aVar7 = operationStatusFragment2.f104423e0;
                    Intrinsics.h(aVar7);
                    FullScreenStateView playerView2 = aVar7.f131986m;
                    Intrinsics.checkNotNullExpressionValue(playerView2, "playerView");
                    w01.k.a(playerView2);
                    if (image instanceof LottieImage) {
                        LottieImage lottieImage = (LottieImage) image;
                        if (zBooleanValue) {
                            f3l.a aVar8 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar8);
                            aVar8.f131981c.cancelAnimation();
                            f3l.a aVar9 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar9);
                            LottieAnimationView operationStateAnimation = aVar9.f131981c;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimation, "operationStateAnimation");
                            w01.k.a(operationStateAnimation);
                            f3l.a aVar10 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar10);
                            CircleClipView operationStateAnimationMask = aVar10.f;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimationMask, "operationStateAnimationMask");
                            w01.k.a(operationStateAnimationMask);
                            f3l.a aVar11 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar11);
                            LottieAnimationView operationStateAnimationBig = aVar11.d;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimationBig, "operationStateAnimationBig");
                            w01.k.d(operationStateAnimationBig);
                            f3l.a aVar12 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar12);
                            CircleClipView operationStateAnimationBigMask = aVar12.e;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimationBigMask, "operationStateAnimationBigMask");
                            w01.k.d(operationStateAnimationBigMask);
                            yy0.f fVar = (yy0.f) lazy.getValue();
                            f3l.a aVar13 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar13);
                            LottieAnimationView operationStateAnimationBig2 = aVar13.d;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimationBig2, "operationStateAnimationBig");
                            yy0.f.e(fVar, lottieImage, operationStateAnimationBig2, null, new a(operationStatusFragment2, 2), 4);
                        } else {
                            f3l.a aVar14 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar14);
                            aVar14.d.cancelAnimation();
                            f3l.a aVar15 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar15);
                            LottieAnimationView operationStateAnimationBig3 = aVar15.d;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimationBig3, "operationStateAnimationBig");
                            w01.k.a(operationStateAnimationBig3);
                            f3l.a aVar16 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar16);
                            CircleClipView operationStateAnimationBigMask2 = aVar16.e;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimationBigMask2, "operationStateAnimationBigMask");
                            w01.k.a(operationStateAnimationBigMask2);
                            f3l.a aVar17 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar17);
                            LottieAnimationView operationStateAnimation2 = aVar17.f131981c;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimation2, "operationStateAnimation");
                            w01.k.d(operationStateAnimation2);
                            f3l.a aVar18 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar18);
                            CircleClipView operationStateAnimationMask2 = aVar18.f;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimationMask2, "operationStateAnimationMask");
                            w01.k.d(operationStateAnimationMask2);
                            yy0.f fVar2 = (yy0.f) lazy.getValue();
                            f3l.a aVar19 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar19);
                            LottieAnimationView operationStateAnimation3 = aVar19.f131981c;
                            Intrinsics.checkNotNullExpressionValue(operationStateAnimation3, "operationStateAnimation");
                            yy0.f.e(fVar2, lottieImage, operationStateAnimation3, null, new a(operationStatusFragment2, 3), 4);
                        }
                    } else {
                        f3l.a aVar20 = operationStatusFragment2.f104423e0;
                        Intrinsics.h(aVar20);
                        FullScreenStateView playerView3 = aVar20.f131986m;
                        Intrinsics.checkNotNullExpressionValue(playerView3, "playerView");
                        FullScreenStateView.setImage$default(playerView3, null, null, 2, null);
                        f3l.a aVar21 = operationStatusFragment2.f104423e0;
                        Intrinsics.h(aVar21);
                        FullScreenStateView playerView4 = aVar21.f131986m;
                        Intrinsics.checkNotNullExpressionValue(playerView4, "playerView");
                        w01.k.a(playerView4);
                        if (zBooleanValue) {
                            f3l.a aVar22 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar22);
                            ImageView imageView = aVar22.f131983h;
                            f3l.a aVar23 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar23);
                            pair = new Pair(imageView, aVar23.f131982g);
                        } else {
                            f3l.a aVar24 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar24);
                            ImageView imageView2 = aVar24.f131982g;
                            f3l.a aVar25 = operationStatusFragment2.f104423e0;
                            Intrinsics.h(aVar25);
                            pair = new Pair(imageView2, aVar25.f131983h);
                        }
                        Object obj3 = pair.f186385a;
                        Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                        ImageView imageView3 = (ImageView) obj3;
                        Object obj4 = pair.f186386b;
                        Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                        yy0.f.e((yy0.f) lazy.getValue(), image, imageView3, null, null, 12);
                        w01.k.a((ImageView) obj4);
                        w01.k.d(imageView3);
                    }
                }
                return Unit.f186387a;
            case 9:
                Integer num = (Integer) obj2;
                zpi.c cVar = this.f221857b.f221865l;
                Intrinsics.h(num);
                int iIntValue = num.intValue();
                w01.g scaleType = w01.g.CENTER_IN;
                zpi.b bVar2 = (zpi.b) cVar;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(scaleType, "scaleType");
                ((w01.c) bVar2.f324313h.getValue()).a(iIntValue, scaleType);
                return Unit.f186387a;
            case 10:
                Boolean bool = (Boolean) obj2;
                g gVar8 = (g) this.f221857b.L();
                if (gVar8 != null) {
                    Intrinsics.h(bool);
                    boolean zBooleanValue2 = bool.booleanValue();
                    f3l.a aVar26 = ((OperationStatusFragment) gVar8).f104423e0;
                    Intrinsics.h(aVar26);
                    ProgressBar operationStateProgress = aVar26.f131984j;
                    Intrinsics.checkNotNullExpressionValue(operationStateProgress, "operationStateProgress");
                    w01.k.e(operationStateProgress, zBooleanValue2);
                }
                return Unit.f186387a;
            case 11:
                Video video = (Video) obj2;
                g gVar9 = (g) this.f221857b.L();
                if (gVar9 != null) {
                    Intrinsics.h(video);
                    OperationStatusFragment operationStatusFragment3 = (OperationStatusFragment) gVar9;
                    Intrinsics.checkNotNullParameter(video, "video");
                    f3l.a aVar27 = operationStatusFragment3.f104423e0;
                    Intrinsics.h(aVar27);
                    FullScreenStateView playerView5 = aVar27.f131986m;
                    Intrinsics.checkNotNullExpressionValue(playerView5, "playerView");
                    FullScreenStateView.setImage$default(playerView5, new ComplexImage.Video(video), null, 2, null);
                    f3l.a aVar28 = operationStatusFragment3.f104423e0;
                    Intrinsics.h(aVar28);
                    FullScreenStateView fullScreenStateView = aVar28.f131986m;
                    Intrinsics.h(fullScreenStateView);
                    w01.k.d(fullScreenStateView);
                    fullScreenStateView.setOutlineProvider(new b());
                    fullScreenStateView.setClipToOutline(true);
                }
                return Unit.f186387a;
            case 12:
                e3l.a aVar29 = (e3l.a) obj2;
                r70.c cVar2 = this.f221857b.f221866m;
                Intrinsics.h(aVar29);
                int i = l.f221858a[aVar29.ordinal()];
                if (i == 1) {
                    bVar = r70.b.SHORT;
                } else if (i == 2) {
                    bVar = r70.b.PULSE;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = r70.b.DEEP;
                }
                ((r70.e) cVar2).c(bVar, true);
                return Unit.f186387a;
            case 13:
                Pair pair3 = (Pair) obj2;
                this.f221857b.i.A(((Number) pair3.f186385a).intValue(), ((Number) pair3.f186386b).intValue());
                return Unit.f186387a;
            default:
                Clause text3 = (Clause) obj2;
                q qVar3 = this.f221857b;
                g gVar10 = (g) qVar3.L();
                if (gVar10 != null) {
                    boolean z4 = text3 != null;
                    f3l.a aVar30 = ((OperationStatusFragment) gVar10).f104423e0;
                    Intrinsics.h(aVar30);
                    AppCompatTextView operationStateSubtitle = aVar30.k;
                    Intrinsics.checkNotNullExpressionValue(operationStateSubtitle, "operationStateSubtitle");
                    w01.k.e(operationStateSubtitle, z4);
                }
                g gVar11 = (g) qVar3.L();
                if (gVar11 != null) {
                    Intrinsics.h(text3);
                    OperationStatusFragment operationStatusFragment4 = (OperationStatusFragment) gVar11;
                    Intrinsics.checkNotNullParameter(text3, "text");
                    ty0.c cVarB02 = operationStatusFragment4.D().b0();
                    Context contextRequireContext = operationStatusFragment4.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    CharSequence charSequenceA = ty0.c.a(cVarB02, text3, contextRequireContext, new o3k.a(operationStatusFragment4, 1), null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
                    if (text3 instanceof CharSequenceClause) {
                        Context contextRequireContext2 = operationStatusFragment4.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        com.revolut.core.android.spannable.a aVarD = e80.i.d(new e80.i(contextRequireContext2), true, new nx2.f(operationStatusFragment4, 17), new e80.e(null, 15, 3), null, 8);
                        aVarD.a(charSequenceA.toString(), null);
                        charSequenceA = aVarD.d();
                    }
                    f3l.a aVar31 = operationStatusFragment4.f104423e0;
                    Intrinsics.h(aVar31);
                    AppCompatTextView operationStateSubtitle2 = aVar31.k;
                    Intrinsics.checkNotNullExpressionValue(operationStateSubtitle2, "operationStateSubtitle");
                    hx7.b.w(operationStateSubtitle2, charSequenceA);
                    f3l.a aVar32 = operationStatusFragment4.f104423e0;
                    Intrinsics.h(aVar32);
                    aVar32.k.setText(charSequenceA);
                    f3l.a aVar33 = operationStatusFragment4.f104423e0;
                    Intrinsics.h(aVar33);
                    AppCompatTextView operationStateSubtitle3 = aVar33.k;
                    Intrinsics.checkNotNullExpressionValue(operationStateSubtitle3, "operationStateSubtitle");
                    w01.k.e(operationStateSubtitle3, !d0.W(charSequenceA));
                }
                return Unit.f186387a;
        }
    }
}
