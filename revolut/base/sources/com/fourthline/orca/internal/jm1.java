package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.location.Location;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class jm1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29967a;

    public /* synthetic */ jm1(int i) {
        this.f29967a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f29967a) {
            case 0:
                return g9.a((String) obj2);
            case 1:
                return gb.a((wb) obj2);
            case 2:
                return gb.c((wb) obj2);
            case 3:
                return gb.d((wb) obj2);
            case 4:
                return gb.b((wb) obj2);
            case 5:
                return h21.a((DrawScope) obj2);
            case 6:
                return hi0.a((SemanticsPropertyReceiver) obj2);
            case 7:
                return Integer.valueOf(hi0.a(((Integer) obj2).intValue()));
            case 8:
                return ii0.a((SemanticsPropertyReceiver) obj2);
            case 9:
                return jf0.a((SemanticsPropertyReceiver) obj2);
            case 10:
                return jf0.b((SemanticsPropertyReceiver) obj2);
            case 11:
                return jj0.a((olm.a) obj2);
            case 12:
                return Boolean.valueOf(jw.a((Location) obj2));
            case 13:
                return k21.a((SemanticsPropertyReceiver) obj2);
            case 14:
                return ke1.a(Constants.TAG_SUPPORTED_LOCALE_LIST, 400, 1.1f, (KeyframesSpec.KeyframesSpecConfig) obj2);
            case 15:
                return ke1.b(Constants.TAG_SUPPORTED_LOCALE_LIST, 400, 1.1f, (KeyframesSpec.KeyframesSpecConfig) obj2);
            case 16:
                return ke1.a(Constants.TAG_SUPPORTED_LOCALE_LIST, 400, (KeyframesSpec.KeyframesSpecConfig) obj2);
            case 17:
                return kr0.a((DrawScope) obj2);
            case 18:
                return l2.a((TextLayoutResult) obj2);
            case 19:
                return l2.b((TextLayoutResult) obj2);
            case 20:
                return l21.a((c21) obj2);
            case 21:
                return Long.valueOf(l90.a(((Integer) obj2).intValue()));
            case 22:
                return Long.valueOf(l90.b(((Integer) obj2).intValue()));
            case 23:
                return lu.b((bu) obj2);
            case 24:
                return lu.a((bu) obj2);
            case 25:
                return Long.valueOf(m90.a(((Integer) obj2).intValue()));
            case 26:
                return Long.valueOf(m90.b(((Integer) obj2).intValue()));
            case 27:
                return me1.a((SemanticsPropertyReceiver) obj2);
            case 28:
                return o7.a((SemanticsPropertyReceiver) obj2);
            default:
                return oe1.a((Bitmap) obj2);
        }
    }
}
