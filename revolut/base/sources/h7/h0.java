package h7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ d7.j u;
    public final /* synthetic */ Context v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f149786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(d7.j jVar, Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.u = jVar;
        this.v = context;
        this.f149786w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h0(this.u, this.v, this.f149786w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        for (d7.c0 c0Var : ((HashMap) this.u.c()).values()) {
            Intrinsics.h(c0Var);
            String str2 = c0Var.d;
            if (c0Var.f == null && kotlin.text.a0.H(str2, "data:", false) && kotlin.text.d0.T(str2, "base64,", 0, false, 6) > 0) {
                try {
                    String strSubstring = str2.substring(kotlin.text.d0.S(str2, CoreConstants.COMMA_CHAR, 0, 6) + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    byte[] bArrDecode = Base64.decode(strSubstring, 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    c0Var.f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                } catch (IllegalArgumentException e) {
                    r7.c.c("data URL did not have correct base64 format.", e);
                }
            }
            Context context = this.v;
            if (c0Var.f == null && (str = this.f149786w) != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str + str2);
                    Intrinsics.h(inputStreamOpen);
                    Bitmap bitmapDecodeStream = null;
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                    } catch (IllegalArgumentException e2) {
                        r7.c.c("Unable to decode image.", e2);
                    }
                    if (bitmapDecodeStream != null) {
                        c0Var.f = r7.l.d(c0Var.f111643a, c0Var.f111644b, bitmapDecodeStream);
                    }
                } catch (IOException e4) {
                    r7.c.c("Unable to open asset.", e4);
                }
            }
        }
        return Unit.f186387a;
    }
}
