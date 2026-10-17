package as9;

import androidx.appcompat.view.ContextThemeWrapper;
import aoa.h;
import ipa.j;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;
import q06.d;
import te0.w;
import yf.c;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f8880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b90.a f8881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContextThemeWrapper f8882c;
    public final c d;
    public final lfm.c e;
    public final f01.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s70.a f8883g;

    public b(d deeplinkParser, b90.a pushMessagesTools, ContextThemeWrapper context, c contactsNameReplacer, lfm.c appDisposable, f01.c uiKitResources, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contactsNameReplacer, "contactsNameReplacer");
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f8880a = deeplinkParser;
        this.f8881b = pushMessagesTools;
        this.f8882c = context;
        this.d = contactsNameReplacer;
        this.e = appDisposable;
        this.f = uiKitResources;
        this.f8883g = intentProvider;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        boolean zF;
        String strO;
        String strL;
        String strI;
        String strL2;
        String strA;
        String strL3;
        String strC;
        String strL4;
        Intrinsics.checkNotNullParameter(message, "message");
        String strE = k.e(message);
        if (strE == null || strE.length() == 0) {
            zF = false;
        } else {
            jf0.c cVarD = ((s06.c) this.f8880a).d(strE);
            zF = Intrinsics.f(cVarD != null ? cVarD.a() : null, "group-bills");
        }
        if (!zF || (strO = k.o(message)) == null || (strL = m70.a.l(strO)) == null || (strI = k.i(message)) == null || (strL2 = m70.a.l(strI)) == null || (strA = k.a(message)) == null || (strL3 = m70.a.l(strA)) == null || (strC = k.c(message)) == null || (strL4 = m70.a.l(strC)) == null) {
            return false;
        }
        c cVar = this.d;
        this.e.a(new pfm.a(w.H0(cVar.k(strL, strL3, strL4), cVar.k(strL2, strL3, strL4)), new h(new a(this, message, 0), 25), 4).m(new h(new arf.h(6), 26)).v());
        return true;
    }
}
