package e80;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y99.c f123551a;

    public g(y99.c onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f123551a = onClick;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f123551a, ((g) obj2).f123551a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f123551a.hashCode() * 31);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f123551a.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds10) {
        Intrinsics.checkNotNullParameter(ds10, "ds");
        super.updateDrawState(ds10);
        ds10.setUnderlineText(false);
    }
}
