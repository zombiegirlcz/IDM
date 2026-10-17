package jd7;

import com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f172992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ HtmlDocumentDescriptor f172993x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, HtmlDocumentDescriptor htmlDocumentDescriptor, Continuation continuation) {
        super(2, continuation);
        this.f172992w = lVar;
        this.f172993x = htmlDocumentDescriptor;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.f172992w, this.f172993x, continuation);
        kVar.v = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        if (r0.emit(r5, r11) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r0.emit(r4, r11) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.Object r0 = r11.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            yhm.o.b(r12)
            goto La2
        L1e:
            yhm.o.b(r12)
            jd7.l r12 = r11.f172992w
            f80.a r12 = r12.f172995q
            com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor r2 = r11.f172993x
            com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor$HtmlLocalFileDescriptor r2 = (com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor.HtmlLocalFileDescriptor) r2
            android.net.Uri r2 = r2.f74745a
            f80.b r12 = (f80.b) r12
            java.io.File r12 = r12.d(r2)
            r2 = 0
            if (r12 == 0) goto L87
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            jd7.e r6 = new jd7.e
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r12)
            r7.<init>(r8, r3)
            java.io.BufferedReader r12 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.148E-41)
            r12.<init>(r7, r3)
            java.lang.String r3 = jh.d.s(r12)     // Catch: java.lang.Throwable -> L7f
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L7f
            r12.close()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
        */
        //  java.lang.String r3 = "<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n\n<style>\n  html {\n    -webkit-text-size-adjust: 100%;\n  }\n\n  html,\n  body,\n  div,\n  span,\n  applet,\n  object,\n  iframe,\n  h1,\n  h2,\n  h3,\n  h4,\n  h5,\n  h6,\n  p,\n  blockquote,\n  pre,\n  a,\n  abbr,\n  acronym,\n  address,\n  big,\n  cite,\n  code,\n  del,\n  dfn,\n  em,\n  img,\n  ins,\n  kbd,\n  q,\n  s,\n  samp,\n  small,\n  strike,\n  strong,\n  sub,\n  sup,\n  tt,\n  var,\n  b,\n  u,\n  i,\n  center,\n  dl,\n  dt,\n  dd,\n  ol,\n  ul,\n  li,\n  fieldset,\n  form,\n  label,\n  legend,\n  table,\n  caption,\n  tbody,\n  tfoot,\n  thead,\n  tr,\n  th,\n  td,\n  article,\n  aside,\n  canvas,\n  details,\n  embed,\n  figure,\n  figcaption,\n  footer,\n  header,\n  hgroup,\n  menu,\n  nav,\n  output,\n  ruby,\n  section,\n  summary,\n  time,\n  mark,\n  audio,\n  video {\n    margin: 0;\n    padding: 0;\n    border: 0;\n    font-size: 100%;\n    vertical-align: baseline;\n  }\n</style>\n\n<style>\n    :root {\n        color-scheme: light dark;\n        --background-color: #FFFFFF;\n        --foreground-color: #191C1F;\n        --text-color: #8B959E;\n        --link-color: #0666EB;\n    }\n    @media screen and (prefers-color-scheme: dark) {\n        :root {\n            color-scheme: light dark;\n            --background-color: #000000;\n            --foreground-color: #F4F4F4;\n            --text-color: #8E8E93;\n            --link-color: #0A84FF;\n        }\n    }\n    body, html {\n        background-color: var(--background-color);\n        color: var(--foreground-color);\n    }\n    p {\n        color: var(--text-color);\n    }\n    a {\n        color: var(--link-color);\n    }\n  /**\n    * Actual styles go here\n    */\n  html {\n    font-size: 16px;\n  }\n\n  body {\n    font-family: -apple-system, \"Helvetica Neue\", \"Lucida Grande\";\n    line-height: 1.5rem;\n    font-size: 1rem;\n    padding: 0 2rem;\n  }\n\n  h1,\n  h2,\n  h3,\n  h4,\n  h5,\n  h6,\n  p,\n  ul,\n  li {\n    margin: 1.5rem 0;\n  }\n\n  ul {\n    padding-left: 1.25rem;\n  }\n\n  a[href^=\"mailto:\"] {\n    color: inherit;\n  }\n</style>"
        /*
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r6.<init>(r12)
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r11.v = r2
            r11.u = r4
            java.lang.Object r12 = r0.emit(r5, r11)
            if (r12 != r1) goto La2
            goto La1
        L7f:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            com.bumptech.glide.d.e(r12, r1)
            throw r0
        L87:
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "uri to non-existed file"
            r6.<init>(r12)
            r8 = 5
            r9 = 0
            r5 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r11.v = r2
            r11.u = r3
            java.lang.Object r12 = r0.emit(r4, r11)
            if (r12 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: jd7.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
