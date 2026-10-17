package com.revolut.core.android.spannable;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.util.Linkify;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.text.HtmlCompat;
import bp0.t;
import e80.b;
import e80.d;
import e80.e;
import e80.f;
import e80.g;
import e80.h;
import e80.i;
import e80.j;
import e80.k;
import e80.l;
import e80.m;
import e80.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.q;
import yhm.r;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f51210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f51211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f51212c;
    public final List d;
    public final SpannableStringBuilder e;
    public final /* synthetic */ i f;

    public a(i iVar, boolean z, Function2 function2, e params, List swapSpanDataList) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(swapSpanDataList, "swapSpanDataList");
        this.f = iVar;
        this.f51210a = z;
        this.f51211b = function2;
        this.f51212c = params;
        this.d = swapSpanDataList;
        this.e = new SpannableStringBuilder();
    }

    public final void a(String text, Function2 function2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Regex.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter("\n", "literal");
        String strReplace = new Regex("\n", q.LITERAL).replace(text, "<br />");
        e eVar = this.f51212c;
        eVar.getClass();
        Spanned spannedFromHtml = HtmlCompat.fromHtml(strReplace, 4, null, eVar.f123549a);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        Integer num = eVar.f123550b;
        if (num != null) {
            int iIntValue = num.intValue();
            j jVar = new j(spannedFromHtml);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
            Linkify.addLinks(jVar, iIntValue);
            Intrinsics.h(uRLSpanArr);
            ArrayList<r> arrayList = new ArrayList(uRLSpanArr.length);
            for (URLSpan uRLSpan : uRLSpanArr) {
                arrayList.add(new r(uRLSpan, Integer.valueOf(spannedFromHtml.getSpanStart(uRLSpan)), Integer.valueOf(spannedFromHtml.getSpanEnd(uRLSpan))));
            }
            for (r rVar : arrayList) {
                jVar.setSpan((URLSpan) rVar.f314201a, ((Number) rVar.f314202b).intValue(), ((Number) rVar.f314203c).intValue(), 0);
            }
            spannedFromHtml = jVar;
        }
        Intrinsics.i(spannedFromHtml, "null cannot be cast to non-null type android.text.Spannable");
        Spannable spannable = (Spannable) spannedFromHtml;
        e(spannable, function2);
        for (m mVar : this.d) {
            mVar.getClass();
            Function0 function0 = mVar.f123553a;
            Object[] spans = spannable.getSpans(0, spannable.length(), BulletSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            ArrayList<r> arrayList2 = new ArrayList(spans.length);
            for (Object obj2 : spans) {
                arrayList2.add(new r(obj2, Integer.valueOf(spannable.getSpanStart(obj2)), Integer.valueOf(spannable.getSpanEnd(obj2))));
            }
            for (r rVar2 : arrayList2) {
                Object obj3 = rVar2.f314201a;
                int iIntValue2 = ((Number) rVar2.f314202b).intValue();
                int iIntValue3 = ((Number) rVar2.f314203c).intValue();
                spannable.removeSpan(obj3);
                spannable.setSpan(function0.invoke(), iIntValue2, iIntValue3, 0);
            }
        }
        this.e.append((CharSequence) spannable);
    }

    public final void b(SpannableStringBuilder text, t tVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        e eVar = this.f51212c;
        if (eVar.f123550b != null) {
            SpannableStringBuilder spannableStringBuilder = this.e;
            spannableStringBuilder.append((CharSequence) text);
            Linkify.addLinks(spannableStringBuilder, eVar.f123550b.intValue());
            e(spannableStringBuilder, tVar);
        }
    }

    public final a c(String text, h[] spans) {
        Object superscriptSpan;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spans, "spans");
        SpannableStringBuilder spannableStringBuilder = this.e;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) text);
        for (h hVar : spans) {
            Context context = this.f.f123552a;
            if (hVar instanceof d) {
                superscriptSpan = new ForegroundColorSpan(ResourcesCompat.getColor(context.getResources(), ((d) hVar).f123548a, context.getTheme()));
            } else if (hVar instanceof k) {
                superscriptSpan = new StrikethroughSpan();
            } else if (hVar instanceof e80.a) {
                superscriptSpan = new StyleSpan(1);
            } else if (hVar instanceof n) {
                superscriptSpan = new UnderlineSpan();
            } else if (hVar instanceof b) {
                superscriptSpan = new g(((b) hVar).f123547a);
            } else if (hVar instanceof l) {
                superscriptSpan = new SuperscriptSpan();
            } else {
                if (!(hVar instanceof f)) {
                    throw new NoWhenBranchMatchedException();
                }
                superscriptSpan = null;
            }
            if (superscriptSpan != null) {
                spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
            }
        }
        return this;
    }

    public final j d() {
        return new j(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.text.Spannable r10, kotlin.jvm.functions.Function2 r11) {
        /*
            r9 = this;
            int r0 = r10.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r2 = 0
            java.lang.Object[] r0 = r10.getSpans(r2, r0, r1)
            java.lang.String r1 = "getSpans(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r3 = r0.length
            if (r3 != 0) goto L1b
            zhm.f0 r0 = zhm.f0.f322471a
            goto L25
        L1b:
            java.util.ArrayList r0 = kotlin.collections.d.x0(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.Collections.reverse(r0)
        L25:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = zhm.w.t(r0, r3)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r0.next()
            android.text.style.URLSpan r3 = (android.text.style.URLSpan) r3
            yhm.r r4 = new yhm.r
            int r5 = r10.getSpanStart(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r10.getSpanEnd(r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r3, r5, r6)
            r1.add(r4)
            goto L36
        L5b:
            java.util.Iterator r0 = r1.iterator()
        L5f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            yhm.r r1 = (yhm.r) r1
            java.lang.Object r3 = r1.f314201a
            android.text.style.URLSpan r3 = (android.text.style.URLSpan) r3
            java.lang.Object r4 = r1.f314202b
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r1 = r1.f314203c
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r10.removeSpan(r3)
            java.lang.CharSequence r5 = r10.subSequence(r4, r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "getURL(...)"
            if (r11 == 0) goto L9b
            java.lang.String r7 = r3.getURL()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            java.lang.Object r7 = r11.invoke(r7, r5)
            if (r7 != 0) goto Lab
        L9b:
            com.revolut.core.android.spannable.UrlSpanCustomUnderlineCustomClick r7 = new com.revolut.core.android.spannable.UrlSpanCustomUnderlineCustomClick
            java.lang.String r3 = r3.getURL()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            boolean r6 = r9.f51210a
            kotlin.jvm.functions.Function2 r8 = r9.f51211b
            r7.<init>(r3, r6, r8, r5)
        Lab:
            r10.setSpan(r7, r4, r1, r2)
            goto L5f
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.android.spannable.a.e(android.text.Spannable, kotlin.jvm.functions.Function2):void");
    }
}
