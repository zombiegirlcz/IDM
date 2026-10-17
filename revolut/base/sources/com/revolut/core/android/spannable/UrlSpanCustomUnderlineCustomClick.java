package com.revolut.core.android.spannable;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/android/spannable/UrlSpanCustomUnderlineCustomClick;", "Landroid/text/style/URLSpan;", "", "toString", "()Ljava/lang/String;", "core_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class UrlSpanCustomUnderlineCustomClick extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51209c;
    public final Function2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlSpanCustomUnderlineCustomClick(String url2, boolean z, Function2 function2, String visibleText) {
        super(url2);
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(visibleText, "visibleText");
        this.f51207a = url2;
        this.f51208b = visibleText;
        this.f51209c = z;
        this.d = function2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UrlSpanCustomUnderlineCustomClick)) {
            return false;
        }
        UrlSpanCustomUnderlineCustomClick urlSpanCustomUnderlineCustomClick = (UrlSpanCustomUnderlineCustomClick) obj2;
        return Intrinsics.f(this.f51207a, urlSpanCustomUnderlineCustomClick.f51207a) && Intrinsics.f(this.f51208b, urlSpanCustomUnderlineCustomClick.f51208b) && this.f51209c == urlSpanCustomUnderlineCustomClick.f51209c && Intrinsics.f(this.d, urlSpanCustomUnderlineCustomClick.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f51207a.hashCode() * 31, 31, this.f51208b), 31, this.f51209c);
        Function2 function2 = this.d;
        return iC + (function2 == null ? 0 : function2.hashCode());
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Function2 function2 = this.d;
        if (function2 == null || !((Boolean) function2.invoke(this.f51207a, this.f51208b)).booleanValue()) {
            super.onClick(widget);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds10) {
        Intrinsics.checkNotNullParameter(ds10, "ds");
        super.updateDrawState(ds10);
        ds10.setUnderlineText(this.f51209c);
    }
}
