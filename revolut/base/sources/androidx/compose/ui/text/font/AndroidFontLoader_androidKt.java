package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import fim.a;
import fim.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import skm.l;
import yhm.m;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"load", "Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/ResourceFont;", "context", "Landroid/content/Context;", "loadAsync", "(Landroidx/compose/ui/text/font/ResourceFont;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface load(ResourceFont resourceFont, Context context) {
        Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        Intrinsics.h(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, Continuation<? super Typeface> frame) {
        final l lVar = new l(1, h.b(frame));
        lVar.u();
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* JADX INFO: renamed from: onFontRetrievalFailed */
            public void lambda$callbackFailAsync$1(int reason) {
                lVar.a(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + reason + CoreConstants.RIGHT_PARENTHESIS_CHAR));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* JADX INFO: renamed from: onFontRetrieved */
            public void lambda$callbackSuccessAsync$0(Typeface typeface) {
                CancellableContinuation cancellableContinuation = lVar;
                m.Companion companion = m.INSTANCE;
                cancellableContinuation.resumeWith(typeface);
            }
        }, null);
        Object objT = lVar.t();
        if (objT == a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }
}
