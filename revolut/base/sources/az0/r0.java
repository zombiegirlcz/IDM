package az0;

import android.content.Context;
import com.revolut.core.ui_kit.models.MaskedImage;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r0 extends u {
    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof MaskedImage;
    }

    @Override // az0.u
    public final Object g(Context context, Image image, Continuation continuation) {
        if (!(image instanceof MaskedImage)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MaskedImage maskedImage = (MaskedImage) image;
        MaskedImage.MaskType maskType = maskedImage.f57817b;
        if (maskType instanceof MaskedImage.MaskType.Circle) {
            return h(context, maskedImage.f57816a, (MaskedImage.MaskType.Circle) maskType, (gim.c) continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.content.Context r17, com.revolut.core.ui_kit_core.displayers.image.Image r18, com.revolut.core.ui_kit.models.MaskedImage.MaskType.Circle r19, gim.c r20) {
        /*
            r16 = this;
            r2 = r17
            r0 = r19
            r1 = r20
            boolean r3 = r1 instanceof az0.q0
            if (r3 == 0) goto L1c
            r3 = r1
            az0.q0 r3 = (az0.q0) r3
            int r4 = r3.f11344y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.f11344y = r4
            r6 = r16
        L1a:
            r5 = r3
            goto L24
        L1c:
            az0.q0 r3 = new az0.q0
            r6 = r16
            r3.<init>(r6, r1)
            goto L1a
        L24:
            java.lang.Object r1 = r5.f11342w
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r3 = r5.f11344y
            r8 = 1
            if (r3 == 0) goto L40
            if (r3 != r8) goto L38
            int r0 = r5.v
            int r2 = r5.u
            yhm.o.b(r1)
            r12 = r0
            goto L69
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            yhm.o.b(r1)
            float r1 = r0.f57819a
            int r3 = kli.a.k(r2, r1)
            float r0 = r0.f57820b
            int r9 = kli.a.k(r2, r0)
            wy0.a r0 = jh.d.f(r2)
            yy0.f r0 = r0.Q()
            r5.u = r3
            r5.v = r9
            r5.f11344y = r8
            r4 = r3
            r1 = r18
            java.lang.Object r1 = ofm.q.J(r0, r1, r2, r3, r4, r5)
            if (r1 != r7) goto L67
            return r7
        L67:
            r2 = r3
            r12 = r9
        L69:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            com.revolut.core.ui_kit_core.displayers.image.delegates.ScalableLayerDrawable r10 = new com.revolut.core.ui_kit_core.displayers.image.delegates.ScalableLayerDrawable
            com.revolut.core.ui_kit_core.displayers.image.drawables.CircularDrawable r0 = new com.revolut.core.ui_kit_core.displayers.image.drawables.CircularDrawable
            r0.<init>(r1)
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r8]
            r3 = 0
            r1[r3] = r0
            int r0 = r12 * 2
            int r0 = r0 + r2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            r10.<init>(r1, r2, r3)
            r11 = 0
            r13 = r12
            r14 = r12
            r15 = r12
            r10.setLayerInset(r11, r12, r13, r14, r15)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.r0.h(android.content.Context, com.revolut.core.ui_kit_core.displayers.image.Image, com.revolut.core.ui_kit.models.MaskedImage$MaskType$Circle, gim.c):java.lang.Object");
    }
}
