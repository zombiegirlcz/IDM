package jd7;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f172991w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f172991w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f172991w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f172991w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return new e(a0.d.r(str, "<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n\n<style>\n  html {\n    -webkit-text-size-adjust: 100%;\n  }\n\n  html,\n  body,\n  div,\n  span,\n  applet,\n  object,\n  iframe,\n  h1,\n  h2,\n  h3,\n  h4,\n  h5,\n  h6,\n  p,\n  blockquote,\n  pre,\n  a,\n  abbr,\n  acronym,\n  address,\n  big,\n  cite,\n  code,\n  del,\n  dfn,\n  em,\n  img,\n  ins,\n  kbd,\n  q,\n  s,\n  samp,\n  small,\n  strike,\n  strong,\n  sub,\n  sup,\n  tt,\n  var,\n  b,\n  u,\n  i,\n  center,\n  dl,\n  dt,\n  dd,\n  ol,\n  ul,\n  li,\n  fieldset,\n  form,\n  label,\n  legend,\n  table,\n  caption,\n  tbody,\n  tfoot,\n  thead,\n  tr,\n  th,\n  td,\n  article,\n  aside,\n  canvas,\n  details,\n  embed,\n  figure,\n  figcaption,\n  footer,\n  header,\n  hgroup,\n  menu,\n  nav,\n  output,\n  ruby,\n  section,\n  summary,\n  time,\n  mark,\n  audio,\n  video {\n    margin: 0;\n    padding: 0;\n    border: 0;\n    font-size: 100%;\n    vertical-align: baseline;\n  }\n</style>\n\n<style>\n    :root {\n        color-scheme: light dark;\n        --background-color: #FFFFFF;\n        --foreground-color: #191C1F;\n        --text-color: #8B959E;\n        --link-color: #0666EB;\n    }\n    @media screen and (prefers-color-scheme: dark) {\n        :root {\n            color-scheme: light dark;\n            --background-color: #000000;\n            --foreground-color: #F4F4F4;\n            --text-color: #8E8E93;\n            --link-color: #0A84FF;\n        }\n    }\n    body, html {\n        background-color: var(--background-color);\n        color: var(--foreground-color);\n    }\n    p {\n        color: var(--text-color);\n    }\n    a {\n        color: var(--link-color);\n    }\n  /**\n    * Actual styles go here\n    */\n  html {\n    font-size: 16px;\n  }\n\n  body {\n    font-family: -apple-system, \"Helvetica Neue\", \"Lucida Grande\";\n    line-height: 1.5rem;\n    font-size: 1rem;\n    padding: 0 2rem;\n  }\n\n  h1,\n  h2,\n  h3,\n  h4,\n  h5,\n  h6,\n  p,\n  ul,\n  li {\n    margin: 1.5rem 0;\n  }\n\n  ul {\n    padding-left: 1.25rem;\n  }\n\n  a[href^=\"mailto:\"] {\n    color: inherit;\n  }\n</style>"));
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = this.f172991w;
                lVar.H2(lVar.f172997s, new j45.m(data, 22));
                return Unit.f186387a;
        }
    }
}
